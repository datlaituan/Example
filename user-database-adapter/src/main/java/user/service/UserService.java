package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.dao.UserRepository;
import user.domain.UserDTO;
import user.entity.UserEntity;
import user.port.OutputPort;

import java.util.Optional;

@Service
public class UserService implements OutputPort {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserById(Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        UserDTO userDTO = new UserDTO();
        if (user.isPresent()) {
            userDTO.setAge(user.get().getAge());
            userDTO.setName(user.get().getName());
        }
        return userDTO;
    }
}

