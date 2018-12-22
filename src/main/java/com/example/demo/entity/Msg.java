package com.example.demo.entity;

public class Msg {
    private String title;
    private String content;
    private String etrainfo;

    public Msg(String 测试标题, String 测试内容, String s) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEtrainfo() {
        return etrainfo;
    }

    public void setEtrainfo(String etrainfo) {
        this.etrainfo = etrainfo;
    }
}
