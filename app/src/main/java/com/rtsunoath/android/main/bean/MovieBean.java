package com.rtsunoath.android.main.bean;

import java.util.List;

/**
 * Created by tengshuai on 2016/2/18.
 */
public class MovieBean {
    /**
     * resultcode : 200
     * reason : success
     * result : [{"rid":"1","name":"美人鱼","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥180000","tboxoffice":"￥180486"},{"rid":"2","name":"澳门风云3","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥78000","tboxoffice":"￥78629"},{"rid":"3","name":"西游记之孙悟空三打白骨精","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥76000","tboxoffice":"￥76195"},{"rid":"4","name":"功夫熊猫3","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥15500","tboxoffice":"￥83800"},{"rid":"5","name":"奔爱","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥3590","tboxoffice":"￥3590"},{"rid":"6","name":"年兽大作战","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥3250","tboxoffice":"￥3250"},{"rid":"7","name":"高跟鞋先生","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥2930","tboxoffice":"￥3150"},{"rid":"8","name":"谋杀似水年华","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥920","tboxoffice":"￥920"},{"rid":"9","name":"过年好","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥680","tboxoffice":"￥5340"},{"rid":"10","name":"熊出没之熊心归来","wk":"2016.2.8 - 2016.2.14（单位：万元）","wboxoffice":"￥575","tboxoffice":"￥28041"}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    /**
     * rid : 1
     * name : 美人鱼
     * wk : 2016.2.8 - 2016.2.14（单位：万元）
     * wboxoffice : ￥180000
     * tboxoffice : ￥180486
     */

    private List<ResultEntity> result;

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getResultcode() {
        return resultcode;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        private String rid;
        private String name;
        private String wk;
        private String wboxoffice;
        private String tboxoffice;

        public void setRid(String rid) {
            this.rid = rid;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWk(String wk) {
            this.wk = wk;
        }

        public void setWboxoffice(String wboxoffice) {
            this.wboxoffice = wboxoffice;
        }

        public void setTboxoffice(String tboxoffice) {
            this.tboxoffice = tboxoffice;
        }

        public String getRid() {
            return rid;
        }

        public String getName() {
            return name;
        }

        public String getWk() {
            return wk;
        }

        public String getWboxoffice() {
            return wboxoffice;
        }

        public String getTboxoffice() {
            return tboxoffice;
        }
    }
}
