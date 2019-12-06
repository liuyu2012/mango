package liuyu.mango.com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问控制器
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/query")
public class WebController {
    @GetMapping("/echo")
    public String echo() {
        return "第一次访问数据";
    }
}



