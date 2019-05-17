# LogUDPServer

#### 介绍
分布式日志采集UDP服务器

#### 软件架构
软件架构说明

项目构建完成后可打包为Jar直接运行，依赖[Log4s](https://gitee.com/Bingeneral/MvnRepo/tree/master/xabean/log4s_2.11)。

#### 安装教程

1. Maven
```
<!-- https://gitee.com/Bingeneral/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>logudpserver_2.11</artifactId>
    <version>0.1</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://gitee.com/Bingeneral/MvnRepo/tree/master
implementation("xabean:logudpserver_2.11:0.1")
```
3. sbt
```
// https://gitee.com/Bingeneral/MvnRepo/tree/master
libraryDependencies += "xabean" % "logudpserver_2.11" % "0.1"
```

#### 使用说明

请查看UDPListener主方法的文档注释。
