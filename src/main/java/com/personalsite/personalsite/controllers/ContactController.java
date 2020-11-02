package com.personalsite.personalsite.controllers;

import com.personalsite.personalsite.models.Contact;
import com.personalsite.personalsite.repositories.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    private final ContactRepository contactDao;


    public ContactController(ContactRepository contactDao) {
        this.contactDao = contactDao;
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact/submit")
    public String contactRequest(@ModelAttribute Contact contact){
        Contact contacts = contactDao.save(contact);
        contacts.setCreateDateTime(contacts.getCreateDateTime());
        contacts.setEmail(contacts.getEmail());
        contacts.setFirstName(contacts.getFirstName());
        contacts.setLastName(contacts.getLastName());
        contacts.setPhone(contacts.getPhone());
        contacts.setNote(contacts.getNote());
        contacts.setId(contacts.getId());
        contactDao.save(contacts);
        return "redirect:/";
    }
}
