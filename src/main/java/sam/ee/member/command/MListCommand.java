package sam.ee.member.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import sam.ee.member.dao.MDao;
import sam.ee.member.dto.MDto;

public class MListCommand implements MCommand {

	@Override
	public void execute(Model model) {
		MDao dao = new MDao();
		System.out.println(dao.list());
		ArrayList<MDto> dtos = dao.list();

		model.addAttribute("list",dtos);
	}

}
