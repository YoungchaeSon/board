package sam.ee.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sam.ee.member.command.*;

@Controller
public class MController {

	MCommand command = null;
	
	@RequestMapping("/main")
	public String main() {
		return "gateway";
	}
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new MLogoutCommand();
		command.execute(model);
		
		return "redirect:main";
	}
	
	@RequestMapping("resultpost")
	public String resultpost(HttpServletRequest request, Model model) {
		
		model.addAttribute("request",request);
		command = new MJoinCommand();
		command.execute(model);
		return "login_view";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login_view";
	}
	@RequestMapping(value ="/login", method =RequestMethod.POST )
	public String login(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
 		MLoginCommand result = new MLoginCommand();
		int rs = result.execute(model);
		System.out.println("/login : "+request.getSession().getAttribute("lId"));
		if(rs==1) {
			return "gateway";
		}else {
			return "redirect:/login";
		}
		
	}
	
	@RequestMapping("memberlist")
	public String memberlist(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command = new MListCommand();
		command.execute(model);
		
		return "memberlist";
	}
	
	@RequestMapping("member_detail")
	public String memberdetail(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command = new MDetailCommand();
		command.execute(model);
		
		return "member_detail";
	}
	
	@RequestMapping("member_delete")
	public String memberdelete(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command = new MDeleteCommand();
		command.execute(model);
		
		return "redirect:memberlist";
	}
}
