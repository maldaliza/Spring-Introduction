package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    /*
        요청이 오면 첫번째 스프링 컨테이너 안의 관련 컨트롤러가 있는지 먼저 확인한다.
        없다면 resources/static/ 안을 찾는다.
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
