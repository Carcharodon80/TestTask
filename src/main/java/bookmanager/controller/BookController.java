package bookmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @RequestMapping(value = "books")
    public String books(Model model){
        return "pagebooks";
    }
}
