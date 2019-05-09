# MvnRepo

#### 介绍
个人Maven仓库

#### 软件架构
软件架构说明

使用Scala编写，并基于SLF4J进行二次开发。

#### 安装教程

1. Maven
```
<repositories>
    <repository>
        <id>MvnRepo</id>
        <url>https://gitee.com/Bingeneral/MvnRepo/raw/master</url>
    </repository>
</repositories>
<!-- https://gitee.com/Bingeneral/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>log4s_2.12</artifactId>
    <version>0.0</version>
</dependency>
```
2. sbt
```
resolvers += "MvnRepo" at "https://gitee.com/Bingeneral/MvnRepo/raw/master"
// https://gitee.com/Bingeneral/MvnRepo/tree/master
libraryDependencies += "xabean" % "log4s_2.12" % "0.0"
```

#### 使用说明

1. xxxx
2. xxxx
3. xxxx
