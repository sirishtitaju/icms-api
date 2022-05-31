package com.initial.serviceImpl;
import com.initial.model.Author;
import com.initial.repo.AuthorRepo;
import com.initial.services.AuthorService;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Slice;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;


@Singleton
@Named("Author")
public class AuthorServiceManager implements AuthorService {

    @Inject
    private AuthorRepo authorRepo;

    //_____________________________just for Practice purpose____________________________//

    public List<Author> EveryAuthor()
    {
       return authorRepo.getEveryUser();
    }

    public List<Author> getSomeUser() {
        return authorRepo.getSomeUser();
    }

    public Slice<Author> getSortedUser()
    {
        Slice<Author> slice = authorRepo.list(Pageable.from(0, 5));
//        Slice<Author> slice = authorRepo.list(Pageable.from(0, 3));
        return  slice;
    }
    //_____________________________just for Practice purpose____________________________//


    @Override
    public Author add(Author author) {
         return authorRepo.save(author);
    }

    @Override
    public List<Author> getAll() {
        return (List<Author>) authorRepo.findAll();
    }

    @Override
    public Author updateAuthor(Author author) {
        return  authorRepo.update(author);
    }

    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorRepo.findById(id);
    }

    @Override
    public  void delete(Long Id) {
        authorRepo.deleteById(Id);

    }



//
//    public List<Author> getSomeUser() {
//        return authorRepo.getSomeUser();
//    }
}
