package com.offcn;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
        String message = "hello thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }
    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User();
        user.setId(1);
        user.setName("优就业");
        user.setAge(18);
        model.addAttribute("user",user);
        Map<String,Object> map = new HashMap<>();
        map.put("src","boy.jpg");
        model.addAttribute("src",map);
        return "index2";
    }
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"迪迦",300000));
        list.add(new User(2,"泰罗",300000));
        list.add(new User(3,"赛文",300000));
        list.add(new User(4,"盖亚",300000));
        model.addAttribute("list",list);
        return "index3";

    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","迪迦");
        model.addAttribute("href","http://www.ujiuye.com");
        return "index4";
    }
    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","admin");
        model.addAttribute("manage","dijia");
        return "index5";
    }

    @RequestMapping("/index7")
    public String index7(Model model){
        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        //数字的格式化
        model.addAttribute("num",1234.5678);
        //字符串
        String str = "2020-10-22 11:27:49.779  INFO 20280 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\n" +
                "2020-10-22 11:27:49.789  INFO 20280 --- [           main] com.offcn.ThymeleafdemoApplication       : Started ThymeleafdemoApplication in 2.258 seconds (JVM running for 3.754)\n" +
                "2020-10-22 11:27:53.710  INFO 20280 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'\n" +
                "2020-10-22 11:27:53.710  INFO 20280 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'\n" +
                "2020-10-22 11:27:53.724  INFO 20280 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 14 ms";
        model.addAttribute("str",str);
        //字符串的截取
        String str2 = "java-offcn-00615";
        model.addAttribute("str2",str2);
        return "index7";
    }

}
