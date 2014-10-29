package action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value = "/")
public class HomePageAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2711673653867282802L;

	Map session;

	@Action(value = "HomePage", results = { @Result(name = "success", location = "/jsp/homePage.jsp") })
	public String showHomePage() {
		return SUCCESS;
	}

	public void setSession(Map session) {
		session = this.session;
	}
}
