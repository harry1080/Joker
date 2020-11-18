package com.lucifaer.network.context;

import com.lucifaer.network.client.Client;
import com.lucifaer.network.server.Server;

import java.util.Map;

/**
 * @author Lucifaer
 * @version 1.0.0.RELEASE
 * @since 2020/11/18
 */
public class NetWorkContext {
    private Map<String, Server> existServer;
    private Map<String, Client> existClient;
    private Map<String, Server> serverRunningMap;


}
