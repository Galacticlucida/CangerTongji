package cn.lyc.demo.bean;

import java.sql.Date;

public class DayData {
    private Date day;
    private int count;

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DayData{" +
                "day=" + day +
                ", count=" + count +
                '}';
    }

    public void setCount(int count) {
        this.count = count;
    }
}
