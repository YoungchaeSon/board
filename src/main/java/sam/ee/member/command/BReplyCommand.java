package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.BDao;


public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		String lId = (String) request.getSession().getAttribute("lId");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");
		
		BDao dao = new BDao();
		dao.reply(bId, lId, bTitle, bContent, bGroup, bStep, bIndent);
	}

}
