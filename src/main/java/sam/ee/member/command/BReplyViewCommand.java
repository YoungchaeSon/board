package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.BDao;
import sam.ee.member.dto.BDto;


public class BReplyViewCommand implements BCommand{

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		model.addAttribute("reply_view",dao.reply_view(bId));
			
	}

}
