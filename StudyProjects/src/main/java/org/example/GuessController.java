package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class GuessController {

    @GetMapping("/guess")
    public String first() {
        return "guess.jsp";
    }

    @GetMapping("/guess/{find}")
    public String guess(@PathVariable(name = "find") int find, HttpServletRequest request) {
        Random random = new Random();
        int guess = random.nextInt(10 + 1);
        String answer;
        while (true) {
            if (find > guess) {
                answer = "Wpisana liczba jest większa";
            } else if (find < guess) {
                answer = "Wpisana liczba jest mniejsza";
            } else {
                answer = "Gratulacje trafiłeś";
            }
            request.setAttribute("answer", answer);
            return "guess.jsp";
        }
    }
}