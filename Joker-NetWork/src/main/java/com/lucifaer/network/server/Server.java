package com.lucifaer.network.server;

/**
 * @author Lucifaer
 * @version 1.0.0.RELEASE
 * @since 2020/11/18
 */
public interface Server {
//  获取server名称
    String getServerName();
//  开启服务
    void startServer(String[] args);
//  关闭服务
    void stopServer();
}
