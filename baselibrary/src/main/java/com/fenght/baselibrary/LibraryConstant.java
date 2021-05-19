package com.fenght.baselibrary;

import android.bluetooth.BluetoothAdapter;

public class LibraryConstant {
    /**
     * 蓝牙连接成功
     */
    public static final int UART_PROFILE_CONNECTED = 20;//20
    /**
     * 蓝牙断开连接
     */
    public static final int UART_PROFILE_DISCONNECTED = 21;//21
    /**
     * 蓝牙状态
     */
    public static int mState = 21;
    /**
     * logcat的tag
     */
    public static final String TAG = "wanji.bule";
    /**
     * 蓝牙状态
     */
    public static final int BULESTATE = -1;
    /**
     * 输入蓝牙设备为空
     */
    public static final int DEVICENAMENULL = 0;
    /**
     * 成功连接蓝牙
     */
    public static final int CONNETCDEVICE = 1;
    /**
     * 读取卡信息成功
     */
    public static final int READICCINFOSUCESS = 100;
    /**
     * 读取卡信息失败
     */
    public static final int READICCINFOFAIL = -01;
    /**
     * 失败连接蓝牙
     */
    public static final int DISCONNETCDEVICE = 2;
    /**
     * 手动输入并连接蓝牙设备,读取信息
     */
    public static final int HANDINPUTDEVICENAME = 3;
    /**
     * 获取ICC卡信息
     */
    public static final int CARDINFORMATION = 4;
    /**
     * 连接蓝牙成功处理消息
     */
    public static final String SENDINFO = "handconnectdevicesuccess";

    public static final String STOPSIACOVER = "stopsiacover";
    /**
     * 蓝牙断开连接
     */
    public static final int INTERRUPTCONNECTDEVICE = 5;
    /**
     * 跳转蓝牙连接界面的请求吗
     */
    public static final int REQUEST_ENABLE_BT = 11;
    /**
     * ICC发行方
     */
    public static final int PROVIDER = 12;
    /**
     * 卡号
     */
    public static final int CARDID = 10;
    /**
     * 车牌
     */
    public static final int VEHICLENUMBER = 13;
    /**
     * 发行日期
     */
    public static final int SIGNEDDATE = 14;
    /**
     * 余额
     */
    public static final int BALANCE = 15;
    /**
     * 到期日期
     */
    public static final int EXPIREDDATE = 16;
    /**
     * 隐藏连接蓝牙按钮
     */
    public static final int GONEHANDCONNECTBT = 17;
    /**
     * 手动连接按钮不能点击
     */
    public static final int UNABLECLICK = 23;

    /**
     * 蓝牙adapter
     */
    public static BluetoothAdapter mBluetoothAdapter = null;
    /**
     * quancun蓝牙adapter
     */
    public static BluetoothAdapter mBluetoothAdapter2quancun = null;
    /**
     * bule蓝牙adapter
     */
    public static BluetoothAdapter mBluetoothAdapter2bule = null;
    /**
     * readicc蓝牙adapter
     */
    public static BluetoothAdapter mBluetoothAdapterreadicc = null;
    /**
     * 交易记录蓝牙adapter
     */
    public static BluetoothAdapter mBluetoothAdapter2transation = null;

    /**
     * 将圈存的金额传递给卡片信息界面
     */
    public static final String RECHARGENUMBER = "rechargenumber";

    /**
     * 将圈存的账户余额传递给卡片信息界面
     */
    public static final String ACCOUNTBALANCE = "accountbalance";
    /**
     * 圈存界面跳转卡片信息界面的请求吗
     */
    public static final int TOCARDCHARGEREQUESTCODE = 18;
    /**
     * 圈存界面跳转卡片信息界面的结果码
     */
    public static final int QUANCUN2CARDRESULTCODE = 19;
    /**
     * 读ICC界面跳转蓝牙连接窗口界面
     */
    public static final int READICC2CONNECTREQUESTCODE = 23;

    /*sp存执操作*/
    /**
     * 将用户卡号存入ap的key
     */
    public static final String SPCARDNUMBER = "spcardnumber";
    /**
     * 账户余额存入sp的key
     */
    public static final String SPACCOUNTBALANCE = "spaccountbalance";
    /**
     * 卡片余额存入sp的key
     */
    public static final String SPCARDBALANCE = "spcardbalance";
    /**
     * 账户名存入sp的key
     */
    public static final String SPACCOUNTNAME = "spaccountname";
    /**
     * 将圈存金额存入sp
     */
    public static final String SPRECHARGEMONEY = "sprechargemoney";
    /**
     * 将圈存金额传入结果界面
     */
    public static final String RECHARGEMONEYNUMBER = "rechargemoneynumber";
    /**
     * 将卡片ID存入sp
     */
    public static final String SPREADCARDCARDID = "spreadcardcardid";

    /*------------------------------------读取卡片信息---------------------------------*/
    /**
     * 成功读取卡片信息,发送hander
     */
    public static final int READCARDINFO = 20;
    /**
     * 成功读取卡片信息
     */
    public static final String READCARDINFOSUCESS = "readcardinfosucess";
    /**
     * 读取卡片id
     */
    public static final int READCARDCARDID = 21;
    /**
     * 读取卡片余额
     */
    public static final int READCARDBALANCE = 22;
    /**
     * 传递卡片ID
     */
    public static final String PUTCARDID = "putcardid";
    /**
     * 传递卡片余额
     */
    public static final String PUTCARDBALANCE = "putcardbalance";
    /*圈存*/
    /**
     * 圈存成功
     */
    public static final int QUANCUNSUCESS = 25;
    /**
     * 圈存失败
     */
    public static final int QUANCUNFAILED = 26;
    /*----------------------------------账户充值---------------------------------------*/
    /**
     * 账户充值
     */
    public static final String ACCOUNTRECHARGEMONEY = "accountrechargemoney";
    /*-----------------------蓝牙连接到obuinfo数据传递----------------------*/

    public static final String CONNECT2OBUINFO = "connect2obuinfo";

    /*-----------------------蓝牙连接到transationrecord数据传递----------------------*/


    public static final String CONNECT2TRANSATIONRECORD = "connect2transationrecord";
    /*---------------------------------展示dialog------------------*/
    public static final int SHOWDIALOG = 30;
    /*-----------------------------------停止扫描-----------------------------*/
    /**
     * 停止扫描
     */
    public static final int STOPDISCOVERDEVICE = 31;


    //蓝牙连接时间测试
    public static long StaConTime;//开始连接蓝牙
    public static long EndConTime;//蓝牙结束
    public static long BleConTime;//连接时间
    //圈存读卡时间测试
    public static long StaReadCardTime;//圈存读卡开始
    public static long EndReadCardTime;//圈存读卡结束
    public static long ReadCardTime;//圈存读卡时间
    //圈存写卡时间测试
    public static long StaWriteCardTime;//圈存写卡开始
    public static long EndWriteCardTime;//圈存写卡结束
    public static long WriteCardTime;//圈存写卡时间
    //蓝牙配对时间
    public static long StrBlePairTime;//开始配对

    public static long EndBlePairTime;//结束配对
    public static long BlePairTime;//蓝牙配对时间


    public static boolean updateSucess = false;
    public static int SUCCESS = 0;
    public static boolean IntterupFlag = false;
    public final static String app_rootdirpath = "/sdcard/ObuIssue/";
    public final static String app_etcbin_dirpath = app_rootdirpath + "WJ_BIN/";
    public static final int PROCESS_0 = 0;
    public static final int PROCESS_10 = 10;
    public static final int PROCESS_20 = 20;
    public static final int PROCESS_30 = 30;
    public static final int PROCESS_40 = 40;
    public static final int PROCESS_50 = 50;
    public static final int PROCESS_60 = 60;
    public static final int PROCESS_70 = 70;
    public static final int PROCESS_80 = 80;
    public static final int PROCESS_90 = 90;
    public static final int PROCESS_100 = 100;
    //判断是否需要加微信格式
    public static Boolean bIs_ConPag_WEIXIN = true;//默认1 加微信格式  ，0 不加微信格式
    //public static UartService mService = null;
    public static final int TIME_OUT = 100;
    public static final int TIME_OUT_BLE = 5000;

    public static byte[] B1 = new byte[4];
}
