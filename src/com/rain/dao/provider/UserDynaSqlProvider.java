package com.rain.dao.provider;

import static com.rain.util.common.Constants.USERTABLE;

import org.apache.ibatis.jdbc.SQL;

import com.rain.domain.User;

public class UserDynaSqlProvider {
			// 动态插入
			public String insert_Notice(User job){
				
				return new SQL(){
					{
						INSERT_INTO(USERTABLE);
						if(job.getLoginname() != null ){
							VALUES("loginname", "#{loginname}");
						}
						if(job.getPassword()!=null){
							VALUES("password","#{password}");
						}
						if(job.getUsername()!=null){
							VALUES("username","#{username}");
						}
						if(job.getUserphone()!=null){
							VALUES("userphone","#{userphone}");
						}
						if(job.getUserschool()!=null){
							VALUES("userschool","#{userschool}");
						}
						if(job.getUserage()!=null){
							VALUES("userage","#{userage}");
						}
						if(job.getUserinstruction()!=null){
							VALUES("instruction","#{useinstruction}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_Notice(User job){
				
				return new SQL(){
					{
						UPDATE(USERTABLE);
						if(job.getLoginname() != null ){
							SET("loginname = #{loginname}");
						}
						if(job.getPassword()!=null){
							SET("password = #{password}");
						}
						if(job.getUsername()!=null){
							SET("username = #{username}");
						}
						if(job.getUserphone()!=null){
							SET("userphone=#{userphone}");
						}
						if(job.getUserschool()!=null){
							SET("userschool=#{userschool}");
						}
						if(job.getUserage()!=null){
							SET("userage=#{userage}");
						}
						if(job.getUserinstruction()!=null){
							SET("userinstruction=#{userinstruction}");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
