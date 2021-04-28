package com.edu.cdp.easyswim.mode;

import com.edu.cdp.easyswim.helper.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class PoolDetail implements Serializable {


    /**
     * success : true
     * msg :
     * obj : {"setyouyongchiid":14,"mingcheng":"耘健身游泳馆","pianqu":"青羊区","yongchidaxiao":350,"baidux":"104.06653686352861","baiduy":"30.655830944159714","dizhi":"四川省成都市青羊区上池北街8号","leibie":"恒温游泳池","path":"/游泳池/14/0.jpg,/游泳池/14/1.jpg,/游泳池/14/2.jpg","dianhua":"15882252732","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":2,"pingjunfen":"5.0","isshoucang":false}
     * list : ["/游泳池/14/0.jpg","/游泳池/14/1.jpg","/游泳池/14/2.jpg"]
     * js :
     */

    private boolean success;
    private String msg;
    private ObjBean obj;
    private String js;
    private List<String> list;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ObjBean getObj() {
        return obj;
    }

    public void setObj(ObjBean obj) {
        this.obj = obj;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static class ObjBean implements Serializable{
        /**
         * setyouyongchiid : 14
         * mingcheng : 耘健身游泳馆
         * pianqu : 青羊区
         * yongchidaxiao : 350.0
         * baidux : 104.06653686352861
         * baiduy : 30.655830944159714
         * dizhi : 四川省成都市青羊区上池北街8号
         * leibie : 恒温游泳池
         * path : /游泳池/14/0.jpg,/游泳池/14/1.jpg,/游泳池/14/2.jpg
         * dianhua : 15882252732
         * yingyejieshutime : null
         * yingyekaishitime : null
         * zongshu : 2
         * pingjunfen : 5.0
         * isshoucang : false
         */

        private int setyouyongchiid;
        private String mingcheng;
        private String pianqu;
        private double yongchidaxiao;
        private String baidux;
        private String baiduy;
        private String dizhi;
        private String leibie;
        private String path;
        private String dianhua;
        private String yingyejieshutime;
        private String yingyekaishitime;
        private int zongshu;
        private String pingjunfen;
        private boolean isshoucang;

        public int getSetyouyongchiid() {
            return setyouyongchiid;
        }

        public void setSetyouyongchiid(int setyouyongchiid) {
            this.setyouyongchiid = setyouyongchiid;
        }

        public String getMingcheng() {
            return mingcheng;
        }

        public void setMingcheng(String mingcheng) {
            this.mingcheng = mingcheng;
        }

        public String getPianqu() {
            return pianqu;
        }

        public void setPianqu(String pianqu) {
            this.pianqu = pianqu;
        }

        public double getYongchidaxiao() {
            return yongchidaxiao;
        }

        public void setYongchidaxiao(double yongchidaxiao) {
            this.yongchidaxiao = yongchidaxiao;
        }

        public String getBaidux() {
            return baidux;
        }

        public void setBaidux(String baidux) {
            this.baidux = baidux;
        }

        public String getBaiduy() {
            return baiduy;
        }

        public void setBaiduy(String baiduy) {
            this.baiduy = baiduy;
        }

        public String getDizhi() {
            return dizhi;
        }

        public void setDizhi(String dizhi) {
            this.dizhi = dizhi;
        }

        public String getLeibie() {
            return leibie;
        }

        public void setLeibie(String leibie) {
            this.leibie = leibie;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getDianhua() {
            return dianhua;
        }

        public void setDianhua(String dianhua) {
            this.dianhua = dianhua;
        }

        public String getYingyejieshutime() {
            return yingyejieshutime;
        }

        public void setYingyejieshutime(String yingyejieshutime) {
            this.yingyejieshutime = yingyejieshutime;
        }

        public String getYingyekaishitime() {
            return yingyekaishitime;
        }

        public void setYingyekaishitime(String yingyekaishitime) {
            this.yingyekaishitime = yingyekaishitime;
        }

        public int getZongshu() {
            return zongshu;
        }

        public void setZongshu(int zongshu) {
            this.zongshu = zongshu;
        }

        public String getPingjunfen() {
            return pingjunfen;
        }

        public void setPingjunfen(String pingjunfen) {
            this.pingjunfen = pingjunfen;
        }

        public boolean isIsshoucang() {
            return isshoucang;
        }

        public void setIsshoucang(boolean isshoucang) {
            this.isshoucang = isshoucang;
        }
    }
}

