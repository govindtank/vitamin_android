package com.vitamin.wecantalk.POJO;

/**
 * Created by JongHwa on 2018-04-17.
 */

public class CommunityRoomListViewPOJO {

    private byte[] img;
    private String name;
    private String msg;
    private String time;
    private int where;

    public int getWhere() {
        return where;
    }

    public void setWhere(int where) {
        this.where = where;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
