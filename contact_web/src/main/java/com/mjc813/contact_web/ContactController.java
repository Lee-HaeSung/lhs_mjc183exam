package com.mjc813.contact_web;

import com.mjc813.contact_web.dto.Contact;
import com.mjc813.contact_web.service.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/add")
    public String addView() {
        return "contact/add";
    }

    @PostMapping("/addconfirm")
    public String addConfirm(@ModelAttribute Contact inputContact) {
        try {
            System.out.printf("DB insert 전 : %s\n", inputContact.getContactFullInfo());
            contactRepository.insert(inputContact);
            System.out.printf("DB insert 후 : %s\n", inputContact.getContactFullInfo());
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "redirect:/";
    }

    @GetMapping("/contactlist")
    public String selectAll(Model model) {
        List<Contact> contacts = null;
        try {
            contacts = this.contactRepository.selectAll();
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        model.addAttribute("contacts", contacts);
        return "contact/list";
    }
}
