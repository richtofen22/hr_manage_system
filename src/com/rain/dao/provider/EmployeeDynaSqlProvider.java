package com.rain.dao.provider;

import static com.rain.util.common.Constants.EMPLOYEETABLE;

import org.apache.ibatis.jdbc.SQL;

import com.rain.domain.Employee;

public class EmployeeDynaSqlProvider {
			// 动态插入
			public String insert_Employee(Employee job){
				
				return new SQL(){
					{
						INSERT_INTO(EMPLOYEETABLE);
						if(job.getName() != null ){
							VALUES("name", "#{name}");
						}
						if(job.getCard_id()!=null){
							VALUES("card_id","#{card_id}");
						}
						if(job.getAddress()!=null){
							VALUES("address","#{address}");
						}
						if(job.getPost_code()!=null){
							VALUES("post_code","#{post_code}");
						}
						if(job.getTel()!=null){
							VALUES("tel","#{tel}");
						}
						if(job.getPhone()!=null){
							VALUES("phone","#{phone}");
						}
						if(job.getSalary()!=null){
							VALUES("salary","#{salary}");
						}
						if(job.getEmail()!=null){
							VALUES("email","#{email}");
						}
						if(job.getSex()!=null){
							VALUES("sex","#{sex}");
						}
						if(job.getAge()!=null){
							VALUES("age","#{age}");
						}
						if(job.getEducation()!=null){
							VALUES("education","#{education}");
						}
						if(job.getSpeciality()!=null){
							VALUES("speciality","#{speciality}");
						}
						if(job.getHobby()!=null){
							VALUES("hobby","#{hobby}");
						}
						if(job.getRemark()!=null){
							VALUES("remark","#{remark}");
						}
						if(job.getDept_id()!=null){
							VALUES("dept_id","#{dept_id}");
						}
						if(job.getJob_id()!=null){
							VALUES("job_id","#{job_id}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_Employee(Employee job){
				
				return new SQL(){
					{
						UPDATE(EMPLOYEETABLE);
						if(job.getName() != null ){
							SET("name = #{name}");
						}
						if(job.getCard_id()!=null){
							SET("card_id = #{card_id}");
						}
						if(job.getAddress()!=null){
							SET("address = #{address}");
						}
						if(job.getPost_code()!=null){
							SET("post_code = #{post_code}");
						}
						if(job.getTel()!=null){
							SET("tel = #{tel}");
						}
						if(job.getPhone()!=null){
							SET("phone = #{phone}");
						}
						if(job.getSalary()!=null){
							SET("salary = #{salary}");
						}
						if(job.getEmail()!=null){
							SET("email = #{email}");
						}
						if(job.getSex()!=null){
							SET("sex = #{sex}");
						}
						if(job.getAge()!=null){
							SET("age = #{age}");
						}
						if(job.getEducation()!=null){
							SET("education = #{education}");
						}
						if(job.getSpeciality()!=null){
							SET("speciality = #{speciality}");
						}
						if(job.getHobby()!=null){
							SET("hobby = #{hobby}");
						}
						if(job.getRemark()!=null){
							SET("remark = #{remark}");
						}
						if(job.getDept_id()!=null){
							SET("dept_id = #{dept_id}");
						}
						if(job.getJob_id()!=null){
							SET("job_id = #{job_id}");
						}
						
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
