package kasad0r.chucknorrisjokes.controllers;

import kasad0r.chucknorrisjokes.services.RandomQuot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final RandomQuot randomQuot;

    public JokeController(RandomQuot randomQuot) {
        this.randomQuot = randomQuot;
    }

    @GetMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", randomQuot.getRandomQuote());
        return "chucknorris";
    }
}
