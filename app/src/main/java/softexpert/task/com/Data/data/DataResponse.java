package softexpert.task.com.Data.data;

import java.util.List;

/**
 * Created by amit on 3/23/18.
 */

public class DataResponse {



    private List<Data> data;

    public DataResponse(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
