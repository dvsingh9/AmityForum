package action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import action.facebook.FBConnection;
import action.facebook.FBGraph;

import com.opensymphony.xwork2.ActionSupport;

import entities.User;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private String code = "";
	private Map session;

	@Action(value = "fbhome", results = {
			@Result(name = "success", type = "redirectAction", params = {
					"namespace", "/", "actionName", "showPostPage" }),
			@Result(name = "failure", location = "/jsp/error.jsp") })
	public String service() throws ServletException, IOException {
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
		code = req.getParameter("code");
		if (code == null || code.equals("")) {
			throw new RuntimeException(
					"ERROR: Didn't get code parameter in callback.");
		}
		FBConnection fbConnection = new FBConnection();
		String accessToken = fbConnection.getAccessToken(code);

		FBGraph fbGraph = new FBGraph(accessToken);
		String graph = fbGraph.getFBGraph();
		Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
		User userInfo = new User();

		userInfo.setName(fbProfileData.get("first_name") + " "
				+ fbProfileData.get("last_name"));
		userInfo.setEmail(fbProfileData.get("email"));
		session.put("userInfo", userInfo);

		return SUCCESS;

	}

	public void setSession(Map session) {
		this.session = session;
	}

}
