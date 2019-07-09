package user.service.provider.service;

import com.heheda.api.domain.User;
import com.heheda.api.server.UserServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: spring-cloud
 * @package_name: user.service.provider.service
 * @name: InMemoryUserService
 * @description: 实现用户数据接口
 * @author: clx
 * @create: 2019-07-09 17:54
 **/
public class InMemoryUserService implements UserServer {

    private Map<Long,User> repository=new ConcurrentHashMap<>();
    @Override
    public List<User> getAllUser() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public boolean saveUser(User user) {
        return repository.put(user.getId(),user)==null;
    }
}
