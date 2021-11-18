package com.rain.dao.provider;

import static com.rain.util.common.Constants.NOTICETABLE;

import org.apache.ibatis.jdbc.SQL;

import com.rain.domain.Notice;

public class NoticeDynaSqlProvider {
			// 动态插入
			public String insert_Notice(Notice job){
				
				return new SQL(){
					{
						INSERT_INTO(NOTICETABLE);
						if(job.getTitle() != null ){
							VALUES("title", "#{title}");
						}
						if(job.getContent()!=null){
							VALUES("content","#{content}");
						}
					
					}
				}.toString();
			}	
			// 动态更新
			public String update_Notice(Notice job){
				
				return new SQL(){
					{
						UPDATE(NOTICETABLE);
						if(job.getTitle() != null ){
							SET("title = #{title}");
						}
						if(job.getContent()!=null){
							SET("content = #{content}");
						}
						
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
