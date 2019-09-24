# Spark SQL

#### 介绍
提供Spark SQL开发的常用工具集

#### 软件架构
软件架构说明

依赖[spark-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/spark-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>spark-sql_2.11</artifactId>
    <version>1.3</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:spark-sql_2.11:1.3")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "spark-sql_2.11" % "1.3"
```

#### 使用说明

请查看xabean.spark.sql包对象。
