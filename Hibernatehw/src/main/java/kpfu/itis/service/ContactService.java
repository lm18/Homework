package kpfu.itis.service;

import kpfu.itis.domain.ContactsEntity;

import java.util.List;

/**
 * Created by Admin on 28.03.2017.
 */
public interface ContactService {

    void addContact(ContactsEntity contact);

    void deleteContact(Integer id);

    void editContact(Integer id);

    List<ContactsEntity> getAllContacts();

    ContactsEntity getContactById(Long id);

}
