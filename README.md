# dubbo

默认使用 gradle 5 构建。

## dubbo-demo-0001

使用较旧的 dubbo 版本 （2.5.3）构建 dubbo 服务和消费者。

## dubbo-demo-0002

使用较新版本的 dubbo。新版本的 dubbo 有一个更改是将 com.alibaba包 换成 org.apache 。2.7.3 版本是过度版本，两个包都存在。

[Dubbo: 第一个 Dubbo 项目](https://blog.letiantian.me/dubbo/dubbo-hello-world.html) 。


## 005. dubbo入门
见 [dubbo-demo-0005](dubbo-demo-0005)，拷贝自[dubbo-demo-0004](dubbo-demo-0004)，删掉了 pom.xml 文件，精简了gradle配置。


## 005. dubbo入门 - v2
见 [dubbo-demo-0005-v2](dubbo-demo-0005-v2)。

使用了更新版本的 dubbo 2.7.1，包名已经变成了 org.apache 开头。优化gradle配置。


## 006. dubbo集成spark web框架
见 [dubbo-demo-0006](dubbo-demo-0006)。

关于 spark 框架：http://sparkjava.com/

1. 启动dubbo服务：provider模块中的ProviderMain。
2. 启动web服务：web模块中的WebApplication。

浏览器访问`http://127.0.0.1:4567/hello`，可以看到`Hello, 张三`。

## 007. dubbo集成spring-boot-starter-web

见 [dubbo-demo-0007](dubbo-demo-0007)。

1. 启动dubbo服务：provider模块中的ProviderMain。
2. 启动web服务：spring-web模块中的SpringWebApplication。

浏览器访问`http://127.0.0.1:8080/greeting`，可以看到`Hello, World`。