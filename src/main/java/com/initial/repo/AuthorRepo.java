package com.initial.repo;

import com.initial.model.Article;
import com.initial.model.Author;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.intercept.annotation.DataMethodQueryParameter;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Slice;
import io.micronaut.data.model.Sort;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.http.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepo extends CrudRepository<Author,Long> {

@Query("select u from Author u")
    public List<Author> getEveryUser();

//    @Query("select u from Author u WHERE  u.authorProfile= :authorProfile2")

//    public List<Author> getSomeUser(@DataMethodQueryParameter(name = "a2")String authProfile2);
    //id

    @Query("select u from Author u order by u.authorName desc ")
    public List<Author> getSomeUser();

    Slice<Author> list(Pageable from);


//    @Query("select u from Author u order by u.id")
//    public List<Author> getSomeUser();
//



}
