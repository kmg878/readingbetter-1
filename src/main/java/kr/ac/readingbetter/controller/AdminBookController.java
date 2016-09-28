package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.readingbetter.service.AdminBookService;
import kr.ac.readingbetter.vo.AuthorVo;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.PublisherVo;

@Controller
@RequestMapping("/admin")
public class AdminBookController {
	
	@Autowired
	private AdminBookService adminBookService;

	// 도서 관리
	@RequestMapping("/booklist")
	public String bookList(Model model) {
		List<BookVo> list = adminBookService.getList();
		model.addAttribute("list", list);
		return "admin/booklist";
	}

	// 책 저장
	@RequestMapping("/bookaddform")
	public String bookaddList(Model model, AuthorVo authorvo, PublisherVo publishervo) {
		if (authorvo.getKwd2() == null) {
			authorvo.setKwd2("");
		}
		List<AuthorVo> list = adminBookService.getAuthorList(authorvo);
		model.addAttribute("authorlist", list);

		if (publishervo.getKwd1() == null) {
			publishervo.setKwd1("");
		}
		List<PublisherVo> list2 = adminBookService.getPublisherList(publishervo);
		model.addAttribute("publisherlist", list2);

		return "admin/bookaddform";
	}

	@RequestMapping(value = "/checkbook", method = RequestMethod.POST)
	@ResponseBody
	public void checkBook(@RequestParam(value = "title") String title) {
		List<BookVo> bookList = adminBookService.checkBook(title);
		System.out.println(bookList);
	}
}