package kpfu.itis.dao;

import kpfu.itis.domain.ContactsEntity;

import java.util.List;

/**
 * Created by Admin on 14.03.2017.
 */
public interface ContactDAO {

    void deleteContact(Integer id);

    void saveOrUpdateContact(ContactsEntity contactsEntity);

    List<ContactsEntity> getAllContacts();

    ContactsEntity getContactById(int id);
}
