import com.kaede.myResources.pojo.Audio;
import com.kaede.myResources.service.AudioService;
import com.kaede.myResources.service.impl.AudioServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author kaede
 * @create 2022-08-18 13:22
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AudioServiceTest {

    @Autowired
    private AudioService audioService = new AudioServiceImpl();

    @Test
    public void selecAll() {
        List<Audio> audioList = audioService.selectAll();
        audioList.forEach(x -> System.out.println(x));
    }

}
