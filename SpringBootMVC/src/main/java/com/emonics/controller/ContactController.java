package com.emonics.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.emonics.entity.Contact;
import com.emonics.service.ContactService;

import net.bytebuddy.asm.Advice.This;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/")
	public String listContact(Model model) {
		model.addAttribute("contactList", contactService.fetchContactList());
		return "contactList";

	}

	@GetMapping("/newContact")

	public String newContact(Model model) {
		Contact contact = new Contact();

		model.addAttribute("contact", contact);
		return "contactForm";

	}

	@PostMapping("/saveContact")

	public String saveContact(@ModelAttribute("contact") Contact contact) {

		contactService.saveContact(contact);
		return "redirect:/";
	}

	@GetMapping("/editContact/")
	public String editContact(int id, Model model) {
		model.addAttribute("contact", this.contactService.getContactById(id));
		return "contactForm";

	}
	@GetMapping("/deleteContact")
	public String deleteContact(int id)
	{
		contactService.deleteContactById(id);
		return"redirect:/";
	}
	

}
