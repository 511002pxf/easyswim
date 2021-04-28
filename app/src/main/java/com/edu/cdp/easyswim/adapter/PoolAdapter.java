package com.edu.cdp.easyswim.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.edu.cdp.easyswim.IPAddress;
import com.edu.cdp.easyswim.R;
import com.edu.cdp.easyswim.activity.ActDetall;
import com.edu.cdp.easyswim.mode.Pool;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PoolAdapter extends RecyclerView.Adapter <PoolAdapter.MyViewHolder> {

    private Context context;//上下文
    private  List<Pool.ListBean>data=new ArrayList<>();


    public PoolAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public PoolAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pool, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PoolAdapter.MyViewHolder holder, int position) {
        Pool.ListBean item=data.get(position);
        holder.tvName.setText(item.getMingcheng());

        if(item.getZongshu()==0){
            holder.tvSort.setText("暂无评价");
            holder.tvNumber.setVisibility(View.GONE);
        }else {
            holder.tvNumber.setVisibility(View.VISIBLE);
            holder.tvNumber.setText(item.getZongshu()+"条评论");
            holder.tvSort.setText(item.getPingjunfen()+"分");
        }
        holder.tvAddress.setText(item.getDizhi());
        if (item.getPath()!=null&& !TextUtils.isEmpty(item.getPath())){
            String imgUrl = IPAddress.getImgUrl(item.getPath());
            Glide.with(context).load(imgUrl).into(holder.ivCover);//加载图片
        }

        holder.llItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActDetall.class);
                intent.putExtra("datd",item.getSetyouyongchiid());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void initDate(List<Pool.ListBean> list,int pageIndex) {
        if(pageIndex==0){
            data.clear();//用户数新，清空之前的数据
        }
        data.addAll(list);
        notifyDataSetChanged();//刷新数据
    }

    static
    class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_cover)
        ImageView ivCover;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_sort)
        TextView tvSort;
        @BindView(R.id.tv_number)
        TextView tvNumber;
        @BindView(R.id.tv_address)
        TextView tvAddress;
        @BindView(R.id.tv_juli)
        TextView tvJuli;
        @BindView(R.id.ll_item)
        LinearLayout llItem;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
