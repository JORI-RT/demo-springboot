## actuator/prometheusエンドポイントにカスタムメトリクスを公開する方法
build.gradleの設定
```
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-actuator'
    runtimeOnly 'io.micrometer:micrometer-registry-prometheus'
    ...
}
```
applicaton.propertiesの設定
```
management.endpoints.web.exposure.include=info,health,prometheus

```
CustomMetricsを設定するソース
```java
@Component
public class CustomMetricsPrometheus {

    @Autowired
    private MeterRegistry meterRegistry;

    public CustomMetricsPrometheus(MeterRegistry meterRegistry) {
        meterRegistry.gauge("hoge.fuga", 222);
        this.meterRegistry = meterRegistry;
    }

}
```
確認方法
```sh
bootRunで起動
curl localhost:8080/actuator/prometheus

```
### link
* [spring boot official](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#legal)
* [micrometer offcial](https://micrometer.io/docs/registry/prometheus)
* [custom metrics](https://blog.autsoft.hu/defining-custom-metrics-in-a-spring-boot-application-using-micrometer/)
