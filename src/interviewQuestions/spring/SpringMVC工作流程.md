# SpringMVC工作流程

```java
//1.简单的谈一下SpringMVC的工作流程
//处理模型数据方式一：将方法的返回值设置为ModelAndView
@RequestMapping（"/testModelAndView"）
public ModelAndView testModelAndView（）{
//1.创建ModelAndView对象ModelAndView mav=new ModelAndView（）；
//2.设置模型数据，最终会放到request域中mav.addobject（"user"，"admin"）；
//3.设置视图
mav.setViewName（"success"）；
return mav；
}
*处理模型数据方式二：方法的返回值仍是String类型，在方法的入参中传入Map、Mode1或者ModelMap
*不管将处理器方法的返回值设置为ModelAndView还是在方法的入参中传入Map、Mode1或者ModelMap，
*SpringMVC都会转换为一个Mode1AndView对象
*/
@RequestMapping（"/testMap"）
public String testMap（Map<String，Object>map）{
//向Map中添加模型数据，最终会自动放到request域中
map.put（"user"，new Employee（1，"韩总"，"hybing@atguigu.com"，new Department()); 
return SUCCESS；
}
```

