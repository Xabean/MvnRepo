# KafkaSh

#### 介绍
通过模板命令及属性文件的编写，批量执行某个Kafka脚本。

#### 软件架构
软件架构说明

项目构建完成后可打包为Jar直接运行，依赖[flume-workflow](https://github.com/Xabean/MvnRepo/tree/master/xabean/flume-workflow_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>kafka-sh_2.11</artifactId>
    <version>0.0</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:kafka-sh_2.11:0.0")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "kafka-sh_2.11" % "0.0"
```

#### 使用说明

请查看KafkaShExecutor主函数的文档注释。
