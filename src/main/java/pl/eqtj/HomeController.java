package pl.eqtj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.eqtj.DB.DBManager;

import java.util.Random;

@Controller
public class HomeController {
    @Autowired
    DBManager dbManager;
    public long randomNumberCreator() {
        Random rnd = new Random();
        return rnd.nextInt(101);
    }





    @GetMapping("/")
    public String getHomePagewithQuestion(Model model) {

        long numberOfQuery= randomNumberCreator();//losowy numer
        model.addAttribute("dbManagerQ",dbManager.findQuestionById(numberOfQuery));
        model.addAttribute("dbManagerA",dbManager.findAnswerById(numberOfQuery));
        return "index";
    }

    @PostMapping("/")
    public void postResult(Model model) {
//        model.addAttribute() - wysłac wynik do bazy wyniki
        //wywołac kolejne [yttanie

    }
}
