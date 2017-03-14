package org.second;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Created by K550jk on 2017/3/13.
 */
public class Car {
  /*  @DateTimeFormat(pattern="yyyy-MM-dd")*/
    public Date getNow() {
        return now;
    }
    public void setNow(String now) {
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.now = (Date) dateFormat.parse(now);
        }catch (Exception e){
            System.out.print(e);
        }

    }
    private Date now;



    public void printData(){
        System.out.print("生产日期:" + this.now.toString());
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {

        this.brand = brand;
    }
    private String brand;
    public void Run(){
        System.out.print(this.brand + "I am Run on" +this.now);
    }



}
