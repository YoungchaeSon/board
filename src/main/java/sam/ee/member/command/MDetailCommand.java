package sam.ee.member.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.MDao;
import sam.ee.member.dto.MDto;

public class MDetailCommand implements MCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mId = request.getParameter("mId");
		
		MDao dao = new MDao();
		MDto dto = dao.detail(mId);

		model.addAttribute("list",dto);
	}
	

}
