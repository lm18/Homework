package kpfu.itis.controller;

import kpfu.itis.domain.ContactsEntity;
import kpfu.itis.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Admin on 15.03.2017.
 */

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/")
    public String listContacts(Map<String, Object> map) {
        map.put("contact", new ContactsEntity());
        map.put("contactList", contactService.getAllContacts());
        return "index";
    }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        ContactsEntity newContact = new ContactsEntity();
        model.addObject("contact", newContact);
        model.setViewName("addContact");
        return model;
    }

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") ContactsEntity contact) {
        contactService.addContact(contact);
        return "redirect:/";
    }

    @RequestMapping(value = "/editContact", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        Long id = Long.valueOf(request.getParameter("id"));
        ContactsEntity contactsEntity = contactService.getContactById(id);
        ModelAndView model = new ModelAndView("updateContact");
        model.addObject("contact", contactsEntity);
        return model;
    }

    @RequestMapping(value = "/updateContact", method = RequestMethod.POST)
    public String updateContact(Integer id) {
        contactService.editContact(id);
        return "redirect:/";
    }

    @RequestMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable("id") Integer id) {
        contactService.deleteContact(id);
        return "redirect:/";
    }
}