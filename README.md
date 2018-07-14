# dubbo

默认使用 gradle 4.1 构建。maven 会特别说明，使用 3.5 版本。

## 001. 构建多模块项目（gradle版）
见 [dubbo-demo-001](dubbo-demo-001)，这是一个纯Java项目，使用IDEA打开最外层的build.gradle即可。

其中有child1和child2两个子项目。child2依赖child1，所以child2的build.gradle中有：
```
dependencies {
    compile project(':child1')
    //...
}
```
运行child2中的`CalculateService`类，输出`3`。

## 002. 构建多模块项目（maven版）

见 [dubbo-demo-002](dubbo-demo-002)，这是一个纯Java项目。

和gradle版类似。

## 003. dubbo入门（maven版）

见 [dubbo-demo-003](dubbo-demo-003)，基于 maven。
代码来自 [一个简单的案例带你入门Dubbo分布式框架](https://blog.csdn.net/u012702547/article/details/77601538)，略作改动。

需要安装 zookeeper，作为注册中心。

测试过程中遇到了注册zookeeper慢的问题，解决方案：
* [解决linux dubbo注册到zookeeper 很慢 3-10分钟问题](https://cn.aliyun.com/jiaocheng/128140.html)
* [记一次本机InetAddress.getLocalHost()引起的项目启动变慢及解决过程](https://blog.csdn.net/puma_dong/article/details/53096149)

## 004. dubbo入门（gradle版）

见 [dubbo-demo-004](dubbo-demo-004)，拷贝自[dubbo-demo-003](dubbo-demo-003)， 保留了pom.xml文件。运行下面的命令生成的gradle文件：
```
$ gradle init --type pom
```

## 005. dubbo入门（gradle版精简）
见 [dubbo-demo-005](dubbo-demo-005)，拷贝自[dubbo-demo-004](dubbo-demo-004)，删掉了 pom.xml 文件，精简了gradle配置。

## 006. dubbo集成spark web框架（gradle版）
见 [dubbo-demo-006](dubbo-demo-006)。

关于 spark 框架：http://sparkjava.com/

1. 启动dubbo服务：provider模块中的ProviderMain。
2. 启动web服务：web模块中的WebApplication。

浏览器访问`http://127.0.0.1:4567/hello`，可以看到`Hello, 张三`。

## 007. dubbo集成spring-boot-starter-web

见 [dubbo-demo-007](dubbo-demo-007)。

1. 启动dubbo服务：provider模块中的ProviderMain。
2. 启动web服务：spring-web模块中的SpringWebApplication。

浏览器访问`http://127.0.0.1:8080/greeting`，可以看到`Hello, World`。