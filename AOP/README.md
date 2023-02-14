# AOP(Aspect Oriented Programming) - 관점지향 프로그래밍

스프링 애플리케이션은 대부분 특별한 경우를 제외하고는 MVC 웹 애플리케이션에서는 3가지 계층(Layer)로 역할을 분리해서 코드를 작성함.
- Web Layer
- Business Layer
- Data Layer


### AOP 어노테이션

- @Before (이전) 어드바이스 타겟 메소드가 호출되기 전에 어드바이스 기능을 수행
- @After (이후) : 타겟 메소드의 결과에 관계없이(즉 성공, 예외 관계없이) 타겟 메소드가 완료 되면 어드바이스 기능을 수행
- @AfterReturning (정상적 반환 이후)타겟 메소드가 성공적으로 결과값을 반환 후에 어드바이스 기능을 수행
- @AfterThrowing (예외 발생 이후) : 타겟 메소드가 수행 중 예외를 던지게 되면 어드바이스 기능을 수행
- @Around (메소드 실행 전후) : 어드바이스가 타겟 메소드를 감싸서 타겟 메소드 호출전과 후에 어드바이스 기능을 수행


### aop 디펜던시 추가

```
dependencies {
    // aop 추가
	implementation 'org.springframework.boot:spring-boot-starter-aop'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

---- 
* @Bean과 @Component 차이
 @Component는 클래스에 붙힐 수 있고, @Bean은 class에 붙힐 수 없고 method에서. @Configuration은 @Bean을 여러개 등록할 수 있다.
