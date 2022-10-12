package com.emonics.service;

import java.util.List;

import com.emonics.entity.Contact;

public interface ContactService {
List<Contact> fetchContactList();
void saveContact(Contact employee);

Contact getContactById(int id);
void deleteContactById(int id);



}
