import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

/**
 * @Author jwq
 * @Date 2023/3/11 23:37
 */
@Slf4j
public class Server {
    public static void main(String[] args) throws IOException {
        //使用nio来理解阻塞模式,单线程
        //0.Bytebuffer
        ByteBuffer buffer = ByteBuffer.allocate(16);
        //1.创建了服务器
        ServerSocketChannel ssc = ServerSocketChannel.open();
        //绑定监听端口
        ssc.bind(new InetSocketAddress(8080));

        //3.连接集合
        ArrayList<SocketChannel> channels = new ArrayList<>();

        while (true){
            //4.accept建立与客户端的连接，SocketChannel用来与客户端之间通信
            log.debug("connecting...");
            SocketChannel sc = ssc.accept();
            log.debug("connected...");
            channels.add(sc);
            for (SocketChannel channel : channels) {
                //5.接受客户端发送的数据
                log.debug("before read...{}",channel);
                channel.read(buffer);
                buffer.flip();
                ByteBufferUtil.debugRead(buffer);
                buffer.clear();
                log.debug("after read...{}",channel);
            }
        }

    }
}
