import java.nio.ByteBuffer;

/**
 * @Author jwq
 * @Date 2023/3/11 13:51
 */
public class TestBytebufferRead {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a','b','c','d'});
        buffer.flip();
        //从头开始读
//        buffer.get(new byte[4]);
//        ByteBufferUtil.debugAll(buffer);
//        buffer.rewind();
//        System.out.println(buffer.get());
        //mark & reset
        //mark做一个标记，记录position位置，reset是将position重置到Mark的位置
//        System.out.println((char)buffer.get());
//        System.out.println((char)buffer.get());
//        buffer.mark();//加标记，索引2的位置
//        System.out.println((char)buffer.get());
//        System.out.println((char)buffer.get());
//        buffer.reset();//将position重置到索引2
//        System.out.println((char)buffer.get());
//        System.out.println((char)buffer.get());
        System.out.println((char)buffer.get(3));
        ByteBufferUtil.debugAll(buffer);
    }
}
