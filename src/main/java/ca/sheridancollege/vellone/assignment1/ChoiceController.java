package ca.sheridancollege.vellone.assignment1;

//import javax.swing.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;


@Controller
public class ChoiceController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/game")
    public String choice1(Model model, @RequestParam String selection1) {
        model.addAttribute("name", selection1);
        return "output";
    }
    public String choice2(Model model, @RequestParam String selection2) {
        model.addAttribute("name", selection2);
        return "output";
    }
    public String choice3(Model model, @RequestParam String selection3) {
        model.addAttribute("name", selection3);
        return "output";
    }
}


//        Random rn = new Random();
//        int cAnswer = 0;
//        for(int i=0; i < 1; i++)
//        {
//            int answer = rn.nextInt(3) + 1;
//            cAnswer = answer;
//        }





//        if (cAnswer > value)
//        {
//            model.addAttribute("result", "Winner");
//            return "output";
//        }
//        else if (cAnswer < value)
//        {
//            model.addAttribute("winner", "you lose");
//            return "output";
//        }
//        else
//        {
//            model.addAttribute("winner", "tie");
//            return "output";
//        }
