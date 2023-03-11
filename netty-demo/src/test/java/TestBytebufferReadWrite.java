import java.nio.ByteBuffer;

/**
 * @Author jwq
 * @Date 2023/3/11 13:26
 */
public class TestBytebufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);//分配空间
        buffer.put((byte)0x61); //0x61 = a
        ByteBufferUtil.debugAll(buffer);
        buffer.put(new byte[]{0x62,0x63,0x64});
        ByteBufferUtil.debugAll(buffer);
       // System.out.println(buffer.get());
        buffer.flip();//切换读模式
        System.out.println(buffer.get());
        ByteBufferUtil.debugAll(buffer);
        buffer.compact();//切换写模式
        ByteBufferUtil.debugAll(buffer);
        buffer.put(new byte[]{0x65,0x66});
        ByteBufferUtil.debugAll(buffer);
    }
}
