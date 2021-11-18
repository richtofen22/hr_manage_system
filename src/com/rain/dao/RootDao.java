package com.rain.dao;

import static com.rain.util.common.Constants.ROOTTABLE;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.rain.dao.provider.RootDynaSqlProvider;
import com.rain.domain.Root;

public interface RootDao {

	@Select("select * from "+ROOTTABLE+"  where loginname = #{loginname} AND password = #{password}")
	Root get_login(@Param("loginname") String loginname,
			@Param("password") String password);
	
	@SelectProvider(type=RootDynaSqlProvider.class,method="insert_Notice")
	void insert_Info(Root employee);
	
	@Select("select * from "+ROOTTABLE+" where id = #{id}")
	Root get_Info(Integer id);

	@SelectProvider(type=RootDynaSqlProvider.class,method="update_Notice")
	void update_Info(Root employee);
	// 根据id删除部门
	@Delete(" delete from "+ROOTTABLE+" where id = #{id} ")
	void delete_Info(Integer id);

}
