# JPA抽取Base<T,V>集成Mybatis



## 项目简介  

使用JPA将实体类常用方法抽取到泛型Base<T,V>中，使我们能够关注实体类的特定方法和需求的实现（该部分使用Mybatis实现）。

验证前先将配置文件中的Mysql地址更改为服务器地址或者主机，确保数据库中存在article表。
