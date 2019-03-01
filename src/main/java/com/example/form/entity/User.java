package com.example.form.entity;


public class User {

  private int wechatid;
  private String wechatNum;
  private String userName;
  private String passWord;
  private String type;
  private String state;


  public int getWechatid() {
    return wechatid;
  }

  public void setWechatid(int wechatid) {
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

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
}
