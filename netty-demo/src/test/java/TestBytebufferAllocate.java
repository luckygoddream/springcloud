import java.nio.ByteBuffer;

/**
 * @Author jwq
 * @Date 2023/3/11 13:38
 */
public class TestBytebufferAllocate {
    public static void main(String[] args) {
        //class java.nio.HeapByteBuffer java堆内存，读写效率低，受到垃圾回收影响
        System.out.println(ByteBuffer.allocate(16).getClass());
        //class java.nio.DirectByteBuffer 直接内存，读写效率高（少一次拷贝），不会受到gc影响，分配内存效率低，使用不当会内存泄露
        System.out.println(ByteBuffer.allocateDirect(16).getClass());
    }
}
