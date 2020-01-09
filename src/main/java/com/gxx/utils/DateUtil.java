package com.gxx.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtil {

	public static void main(String[] args) {
		int age = getAge(new Date());
		System.out.println(age);
	}
	
	/**
	 * 根据传入的日期获取年龄
	 * @param src
	 * @return
	 */
	public static int getAge (Date src) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String format = sdf.format(date);
		String substring = format.substring(0,4);
		int parseInt = Integer.parseInt(substring);
		
		String string = sdf.format(src);
		String substring2 = string.substring(0,4);
		int parseInt2 = Integer.parseInt(substring2);
		
		return parseInt-parseInt2;
	}

	
/*//	根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public static Date getDateByMonthInit (Date src) {
		
	}
//  根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		
	}
//	求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		
	}
//	求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		
	}
*/
}
