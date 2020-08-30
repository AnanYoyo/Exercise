package per.zqa.web.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import per.zqa.domain.User;
import per.zqa.service.UserService;

@Controller
@RequestMapping("/springboot/user")
public class UserController {
    @DubboReference(interfaceClass = UserService.class, version = "1.0.0", check = false)
    private UserService userService;

    @RequestMapping("/detail/{id}")
    public String userDetail(Model model, @PathVariable("id") Integer id) { // restful请求路径，根据路径获取值

        User user = userService.queryUserById(id);

        model.addAttribute(user);

        return "detail";

    }

}
