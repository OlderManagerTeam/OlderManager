package com.sds.em.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017-05-19.
 */

public class DateSimp {
	public static Date simp(String sDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date date = new Date();
		/*
		 * String sDate = "2010-03-26 12:10";
		 */
		date = sdf.parse(sDate);
		return date;
	}

	public static String simpToSting(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String str = sdf.format(date);

		return str;
	}

	// ���������ռ�������,birthTimeString:"1994-11-14"
	public static int getAgeFromBirthTime(String birthTimeString) {
		// �Ƚ�ȡ���ַ����е��ꡢ�¡���
		String strs[] = birthTimeString.trim().split("-");
		int selectYear = Integer.parseInt(strs[0]);
		int selectMonth = Integer.parseInt(strs[1]);
		int selectDay = Integer.parseInt(strs[2]);
		// �õ���ǰʱ����ꡢ�¡���
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH) + 1;
		int dayNow = cal.get(Calendar.DATE);

		// �õ�ǰ�����ռ�ȥ����������
		int yearMinus = yearNow - selectYear;
		int monthMinus = monthNow - selectMonth;
		int dayMinus = dayNow - selectDay;

		int age = yearMinus;// �ȴ��¸�ֵ
		if (yearMinus < 0) {// ѡ��δ�������
			age = 0;
		} else if (yearMinus == 0) {// ͬ��ģ�ҪôΪ1��ҪôΪ0
			if (monthMinus < 0) {// ѡ��δ�����·�
				age = 0;
			} else if (monthMinus == 0) {// ͬ�·ݵ�
				if (dayMinus < 0) {// ѡ��δ��������
					age = 0;
				} else if (dayMinus >= 0) {
					age = 1;
				}
			} else if (monthMinus > 0) {
				age = 1;
			}
		} else if (yearMinus > 0) {
			if (monthMinus < 0) {// ��ǰ��>������
			} else if (monthMinus == 0) {// ͬ�·ݵģ��ٸ������ڼ�������
				if (dayMinus < 0) {
				} else if (dayMinus >= 0) {
					age = age + 1;
				}
			} else if (monthMinus > 0) {
				age = age + 1;
			}
		}
		return age;
	}

/*	// ����ʱ�����������
	public static int getAgeFromBirthTime(long birthTimeLong) {
		Date date = new Date(birthTimeLong * 1000l);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String birthTimeString = format.format(date);
		return getAgeFromBirthTime(birthTimeString);
	}
*/
	/*
	 * public static String getDateDays(Date fDate) {
	 * 
	 * Calendar aCalendar = Calendar.getInstance();
	 * 
	 * aCalendar.setTime(fDate);
	 * 
	 * int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
	 * 
	 * aCalendar.setTime(new Date());
	 * 
	 * int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
	 * 
	 * return String.valueOf(day2 - day1);
	 * 
	 * }
	 */

}