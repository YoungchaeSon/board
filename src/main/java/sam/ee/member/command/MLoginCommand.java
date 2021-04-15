package sam.ee.member.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import sam.ee.member.dao.MDao;
import sam.ee.member.dto.MDto;

public class MLoginCommand {

	public int execute(Model model) {
		System.out.println("login command activate");
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		String lId = request.getParameter("id");
		String lPw = request.getParameter("pw");

		MDao dao = new MDao();
		ArrayList<MDto> dtos = dao.login(lId, lPw);
		System.out.println(dtos);
		try {
			String id = dtos.get(0).getmId();
			System.out.println(id);
			request.getSession().setAttribute("lId", id);
			return 1;
		} catch (IndexOutOfBoundsException e) {
			return 0;
		}

	}

}
