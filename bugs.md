# 为解决bug记录 

properties的变量如果使用中文的话会变成乱码问题,如application-dev.properties中的变量
```
### 欢迎页 语句
welcome.words=你好, world!(开发)
```
使用
```
    @Value("${welcome.words}")
    private String welcome;
```
取值之后在网页上显示乱码