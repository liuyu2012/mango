package liuyu.mango.com.web.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ???????????????
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


//~ Formatted by Jindent --- http://www.jindent.com
