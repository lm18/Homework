package kpfu.itis.service;

import kpfu.itis.domain.ContactsEntity;

import java.util.List;

/**
 * Created by Admin on 28.03.2017.
 */
public interface ContactService {

    void deleteContact(Integer id);

    void saveOrUpdateContact(ContactsEntity contactsEntity);

    List<ContactsEntity> getAllContacts();

    ContactsEntity getContactById(int id);

}
