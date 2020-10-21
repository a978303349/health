package com.itheima.job;

import com.itheima.Util.DateUtils;
import com.itheima.dao.OrderSettingDao;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.SimpleDateFormat;

public class CleanOrderSetting {
    /**
     * 删除
     */
    @Autowired
    private OrderSettingDao orderSettingDao;
    public void doCleanOrderSetting(){
        java.util.Date firstDayOfThisMonth = DateUtils.getFirstDayOfThisMonth();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(firstDayOfThisMonth);
        System.out.println(format);
        orderSettingDao.deleteByDate(format);
    }
}
