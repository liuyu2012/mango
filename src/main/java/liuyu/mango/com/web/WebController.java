package liuyu.mango.com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ?????????
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/query")
public class WebController {
    @GetMapping("/echo")
    public String echo() {
        return "?????????????";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
