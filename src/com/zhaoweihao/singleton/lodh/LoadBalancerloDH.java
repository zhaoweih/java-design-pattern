package com.zhaoweihao.singleton.lodh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancerloDH {

    private List serverList = null;

    private LoadBalancerloDH() {
        serverList = new ArrayList();
    }

    private static class HolderClass {
        private final static LoadBalancerloDH instance = new LoadBalancerloDH();
    }

    public static LoadBalancerloDH getInstance() {
        return HolderClass.instance;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }




}
