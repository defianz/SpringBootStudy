package me.hyungchul.spinrgapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    BookRepository bookRepository;

//
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    }

    @Autowired(required = false)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

}
