import com.kaede.user.pojo.User;
import com.kaede.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author kaede
 * @create 2022-08-20 12:55
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        List<User> users = userService.selectAll();
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println(users);
    }

}
