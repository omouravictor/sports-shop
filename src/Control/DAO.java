package Control;

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

    public T createInBank(T toCreate) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(toCreate);
            entityManager.getTransaction().commit();
            return toCreate;
        } catch (Exception e) {
            return null;
        }
    }

    public T updateInBank(T toUpdate) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(toUpdate);
            entityManager.getTransaction().commit();
            return toUpdate;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean deleteInBank(T toDelete) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(toDelete);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public List getAllFromBank(Class tClass) {
            try {
                javax.persistence.criteria.CriteriaQuery cq;
                cq = entityManager.getCriteriaBuilder().createQuery();
                cq.select(cq.from(tClass));
                return entityManager.createQuery(cq).getResultList();
            } catch (Exception e) {
                return null;
            }
        }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
