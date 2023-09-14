package com.example.demo.controller;

import com.example.demo.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {

	List<Friend> friends = new ArrayList<>();

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("friends", friends);
		model.addAttribute("friend", new Friend());
		return "index";
	}

	@PostMapping("/addFriend")
	public String addFriend(@ModelAttribute Friend friend) {
		friends.add(friend);
		return "redirect:/index";
	}
}