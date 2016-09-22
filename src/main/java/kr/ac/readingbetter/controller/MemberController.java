package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.readingbetter.service.MemberService;
import kr.ac.readingbetter.vo.MemberVo;
import kr.ac.readingbetter.vo.SchoolVo;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("/loginform")
	public String loginForm() {
		return "member/loginform";
	}

	@RequestMapping("/joinform")
	public String joinForm(Model model) {
		List<SchoolVo> list = memberService.selectSchoolTitle();

		model.addAttribute("list", list);

		return "member/joinform";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public List<SchoolVo> searchSchool(@RequestParam(value = "kwd") String kwd) {
		if (kwd.equals("")) {
			kwd = "@@@@@@@@@@@";
		}

		List<SchoolVo> list = memberService.searchSchool(kwd);

		return list;
	}

	@RequestMapping(value = "/checkid", method = RequestMethod.POST)
	@ResponseBody
	public MemberVo checkId(MemberVo vo2, @RequestParam(value = "id") String id) {
		MemberVo vo = memberService.checkId(id);

		// null 객체를 return할 때의 error 방지
		if (vo == null) {
			vo2.setId("");

			return vo2;
		}

		return vo;
	}

	@RequestMapping(value = "/checkemail", method = RequestMethod.POST)
	@ResponseBody
	public MemberVo checkEmail(MemberVo vo2, @RequestParam(value = "email") String email) {
		MemberVo vo = memberService.checkEmail(email);

		// null 객체를 return할 때의 error 방지
		if (vo == null) {
			vo2.setEmail("");

			return vo2;
		}

		return vo;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVo vo) {
		memberService.insertMember(vo);

		return "redirect:/main";
	}
}