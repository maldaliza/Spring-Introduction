package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "재국");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody       // 리턴 값을 body부에 직접 넣어주겠다. => viewResolver를 사용하지 않음
    public String helloString(@RequestParam("name") String name) {
        return "Hello! My Name is " + name;         // "Hello! My Name is 재국" => 문자(열)를 리턴
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();      // 객체 생성
        hello.setName(name);        // parameter로 넘어온 name을 넣는다.
        return hello;           // 객체를 리턴
    }

    static class Hello {            // static class로 만들면 public class 안에서 클래스를 만들 수 있다.
        private String name;        // key
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
