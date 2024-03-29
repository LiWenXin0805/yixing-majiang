package com.sjtudoit.majiang.constant;

public class MessageType {
    public static final int NOTIFY_CLIENT_QUIT = -5; // android设备无法监听服务端onSocketClose，只好通知客户端主动关闭连接
    public final static int QUIT = -4;
    public final static int GET_GAME = -3;
    public final static int CHOOSE_SEAT = -2;
    public final static int HEART_BEAT = -1;
    public final static int CLIENT_READY = 0;
    public final static int START_GAME = 1;
    public final static int RESET_FLOWER = 2;
    public final static int MJ_OUT = 3;
    public final static int MJ_IN = 4;
    public final static int MJ_ADD_FLOWER = 5;
    public final static int MJ_CHI = 6;
    public final static int MJ_PENG = 7;
    public final static int MJ_GANG = 8;
    public final static int MJ_AN_GANG = 9;
    public final static int MJ_JIA_GANG = 10;
    public final static int MJ_HU = 11;
    public final static int PASS = 12;
    public final static int HU_PING_HU = 13;
    public final static int HU_ZI_MO = 14;
    public final static int HU_QIANG_JIN = 15;
    public final static int HU_THREE_JIN = 16;
    public final static int HU_JIN_QUE= 17;
    public final static int MJ_TIE= 18;
    public final static int INFO= 19;
    public final static int GAME_OVER = 20;
    public final static int CHAT = 101;
    public final static int AUDIO_CHAT = 102;
    public final static int ADD_ROBOT = 103;
}
