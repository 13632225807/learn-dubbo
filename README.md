# dubbo

默认使用 gradle 5 构建。

## dubbo-demo-0001

使用较旧的 dubbo 版本 （2.5.3）构建 dubbo 服务和消费者。

## dubbo-demo-0002

使用较新版本的 dubbo。新版本的 dubbo 有一个更改是将 com.alibaba包 换成 org.apache 。2.7.3 版本是过度版本，两个包都存在。

[Dubbo: 第一个 Dubbo 项目](https://blog.letiantian.me/dubbo/dubbo-hello-world.html) 。

## dubbo-demo-0003

基于注解。

[Dubbo: 使用 Spring 注解构建 Dubbo 服务](https://blog.letiantian.me/dubbo/dubbo-hello-world-with-annotation.html)


## dubbo-demo-0004

dubbo集成spark web框架

关于 spark 框架：http://sparkjava.com/

1. 启动dubbo服务：provider 模块中的 ProviderMain。
2. 启动web服务：web 模块中的 WebApplication。

浏览器访问`http://127.0.0.1:4567/hello`，可以看到`Hello, 张三`。

## 0005. dubbo集成 spring-boot

见 [dubbo-demo-0005](dubbo-demo-0005)。

1. 启动dubbo服务：provider 模块中的 ProviderMain。
2. 启动web服务：spring-boot-web 模块中的 WebApplication。

浏览器访问`http://127.0.0.1:8080/hello`，可以看到`Hello, World`。

## 0006. 超时配置

见 [dubbo-demo-0006](dubbo-demo-0006)。

## 0007. 参数校验

有问题。

## 0008. 使用 Filter 进行参数校验

http://dubbo.apache.org/zh-cn/docs/dev/impls/filter.html

## 0009. Filter 的使用

## 0010. 服务直连

