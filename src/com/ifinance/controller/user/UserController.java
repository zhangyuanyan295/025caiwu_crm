package com.ifinance.controller.user;

import com.ifinance.base.BaseController;

public class UserController extends BaseController {
	
	/**
	 * 登录接口
	 */
	public void login()
	{
		String respone = UserService.service.login(this);
		renderJson(respone);
	}
	
	/**
	 *  退出接口
	 */
	public void quit()
	{
		String respone = UserService.service.quit(this);
		renderJson(respone);
	}
}