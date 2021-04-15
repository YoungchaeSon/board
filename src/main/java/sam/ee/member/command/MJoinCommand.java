package sam.ee.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import sam.ee.member.dao.MDao;

public class MJoinCommand implements MCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mName = request.getParameter("name");
		String mPassword  = request.getParameter("password");
		String mId = request.getParameter("id");
		String mEmail = request.getParameter("email");
		String mZipNo = request.getParameter("zipNo");
		String mIntroduce = request.getParameter("introduce");
		String mAddr1  = request.getParameter("addr1");
		String mAddr2 = request.getParameter("addr2");
		String mInterest = request.getParameter("interest");
		int mYear = Integer.parseInt(request.getParameter("bYear"));
		int mMonth = Integer.parseInt(request.getParameter("bDate"));
		int mDate = Integer.parseInt(request.getParameter("bDate"));
		String mIdentity = request.getParameter("mIdentity");
		
		MDao dao = new MDao();
		dao.join(mName,mId,mPassword,mEmail,mZipNo,mAddr1,mAddr2,mYear,mMonth,mDate,mInterest,mIntroduce,mIdentity);
	}

}
