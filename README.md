# spring-official-async-init
spring官方支持的spring bean异步初始化启动容器


- [why技术-博客园](https://www.cnblogs.com/thisiswhy/p/18202897)

开发中的版本，一般在公开maven仓库中没有，需要在工程的pom文件中指定一些repository，
如下所示

```xml
<repositories>
    <repository>
        <id>spring-snapshots</id>
        <name>Spring Snapshots</name>
        <url>https://repo.spring.io/snapshot</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>


    <repository>
        <id>libs-milestone-local</id>
        <name>libs milestonelocal</name>
        <url>https://repo.spring.io/artifactory/libs-milestone-local/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
    <!-- 其他仓库配置 -->
</repositories>
```