package util;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {

   ///private String url = "jdbc:mysql://192.168.1.9";
    ////"jdbc:mysql://192.168.1.9 ; user= dba; password= sql"

   EntityManager em ;
   static PersistenceUtil ps= null;


    private PersistenceUtil(String connectionString) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( connectionString);
        em = emf.createEntityManager();
    }

    public static PersistenceUtil getInstance() {
        return ps;
    }

    public static void openConnection (String connectionString)
    {
        if(ps== null)
        {
            ps= new PersistenceUtil(connectionString);
        }

    }

    public EntityManager getEm() {
        return em;
    }

    public static void closeConnection()
    {
        EntityManager x = ps.getEm();
        System.out.println(x);
    }



}
