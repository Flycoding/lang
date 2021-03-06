package com.flyingh.demo;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class Demo {
	@Test
	public void test11() {
		ResourceBundle bundle = ResourceBundle.getBundle(
				"com.flyingh.resources.MessageResource", Locale.CHINA);
		String info = bundle.getString("info");
		System.out.println(new MessageFormat(info, Locale.FRANCE)
				.format(new Object[] { new Date(), 10, 0.99 }));
	}

	@Test
	public void test10() {
		MessageFormat messageFormat = new MessageFormat(
				"...{0,time,short}...{0,date}...{1,number,currency}...{2,number,percent}",
				Locale.FRANCE);
		System.out.println(messageFormat.format(new Object[] { new Date(), 10,
				0.99 }));

	}

	@Test
	public void test9() {
		System.out.println(MessageFormat.format("...{0}....{1}...{2}",
				new Date(), 10, 99999));
	}

	@Test
	public void test8() {
		System.out.println(NumberFormat.getPercentInstance(Locale.CHINA)
				.format(0.15));
	}

	@Test
	public void test7() throws ParseException {
		Number num = NumberFormat.getCurrencyInstance(Locale.FRANCE).parse(
				"18,50 €");
		System.out.println(num.getClass());
		System.out.println(num);
	}

	@Test
	public void test6() {
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE)
				.format(18.5));
		int € = 1;
		System.out.println(€);
		int ￥ = 5;
		System.out.println(￥);
	}

	@Test
	public void test5() throws ParseException {
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(
				DateFormat.FULL, DateFormat.SHORT, Locale.CHINA);
		Date date = dateTimeInstance.parse("2013年6月11日 星期二 下午10:36");
		System.out.println(date);
		System.out.println(String.format("%1$tF %1$tT", date));
	}

	@Test
	public void test4() {
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(
				DateFormat.FULL, DateFormat.SHORT, Locale.CHINA);
		System.out.println(dateTimeInstance.format(new Date()));
	}

	@Test
	public void test3() {
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(
				DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA);
		System.out.println(dateTimeInstance.format(new Date()));
	}

	@Test
	public void test2() {
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT,
				Locale.CHINA);
		System.out.println(dateFormat.format(new Date()));
	}

	@Test
	public void test() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.KOREA);
		System.out.println(dateFormat.format(new Date()));
	}
}
