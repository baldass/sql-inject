package com.shop.wechat.exercise.utils;

import com.shop.wechat.exercise.common.CompareEnum;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.shop.wechat.exercise.common.CompareEnum.EQUAL;

/**
 * @description: 日期类工具
 * @auther: bald ass
 * @date: 2019/11/20 10:23
 */
public class DateUtils {

    public static String date2String(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String date2String(Date date) {
        return date2String(date, "yyyy年MM月dd日 HH时mm分ss秒");
    }

    public static Date string2Date(String source, String format) throws ParseException {
        if (StringUtils.isEmpty(source)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(source);
    }

    public static Date string2Date(String source) throws ParseException {
        return string2Date(source, "yyyy年MM月dd日 HH时mm分ss秒");
    }

    public static boolean isSame(Date d1, Date d2) {
        CompareEnum compare = compare(d1, d2);
        if (EQUAL == compare) {
            return true;
        }
        return false;
    }

    public static CompareEnum compare(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            return CompareEnum.ERR;
        }
        long flag = d1.getTime() - d2.getTime();
        if (flag > 0) {
            return CompareEnum.GREATER;
        } else {
            if (flag == 0) {
                return EQUAL;
            }
            return CompareEnum.SMALLER;
        }
    }
}
