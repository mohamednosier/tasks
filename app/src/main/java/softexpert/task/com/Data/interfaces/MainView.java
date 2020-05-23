package softexpert.task.com.Data.interfaces;

import java.util.List;

import softexpert.task.com.Data.data.Data;

/**
 * Created by amit on 3/23/18.
 */

public interface MainView {
    void onGetDataSuccess(String message, List<Data> list);

    void onGetDataFailure(String message);

    void showProgress();

    void hideProgress();

    void showMessage(String message);
}
