package com.packt.webstore.domain.repository;

import java.util.List;

import com.packt.webstore.dto.Contact;
import com.packt.webstore.dto.Countries;

public interface ContactDAO {
	
	public void saveOrUpdate(Contact contact);
    
    public void delete(int contactId);
     
    public Contact get(int contactId);
     
    public List<Countries> list();

}
