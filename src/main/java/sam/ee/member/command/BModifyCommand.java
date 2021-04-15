package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import sam.ee.member.dao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String lId = (String) request.getSession().getAttribute("lId");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.modify(bId, lId ,bTitle,bContent,bName);
				
	
	}

}
