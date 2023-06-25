package demo3041.server.controller.api;

import demo3041.common.UserModel;
import demo3041.common.UserService;
import demo3041.server.dso.dao.UserDao;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Inject;

/**
 * @author noear 2021/4/22 created
 */
@Component
public class UserServiceImpl implements UserService {
    @Inject
    UserDao userDao;

    @Override
    public UserModel getUser(String name) {
        UserModel user = userDao.getUser();

        return user;
    }
}
