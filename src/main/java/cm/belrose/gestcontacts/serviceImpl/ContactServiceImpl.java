/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.gestcontacts.serviceImpl;

import cm.belrose.gestcontacts.dao.ContactDao;
import cm.belrose.gestcontacts.entities.Contact;
import cm.belrose.gestcontacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ngnawen
 */
@Transactional
@Service
public class ContactServiceImpl extends GenericServiceImpl<Contact, Long, ContactDao> implements ContactService {
    
    @Autowired
    public ContactServiceImpl(ContactDao contactDao) {
        super(contactDao);
    }
    

}
