package com.rain.dao;

import static com.rain.util.common.Constants.TOUDITABLE;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.rain.dao.provider.ToudiDynaSqlProvider;
import com.rain.domain.Toudi;

public interface ToudiDao {

	@Select("select * from "+TOUDITABLE+"  where noticeid = #{id}")
	List<Toudi> get_ToudiList(Integer id);

	@SelectProvider(type=ToudiDynaSqlProvider.class,method="insert_Toudi")
	void insert_Toudi(Toudi Toudi);

}