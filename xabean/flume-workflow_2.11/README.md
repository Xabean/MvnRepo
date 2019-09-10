# FlumeWorkflow

#### 介绍
一键式灵活完成Flume工作流

#### 软件架构
软件架构说明

项目构建完成后可打包为Jar直接运行，依赖[log4s-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>flume-workflow_2.11</artifactId>
    <version>0.5</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:flume-workflow_2.11:0.5")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "flume-workflow_2.11" % "0.5"
```

#### 使用说明

请查看FlumeWorkflowEngine主函数的文档注释。
