package com.lucifaer.network.learn;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author Lucifaer
 * @version 1.0.0.RELEASE
 * @since 2020/11/16
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        super.channelActive(ctx);
//        使用pojo代替ByteBuf
        ChannelFuture f = ctx.writeAndFlush(new UnixTime());
        f.addListener(ChannelFutureListener.CLOSE);

//        final ByteBuf time = ctx.alloc().buffer(4);
//        time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));
//
//        final ChannelFuture f = ctx.writeAndFlush(time);
//        f.addListener(new ChannelFutureListener() {
//            @Override
//            public void operationComplete(ChannelFuture future) throws Exception {
//                assert f == future;
//                ctx.close();
//            }
//        });
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//        super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }
}
