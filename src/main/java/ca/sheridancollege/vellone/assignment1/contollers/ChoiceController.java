package ca.sheridancollege.vellone.assignment1.contollers;

import ca.sheridancollege.vellone.assignment1.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChoiceController {

    @RequestMapping("/")//
    public String index(){
        return "index";
    }

    @RequestMapping("/output")// routs to output
    public ModelAndView choice(@RequestParam ("selection") int value) {// selection being stored int value
        ModelAndView modelAndView = new  ModelAndView("output");
        Game game = new Game();//create obj game
        game.setHand();//set hand
        game.setUserChoice(value);//setting userChoice
        game.winner();//set winner
        modelAndView.addObject("game", game);//passes object to output
        System.out.println("userChoice:" + value);
        return modelAndView;
    }
}


