# Spark SQL

#### 介绍
提供Spark SQL开发的常用工具集

#### 软件架构
软件架构说明

依赖[spark-core](https://gitee.com/Bingeneral/MvnRepo/tree/master/xabean/spark-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://gitee.com/Bingeneral/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>spark-sql_2.11</artifactId>
    <version>0.6</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://gitee.com/Bingeneral/MvnRepo/tree/master
implementation("xabean:spark-sql_2.11:0.6")
```
3. sbt
```
// https://gitee.com/Bingeneral/MvnRepo/tree/master
libraryDependencies += "xabean" % "spark-sql_2.11" % "0.6"
```

#### 使用说明

请查看xabean.spark.sql包对象。
