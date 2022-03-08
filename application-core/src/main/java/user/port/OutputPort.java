package user.port;

import user.domain.UserDTO;

public interface OutputPort {
    public UserDTO getUserById(Long id);
}
