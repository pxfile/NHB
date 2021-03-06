package com.nhb.app.custom.bean;

import com.fast.library.bean.Pojo;

/**
 * ***********************************************************************
 * Author:pengxiaofang
 * CreateData:2016-06-29 20:06
 * Version:xx
 * Description:xx
 * ***********************************************************************
 */
public class OrderDetailBean extends Pojo{
    public String orderId;
    public String orderState;//订单状态【0：支付中，1：订单支付成功，2：订单支付失败】
    public String paymentWay;//支付方式【0：微信支付，1：支付宝支付】
    public String payAmount;//支付金额
    public String itemId;
    public String priceInStore;
    public String price;
    public String itemName;
    public String buyCount;
    public String itemPic;
    public String itemDesc;
    public String validTime;
    public String itemType;
    public String storeName;
    public String storePic;
    public String storePhone;
    public String createTime;
    public String address;
    public String finishTime; //成交时间
    public String receiverName; //接收人姓名
    public String receiverPhone; //接收人电话这几个字段就行
}
