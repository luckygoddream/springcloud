import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * @Author jwq
 * @Date 2023/3/11 14:03
 */
public class TestBytebufferString {
    public static void main(String[] args) {
        //1. 字符串转为Bytebuffer
        ByteBuffer buffer = ByteBuffer.allocate(16);
        buffer.put("hello".getBytes());
        ByteBufferUtil.debugAll(buffer);

        //2.Charset
        ByteBuffer buffer2 =StandardCharsets.UTF_8.encode("hello");
        ByteBufferUtil.debugAll(buffer2);

        //3. wrap
        ByteBuffer buffer3 = ByteBuffer.wrap("hello".getBytes());
        ByteBufferUtil.debugAll(buffer3);

        //转为字符串
        String string = StandardCharsets.UTF_8.decode(buffer2).toString();
        System.out.println(string);

        buffer.flip();
        String string1 = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println(string1);
    }
}
