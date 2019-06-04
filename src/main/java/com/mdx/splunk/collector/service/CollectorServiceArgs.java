package com.mdx.splunk.collector.service;

import com.splunk.ServiceArgs;

public class CollectorServiceArgs extends ServiceArgs {

    private String host;
    private String username;
    private String password;
    private int port;

    public CollectorServiceArgs() {}

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}