package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // default 생성자 막기
    private SocketClient() {
    }

    // static 메소드를 통해서 getInstance 메소드 생성
    public static SocketClient getInstance() {
        // socketClient 객체 null 인경우 생성 후 리턴
        // socketClient 객체 null 아닌경우 리턴
        if (socketClient == null) {
            socketClient = new SocketClient();
            System.out.println("socket new instance");
        }

        return socketClient;
    }

    public void connect() {
        System.out.println("socket");
    }

}
