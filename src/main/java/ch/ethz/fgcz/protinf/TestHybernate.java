package ch.ethz.fgcz.protinf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 * Created by witold on 17/08/15.
 */

public class TestHybernate {
    public void createinserts() {
        Random r = new Random();

        Map addedOrOverridenProperties = new HashMap();
        addedOrOverridenProperties.put("javax.persistence.jdbc.url", "jdbc:sqlite:sample.db");
        //properties.put("javax.persistence.jdbc.user", dbUser); //if needed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test", addedOrOverridenProperties);
        EntityManager em = emf.createEntityManager();
        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 1000000; ++i) {
            String name = "bla";
            //SpecnautInputTable product1 = new SpecnautInputTable( name + i, r.nextDouble(), r.nextDouble() );
           // Persisting the product entity objects
            //em.persist(product1);
        }

        tx.commit();
        long endTime = System.currentTimeMillis();
        System.out.println("insert time :" + (endTime - startTime )/1000);

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT p FROM SpecnautInputTable p");

        //@SuppressWarnings("unchecked")
        //List<SpecnautInputTable> results = q.getResultList();
        //System.out.println("result length :" + results.size());

        System.out.println("List of products\n----------------");

        //for (SpecnautInputTable p : results) {
            //System.out.println(p.getId() + " " + p.getName() + " " + p.getqScore() + " " + p.getIntentsity()  );
        //}

        // Closing connection
        em.close();
        emf.close();
    }

    public static void main(String[] args) {
        TestHybernate th= new TestHybernate();
        th.createinserts();
    }

}
