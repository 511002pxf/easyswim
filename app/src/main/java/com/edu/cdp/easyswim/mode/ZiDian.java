package com.edu.cdp.easyswim.mode;

import com.edu.cdp.easyswim.helper.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;
@HttpResponse(parser = JsonRespondParse.class)
public class ZiDian implements Serializable {

    /**
     * success : true
     * msg :
     * obj : 5F6C6343853507EB1ACFA8000D86656A
     * list : [{"id":23,"name":"打印类别","paixu":42,"pid":0,"zhujifu":"DAYINLEIBIE","val":"打印类别","list":[{"id":24,"name":"登记表","paixu":41,"pid":23,"zhujifu":"DENGJIBIAO","val":"登记表"}]},{"id":33,"name":"片区","paixu":40,"pid":0,"zhujifu":"PIANOU","val":"0","list":[{"id":53,"name":"青羊区","paixu":39,"pid":33,"zhujifu":"QYQ","val":"青羊区"},{"id":80,"name":"高新区","paixu":38,"pid":33,"zhujifu":"GAOXINOU","val":"高新区"},{"id":54,"name":"成华区","paixu":37,"pid":33,"zhujifu":"CHENGHUAOU","val":"成华区"},{"id":55,"name":"金牛区","paixu":36,"pid":33,"zhujifu":"JINNIUOU","val":"金牛区"},{"id":56,"name":"武侯区","paixu":35,"pid":33,"zhujifu":"WUHOUOU","val":"武侯区"},{"id":57,"name":"锦江区","paixu":34,"pid":33,"zhujifu":"NABUXIAN","val":"锦江区"},{"id":58,"name":"青白江区","paixu":33,"pid":33,"zhujifu":"QINGBAIJIANGOU","val":"青白江区"},{"id":59,"name":"龙泉驿区","paixu":32,"pid":33,"zhujifu":"LONGQUANYIOU","val":"龙泉驿区"},{"id":60,"name":"新都区","paixu":31,"pid":33,"zhujifu":"XINDOUOU","val":"新都区"},{"id":69,"name":"温江区","paixu":30,"pid":33,"zhujifu":"WENJIANGOU","val":"温江区"},{"id":76,"name":"都江堰市","paixu":29,"pid":33,"zhujifu":"DOUJIANGYANSHI","val":"都江堰市"},{"id":78,"name":"邛崃市","paixu":28,"pid":33,"zhujifu":"QIONGLAISHI","val":"邛崃市"},{"id":77,"name":"崇州市","paixu":27,"pid":33,"zhujifu":"CHONGZHOUSHI","val":"崇州市"},{"id":79,"name":"彭州市","paixu":26,"pid":33,"zhujifu":"PENGZHOUSHI","val":"彭州市"},{"id":70,"name":"双流县","paixu":25,"pid":33,"zhujifu":"SHUANGLIUXIAN","val":"双流县"},{"id":71,"name":"金堂县","paixu":24,"pid":33,"zhujifu":"JINTANGXIAN","val":"金堂县"},{"id":72,"name":"郫县","paixu":23,"pid":33,"zhujifu":"PIXIAN","val":"郫县"},{"id":73,"name":"蒲江县","paixu":22,"pid":33,"zhujifu":"PUJIANGXIAN","val":"蒲江县"},{"id":74,"name":"大邑县","paixu":21,"pid":33,"zhujifu":"DAYIXIAN","val":"大邑县"},{"id":75,"name":"新津县","paixu":20,"pid":33,"zhujifu":"XINJINXIAN","val":"新津县"},{"id":85,"name":"课题研究组","paixu":19,"pid":33,"zhujifu":"KETIYANJIUZU","val":"课题研究组"},{"id":86,"name":"南充市嘉陵区","paixu":18,"pid":33,"zhujifu":"NACHONGSHIJIALINGOU","val":"南充市嘉陵区"},{"id":91,"name":"简阳市","paixu":null,"pid":33,"zhujifu":"JIANYANGSHI","val":"简阳市"}]},{"id":48,"name":"监测类型","paixu":17,"pid":0,"zhujifu":"JIANCELEIXING","val":"0","list":[{"id":46,"name":"PH","paixu":16,"pid":48,"zhujifu":" ","val":"PH"},{"id":45,"name":"温度","paixu":15,"pid":48,"zhujifu":"℃","val":"温度"},{"id":37,"name":"余氯","paixu":14,"pid":48,"zhujifu":"mg/L","val":"余氯"},{"id":68,"name":"水量","paixu":13,"pid":48,"zhujifu":"m³","val":"水量"},{"id":83,"name":"浊度","paixu":12,"pid":48,"zhujifu":"NTU","val":"浊度"},{"id":90,"name":"尿素","paixu":null,"pid":48,"zhujifu":"NIAOSU","val":"尿素"}]},{"id":49,"name":"游泳池类别","paixu":11,"pid":0,"zhujifu":"YOUYONGCHILEIBIE","val":"0","list":[{"id":50,"name":"恒温游泳池","paixu":10,"pid":49,"zhujifu":"HENGWENYOUYONGCHI","val":"恒温游泳池"},{"id":51,"name":"季节性游泳池","paixu":9,"pid":49,"zhujifu":"JIJIEXINGYOUYONGCHI","val":"季节性游泳池"}]},{"id":63,"name":"设备功能","paixu":8,"pid":0,"zhujifu":"SHEBEIGONGNENG","val":"0","list":[{"id":65,"name":"读取余氯温度PH","paixu":7,"pid":63,"zhujifu":"查询余氯数据 地址01 010300000006C5C8  020300000006C5FB CC0300000006D5D5 ","val":"010300000006C5C8"},{"id":67,"name":"读取水表读数","paixu":6,"pid":63,"zhujifu":"FEFEFE68103442608000000001031F90008116","val":"0"},{"id":66,"name":"获取设备坐标","paixu":5,"pid":63,"zhujifu":"usr.cn#AT+CCED=0,2\\r\\n","val":"usr.cn#AT+CCED=0,2\r\n"},{"id":81,"name":"获取4G设备坐标","paixu":4,"pid":63,"zhujifu":"usr.cn#AT+LBS\\r\\n","val":"usr.cn#AT+LBS\r\n"},{"id":84,"name":"读取余氯温度PH浊度","paixu":3,"pid":63,"zhujifu":"查询浊度数据 地址01 010300000006C5C8  020300000006C5FB CC0300000006D5D5 ","val":"010300000006C5C8"},{"id":93,"name":"读取浊度重庆设备","paixu":null,"pid":63,"zhujifu":"DOUQUZHUODUCHONGQINGSHEBEI","val":"060300010008147B"}]},{"id":62,"name":"地图初始地点","paixu":2,"pid":0,"zhujifu":"DETUCHUSHIDEDIAN","val":"南充市"},{"id":87,"name":"地图所属城市","paixu":1,"pid":0,"zhujifu":"DETUSUOSHUCHENGSHI","val":" 0","list":[{"id":88,"name":"成都市","paixu":null,"pid":87,"zhujifu":"CHENGDOUSHI","val":"成都市"},{"id":89,"name":"南充市","paixu":null,"pid":87,"zhujifu":"NACHONGSHI","val":"南充市"}]}]
     * js : 7
     */

    private boolean success;
    private String msg;
    private String obj;
    private String js;
    private List<ListBeanX> list;

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

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public List<ListBeanX> getList() {
        return list;
    }

    public void setList(List<ListBeanX> list) {
        this.list = list;
    }

    public static class ListBeanX implements Serializable{
        /**
         * id : 23
         * name : 打印类别
         * paixu : 42
         * pid : 0
         * zhujifu : DAYINLEIBIE
         * val : 打印类别
         * list : [{"id":24,"name":"登记表","paixu":41,"pid":23,"zhujifu":"DENGJIBIAO","val":"登记表"}]
         */

        private int id;
        private String name;
        private int paixu;
        private int pid;
        private String zhujifu;
        private String val;
        private List<ListBean> list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPaixu() {
            return paixu;
        }

        public void setPaixu(int paixu) {
            this.paixu = paixu;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getZhujifu() {
            return zhujifu;
        }

        public void setZhujifu(String zhujifu) {
            this.zhujifu = zhujifu;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable{
            /**
             * id : 24
             * name : 登记表
             * paixu : 41
             * pid : 23
             * zhujifu : DENGJIBIAO
             * val : 登记表
             */

            private int id;
            private String name;
            private int paixu;
            private int pid;
            private String zhujifu;
            private String val;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPaixu() {
                return paixu;
            }

            public void setPaixu(int paixu) {
                this.paixu = paixu;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getZhujifu() {
                return zhujifu;
            }

            public void setZhujifu(String zhujifu) {
                this.zhujifu = zhujifu;
            }

            public String getVal() {
                return val;
            }

            public void setVal(String val) {
                this.val = val;
            }
        }
    }
}
