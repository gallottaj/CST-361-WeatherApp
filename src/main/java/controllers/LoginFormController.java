package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
public class LoginFormController {

	public String onSubmit() {

		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

		System.out.println("first name: " + user.getFirstName());
		System.out.println("last name: " + user.getLastName());
		return null;

	}

}
