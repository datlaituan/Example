package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.domain.UserDTO;
import user.port.InputPort;

@RestController
@RequestMapping(path = "/api/v1/Users")
public class UserController {

    @Autowired
    InputPort inputPort;

    @GetMapping("getUser/{id}")
    UserDTO getUserById (@PathVariable Long id){
        return inputPort.getUserById(id);
    }
}
