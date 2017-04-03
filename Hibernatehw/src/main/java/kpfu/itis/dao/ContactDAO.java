package kpfu.itis.dao;

import kpfu.itis.domain.ContactsEntity;

import java.util.List;

/**
 * Created by Admin on 14.03.2017.
 */
public interface ContactDAO {

    void addContact(ContactsEntity contact);

    void deleteContact(Integer id);

    void editContact(Integer id);

    List<ContactsEntity> getAllContacts();

    ContactsEntity getContactById(Long id);
}
