package softexpert.task.com.Data.interfaces;

import java.util.List;

import softexpert.task.com.Data.data.Data;

/**
 * Created by amit on 3/23/18.
 */

public interface GetDataListener {

    void onSuccess(String message, List<Data> list);

    void onFailure(String message);

}
