package com.initial.serviceImpl;

import com.initial.model.ArticleDTO;
import com.initial.services.ArticleService;
import com.initial.model.Article;
import com.initial.repo.ArticleRepo;
import com.initial.utils.Utility;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class ArticleServiceManager implements ArticleService {

    @Inject
    private ArticleRepo articleRepo;



    @Override
    public Article getByAuthorLinkAndAuthorId(String authorLink, Integer id) {
        return articleRepo.findByAuthorLinkAndAuthorId(authorLink,id);
    }

    @Override
    public Article add(Article article) {
        System.out.println("gsm: articleAddManager: " + article.toString());
        return articleRepo.save(article);
    }





    @Override
    public List<Article> getArticles() {
        return (List<Article>) articleRepo.findAll();
    }



    @Override
    public List<Article> getSortedArticle() {
        return articleRepo.getSortedArticle();
    }

    @Override
    public Article getArticlesByIds(Integer aId, Integer cId, Integer pId) {
        return  articleRepo.findByAuthorIdAndCategoryIdAndProductId(aId,cId,pId);
    }
//
//    @Override
//    public List<Article> getArticlesByAuthorId(Integer aId) {
//        return articleRepo.findByAuthorId(aId);
//    }


    @Override
    public ArticleDTO addArticle(ArticleDTO articleDTO) {
        Article article1 = Utility.getArticle(articleDTO);

        Article article2 = articleRepo.save(article1);
        System.out.println("printing Main DTOARTICLE_________________________________________");

        ArticleDTO article2DTO = Utility.getArticleDTO(article2);

        System.out.println("printing Main DTOARTICLE_________________________________________");
        System.out.println(article2DTO);
        return article2DTO;
        //return Utility.getArticleDTO(articleRepo.save(Utility.getArticle(article)));
    }




    @Override
    public List<Article> getPublishedArticle() {
        return null;
    }

    @Override
    public List<Article> getDraftArticle() {
        return null;
    }




    @Override
    public Article updateArticle(Article article) {
        return null;
    }

    @Override
    public boolean deleteArticleBy(String providerKey) {
        articleRepo.deleteByProviderKey(providerKey);
        return true;
    }

//    @Override
//    public Article findArticleBy(String providerKey) {
//        return articleRepo.findByProviderKey(providerKey);

    @Override
    public boolean publishArticle(String providerKey) {
        return false;
    }

    @Override
    public Article getByAuthor(String author) {
        return articleRepo.findByAuthorLink(author);
    }

//    @Override
//    public Article getArticleByGtm(String gtm) {
//        Article article = articleRepo.findByGtm(gtm);
//        if( article != null){
//           return article;
//        }
//        throw new ArticleNotFoundException();
//    }

    @Override
    public Article getArticleByKicker(String kicker) {
        return articleRepo.findByKicker(kicker);
    }

//    @Override
//    public Article getArticleByKickerAndGtm(String kicker, String gtm) {
//        return articleRepo.findByGtmAndKicker(gtm,kicker);
//    }

    @Override
    public Article getArticleByProviderKeyAndAuthorLink(String providerKey, String authorLink) {
        return articleRepo.findByProviderKeyAndAuthorLink(providerKey,authorLink);
    }

    @Override
    public Article getArticleByTitleAndId(String title, Integer id) {
        return articleRepo.findByTitleAndId(title,id);
    }

    @Override
    public List<Article> getArticlesByAuthorId(Integer aId) {
        return articleRepo.findByAuthorId(aId);
    }

    @Override
    public List<Article> getArticlesByCategoryId(Integer cId) {
        return articleRepo.findByCategoryId(cId);
    }

    @Override
    public List<Article> getArticlesByProductId(Integer pId) {
        return articleRepo.findByProductId(pId);
    }


    public Article getByTitleAndProviderKey(String title, String providerKey)
    {
        return articleRepo.findByTitleAndProviderKey(title,providerKey);
    }
    public Article getByTitle(String title)
    {
        return articleRepo.findByTitle(title);
    }



    @Override
    public Article get(String providerkey) {
        return articleRepo.findByProviderKey(providerkey);
    }

    @Override
    public Optional<Article> getById(Integer id) {
        return articleRepo.findById(id);
    }



}


