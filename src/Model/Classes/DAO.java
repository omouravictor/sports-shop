package Model.Classes;

import Model.Interfaces.IDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO implements IDAO {

    protected EntityManagerFactory factory;
    protected EntityManager em;

    public DAO() {
        factory = Persistence.createEntityManagerFactory("LojaEsportivaPU");
        em = factory.createEntityManager();
    }

    @Override
    public boolean create(Object toCreate) {
        try {
            em.getTransaction().begin();
            em.persist(toCreate);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Object ob) {
        try {
            em.getTransaction().begin();
            em.merge(ob);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(Object toDelete) {
        try {
            em.getTransaction().begin();
            em.remove(toDelete);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Object getObjectById(Class classToLookFor, long id) {
        Object obFinded = em.find(classToLookFor, id);
        return obFinded;
    }

    @Override
    public List<Object> getAllObjects(Class classToLookFor) {
        javax.persistence.criteria.CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(classToLookFor));
        return em.createQuery(cq).getResultList();
    }

    public EntityManagerFactory getFactory() {
        return factory;
    }

    public EntityManager getEm() {
        return em;
    }
}
