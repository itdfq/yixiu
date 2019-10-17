package com.yixiu;

public class Users {
    private Integer id;
    private String name;
    private String address;
    private String mobilePhone;
    private String weChat;
    private Integer num;
    private String numStr;
    private String password;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNumStr() {
        return numStr;
    }

    public void setNumStr(String numStr) {
        if(num!=null) {
            if(num==0){
                numStr="关闭";
            }else
            {
                numStr="开启";
            }
        }
        this.numStr = numStr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
