package ca.sheridancollege.vellone.assignment1;

//import javax.swing.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ChoiceController {
    //JRadioButton radioButton = new JRadioButton(
            //"<html>Show options before adding<br>to version control</html>");



    List<Choice> choices = new ArrayList<Choice>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/game")
    public String processChoice(Model model, @RequestParam int rock, @RequestParam int paper,
                                  @RequestParam int scissors){

        Random rn = new Random();
        for(int i =0; i < 1; i++)
        {
            int answer = rn.nextInt(3) + 1;
        }


        //int total = grommets.size();
        //int bonusGrommets = total/20;

        //for (int i=1; i<=bonusGrommets; i++)
            //grommets.add(new Grommet("Pink", "#"));

        //model.addAttribute("grommetList", grommets);

        return "output";
    }
}
