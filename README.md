# MvnRepo

#### 介绍
个人Maven仓库

#### 仓库目录

1. [log4s-core](https://gitee.com/Bingeneral/MvnRepo/tree/master/xabean/log4s-core_2.11)
2. [LogUDPServer](https://gitee.com/Bingeneral/MvnRepo/tree/master/xabean/logudpserver_2.11)
3. [FlumeWorkflow](https://gitee.com/Bingeneral/MvnRepo/tree/master/xabean/flumeworkflow_2.11)

#### 安装教程

1. Maven
```
<repositories>
    <repository>
        <id>MvnRepo</id>
        <url>https://gitee.com/Bingeneral/MvnRepo/raw/master</url>
    </repository>
</repositories>
```
2. Gradle Kotlin DSL build script
```
repositories { maven("https://gitee.com/Bingeneral/MvnRepo/raw/master") }
```
3. sbt
```
resolvers += "MvnRepo" at "https://gitee.com/Bingeneral/MvnRepo/raw/master"
```
