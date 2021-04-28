package com.edu.cdp.easyswim.mode;

import com.edu.cdp.easyswim.helper.JsonRespondParse;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;


@HttpResponse(parser = JsonRespondParse.class)//指定解析器
public class Pool implements Serializable {

    /**
     * success : true
     * msg :
     * obj :
     * list : [{"setyouyongchiid":14,"mingcheng":"耘健身游泳馆","pianqu":"青羊区","yongchidaxiao":350,"baidux":"104.06653686352861","baiduy":"30.655830944159714","dizhi":"四川省成都市青羊区上池北街8号","leibie":"恒温游泳池","path":"/游泳池/14/0.jpg","dianhua":"15882252732","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":2,"pingjunfen":"5.0"},{"setyouyongchiid":53,"mingcheng":"南充市名越体育游泳馆","pianqu":"高坪区","yongchidaxiao":400,"baidux":"106.12383565696064","baiduy":"30.798908952329676","dizhi":"四川省南充市高坪区江天来大酒店21楼","leibie":"恒温游泳池","path":"/游泳池/53/0.jpg","dianhua":"18990838859","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":2,"pingjunfen":"5.0"},{"setyouyongchiid":54,"mingcheng":"奇迹健身大丰汇融游泳馆","pianqu":"新都区","yongchidaxiao":580,"baidux":"104.06991468868297","baiduy":"30.771842281565345","dizhi":"四川省成都市新都区方元路7楼","leibie":"恒温游泳池","path":"/游泳池/54/0.jpg","dianhua":"15708470975","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":1,"pingjunfen":"5.0"},{"setyouyongchiid":46,"mingcheng":"易锐游泳馆(新都店)","pianqu":"新都区","yongchidaxiao":200,"baidux":"104.06498299999994","baiduy":"30.778217854449384","dizhi":"四川省成都市新都区互惠大道132号","leibie":"恒温游泳池","path":"/游泳池/46/0.jpg","dianhua":"18224422881","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":3,"pingjunfen":"5.0"},{"setyouyongchiid":82,"mingcheng":"靓特东方游泳馆","pianqu":"高坪区","yongchidaxiao":400,"baidux":"106.12823999999995","baiduy":"30.790809853059528","dizhi":"四川省南充市高坪区松林路","leibie":"恒温游泳池","path":"/游泳池/82/0.jpg","dianhua":"15892791005","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":1,"pingjunfen":"5.0"},{"setyouyongchiid":83,"mingcheng":"恒力国际游泳馆","pianqu":"顺庆区","yongchidaxiao":600,"baidux":"106.089345","baiduy":"30.784197","dizhi":"四川省南充市顺庆区红光路","leibie":"恒温游泳池","path":"","dianhua":"18982100407","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":1,"pingjunfen":"5.0"},{"setyouyongchiid":87,"mingcheng":"卡米尔健身中心","pianqu":"顺庆区","yongchidaxiao":400,"baidux":"106.123601","baiduy":"30.836875","dizhi":"四川省南充市顺庆区清风南路10号","leibie":"恒温游泳池","path":"/游泳池/87/1.png","dianhua":"13488955043","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":1,"pingjunfen":"5.0"},{"setyouyongchiid":92,"mingcheng":"奇迹健身（七一国际广场）游泳馆","pianqu":"新都区","yongchidaxiao":375,"baidux":"104.1785124490274","baiduy":"30.828023666583427","dizhi":"四川省南充市金光路七一国际广场5楼","leibie":"恒温游泳池","path":"/游泳池/92/1.jpg","dianhua":"13540850800","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":93,"mingcheng":"香洲半岛恒温游泳池","pianqu":"新都区","yongchidaxiao":250,"baidux":"104.17091105789827","baiduy":"30.79634327293484","dizhi":"南充市嘉陵区2号路","leibie":"恒温游泳池","path":"/游泳池/93/1.jpg","dianhua":"18227682779","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":47,"mingcheng":"东骏会所恒温泳池","pianqu":"新都区","yongchidaxiao":450,"baidux":"104.19352999999988","baiduy":"30.810349702300893","dizhi":"四川省成都市新都区万和北路","leibie":"恒温游泳池","path":"/游泳池/47/0.jpg","dianhua":"13550087205","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":48,"mingcheng":"君临荟恒温游泳馆","pianqu":"新都区","yongchidaxiao":300,"baidux":"104.07417899999994","baiduy":"30.77776685450152","dizhi":"四川省成都市新都区敬成路","leibie":"恒温游泳池","path":"/游泳池/48/0.jpg","dianhua":"15928877721","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":49,"mingcheng":"彭州市圣力凯恒温游泳馆","pianqu":"彭州市","yongchidaxiao":160,"baidux":"103.968712","baiduy":"30.992777","dizhi":"四川省成都市彭州市国泰南路","leibie":"恒温游泳池","path":"/游泳池/49/0.jpg","dianhua":"028-83872832","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":50,"mingcheng":"力道健身恒温泳池","pianqu":"简阳市","yongchidaxiao":312.5,"baidux":"104.53861999999988","baiduy":"30.426055911409936","dizhi":"四川省资阳市简阳市雄州大道南段","leibie":"恒温游泳池","path":"/游泳池/50/0.jpg","dianhua":"18190282996","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":51,"mingcheng":"新佰丽恒温游泳馆","pianqu":"简阳市","yongchidaxiao":312.5,"baidux":"104.54745097218056","baiduy":"30.41193067002476","dizhi":"四川省资阳市简阳市江安北街","leibie":"恒温游泳池","path":"/游泳池/51/0.jpg","dianhua":"18190282996","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":52,"mingcheng":"雄州游泳健身会所","pianqu":"简阳市","yongchidaxiao":276,"baidux":"104.54852599999988","baiduy":"30.385217953871955","dizhi":"四川省资阳市简阳市建设西路西段","leibie":"恒温游泳池","path":"/游泳池/52/0.jpg","dianhua":"13810953709","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":6,"mingcheng":"都市花园恒温游泳馆","pianqu":"青羊区","yongchidaxiao":420,"baidux":"104.01335526619235","baiduy":"30.672747892285084","dizhi":"四川省成都市青羊区青羊大道101号","leibie":"恒温游泳池","path":"/游泳池/6/1.jpg","dianhua":"13488977798","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":7,"mingcheng":"文化宫游泳馆","pianqu":"青羊区","yongchidaxiao":997.5,"baidux":"104.01514864164042","baiduy":"30.676768589535175","dizhi":"四川省成都市青羊区青羊大道129号","leibie":"恒温游泳池","path":"/游泳池/7/0.jpg","dianhua":"13880667752","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":12,"mingcheng":"成都市老年体育活动中心","pianqu":"武侯区","yongchidaxiao":380,"baidux":"104.08891882582394","baiduy":"30.610383027573594","dizhi":"四川省成都市武侯区三瓦窑街202号附20-21号","leibie":"恒温游泳池","path":"/游泳池/12/0.jpg","dianhua":"13981776661","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":13,"mingcheng":"瑞贝斯恒温游泳馆","pianqu":"金牛区","yongchidaxiao":300,"baidux":"103.99869533945505","baiduy":"30.722305940247736","dizhi":"四川省成都市金牛区兴科中路","leibie":"恒温游泳池","path":"/游泳池/13/0.jpg","dianhua":"18349690361","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":55,"mingcheng":"领跑健身游泳馆(凯莱帝景店)","pianqu":"武侯区","yongchidaxiao":330,"baidux":"104.07269899999996","baiduy":"30.623054882949468","dizhi":"四川省成都市武侯区桐梓林北路44号","leibie":"恒温游泳池","path":"/游泳池/55/0.jpg","dianhua":"15884542707","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":56,"mingcheng":"英派斯健身游泳馆（吾悦广场店）","pianqu":"武侯区","yongchidaxiao":100,"baidux":"103.99493386794973","baiduy":"30.63117929656623","dizhi":"四川省成都市武侯区武侯大道顺江段95号","leibie":"恒温游泳池","path":"/游泳池/56/0.png","dianhua":"18483637881","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":57,"mingcheng":"凯宾斯基酒店游泳池","pianqu":"武侯区","yongchidaxiao":230,"baidux":"104.072928","baiduy":"30.624175","dizhi":"四川省成都市武侯区人民南路四段42号","leibie":"恒温游泳池","path":"/游泳池/57/0.png","dianhua":"18030536706","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":58,"mingcheng":"道格健身游泳馆","pianqu":"龙泉驿区","yongchidaxiao":435,"baidux":"104.248046","baiduy":"30.583111","dizhi":"四川省成都市龙泉驿区龙泉桃都大道中段888号4楼4005号","leibie":"恒温游泳池","path":"/游泳池/58/0.png","dianhua":"13158800200","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":59,"mingcheng":"蓝色理想恒温游泳馆","pianqu":"龙泉驿区","yongchidaxiao":250,"baidux":"104.262531","baiduy":"30.549565","dizhi":"四川省成都市龙泉驿区蔚蓝路2号蓝色恒温游泳馆","leibie":"恒温游泳池","path":"/游泳池/59/1.jpg","dianhua":"18200340196","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":60,"mingcheng":"宏毅逸飞运动馆","pianqu":"龙泉驿区","yongchidaxiao":392.5,"baidux":"104.265755","baiduy":"30.542353","dizhi":"四川省成都市龙泉驿区华信大道","leibie":"恒温游泳池","path":"/游泳池/60/1.jpg","dianhua":"15283460773","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":61,"mingcheng":"奇迹欢动之旅游泳馆","pianqu":"武侯区","yongchidaxiao":500,"baidux":"103.990832","baiduy":"30.60881","dizhi":"四川省成都市武侯区金履一路","leibie":"恒温游泳池","path":"/游泳池/61/0.png","dianhua":"13408620830","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":62,"mingcheng":"绿岭恒温游泳池","pianqu":"锦江区","yongchidaxiao":360,"baidux":"104.113568","baiduy":"30.624659","dizhi":"四川省成都市锦江区观音桥街77号","leibie":"恒温游泳池","path":"/游泳池/62/0.png","dianhua":"13688169074","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":70,"mingcheng":"尚格品顿恒温游泳池","pianqu":"彭州市","yongchidaxiao":375,"baidux":"103.94965699999995","baiduy":"30.939736845451705","dizhi":"彭州市致和镇协和路258号逸景苑销售中心楼下","leibie":"恒温游泳池","path":"/游泳池/70/0.jpg","dianhua":"18121842128","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":71,"mingcheng":"圣多美天誉泳池","pianqu":"锦江区","yongchidaxiao":250,"baidux":"104.12044199999995","baiduy":"30.64139087839689","dizhi":"四川省成都市锦江区汇源北路99号","leibie":"恒温游泳池","path":"/游泳池/71/0.jpg","dianhua":"13558626064","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":72,"mingcheng":"蓝色空间游泳健身","pianqu":"彭州市","yongchidaxiao":475,"baidux":"103.9599488360684","baiduy":"30.994853503624455","dizhi":"四川省南充市金彭东路17号附1","leibie":"恒温游泳池","path":"/游泳池/72/0.jpg","dianhua":"18080630511","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":73,"mingcheng":"恒大雅苑室内恒温游泳池","pianqu":"青白江区","yongchidaxiao":430,"baidux":"104.294903","baiduy":"30.882591","dizhi":"四川省南充市凤凰东四路222号","leibie":"恒温游泳池","path":"/游泳池/73/0.png","dianhua":"18081049052","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":74,"mingcheng":"奇迹健身游泳池（太阳公元店）","pianqu":"成华区","yongchidaxiao":375,"baidux":"104.10708499999996","baiduy":"30.678242870256486","dizhi":"四川省南充市建设北路二段辅路","leibie":"恒温游泳池","path":"/游泳池/74/0.jpg","dianhua":"13699439983","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":75,"mingcheng":"途睿健身游泳馆","pianqu":"成华区","yongchidaxiao":500,"baidux":"104.168824","baiduy":"30.706541","dizhi":"四川省南充市龙潭寺西路107号","leibie":"恒温游泳池","path":"/游泳池/75/0.png","dianhua":"18981071710","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":76,"mingcheng":"康桥健身游泳","pianqu":"成华区","yongchidaxiao":270,"baidux":"104.124277","baiduy":"30.670989","dizhi":"四川省南充市杉板桥街199号","leibie":"恒温游泳池","path":"/游泳池/76/0.png","dianhua":"15982283319","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":77,"mingcheng":"世茂茂御酒店游泳池","pianqu":"成华区","yongchidaxiao":125,"baidux":"104.100578","baiduy":"30.675947","dizhi":"四川省南充市建设北路1段-58号","leibie":"恒温游泳池","path":"/游泳池/77/0.png","dianhua":"15802843615","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":78,"mingcheng":"文体中心游泳馆","pianqu":"青白江区","yongchidaxiao":500,"baidux":"104.26575399999994","baiduy":"30.900392845987945","dizhi":"四川省南充市凤祥大道","leibie":"恒温游泳池","path":"/游泳池/78/0.jpg","dianhua":"13568804290","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":79,"mingcheng":"威尔士健身游泳馆","pianqu":"金牛区","yongchidaxiao":330,"baidux":"104.037031","baiduy":"30.704063","dizhi":"四川省南充市","leibie":"恒温游泳池","path":"/游泳池/79/0.png","dianhua":"18582382170","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":80,"mingcheng":"海力体育游泳馆","pianqu":"金牛区","yongchidaxiao":375,"baidux":"104.098749","baiduy":"30.699254","dizhi":"四川省南充市解放路一段139号","leibie":"恒温游泳池","path":"/游泳池/80/0.png","dianhua":"18602873485","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":81,"mingcheng":"测试泳池","pianqu":"武侯区","yongchidaxiao":300,"baidux":"104.06760399999996","baiduy":"30.598412889614636","dizhi":"四川省南充市站华路15号","leibie":"恒温游泳池","path":"/游泳池/81/0.jpg","dianhua":"18008178332","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":19,"mingcheng":"奇迹健身游泳馆","pianqu":"青羊区","yongchidaxiao":420,"baidux":"104.07143976033295","baiduy":"30.680229938496282","dizhi":"四川省成都市青羊区江汉路29号附19号","leibie":"恒温游泳池","path":"/游泳池/19/0.jpg","dianhua":"18780316976","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":20,"mingcheng":"华侨城东岸游泳馆","pianqu":"金牛区","yongchidaxiao":300,"baidux":"104.04593864723654","baiduy":"30.72839349422522","dizhi":"四川省成都市金牛区北三环路一段辅路","leibie":"恒温游泳池","path":"/游泳池/20/0.jpg","dianhua":"028-61362180","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":21,"mingcheng":"锦城恒温游泳馆","pianqu":"武侯区","yongchidaxiao":500,"baidux":"104.0608547496847","baiduy":"30.582296225766644","dizhi":"四川省成都市武侯区成汉南路","leibie":"恒温游泳池","path":"/游泳池/21/0.jpg","dianhua":"13880295507","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":22,"mingcheng":"成都英派斯健身西体游泳馆","pianqu":"金牛区","yongchidaxiao":220,"baidux":"104.06297973174401","baiduy":"30.686772426001564","dizhi":"四川省成都市金牛区西体路2号","leibie":"恒温游泳池","path":"/游泳池/22/0.jpg","dianhua":"13980542535","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":23,"mingcheng":"世外桃源酒店游泳池","pianqu":"武侯区","yongchidaxiao":360,"baidux":"104.0842277859802","baiduy":"30.635342699802866","dizhi":"四川省成都市武侯区科华北路89号","leibie":"恒温游泳池","path":"/游泳池/23/0.jpg","dianhua":"15002868940","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":24,"mingcheng":"格锐健身游泳馆","pianqu":"青羊区","yongchidaxiao":375,"baidux":"104.037474","baiduy":"30.675254","dizhi":"四川省成都市青羊区清江东路186号15栋1层","leibie":"恒温游泳池","path":"/游泳池/24/0.jpg","dianhua":"18381085010","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":27,"mingcheng":"海力体育泳池","pianqu":"锦江区","yongchidaxiao":240,"baidux":"104.09325513123757","baiduy":"30.65930379915292","dizhi":"四川省成都市锦江区东顺城南街57号-附1号","leibie":"恒温游泳池","path":"/游泳池/27/0.jpg","dianhua":"15102831005","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":28,"mingcheng":"龙之梦酒店游泳馆","pianqu":"成华区","yongchidaxiao":487.5,"baidux":"104.15133085185683","baiduy":"30.63615343737613","dizhi":"四川省成都市成华区邛崃山路","leibie":"恒温游泳池","path":"/游泳池/28/0.jpg","dianhua":"028-83218787","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":29,"mingcheng":"韦德伍斯健身(会员专用)","pianqu":"武侯区","yongchidaxiao":360,"baidux":"104.01775799999994","baiduy":"30.63260188053648","dizhi":"四川省成都市武侯区祥云路","leibie":"恒温游泳池","path":"/游泳池/29/0.jpg","dianhua":"028-65063377","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":30,"mingcheng":"猛追湾游泳馆","pianqu":"锦江区","yongchidaxiao":1250,"baidux":"104.10185429422276","baiduy":"30.67062026958064","dizhi":"四川省成都市锦江区游乐园滨河路","leibie":"恒温游泳池","path":"/游泳池/30/0.jpg","dianhua":"13808023183","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":31,"mingcheng":"御龙山商务会所游泳馆","pianqu":"成华区","yongchidaxiao":276,"baidux":"104.12906699999995","baiduy":"30.644437877673255","dizhi":"四川省成都市成华区塔山路","leibie":"恒温游泳池","path":"/游泳池/31/0.jpg","dianhua":"13982266113","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":32,"mingcheng":"富力丽思卡尔顿游泳馆","pianqu":"青羊区","yongchidaxiao":175,"baidux":"104.07672099999996","baiduy":"30.6699918719647","dizhi":"四川省成都市青羊区体育路1号酒店23楼","leibie":"恒温游泳池","path":"/游泳池/32/0.jpg","dianhua":"18200432945","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":33,"mingcheng":"先锋健身游泳馆","pianqu":"青羊区","yongchidaxiao":330,"baidux":"104.01366585459309","baiduy":"30.670248947544543","dizhi":"四川省成都市青羊区青羊大道99号-附1","leibie":"恒温游泳池","path":"/游泳池/33/0.jpg","dianhua":"15680861210","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":34,"mingcheng":"凯旋城恒温游泳馆","pianqu":"青羊区","yongchidaxiao":240,"baidux":"104.00841202603279","baiduy":"30.671677142180982","dizhi":"四川省成都市青羊区瑞联路66号","leibie":"恒温游泳池","path":"/游泳池/34/0.jpg","dianhua":"13982046034","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":37,"mingcheng":"仁和米高会游泳馆","pianqu":"青羊区","yongchidaxiao":334,"baidux":"104.02633399621276","baiduy":"30.66889896653246","dizhi":"四川省成都市青羊区仁和春天酒店5楼","leibie":"恒温游泳池","path":"/游泳池/37/0.jpg","dianhua":"18780241030","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":43,"mingcheng":"艾迪韦尔恒温游泳馆","pianqu":"武侯区","yongchidaxiao":400,"baidux":"104.05708699999995","baiduy":"30.55621690254608","dizhi":"四川省成都市武侯区天府二街","leibie":"恒温游泳池","path":"/游泳池/43/0.jpg","dianhua":"18780195581","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":44,"mingcheng":"中海名城会所恒温游泳馆","pianqu":"武侯区","yongchidaxiao":200,"baidux":"104.05322599999995","baiduy":"30.620308883660833","dizhi":"四川省成都市武侯区神仙树南路8","leibie":"恒温游泳池","path":"/游泳池/44/0.jpg","dianhua":"13438702036","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null},{"setyouyongchiid":45,"mingcheng":"新都一中游泳馆","pianqu":"新都区","yongchidaxiao":1250,"baidux":"104.18637659694267","baiduy":"30.840228662266302","dizhi":"四川省成都市新都区鸿运大道东段","leibie":"恒温游泳池","path":"/游泳池/45/0.jpg","dianhua":"18048058233","yingyejieshutime":null,"yingyekaishitime":null,"zongshu":0,"pingjunfen":null}]
     * js :
     */

    private boolean success;
    private String msg;
    private String obj;
    private String js;
    private List<ListBean> list;

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

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        /**
         * setyouyongchiid : 14
         * mingcheng : 耘健身游泳馆
         * pianqu : 青羊区
         * yongchidaxiao : 350.0
         * baidux : 104.06653686352861
         * baiduy : 30.655830944159714
         * dizhi : 四川省成都市青羊区上池北街8号
         * leibie : 恒温游泳池
         * path : /游泳池/14/0.jpg
         * dianhua : 15882252732
         * yingyejieshutime : null
         * yingyekaishitime : null
         * zongshu : 2
         * pingjunfen : 5.0
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
        private Object yingyejieshutime;
        private Object yingyekaishitime;
        private int zongshu;
        private String pingjunfen;

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

        public Object getYingyejieshutime() {
            return yingyejieshutime;
        }

        public void setYingyejieshutime(Object yingyejieshutime) {
            this.yingyejieshutime = yingyejieshutime;
        }

        public Object getYingyekaishitime() {
            return yingyekaishitime;
        }

        public void setYingyekaishitime(Object yingyekaishitime) {
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
    }
}
