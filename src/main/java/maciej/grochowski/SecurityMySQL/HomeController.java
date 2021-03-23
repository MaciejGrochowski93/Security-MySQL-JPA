package maciej.grochowski.SecurityMySQL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Speak, traveller";
    }

    @GetMapping("/user")
    public String user(){
        return "You n'wah";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Is that the best you can do?";
    }
}
