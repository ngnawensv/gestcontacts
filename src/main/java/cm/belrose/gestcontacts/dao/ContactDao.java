/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.belrose.gestcontacts.dao;
import cm.belrose.gestcontacts.entities.Contact;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ngnawen
 */
public interface ContactDao extends JpaRepository<Contact, Long>{
    @Query("select c from Contact c where c.nom like:x")
    public Page<Contact> chercher(@Param("x") String mot_cle, Pageable pageable);
    
}
