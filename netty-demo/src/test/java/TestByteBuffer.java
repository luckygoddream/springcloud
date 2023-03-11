import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author jwq
 * @Date 2023/3/11 12:33
 */
@Slf4j
public class TestByteBuffer {
    public static void main(String[] args) {
        //FileChannel
        //1.输入输出流，2.RandomAccessFile
        try (FileChannel channel = new FileInputStream("D://data.txt").getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(10);

            while (true) {
                //从Channel读取数据，向buffer写入
                 int len = channel.read(buffer);
                log.debug("读取到的字节：{}", len);
                if (len == -1){
                    break;
                }
                //打印buffer内容
                buffer.flip();//切换读模式
                while (buffer.hasRemaining()) {//检查是否还有剩余的未读的数据
                    //无参，读一个字节
                    byte b = buffer.get();
                    log.debug("实际字节：{}", (char) b);
                }
                buffer.clear();//切换为写模式
            }
        } catch (IOException e) {
            log.debug("error:{}", e);
        }
        ;

    }
}
