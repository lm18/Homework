package kpfu.itis.service;

import kpfu.itis.dao.ContactDAO;
import kpfu.itis.domain.ContactsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 28.03.2017.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(ContactsEntity contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public void deleteContact(Integer id) {
        contactDAO.deleteContact(id);
    }

    @Transactional
    public void editContact(Integer id) {
        contactDAO.editContact(id);
    }

    @Transactional
    public List<ContactsEntity> getAllContacts() {
        return contactDAO.getAllContacts();
    }

    @Transactional
    public ContactsEntity getContactById(Long id) {
        return contactDAO.getContactById(id);
    }
}
