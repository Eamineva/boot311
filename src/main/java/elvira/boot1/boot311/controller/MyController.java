package elvira.boot1.boot311.controller;


import elvira.boot1.boot311.model.User;
import elvira.boot1.boot311.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MyController {

    private final UserService userService;
@Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/")
    public String ShowUser(Model model){
        model.addAttribute("user",userService.listUsers());
        return "index";
    }
    @GetMapping ("/addNewUser")
    public String addNewUser (Model model){
       // User user1=new User();
        model.addAttribute("user", new User());
        return "view1";
    }
    @PostMapping  ("/saveNewUser")
    public String saveNewUser (@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/";
    }
    @PostMapping("/delUser")
    public String delUser(Long id){
        userService.delUser(id);
        return "redirect:/";
    }


    @GetMapping ("/upUser")
    public String upUser (Model model, long id){

        model.addAttribute("user", userService.show(id));
        return "user_update";
    }

    @PatchMapping("/updateUser/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") long id){
        userService.updUser(id, user);
        return "redirect:/";
    }

}
