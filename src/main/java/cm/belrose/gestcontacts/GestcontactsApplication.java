package cm.belrose.gestcontacts;

import cm.belrose.gestcontacts.dao.ContactDao;
import cm.belrose.gestcontacts.entities.Contact;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestcontactsApplication implements CommandLineRunner{
   
    @Autowired
    private ContactDao contactDao;

	public static void main(String[] args) {
		SpringApplication.run(GestcontactsApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        //contactDao.save(new Contact("NGNAWEN", "Samuel Vermon", df.parse("17/12/1950"), "ngnawens@gmail.com",Long.MAX_VALUE, "Bel.png"));
        //contactDao.save(new Contact("NJUEWET", "Frederic Clovis", df.parse("17/12/2000"), "njuewet@gmail.com",Long.MAX_VALUE, "Bel.png"));
        //contactDao.save(new Contact("DOUDOU", "Felicité", df.parse("17/12/2001"), "ngnawens@gmail.com",Long.MAX_VALUE, "Bel.png"));
        //contactDao.save(new Contact("MBERE", "MBARANDI", df.parse("17/12/1975"), "mbere@gmail.com",Long.MAX_VALUE, "Bel.png"));
        //contactDao.save(new Contact("JACQUES", "Meskine", df.parse("17/12/1940"), "jacque@gmail.com",Long.MAX_VALUE, "Bel.png"));
        //contactDao.findAll().forEach(c->{
       //     System.err.println(c.getNom());
       //  });
    }

}
