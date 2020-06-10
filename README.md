# simple-poc-batch
> 基于 spring-btach 的 分布式任务调度系统

## 目录层级

### config
> 配置文件

### consistency
一致性服务 对 从节点的管理;
可考虑使用注册中心 来管理服务;

### controller
spring-mvc中控制层

### dao
mybatis-generator 生成文件

### executor
对spring-batch中任务的封装


实际使用 可查看 com\example\poc\controller\job\JobController.java
