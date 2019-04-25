/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.gestcontacts.daoImpl;

import cm.belrose.gestcontacts.dao.ContactDao;
import cm.belrose.gestcontacts.entities.Contact;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ngnawen
 */
@Repository
public class ContactDaoImpl extends GenericDaoImpl<Contact, Long> implements ContactDao {
    
}
