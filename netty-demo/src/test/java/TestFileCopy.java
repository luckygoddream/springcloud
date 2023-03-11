import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author jwq
 * @Date 2023/3/11 23:11
 */
public class TestFileCopy {
    public static void main(String[] args) throws IOException {
        String source = "D:\\test";
        String target = "D:\\te";

        Files.walk(Paths.get(source)).forEach(path -> {
            try {
                String targetName = path.toString().replace(source, target);
                //是目录
                if (Files.isDirectory(path)) {
                    Files.createDirectory(Paths.get(targetName));
                }else if (Files.isRegularFile(path)){//是普通文件
                    Files.copy(path,Paths.get(targetName));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
