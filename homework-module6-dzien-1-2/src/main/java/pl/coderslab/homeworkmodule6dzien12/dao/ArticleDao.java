package pl.coderslab.homeworkmodule6dzien12.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.homeworkmodule6dzien12.entity.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ArticleDao {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Article article) {
        entityManager.persist(article);
    }

    public Article merge(Article article) {
        return entityManager.merge(article);
    }

    public void remove(Article article) {
        entityManager.remove(entityManager.contains(article) ? article : entityManager.merge(article));
    }
    public List<Article> findAll(){
        Query query = entityManager.createQuery("select a from Article a");
        return query.getResultList();
    }

}
