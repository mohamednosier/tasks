package softexpert.task.com.Data;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amit on 3/23/18.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView brand_car;
    TextView constructionYear;
    TextView isUsed;
    ImageView image_url;
//    LinearLayout mBackgroundView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        brand_car = (TextView) itemView.findViewById(R.id.brand_car);
        constructionYear = (TextView) itemView.findViewById(R.id.constructionYear);
        isUsed = (TextView) itemView.findViewById(R.id.isUsed);
        image_url = (ImageView) itemView.findViewById(R.id.image_url);
//        mBackgroundView = (LinearLayout) itemView.findViewById(R.id.backgroundView);
    }
}
