package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import com.mybatis.pojo.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    Dept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_dept
     *
     * @mbggenerated Mon Jul 24 17:15:17 CST 2023
     */
    int updateByPrimaryKey(Dept record);
}