package kpfu.itis.dao;

import kpfu.itis.model.Contact;

import java.util.List;

/**
 * Created by Admin on 14.03.2017.
 */
public interface ContactDAO {

    void addContact(Contact contact);

    void deleteContact(int id);

    void editContact(Contact contact);

    List<Contact> getAllContacts();

    Contact get(int id);
}
