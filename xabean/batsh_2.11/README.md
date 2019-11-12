# BatSh

#### 介绍
通过属性文件的编写，批量执行某个模板命令。

#### 软件架构
软件架构说明

项目构建完成后可打包为Jar直接运行，依赖[log4s-core](https://github.com/Xabean/MvnRepo/tree/master/xabean/log4s-core_2.11)。

#### 安装教程

1. Maven
```
<!-- https://github.com/Xabean/MvnRepo/tree/master -->
<dependency>
    <groupId>xabean</groupId>
    <artifactId>batsh_2.11</artifactId>
    <version>0.1</version>
</dependency>
```
2. Gradle Kotlin DSL build script
```
// https://github.com/Xabean/MvnRepo/tree/master
implementation("xabean:batsh_2.11:0.1")
```
3. sbt
```
// https://github.com/Xabean/MvnRepo/tree/master
libraryDependencies += "xabean" % "batsh_2.11" % "0.1"
```

#### 使用说明

1. 请查看BatShExecutor主函数的文档注释；
2. 构建可执行jar包；
3. 执行命令运行程序：```java -jar batsh-assembly-0.1.jar```
4. 执行结果如下： 
```
这是模板命令示例->第一个参数为：p、第二个参数为：propA、第三个参数为：valueA，具体写法请传入-h选项查看使用帮助。
这是模板命令示例->第一个参数为：p、第二个参数为：propB、第三个参数为：valueB，具体写法请传入-h选项查看使用帮助。
这是模板命令示例->第一个参数为：p、第二个参数为：props、第三个参数为：arrayValue1，具体写法请传入-h选项查看使用帮助。
这是模板命令示例->第一个参数为：p、第二个参数为：props、第三个参数为：arrayValue2，具体写法请传入-h选项查看使用帮助。
```
5. 传入-h选项查看具体写法：```java -jar batsh-assembly-0.1.jar -h```
6. 上述运行结果中第二、三参数实际为从Jar包里的example.properties中提取出来的数据，文件内容如下：   
```
propA=valueA
propB.1=valueB
props.1=arrayValue1
props.2=arrayValue2
```
7. 属性文件支持一对多的关系，即数组结构，另外：propB.1与propB等价；
8. 运行程序并按照使用帮助传入模板命令及其它相关参数即可。
