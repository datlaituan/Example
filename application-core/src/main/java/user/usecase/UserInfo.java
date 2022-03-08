package user.usecase;

import user.domain.UserDTO;
import user.port.InputPort;
import user.port.OutputPort;

public class UserInfo implements InputPort {
    private OutputPort outputPort ;

    public UserInfo(OutputPort outputPort) {
        this.outputPort = outputPort;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return outputPort.getUserById(id);
    }
}
