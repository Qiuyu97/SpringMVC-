SSM： SpringMVC + Spring + MyBatis

我们利用 Maven 进行项目骨架的搭建，然后通过配置文件加入需要的内容。

已经知道Spring了，就是实现控制翻转，依赖注入，附加AOP。

Maven创建的项目，选择的是WebApp，默认已经集成了Spring

在这个基础上，加入 SpringMVC框架。


=============================================
MVC：Model    View     Controller，
	模型，视图，控制器的简称。
	MVC是一种项目设计的典范，强制性将 显示，操作进行分离。

	View视图，就负责呈现
	Controller控制器，就负责所有的具体操作
	Model模型，为了满足OOP，具体的业务实体


=============================================
单独创建SpringMVC，从空的开始，利用Maven搭建骨架：

【前提】：Maven/settings.xml配置好


【第二】：Eclipse中加载好Maven插件


【第三】：修改与对应：隐藏setting中的两个配置文件，
                然后更新项目，发现有错误，对了。

=============================================
第一步：参照文档1，对pom.xml配置文件进行调整，去除原有的内容，
             追加针对Servlet，SpringMVC的依赖


第二步：项目/src/main/webapp/WEB-INFO/web.xml配置文件，替换掉，
              因为原来的是一个空的，没有用的。

<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">

    <servlet>
        <servlet-name>spring</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>spring</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
</web-app>

第三步：Maven->Update Project，更新一下


第四步：更新update项目。

---->springmvc框架已经配置好了。

===========================================

SpringMVC已经提供一个整体的框架，因此内容创建必须符合他的要求。







