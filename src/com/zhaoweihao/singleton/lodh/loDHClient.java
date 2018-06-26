package com.zhaoweihao.singleton.lodh;

public class loDHClient {
    public static void main(String args[]) {
        LoadBalancerloDH loadBalancerloDH1,loadBalancerloDH2,loadBalancerloDH3,loadBalancerloDH4;

        loadBalancerloDH1 = LoadBalancerloDH.getInstance();
        loadBalancerloDH2 = LoadBalancerloDH.getInstance();
        loadBalancerloDH3 = LoadBalancerloDH.getInstance();
        loadBalancerloDH4 = LoadBalancerloDH.getInstance();

        if (loadBalancerloDH1 == loadBalancerloDH2 && loadBalancerloDH2 == loadBalancerloDH3 && loadBalancerloDH3 == loadBalancerloDH4) {
            System.out.println("服务器负载均衡器具有唯一性");
        }

        loadBalancerloDH1.addServer("Server1");
        loadBalancerloDH1.addServer("Server2");
        loadBalancerloDH1.addServer("Server3");
        loadBalancerloDH1.addServer("Server4");

        //模拟客户端请求
        for (int i = 0; i < 10; i++) {
            String server = loadBalancerloDH1.getServer();
            System.out.println("接受请求的服务器是 " + server);
        }


    }
}
