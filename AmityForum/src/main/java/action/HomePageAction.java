package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/") 
@ResultPath(value="/")
public class HomePageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2711673653867282802L;
	
	
	@Action(value="HomePage",
		    results={@Result(name="success",location="/jsp/homePage.jsp")}
	)
	public String showHomePage(){
		System.out.println("In home page action");
		return SUCCESS;
	}

} 
