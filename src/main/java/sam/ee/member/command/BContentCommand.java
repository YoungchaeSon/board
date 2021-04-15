package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.BDao;
import sam.ee.member.dto.BDto;

public class BContentCommand implements BCommand{

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		model.addAttribute("content_view",dto);		
	}

}
