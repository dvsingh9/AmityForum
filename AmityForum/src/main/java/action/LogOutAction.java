package action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value = "/")
public class LogOutAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -754345977415594416L;
	
	@Action(value = "logOut", results = {
			@Result(name = "success", location = "HomePage", type = "chain") })
	public String logOut(){
		Map session = ActionContext.getContext().getSession();
		session.remove("userInfo");
		session.clear();
		return SUCCESS;
	}
}
