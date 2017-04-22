package cc.howlove.aodacat.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AodaCat on 2017/4/22.
 */

public class City extends DataSupport {

    private int id;             //实体类id
    private String cityName;    //记录城市的名称
    private int cityCode;       //记录城市的代号
    private int provinceId;     //记录当前城市所属省的id值

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
