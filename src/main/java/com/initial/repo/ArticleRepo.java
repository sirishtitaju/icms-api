package com.initial.repo;


import com.initial.model.Article;
import com.initial.model.ArticleDTO;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Sort;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ArticleRepo extends CrudRepository<Article, Integer> {
//      Optional<Article> findByProviderKey(Long id);
//
//    Author save(Author author);
//
//    void deleteByProviderKey(Long id);
//
//    List<Article> findAll();
//
//    void updateArticle(Long id, Article article);

    Article findByProviderKey(String providerKey);
    void deleteByProviderKey(String providerKey);

    public Article findByTitleAndProviderKey(String title,String providerKey);
    public Article findByTitle(String title);

//    public List<Article> findByAuthorLink(String authorLink);
    public Article findByAuthorLink(String authorLink);

    public Article findByKicker(String kicker);
//    public Article findByGtmAndKicker(String gtm, String kicker);
    public Article findByProviderKeyAndAuthorLink(String providerKey, String authorLink);
    public Article findByAuthorIdAndCategoryIdAndProductId(Integer authorId, Integer categoryId, Integer productId);
    public Article findByTitleAndId(String title, Integer id);
    public List<Article> findByAuthorId(Integer aid);
    public List<Article> findByCategoryId(Integer cId);
    public List<Article> findByProductId(Integer pId);





    /**/
}
