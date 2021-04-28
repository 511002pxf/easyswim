package com.edu.cdp.easyswim;

/**
 * 网络请求地址的配置类
 *
 */
public class IPAddress {
    //服务器地址
    public static final String SERVICE_IP="http://221.237.158.212:20504";

    //图片地址——线上
    public static  final String IMG_IP = "http://zhengshi-youyongchi.oss-cn-shenzhen.aliyuncs.com";



    public static String getUrl(String api){
        if(api.startsWith("/")){
            return SERVICE_IP +api;
        }else {
            return SERVICE_IP+"/"+api;
        }
    }

    public static String getImgUrl(String path){
        if(path.startsWith("/")){
            return IMG_IP +path;
        }else {
            return IMG_IP+"/"+path;
        }
    }


    //接口地址
    //游泳池列表
    public static final String POOL_LIST="/apiweixin/WXpool_list";
    //字典树
    public static final String ZIDIANSHU="/apiweixin/zidianshu";
    //游泳池详情
    public static final String POOL_DETAIL="/apiweixin/yongchixiangqing";
}
