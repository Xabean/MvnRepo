# Spark核心

#### 介绍
提供Spark核心开发的常用工具集

#### 软件架构
软件架构说明

依赖[log4s-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>spark-core_2.11</artifactId>
    <version>0.5</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:spark-core_2.11:0.5")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "spark-core_2.11" % "0.5"
```

#### 使用说明

请查看initHadoopNativeLib过程的文档注释。
