package com.initial.controller;

import com.initial.Exception.NotFoundException;

import com.initial.model.Author;
import com.initial.model.AuthorDTO;
import com.initial.serviceImpl.AuthorServiceManager;
import com.initial.utils.Utility;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.Slice;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import javax.validation.Valid;
import java.util.List;

@Controller("/author")
    public class AuthorController {
    @Inject
    private AuthorServiceManager authorServiceManager;


//____________________________________Just For Cheking purpose of Sorted List____________
    @Get("/every")
    public List<Author> getEveryAuthor()
    {
        var a=authorServiceManager.EveryAuthor();
        a.forEach(e -> System.out.println(e.toString()));
        return a;
    }


    @Get("/everyDay")
    public List<Author> getEveryAuthorBy()
    {
        var a=authorServiceManager.EveryAuthor();
        a.forEach(e -> System.out.println(e.toString()));
        return a;
    }

    @Get("/guys")
    public Slice<Author>  getEverySortedAuthorBy()
    {

        var a=authorServiceManager.getSortedUser();
        a.forEach(e -> System.out.println(e.toString()));
        return a;
    }
//++++++++++++++++++++++++++++++++just for getting sorted list of Author

    //  return HttpResponse.ok(a).header("X-My-Header", "Foo");
    @Post("/add")
    public MutableHttpResponse<?> add(@Valid @Body AuthorDTO authorDTO)  {
        try {
            System.out.println("hello");
           return (MutableHttpResponse<?>) authorServiceManager.add(Utility.getAuthorDTO(authorDTO));
//            return HttpResponse.ok(authorServiceManager.addAuthor(author)).header("Posted Status", "True");
        }
        catch (Exception e)
            {//exception pani liyena??
                  e.printStackTrace();
//               throw (new CustomException("Can't Post ",HttpStatus.BAD_REQUEST));
                return HttpResponse.badRequest().body("Author can't be black");
            }

    }


    @Post()
    public HttpResponse<?> addAuthor(@Body Author author) {
        try {
            System.out.println(author);
            System.out.println("Hello world from add author");
           // AuthorDto authorDto = Utility.getAuthorDTO(author);
           return HttpResponse.created(authorServiceManager.add(author));

//            return HttpResponse.ok(authorServiceManager.addAuthor(author)).header("Posted Status", "True");
        }
        catch (Exception e)
            {
                  e.printStackTrace();
//                throw (new CustomException("Can't Post ",HttpStatus.BAD_REQUEST));
                return HttpResponse.badRequest().body("Author can't be blank");
            }

    }



    @Get("/{id}")
    public Author getAuthor(@PathVariable Long id)
    {
        System.out.println("Hello from author");
        return  authorServiceManager.getAuthor(id).orElseThrow(()-> new NotFoundException("Author not found exception") );
    }
    @Delete("/{id}")
    public boolean deleteAuthor(@PathVariable Long id )
    {   authorServiceManager.delete(id);
        return true;
    }

    @Put
    public Author updateAuthor(@Body Author author)
    {
        return  authorServiceManager.updateAuthor(author);
    }


    @Get("/all")
    public List<Author> getAll()
    {
        return  authorServiceManager.getAll();
    }

    @Get("/some")
    public List<Author> getSomeAuthor(){
        return authorServiceManager.getSomeUser();

    }
}
