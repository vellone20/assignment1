package ca.sheridancollege.vellone.assignment1;

//import javax.swing.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;


@Controller
public class ChoiceController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/game")
    public String processChoice(Model model, @RequestParam int value){

        Random rn = new Random();
        int cAnswer = 0;
        for(int i=0; i < 1; i++)
        {
            int answer = rn.nextInt(3) + 1;
            cAnswer = answer;
        }

        if (cAnswer > value)
        {
            model.addAttribute("winner", "you win");
            return "output";
        }
        else if (cAnswer < value)
        {
            model.addAttribute("winner", "you lose");
            return "output";
        }
        else
        {
            model.addAttribute("winner", "tie");
            return "output";
        }
    }
}
