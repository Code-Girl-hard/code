package com.yidong.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	
	
private	static ComboPooledDataSource datasouse=new ComboPooledDataSource();

   public  static ComboPooledDataSource getDataSouse(){
	   return datasouse;
   }
}
