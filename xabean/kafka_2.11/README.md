# Kafka

#### 介绍
提供一个简单的Kafka生产者

#### 软件架构
软件架构说明

独立于其它模块

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>kafka_2.11</artifactId>
    <version>0.0</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:kafka_2.11:0.0")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "kafka_2.11" % "0.0"
```

#### 使用说明

请查看SimpleKafkaProducer源码。
