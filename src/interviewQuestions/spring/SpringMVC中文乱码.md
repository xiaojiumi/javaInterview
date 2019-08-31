# SpringMVC中如何解决POST请求中文乱码问题，GET的又如何处理呢？

post:

```java
<！--解决POST请求的请求乱码问题-->
<filter>
<filter-name>CharacterEncodingFilterk/filter-namey
<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
<init-param>
<param-name>encoding</param-name>
<param-value>UTF-8</param-value>
</init-param>
<init-param>
<param-name>forceEncoding</param-name>
<param-value>true</param-value>
</init-param>
</filter>
<filter-mapping〉
<filter-name>CharacterEncodingFilter</filter-name>
<url-pattern>/*</url-pattern>
</filter-mapping>
//必须写在web.xml的最前面
```

get:

```java
修改tomcat的文件，在server.xml中第一个COnnector标签加入
<Connector URIEncoding="UTF-8"
```

