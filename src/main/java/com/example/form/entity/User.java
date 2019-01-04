package com.example.form.entity;


public class User {

  private long wechatid;
  private String wechatNum;
  private String userName;
  private String type;
  private String state;


  public long getWechatid() {
    return wechatid;
  }

  public void setWechatid(long wechatid) {
    this.wechatid = wechatid;
  }


  public String getWechatNum() {
    return wechatNum;
  }

  public void setWechatNum(String wechatNum) {
    this.wechatNum = wechatNum;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
