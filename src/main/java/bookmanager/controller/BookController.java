package bookmanager.controller;

import bookmanager.model.Book;
import bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired()
    @Qualifier(value = "bookService")
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public String books(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("listbooks", this.bookService.listBooks());
        return "pagebooks";
    }

    /*@RequestMapping(value = "index")
    public String index(Model model) {return "index"; }*/
}
