将pom的zookeeper依赖版本从3.4.13升级到最新版就能够解决连接不上的问题(10分钟后发现不对)
连接不了zookeeper的问题已解决，修改运行配置为java1.8即可正常连接

api应用是要暴露的接口，需要install然后在consumer应用中添加依赖
trigger依赖api   app依赖trigger间接依赖api