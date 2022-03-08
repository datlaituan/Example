package user.port;

import user.domain.UserDTO;

public interface InputPort {
    public UserDTO getUserById(Long id);
}
