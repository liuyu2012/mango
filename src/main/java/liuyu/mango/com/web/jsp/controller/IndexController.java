package liuyu.mango.com.web.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制页面访问控制器
 *
 * @author Administrator
 */
@Controller
@RequestMapping("demo")
public class IndexController {

    @RequestMapping("/index")
    public String indexPage() {
        return "indexPage";
    }
}
