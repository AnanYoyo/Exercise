package per.zqa.serviceimpl;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import per.zqa.domain.User;
import per.zqa.service.UserService;
@Component
@DubboService(interfaceClass = UserService.class, version = "1.0.0", timeout = 15000)
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return null;
    }
}
