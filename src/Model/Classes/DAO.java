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
        factory = Persistence.createEntityManagerFactory("LojaPU");
        em = getEntityManager();
    }

    public EntityManager getEntityManager() {
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }

    @Override
    public Object create(Object cli) {
        em.getTransaction().begin();
        em.persist(cli);
        em.getTransaction().commit();
        em.refresh(cli);
        return cli;
    }

    @Override
    public Object addUpdate(Object edited) {
        em.getTransaction().begin();
        edited = (Object) this.getEntityManager().merge(edited);
        em.getTransaction().commit();
        return edited;
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
}
