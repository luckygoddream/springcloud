import java.nio.ByteBuffer;

/**
 * @Author jwq
 * @Date 2023/3/11 15:04
 */
public class TestBytebufferExam {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(32);
        buffer.put("Hello,world\nI'm zhangsan\nHo".getBytes());
        split(buffer);
        buffer.put("w are you?\n".getBytes());
        split(buffer);
    }
    private static void  split(ByteBuffer buffer){
        buffer.flip();
        for (int i = 0; i < buffer.limit(); i++) {
            boolean b = buffer.get(i) == '\n';
            if (b){
                //判断完成数据长度
                int len = i + 1 - buffer.position();
                //完整消息存到新的Bytebuffer
                ByteBuffer target = ByteBuffer.allocate(len);
                //从buffer读向target写
                for (int j = 0; j < len; j++) {
                    target.put(buffer.get());
                }
                ByteBufferUtil.debugAll(target);
            }
        }
        buffer.compact();
    }
}
