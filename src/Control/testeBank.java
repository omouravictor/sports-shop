package Control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testeBank {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LojaEsportivaPU");
        EntityManager em = emf.createEntityManager();

    }
}
