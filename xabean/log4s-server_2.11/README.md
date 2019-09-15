# LogServer

#### 介绍
日志服务

#### 软件架构
软件架构说明

项目构建完成后可打包为Jar直接运行，依赖[log4s-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>log4s-server_2.11</artifactId>
    <version>0.6</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:log4s-server_2.11:0.6")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "log4s-server_2.11" % "0.6"
```

#### 使用说明

请查看Log4sServer主函数的文档注释。
