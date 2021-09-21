package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String userAgent(HttpServletRequest request, Model model) {
        String browserName = request.getHeader("User-Agent");
        model.addAttribute("browserName", browserName);
        return "userAgent.jsp";
    }
}