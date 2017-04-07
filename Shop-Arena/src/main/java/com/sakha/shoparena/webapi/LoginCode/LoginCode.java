package src.main.java.com.sakha.shoparena.webapi.LoginCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import com.sakha.shoparena.UserDetails;
//import com.sakha.util.HibernateUtil;

public class LoginCode{
	
//Creating a Session
	SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    session.beginTransaction();
    
    //Sample data
  //  UserDetails u1 = new UserDetails("Imran", "Kabir", "imran123", 100, "abc");

    session.persist(u1);
    session.getTransaction().commit();
	session.close();
	
	System.out.println("Record inserted successfully....");
}

}