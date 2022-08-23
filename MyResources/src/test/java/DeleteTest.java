import org.junit.Test;

import java.io.File;

/**
 * @author kaede
 * @create 2022-08-21 16:56
 */
public class DeleteTest {

    @Test
    public void testDelete() {
        String prefixPath = "D:/Code/SSM-Vue-Projects/SSM/MyResources/src/main/webapp/dist/static/UserResources/audio/";
        String filePath = prefixPath + "松本文紀 - 夜の向日葵.mp3";
        File file = new File(filePath);
        file.delete();
    }

    @Test
    public void testSplit() {
        String file = " hufeng- 卡同 - jrk.mp3";
        int i = file.lastIndexOf("-");
        String name = file.substring(0, i).trim();
        int i1 = file.lastIndexOf(".mp3");
        String singer = file.substring(i+1,i1).trim();
        String filename = name + "-" + singer + ".mp3";
        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");
        System.out.println(name);
        System.out.println(singer);
        System.out.println(filename);
    }

    @Test
    public void testRename() {
        String prefixPath = "D:/Code/SSM-Vue-Projects/SSM/MyResources/src/main/webapp/dist/static/UserResources/audio/";
        String oldPath = prefixPath + "美郷あき-Glitter1.mp3";
        String newPath = prefixPath + "美郷あき-Glitter2.mp3";
        File file = new File(oldPath);
        file.renameTo(new File(newPath));
        System.out.println(oldPath);
        System.out.println(newPath);
    }

}
