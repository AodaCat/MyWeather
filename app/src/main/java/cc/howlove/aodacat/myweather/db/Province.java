package cc.howlove.aodacat.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AodaCat on 2017/4/22.
 */

/**
 * 存放省的信息
 */
public class Province extends DataSupport {

    private int id;                  //每个实体类中都应该有的字段
    private String provinceName;    //记录省的名字
    private int provinceCode;       //记录省的代号

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }

}
