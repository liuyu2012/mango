package liuyu.mango.com.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ?????????
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(String username, String userpwd) {
        return "??????";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
