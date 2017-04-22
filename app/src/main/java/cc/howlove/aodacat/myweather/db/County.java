package cc.howlove.aodacat.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AodaCat on 2017/4/22.
 */

public class County extends DataSupport {

    private  int id;                //记录实体id
    private String countyName;      //记录县的名字
    private String weatherId;       //记录县所对应的天气id值
    private int cityId;             //记录当前县所属市的id值

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

}
