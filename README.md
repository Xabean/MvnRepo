# MvnRepo

#### 介绍
个人Maven仓库

#### 仓库目录

1. [common](https://github.com/Xabean/MvnRepo/tree/master/xabean/common_2.11)
2. [log4s-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-core_2.11)
3. [log4s-server](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-server_2.11)
4. [batsh](https://github.com/Xabean/MvnRepo/tree/master/xabean/batsh_2.11)
5. [flume-workflow](https://github.com/Xabean/MvnRepo/tree/master/xabean/flume-workflow_2.11)
6. [spark-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/spark-core_2.11)
7. [spark-sql](https://github.com/Xabean/MvnRepo/tree/master/xabean/spark-sql_2.11)
8. [ml](https://github.com/Xabean/MvnRepo/tree/master/xabean/ml_2.11)

#### 安装教程

1. Maven
```
<repositories>
    <repository>
        <id>MvnRepo</id>
        <url>https://github.com/Xabean/MvnRepo/raw/master</url>
    </repository>
</repositories>
```
2. Gradle Kotlin DSL build script
```
repositories { maven("https://github.com/Xabean/MvnRepo/raw/master") }
```
3. sbt
```
resolvers += "MvnRepo" at "https://github.com/Xabean/MvnRepo/raw/master"
```
