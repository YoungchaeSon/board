package sam.ee.member.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import sam.ee.member.dao.BDao;
import sam.ee.member.dto.BDto;


public class BListCommand implements BCommand{

	@Override
	public void execute(Model model) {
		
		BDao dao = new BDao();
		System.out.println(dao.list());
		ArrayList<BDto> dtos = dao.list();
	//	System.out.println(dtos.get(0).getbTitle());
		model.addAttribute("list",dtos);
	}

}
