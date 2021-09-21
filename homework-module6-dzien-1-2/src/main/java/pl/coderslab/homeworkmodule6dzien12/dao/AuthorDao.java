package pl.coderslab.homeworkmodule6dzien12.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.coderslab.homeworkmodule6dzien12.entity.Author;

import java.util.List;

@Repository
@Transactional
public class AuthorDao {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Author author) {
        entityManager.persist(author);
    }

    public Author merge(Author author) {
        return entityManager.merge(author);
    }

    public void remove(Author author) {
        entityManager.remove(entityManager.contains(author) ? author : entityManager.merge(author));
    }

    public List<Author> findAll(){
        Query query = entityManager.createQuery("select a from Author a");
        return query.getResultList();
    }
}
