package Control.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;

    public DAO() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("LojaEsportivaPU");
            entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            System.out.println("NO CONECTION WITH BANK.");
        }
    }

    public T createInBank(T toCreate) throws Exception {
        // Sends the Exception to the Managers
        entityManager.clear();
        entityManager.getTransaction().begin();
        entityManager.persist(toCreate);
        entityManager.getTransaction().commit();
        return toCreate;
    }

    public T updateInBank(T toUpdate) throws Exception {
        // Sends the Exception to the Managers
        entityManager.clear();
        entityManager.getTransaction().begin();
        entityManager.merge(toUpdate);
        entityManager.getTransaction().commit();
        return toUpdate;
    }

    public void deleteInBank(T toDelete) throws Exception {
        // Sends the Exception to the Managers
        entityManager.clear();
        entityManager.getTransaction().begin();
        if (!entityManager.contains(toDelete)) {
            toDelete = entityManager.merge(toDelete);
        }
        entityManager.remove(toDelete);
        entityManager.getTransaction().commit();
    }

    public List<T> getAllFromBank(Class tClass) {
        try {
            entityManager.clear();
            javax.persistence.criteria.CriteriaQuery cq;
            cq = entityManager.getCriteriaBuilder().createQuery();
            cq.select(cq.from(tClass));
            return entityManager.createQuery(cq).getResultList();
        } catch (Exception ex) {
            System.out.println("getALLFromBank() FAILED IN DAO CLASS.");
            return null;
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
