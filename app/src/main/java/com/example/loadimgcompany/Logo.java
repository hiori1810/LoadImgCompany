package com.example.loadimgcompany;

public class Logo {
    String id,src;
    int linkimg;

    public Logo(String id, String src, int linkimg) {
        this.id = id;
        this.src = src;
        this.linkimg = linkimg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getLinkimg() {
        return linkimg;
    }

    public void setLinkimg(int linkimg) {
        this.linkimg = linkimg;
    }
}
