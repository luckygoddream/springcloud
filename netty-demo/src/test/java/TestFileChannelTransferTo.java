import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @Author jwq
 * @Date 2023/3/11 15:44
 */
public class TestFileChannelTransferTo {
    public static void main(String[] args) {
        try {
            FileChannel from = new FileInputStream("D://data.txt").getChannel();
            FileChannel to = new FileOutputStream("D://to.txt").getChannel();
            //效率高，底层操作系统的零拷贝优化，数据上限一次最多2g
            long size = from.size();
            //left剩余多少没有传输
            for (long left = size; left > 0; ) {
                left -= from.transferTo((size - left), left, to);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
