package softexpert.task.com.Data.interfaces;

import android.content.Context;

/**
 * Created by amit on 3/23/18.
 */

public interface MainPresenter {

    void getDataForList(Context context, boolean isRestoring);

    void onDestroy();

}
