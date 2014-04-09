package action;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

//@Namespace("/") 
//@ResultPath(value="/")
@Result(name="success",location="/jsp/home.jsp")
public class HomePageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2711673653867282802L;
	
	
	//@Action(value="getHomePage", results={})
	public String execute(){
		System.out.println("In home page action");
		return SUCCESS;
	}

} 
