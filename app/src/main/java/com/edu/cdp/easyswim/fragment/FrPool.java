package com.edu.cdp.easyswim.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.edu.cdp.easyswim.IPAddress;
import com.edu.cdp.easyswim.R;
import com.edu.cdp.easyswim.adapter.PoolAdapter;
import com.edu.cdp.easyswim.mode.Pool;
import com.edu.cdp.easyswim.mode.ZiDian;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

public class FrPool extends SupportFragment implements OnRefreshListener, OnRefreshLoadMoreListener {


    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.smart_refresh)
    SmartRefreshLayout smartRefresh;
    @BindView(R.id.tv_area)
    TextView tvArea;
    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.iv_sort)
    ImageView ivSort;
    private Unbinder unbinder;
    private PoolAdapter poolAdapter;
    private static final int PAGE_SIZE = 10;//每页加载10条数据

    private int setyouyongchiid;
    private int pageIndex = 0;
    private List<String> areaList =new ArrayList<>();//区域列表
    private List<String> sortList =new ArrayList<>();//排序列表
    private String pianqu;
    private int paixu;
    private String keyword;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_pool, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        getAreaList();
        getPoolList();
        return view;
    }
    /**
     * 获取区域列表
     */
    private void getAreaList() {
        sortList.add("评分最高");
        sortList.add("评价最多");
        areaList.add("全部");
        RequestParams params = new RequestParams(IPAddress.getUrl(IPAddress.ZIDIANSHU));
        x.http().get(params, new Callback.CommonCallback<ZiDian>() {
            @Override
            public void onSuccess(ZiDian result) {
                if (result!=null){
                    if (result.isSuccess()){
                        List<ZiDian.ListBeanX> list = result.getList();
                        for (ZiDian.ListBeanX x:list) {
                            if ("片区".equals(x.getName())){
                                List<ZiDian.ListBeanX.ListBean> areas = x.getList();
                                for (ZiDian.ListBeanX.ListBean area: areas){
                                    areaList.add(area.getName());
                                }
                            }
                        }
                    }else {
                        Toast.makeText(_mActivity, result.getMsg(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(_mActivity, ex.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 获取游泳池列表
     */
    private void getPoolList() {
        RequestParams params = new RequestParams(IPAddress.getUrl(IPAddress.POOL_LIST));
        params.addParameter("pagesize", PAGE_SIZE);
        params.addParameter("setyouyongchiid", setyouyongchiid);
        params.addParameter("pianqu",pianqu);
        params.addParameter("paixu",paixu);
        params.addParameter("mingcheng",keyword);

        x.http().get(params, new Callback.CommonCallback<Pool>() {

            @Override
            public void onSuccess(Pool pool) {
                smartRefresh.finishRefresh();
                if (pool != null) {
                    if (pool.isSuccess()) {
                        List<Pool.ListBean> list = pool.getList();
                        poolAdapter.initDate(list, pageIndex);
                        if (list != null && list.size() != 0) {
                            //获取最后一条泳池的id作为分页的参数
                            Pool.ListBean bean = list.get(list.size() - 1);
                            setyouyongchiid = bean.getSetyouyongchiid();
                            //pageIndex +=1;
                            if (list.size() < PAGE_SIZE) {
                                smartRefresh.finishLoadMoreWithNoMoreData();//没有更多数据了
                            } else {
                                smartRefresh.finishLoadMore();
                            }
                        } else {
                            smartRefresh.finishLoadMoreWithNoMoreData();
                        }
                    } else {
                        Toast.makeText(_mActivity, pool.getMsg(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                smartRefresh.finishRefresh();
                smartRefresh.finishLoadMoreWithNoMoreData();
                Toast.makeText(_mActivity, ex.toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void initView() {
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(RecyclerView.VERTICAL);
        recycler.setLayoutManager(manager);
        poolAdapter = new PoolAdapter(getContext());
        recycler.setAdapter(poolAdapter);
        smartRefresh.setOnRefreshListener(this);
        smartRefresh.setOnRefreshLoadMoreListener(this);
        //监听用户搜索完成
        edSearch.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //当用户按下回车键时
                if(keyCode==KeyEvent.KEYCODE_ENTER&&event.getAction()==event.ACTION_DOWN){
                    keyword = edSearch.getText().toString().trim();
                    onRefresh(smartRefresh);
                    closeSoftKeybord(edSearch,getContext());
                }
                return false;
            }
        });
    }

    public static void closeSoftKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
        mEditText.clearFocus();//清除焦点
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();//解绑控件，释放资源
    }

    //当用户下拉刷新时触发此方法
    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        pageIndex = 0;
        setyouyongchiid = 0;
        getPoolList();
    }

    //当用户上拉加载时触发此方法
    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        getPoolList();
    }

    @OnClick({R.id.tv_area, R.id.iv_sort})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_area://区域
                OptionsPickerView<String> pickerView = new OptionsPickerBuilder(getContext(), new OnOptionsSelectListener() {
                    @Override
                    public void onOptionsSelect(int options1, int options2, int options3, View v) {
                        //用户选择某一区域时会触发
                        pianqu = areaList.get(options1);
                        tvArea.setText(pianqu);
                        if(options1==0){
                            pianqu="";
                        }
                        onRefresh(smartRefresh);
                    }
                }).build();
                pickerView.setPicker(areaList);
                pickerView.show();
                break;
            case R.id.iv_sort://排序
                OptionsPickerView<String> pickerView2 = new OptionsPickerBuilder(getContext(), new OnOptionsSelectListener() {
                    @Override
                    public void onOptionsSelect(int options1, int options2, int options3, View v) {
                        paixu = options1;
                        onRefresh(smartRefresh);
                    }
                }).build();
                pickerView2.setPicker(sortList);
                pickerView2.show();
                break;
        }
    }
}
