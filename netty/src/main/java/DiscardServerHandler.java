import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * Created by haoranchen on 2016/1/22.
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
    @Override

    /**
     * 什么都不操作
     */
/*    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        //Discard the received data silently
        ((ByteBuf)msg).release();
    }*/

    /**
     * 打印收到的信息
     */
    /*public void channelRead(ChannelHandlerContext ctx,Object msg) {
        ByteBuf in = (ByteBuf)msg;
        try {
            while(in.isReadable()) {
                System.out.print((char)in.readByte());
                System.out.flush();
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }*/

    /**
     * 回显字符
     */
    public void channelRead(ChannelHandlerContext ctx,Object msg) {
        ctx.write(msg);
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) {
        //Close the connection when an exception is raised
        cause.printStackTrace();
        ctx.close();
    }
}
