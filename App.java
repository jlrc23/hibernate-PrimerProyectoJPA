package com.openwebinars.hibernate.PrimerProyecto2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
/*        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyecto2");
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();*/
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyecto2");

        //Generamos un EntityManager
        EntityManager em = emf.createEntityManager();

        //Iniciamos una transacción
        em.getTransaction().begin();
        
        User user1 = new User();
        user1.setId(2);
        user1.setUserName("Pepe1");
        user1.setUserMessage("Hola mundo desde JPA pepe");
        
        User user2 = new User();
        user2.setId(3);
        user2.setUserName("Juan1");
        user2.setUserMessage("Hola mundo desde JAP Juan");
        
        
        em.persist(user1);
        em.persist(user2);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}
