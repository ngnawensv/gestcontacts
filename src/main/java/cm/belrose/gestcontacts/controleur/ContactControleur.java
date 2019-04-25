/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.gestcontacts.controleur;

import cm.belrose.gestcontacts.entities.Contact;
import cm.belrose.gestcontacts.service.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ngnawen
 */
@RestController
public class ContactControleur {

    @Autowired
    private ContactService contactService;

    //méthode pour lister tous les contacts
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public List<Contact> findAll() throws Exception {
        return contactService.findAll();
    }

    //edition d'un contact
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
    public Contact findContactById(@PathVariable Long id) throws Exception {
        return contactService.findById(id);
    }

    //enregistrement d'un contact
    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public Contact create(@RequestBody Contact c) throws Exception {
        return contactService.create(c);
    }

    //suppression d'un contact
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id) throws Exception {
        Contact contact = contactService.findById(id);
        contactService.delete(contact);
        return true;
    }

    //update
    @RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT)
    public Contact update(@PathVariable Long id, @RequestBody Contact c) throws Exception {
        c.setId(id);
        return contactService.update(c);

    }     
}
