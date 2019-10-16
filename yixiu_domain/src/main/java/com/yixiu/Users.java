package com.yixiu;

public class Users {
    private int id;
    private String name;
    private String address;
    private char mobilePhone;
    private String weChat;
    private int num;
    private String numStr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(char mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNumStr() {  //0关闭 1开启
        if(num==0){
            numStr="关闭";
        }
        else{
            numStr="开启";
        }

        return numStr;
    }

    public void setNumStr(String numStr) {
        this.numStr = numStr;
    }
}
