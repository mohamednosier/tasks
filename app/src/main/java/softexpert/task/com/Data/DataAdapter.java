package softexpert.task.com.Data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

import softexpert.task.com.Data.data.Data;

/**
 * Created by amit on 3/23/18.
 */

public class DataAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context mContext;
    private List<Data> mDatalist = new ArrayList<Data>();
    DateFormat dateFormat;

    public DataAdapter(Context mContext, List<Data> list) {
        this.mContext = mContext;
        this.mDatalist = list;
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        Data eq = mDatalist.get(position);
        holder.brand_car.setText("Brand: " +eq.getBrand());
        holder.constructionYear.setText("ConstructionYear: " + eq.getConstructionYear());
        holder.isUsed.setText("IsUsed: " +eq.getIsUsed() + "!");
        Log.d("onBindViewHolder", "onBindViewHolder: "+eq.getImageUrl());

//            holder.mBackgroundView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorMagnitude));
//        Picasso.with(holder.image_url.getContext())
//                .load(eq.getImageUrl())
//                .fit().into(holder.image_url);
        Picasso.get()
                .load(eq.getImageUrl())
                .into(holder.image_url);
    }

    @Override
    public int getItemCount() {
        if (mDatalist.size()>0){
        return mDatalist.size();
    }else {
            return 0;
        }
}}
