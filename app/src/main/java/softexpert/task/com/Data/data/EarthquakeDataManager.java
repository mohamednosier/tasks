package softexpert.task.com.Data.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 3/23/18.
 */

public class EarthquakeDataManager {

    private List<Data> latestData;

    private static EarthquakeDataManager instance=null;

    private EarthquakeDataManager(){
        latestData = new ArrayList<Data>();
    }
    public static EarthquakeDataManager getInstance(){

        synchronized (EarthquakeDataManager.class) {
            if(instance == null){
                instance = new EarthquakeDataManager();
            }
        }

        return instance;
    }

    public List<Data> getLatestData() {
        return latestData;
    }

    public void setLatestData(List<Data> latestData) {

        this.latestData = latestData;
    }
}
