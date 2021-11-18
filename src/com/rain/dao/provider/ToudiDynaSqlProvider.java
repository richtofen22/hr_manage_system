package com.rain.dao.provider;

import static com.rain.util.common.Constants.TOUDITABLE;

import org.apache.ibatis.jdbc.SQL;

import com.rain.domain.Toudi;

public class ToudiDynaSqlProvider {
			// 动态插入
			public String insert_Toudi(Toudi toudi){
				
				return new SQL(){
					{
						INSERT_INTO(TOUDITABLE);
						if(toudi.getNoticeid() != null ){
							VALUES("noticeid", "#{noticeid}");
						}
						if(toudi.getUserid()!=null){
							VALUES("userid","#{userid}");
						}
					
					}
				}.toString();
			}	
}
