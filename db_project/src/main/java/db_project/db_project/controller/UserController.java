package db_project.db_project.controller;

import db_project.db_project.domain.User;
import db_project.db_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String UserList(Model model) {
        List<User> users = userService.findUsers();
        model.addAttribute("users", users);
        return "user/userList";
    }

}
