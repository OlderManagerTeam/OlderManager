package com.hk.controller;

import java.io.IOException;
import java.util.List;







import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.User;
import com.hk.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	//外界访问的URL /user/queryAllUses.action
	/*@RequestMapping(value="/queryAllUsers.action")
	public ModelAndView queryAllUser(){
		
		List<User> users = userService.queryAllUsers();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("/jsp/users.jsp");
		return modelAndView;
	}*/
	
	/***
	 * 形参model的作用主要就是想request域中传递参数
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/queryAllUsers.action")
	public String queryAllUser(Model model){
		List<User> users = userService.queryAllUsers();
		//如果返回字符串，则返回的字符串就是视图的逻辑地址
		model.addAttribute("users", users);
		//return "redirect:/user/queryUserById.action";
		//return "forword:/user/queryUserById.action";
		return "users";
	}
	
	/***
	 * 控制器中的方法可以什么都不返回
	 * @param model
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	/*@RequestMapping(value="/queryAllUsers.action")
	public void queryAllUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		List<User> users = userService.queryAllUsers();
		request.setAttribute("users", users);
		request.getRequestDispatcher("/jsp/users.jsp").forward(request, response);
	}*/
	@RequestMapping(value="/queryUserById.action")
	public String queryUserById(int id,Model model){
		User user = userService.queryUserById(id);
		model.addAttribute("user", user);
		return "user";
	}
	@RequestMapping("deleteUserById")
	public String deleteUserById(int id){
		//先写死删除的id
		userService.deleteUserById(id);
		return "redirect:/user/queryAllUsers.action";
	}
	@RequestMapping("modifyUser.action")
	public String modifyUser(User user){
		//怎么修改
		userService.modifyUser(user);
		return "redirect:/user/queryAllUsers.action";
	}
}
