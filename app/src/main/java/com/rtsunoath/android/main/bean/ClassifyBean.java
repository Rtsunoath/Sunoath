package com.rtsunoath.android.main.bean;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/22.
 */
public class ClassifyBean {
    /**
     * status : true
     * total : 212
     * tngou : [{"count":181,"fcount":0,"galleryclass":1,"id":640,"img":"/ext/160221/2588aa38cab4fb59630e117bbe238508.jpg","rcount":0,"size":27,"time":1456023603000,"title":"甜美模特顾欣怡内衣豹纹私房照"},{"count":97,"fcount":0,"galleryclass":1,"id":639,"img":"/ext/160221/c2c1039cfc3cbd54125f6dad1e75a6b4.jpg","rcount":0,"size":7,"time":1456023544000,"title":"美女兔女郎性感私房写真组图"},{"count":81,"fcount":0,"galleryclass":1,"id":638,"img":"/ext/160221/24b572cb9aa3cfb0d0e8c884f6008a05.jpg","rcount":0,"size":13,"time":1456023506000,"title":"惊艳美女尤物王馨瑶酒店写真"},{"count":55,"fcount":0,"galleryclass":1,"id":635,"img":"/ext/160221/80a832c0c21568b6fbf2bec569908da4.jpg","rcount":0,"size":37,"time":1456023333000,"title":"推女神美女顾欣怡美胸美臀性感图片"},{"count":50,"fcount":0,"galleryclass":1,"id":634,"img":"/ext/160221/da25b788e2fd49ab6ae53789e662dc9b.jpg","rcount":0,"size":31,"time":1456023184000,"title":"美女刘奕宁猫女装性感床照图片"},{"count":266,"fcount":0,"galleryclass":1,"id":631,"img":"/ext/160217/53cdf81cde4ba6cd73fe2884e7fb2acf.jpg","rcount":0,"size":6,"time":1455681197000,"title":"护士妹妹若隐若现透视装的诱惑"},{"count":162,"fcount":0,"galleryclass":1,"id":630,"img":"/ext/160217/b1ae8080848fb19c80660bf202c10391.jpg","rcount":0,"size":16,"time":1455681124000,"title":"性感美女小护士吉木りさ诱人照片"},{"count":198,"fcount":0,"galleryclass":1,"id":625,"img":"/ext/160215/a9f2f33410f65c9d3da49c5e75893e31.jpg","rcount":0,"size":10,"time":1455514726000,"title":"惹火制服性感美女美艳迷人"},{"count":277,"fcount":0,"galleryclass":1,"id":624,"img":"/ext/160215/be8e2f041c6d1e2af11f9fa19658aff9.jpg","rcount":0,"size":34,"time":1455514701000,"title":"美女护士姐妹花大胆玩拉拉"},{"count":253,"fcount":0,"galleryclass":1,"id":623,"img":"/ext/160215/474e06b9ba6e2b9913871e1f0aa22845.jpg","rcount":0,"size":26,"time":1455514677000,"title":"推女郎飞儿Kelvin护士制服私房照 "},{"count":246,"fcount":0,"galleryclass":1,"id":621,"img":"/ext/160215/ac30500d6b5c7a505ecd4223f958b9dd.jpg","rcount":0,"size":16,"time":1455514578000,"title":"D奶美女护士制服写真"},{"count":146,"fcount":0,"galleryclass":1,"id":619,"img":"/ext/160215/bcfe86a9e266dfb38b6660b333ad5ccb.jpg","rcount":0,"size":29,"time":1455514495000,"title":"俏丽妹子coco性感制服诱惑迷人写真"},{"count":196,"fcount":0,"galleryclass":1,"id":617,"img":"/ext/160215/dfa11736fb2faf81947c22c0679c35b9.jpg","rcount":0,"size":24,"time":1455514446000,"title":"护士美女绮里嘉ula制服诱惑性感沐浴照"},{"count":70,"fcount":0,"galleryclass":1,"id":616,"img":"/ext/160215/49121da795c0270365ac71a994a8295b.jpg","rcount":0,"size":8,"time":1455514413000,"title":"松果儿cc露臀护士装性感写真图片"},{"count":745,"fcount":0,"galleryclass":1,"id":615,"img":"/ext/160203/84cbdc28f568ec0298e1faa0c9ae4d18.jpg","rcount":0,"size":23,"time":1454461763000,"title":"美胸美女卓芷伊性感护士制服写真图片"},{"count":443,"fcount":0,"galleryclass":1,"id":614,"img":"/ext/160203/e9fcb93431b0112fbb59f6d9051ee54f.jpg","rcount":0,"size":33,"time":1454461728000,"title":"美女于姬性感护士制服极度诱惑"},{"count":253,"fcount":0,"galleryclass":1,"id":613,"img":"/ext/160203/020789a02bde777c3665c100fa40cdf5.jpg","rcount":0,"size":19,"time":1454461681000,"title":"美腿美女然然性感好身材"},{"count":334,"fcount":0,"galleryclass":1,"id":612,"img":"/ext/160203/aeefb0f2be23cdf7a180f96d9c5d70a4.jpg","rcount":0,"size":16,"time":1454461605000,"title":"美女护士美胸模特风姿诱人写真"},{"count":572,"fcount":0,"galleryclass":1,"id":611,"img":"/ext/160201/c92ff7a131547a71a04751917aef1701.jpg","rcount":0,"size":16,"time":1454291145000,"title":"妖艳美女爆乳身材诱惑写真"},{"count":313,"fcount":0,"galleryclass":1,"id":610,"img":"/ext/160201/ccb8a6403615b3b7fcaec15d38c00803.jpg","rcount":0,"size":13,"time":1454291112000,"title":"美女嫩模美胸性感写真"}]
     */

    private boolean status;
    private int total;
    /**
     * count : 181
     * fcount : 0
     * galleryclass : 1
     * id : 640
     * img : /ext/160221/2588aa38cab4fb59630e117bbe238508.jpg
     * rcount : 0
     * size : 27
     * time : 1456023603000
     * title : 甜美模特顾欣怡内衣豹纹私房照
     */

    private List<TngouEntity> tngou;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTngou(List<TngouEntity> tngou) {
        this.tngou = tngou;
    }

    public boolean isStatus() {
        return status;
    }

    public int getTotal() {
        return total;
    }

    public List<TngouEntity> getTngou() {
        return tngou;
    }

    public static class TngouEntity {
        private int count;
        private int fcount;
        private int galleryclass;
        private int id;
        private String img;
        private int rcount;
        private int size;
        private long time;
        private String title;

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

        public void setTime(long time) {
            this.time = time;
        }

        public void setTitle(String title) {
            this.title = title;
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

        public long getTime() {
            return time;
        }

        public String getTitle() {
            return title;
        }
    }
}
