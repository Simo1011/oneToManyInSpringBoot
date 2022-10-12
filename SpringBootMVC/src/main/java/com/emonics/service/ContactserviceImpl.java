package com.emonics.service;

import java.util.List;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emonics.entity.Contact;
import com.emonics.repository.ContactRepository;



@Service
public class ContactserviceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> fetchContactList() {
		

		return contactRepository.findAll();
	}

	@Override
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub
		this.contactRepository.save(contact);
	}

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		Optional<Contact> optional =contactRepository.findById(id);
		Contact contact=null;
		if(optional.isPresent())
		{
			contact=optional.get();
			}
		else {
			throw new RuntimeException("Contact Not Found for Id::" +id);
		}
		return contact;
		
		}
	

	@Override
	public void deleteContactById(int id) {
		// TODO Auto-generated method stub
		this.contactRepository.deleteById(id);
		
	
	}

}
