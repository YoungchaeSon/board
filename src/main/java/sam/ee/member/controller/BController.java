package sam.ee.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sam.ee.member.command.*;
import sam.ee.member.util.Constant;

@Controller
public class BController {
	
	BCommand command = null;
	
	private JdbcTemplate template;
	
	//객체 주입한것을 자동으로 처리
	@Autowired	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BListCommand();
		command.execute(model);

		return "list";
		
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request",request);
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request",request);
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command = new BDeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command=new BReplyViewCommand();
		command.execute(model);
		
		return "reply_view";
		
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command=new BReplyCommand();
		command.execute(model);
		
		return "redirect:list";
	}

	@RequestMapping(value ="/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
}
