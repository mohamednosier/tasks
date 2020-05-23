package softexpert.task.com.Data.data;

/**
 * Created by amit on 3/23/18.
 */

public class Data {


    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(String constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String constructionYear;
    private String isUsed;
    private String imageUrl;

    public Data( String constructionYear, String isUsed, String brand, String imageUrl) {
        this.imageUrl = imageUrl;
        this.constructionYear = constructionYear;
        this.isUsed = isUsed;
        this.brand = brand;

    }


}
