package pl.coderslab.homeworkmodule6dzien12.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.homeworkmodule6dzien12.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDao {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Category category) {
        entityManager.persist(category);
    }

    public Category merge(Category category) {
        return entityManager.merge(category);
    }

    public void remove(Category category) {
        entityManager.remove(entityManager.contains(category) ? category : entityManager.merge(category));
    }

    public List<Category> findAll(){
        Query query = entityManager.createQuery("select c from Category c");
        return query.getResultList();
    }
}
