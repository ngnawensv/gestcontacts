/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.gestcontacts.controleur;

import cm.belrose.gestcontacts.dao.ContactDao;
import cm.belrose.gestcontacts.entities.Contact;
import static java.util.Collections.list;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ngnawen
 */
@RestController
public class ContactControleur {
    @Autowired
    private ContactDao contactDao;
    
    //méthode pour lister tous les contacts
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public List<Contact> getContact(){
        return contactDao.findAll();
    }
    
     //edition d'un contact
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
    public Optional<Contact> getEditContact(@PathVariable Long id){
        return contactDao.findById(id); 
    }
    
    //enregistrement d'un contact
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public Contact save(@RequestBody Contact c){
        return contactDao.save(c); 
    }
    
     //suppression d'un contact
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id){
        contactDao.deleteById(id);
        return true; 
    }
    
    //update
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT)
    public Contact update(@PathVariable Long id, @RequestBody Contact c){
        c.setId(id);
        return contactDao.save(c);
        
    }
    
      //rechercher un contact
    @RequestMapping(value = "/chercherContact", method = RequestMethod.GET)
    public Page<Contact> chercher(
            @RequestParam(name="mot_cle", defaultValue = "")String mot_cle, 
            @RequestParam(name="page", defaultValue = "0")int page, 
            @RequestParam(name="size", defaultValue = "5")int size){
        return contactDao.chercher("%"+mot_cle+"%", new PageRequest(page, size)); 
    }
        
} 
