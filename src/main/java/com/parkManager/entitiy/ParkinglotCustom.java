package com.parkManager.entitiy;

/**
 * Created by 樱满集0_0 on 2017/9/9.
 */
public class ParkinglotCustom extends parking {

    //车位业主姓名
    private String user_name;
    private String phone_num;
    //车位业主手机号
    private String ordersUserName;
    private String ordersPhoneNum;
    //车位地址
    private String parkLocation;
    //停车场id
    private long parkingId;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getOrdersUserName() {
        return ordersUserName;
    }

    public void setOrdersUserName(String ordersUserName) {
        this.ordersUserName = ordersUserName;
    }

    public String getOrdersPhoneNum() {
        return ordersPhoneNum;
    }

    public void setOrdersPhoneNum(String ordersPhoneNum) {
        this.ordersPhoneNum = ordersPhoneNum;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }

    @Override
    public long getParkingId() {
        return parkingId;
    }

    @Override
    public void setParkingId(long parkingId) {
        this.parkingId = parkingId;
    }
}
