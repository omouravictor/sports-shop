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
    public Object create(Object ob) {
        em.getTransaction().begin();
        em.persist(ob);
        em.getTransaction().commit();
        em.refresh(ob);
        return ob;
    }

    @Override
    public Object addUpdate(Object ob) {
        em.getTransaction().begin();
        ob = (Object) em.merge(ob);
        em.getTransaction().commit();
        return ob;
    }

    @Override
    public boolean delete(Object toDelete) {
        try {
            em.getTransaction().begin();
            em.remove(toDelete);
            em.getTransaction().commit();
            return true;
        } catch (Error | Exception e) {
            return false;
        }
    }

    @Override
    public Object findById(int id) {
        Object item = em.find(Object.class, id);
        return item;
    }

    @Override
    public Object findById(long id) {
        Object item = em.find(Object.class, id);
        return item;
    }

    @Override
    public List<Object> find(List<Object> t) {
        return null;
    }

    @Override
    public List<Object> findAll() {
        javax.persistence.criteria.CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Object.class));
        return em.createQuery(cq).getResultList();
    }

    public EntityManagerFactory getFactory() {
        return factory;
    }

    public EntityManager getEm() {
        return em;
    }
}
