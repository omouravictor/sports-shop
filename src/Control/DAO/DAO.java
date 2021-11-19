package Control.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {

    protected EntityManagerFactory emFactory;
    protected EntityManager em;

    public DAO() {
        try {
            emFactory = Persistence.createEntityManagerFactory("SportsShopPU");
            em = emFactory.createEntityManager();
        } catch (Exception e) {
            System.out.println("SEM CONEXÃO COM O BANCO DE DADOS.");
            System.exit(0);
        }
    }

    public T createInBank(T t) throws Exception {
        // Sends the Exception to the Managers
        em.clear();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        return t;
    }

    public T updateInBank(T t) throws Exception {
        // Sends the Exception to the Managers
        em.clear();
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        return t;
    }

    public void deleteInBank(T t) throws Exception {
        // Sends the Exception to the Managers
        em.clear();
        em.getTransaction().begin();
        if (!em.contains(t)) {
            t = em.merge(t);
        }
        em.remove(t);
        em.getTransaction().commit();
    }

    public List<T> getAllFromBank(Class tClass) {
        em.clear();
        javax.persistence.criteria.CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(tClass));
        return em.createQuery(cq).getResultList();
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
