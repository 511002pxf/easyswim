package com.edu.cdp.easyswim.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.edu.cdp.easyswim.IPAddress;
import com.edu.cdp.easyswim.R;
import com.edu.cdp.easyswim.mode.PoolDetail;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActDetall extends AppCompatActivity {

    @BindView(R.id.view_pager)
    ViewPager viewPager;
    private int yongchild;
    private List<String> imgList;
    private PoolDetail.ObjBean detail;
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_detall);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("data")) {
            yongchild = intent.getIntExtra("data", 0);
            getDetail();
        } else {
            finish();
        }
    }

    private void getDetail() {
        RequestParams params = new RequestParams(IPAddress.getUrl(IPAddress.POOL_DETAIL));
        params.addParameter("setyouyongchiid", yongchild);
        x.http().get(params, new Callback.CommonCallback<PoolDetail>() {
            @Override
            public void onSuccess(PoolDetail result) {
                if (result != null) {
                    if (result.isSuccess()) {
                        imgList = result.getList();
                        detail = result.getObj();
                        if (imgList != null && imgList.size() != 0) {
                            initBanner();
                        }
                    } else {
                        Toast.makeText(ActDetall.this, result.getMsg(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(ActDetall.this, ex.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /***
     * ??????????????????
     */

    private void initBanner() {
        viewPager.setOffscreenPageLimit(5);//??????viewpager??????????????????????????????
        myPagerAdapter = new MyPagerAdapter();
        viewPager.setAdapter(myPagerAdapter);
    }
    class MyPagerAdapter extends PagerAdapter{

/***
 * ?????????viewpager???????????????
 *
 */

        @NonNull
        @Override
        public ImageView instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView imageView = new ImageView(ActDetall.this);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 400);
            imageView.setLayoutParams(params);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);//??????????????????
            String imgUrl = IPAddress.getImgUrl(imgList.get(position));
            Glide.with(ActDetall.this).load(imgUrl).into(imageView);
            container.addView(imageView);
            return imageView;
        }
/**
 *???????????????????????????????????????
 *
 */

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            //super.destroyItem(container, position, object);
            container.removeView((ImageView) object);
        }

        @Override
        public int getCount() {
            return imgList.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view==object;
        }
    }
}