# MyBatis中当实体类中的属性名和表中的字段名不一样，怎么办？

```java
1.写sq1语句时起别名

select id,last_name lastName,email,salary,dept_id deptId from employees

2.在MyBatis的全局配置文件中开启驼峰命名规则
<setting name="mapUnderscoreToCamelCase" value="true"/>
</settings>

3.在Mapper映射文件中使用resultMap来自定义映射规则

<select id="getEmployeeById" resultMap="myMap">
select * from employees where id=#{id}
</select>

<！--自定义高级映射-->
<resultMap type="com.atguigu.mybatis.entities.Employee"id="myMap">
<！--映射主键-->
<id column="id"property="id"/>
<！--映射其他列-->
<result column="last_name"property="LastName"/>
<result column="email"property="email"/>
kresult column="salary"property="salary"/|T
<result column="dept_id"property="deptId"/>
</resultMap>


```

