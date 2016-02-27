package com.rtsunoath.android.main.bean;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/22.
 */
public class ShowBean {


    /**
     * count : 2410
     * fcount : 0
     * galleryclass : 1
     * id : 10
     * img : /ext/150714/832903f1079ad2a74867e5cbd9dcf1a2.jpg
     * list : [{"gallery":10,"id":187,"src":"/ext/150714/832903f1079ad2a74867e5cbd9dcf1a2.jpg"},{"gallery":10,"id":188,"src":"/ext/150714/379ef82a7395be83084aaf2df792f1aa.jpg"},{"gallery":10,"id":189,"src":"/ext/150714/456dee4283fe7ae07e623802012de30d.jpg"},{"gallery":10,"id":190,"src":"/ext/150714/acd51dddc3ee6ab973050b8a969d34fa.jpg"},{"gallery":10,"id":191,"src":"/ext/150714/a74b06ae07807d4cf861d3662a50dcf8.jpg"},{"gallery":10,"id":192,"src":"/ext/150714/fc0ddec9f438f2b383a9c01483cbf885.jpg"},{"gallery":10,"id":193,"src":"/ext/150714/2b89ffba4d98b137e924504205f4d61b.jpg"},{"gallery":10,"id":194,"src":"/ext/150714/d82e9aaae6e2eb2b62a9cca5d3d993e4.jpg"},{"gallery":10,"id":195,"src":"/ext/150714/068a7c6994c8e669878221ffd5dec07c.jpg"},{"gallery":10,"id":196,"src":"/ext/150714/e3616cf7cf18e63e5facec1a20535ba6.jpg"},{"gallery":10,"id":197,"src":"/ext/150714/df3ea80d7ecbd8f025d5ec31635ccdbf.jpg"},{"gallery":10,"id":198,"src":"/ext/150714/a2c23f46b5a1b140cd028c18b5745599.jpg"}]
     * rcount : 0
     * size : 12
     * status : true
     * time : 1436876134000
     * title : 美腿丝袜美女
     * url : http://www.tngou.net/tnfs/show/10
     */

    private int count;
    private int fcount;
    private int galleryclass;
    private int id;
    private String img;
    private int rcount;
    private int size;
    private boolean status;
    private long time;
    private String title;
    private String url;
    /**
     * gallery : 10
     * id : 187
     * src : /ext/150714/832903f1079ad2a74867e5cbd9dcf1a2.jpg
     */

    private List<ListEntity> list;

    public void setCount(int count) {
        this.count = count;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public void setGalleryclass(int galleryclass) {
        this.galleryclass = galleryclass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setList(List<ListEntity> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public int getFcount() {
        return fcount;
    }

    public int getGalleryclass() {
        return galleryclass;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public int getRcount() {
        return rcount;
    }

    public int getSize() {
        return size;
    }

    public boolean isStatus() {
        return status;
    }

    public long getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public List<ListEntity> getList() {
        return list;
    }

    public static class ListEntity {
        private int gallery;
        private int id;
        private String src;

        public void setGallery(int gallery) {
            this.gallery = gallery;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public int getGallery() {
            return gallery;
        }

        public int getId() {
            return id;
        }

        public String getSrc() {
            return src;
        }
    }
}
