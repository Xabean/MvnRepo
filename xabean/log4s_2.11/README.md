# Log4s

#### 介绍
日志框架

#### 软件架构
软件架构说明

基于SLF4J进行二次开发，底层默认绑定Log4j 2，使用Scala编写核心，并提供Java专用的API，可进行依赖注入。

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
    <artifactId>log4s_2.11</artifactId>
    <version>0.1</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
repositories { maven("https://gitee.com/Bingeneral/MvnRepo/raw/master") }
// https://gitee.com/Bingeneral/MvnRepo/tree/master
implementation("xabean:log4s_2.11:0.1")
```
3. sbt
```
resolvers += "MvnRepo" at "https://gitee.com/Bingeneral/MvnRepo/raw/master"
// https://gitee.com/Bingeneral/MvnRepo/tree/master
libraryDependencies += "xabean" % "log4s_2.11" % "0.1"
```
4. 如果需要Dagger2来完成依赖注入，请参考[使用gradle.kts构建Dagger2(Scala+Java)架构项目](https://www.bilibili.com/read/cv2652939)。

#### 使用说明

请查看LoggerBridge的文档注释。
