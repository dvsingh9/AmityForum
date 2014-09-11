package action.facebook;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/") 
@ResultPath(value="/")
public class FBMainMenu extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private String code="";

	private Map sessionMap;
	
	@Action(value="fbhome",
			results={@Result(name = "success", type = "redirectAction", params = {"namespace", "/", "actionName", "HomePage"}),
					@Result(name="failure",location="/jsp/error.jsp")})

	public String service()
			throws ServletException, IOException {
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
		sessionMap.put("userInfo", fbProfileData);
		
		System.out.println("Welcome "+fbProfileData.get("first_name"));
		System.out.println("Your Email: "+fbProfileData.get("email"));
		System.out.println("You are : "+fbProfileData.get("gender"));
		System.out.println("Id : "+fbProfileData.get("id"));
		System.out.println("Link  : "+fbProfileData.get("link"));
		System.out.println("location : "+fbProfileData.get("location"));
		
		return SUCCESS;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public Map getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map sessionMap) {
		this.sessionMap = sessionMap;
	}

	
}
