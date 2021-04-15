package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.BDao;
import sam.ee.member.dto.BDto;


public class BDeleteCommand implements BCommand{

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		String lId = (String) request.getSession().getAttribute("lId");
		System.out.println("tst : " +lId);
		BDao dao = new BDao();
		dao.delete(lId, bId);
		
	}

}
