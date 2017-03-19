package android.hotweather.com.hotweather.entity;

/**
 * Created by Administrator on 2017/3/18.
 */

public class Data {
    private int id;
    private String name;
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
