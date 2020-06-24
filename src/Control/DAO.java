package Control;

import Model.Interfaces.IDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO implements IDAO {

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

    @Override
    public Object createInBank(Object toCreate) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(toCreate);
            entityManager.getTransaction().commit();
            return toCreate;
        } catch (Exception e) {
            return "ERRO ON CREATE IN THE BANK.";
        }
    }

    @Override
    public Object updateInBank(Object toUpdate) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(toUpdate);
            entityManager.getTransaction().commit();
            return toUpdate;
        } catch (Exception e) {
            return "ERRO ON UPDATE IN THE BANK.";
        }
    }

    @Override
    public boolean deleteInBank(Object toDelete) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(toDelete);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Object> getAllFromBank(Class classToLookFor) {
        try {
            javax.persistence.criteria.CriteriaQuery cq;
            cq = entityManager.getCriteriaBuilder().createQuery();
            cq.select(cq.from(classToLookFor));
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
