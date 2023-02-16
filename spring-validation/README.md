# Validation

Validation은 프로그래밍에 있어서 가장 중요한 부분. 특히 java에서 null값에 대해 접근하려할 때 NPE(Null Point Exception)이 발생함으로, 이러한
부분을 방지하기 위해 미리 검증하는 과정을 Validation

단순하게는 다음과 같은 과정

```
void run (String account, Spring pw, int age){
    if(account == null || pw == null) {
        return
    }
    if(age == 0){
        return
    }
}
```

### 단점

- 검증할 값이 많으면 코드가 길어짐
- Service 로직과 분리가 필요
- 흩어진 경우 어디서 검증하는지 알기 어렵고, 재사용에 한계
- 검증 Logic이 변경되면 Test코드 등 참조하는 클래스에서 Logic이 변경되어야 하는 부분이 발생할 수 있음

### 대표적 Validation Annotation

- @Size : 문자 길이 측정 (Int 타입 불가)
- @NotNull : null 불가
- @NotEmpty : null, "" 불가
- @NotBlank : null, "", " "불가
- @Past : 과거 날짜
- @PastOrPresent : 오늘이거나 과거 날짜
- @Future: 미래 날짜
- @FutureOrPresent : 오늘이거나 미래 날짜
- @Pattern : 정규식 적용
- @Max : 최대값
- @Min : 최소값
- @Valid : 해당 object validation 실행

### 의존성 추가

 ```
 implementation("org.springframework.boot:spring-boot-starter-validation")
 ```

<br>

-----

## 커스텀 validation

- AssertTrue / False와 같은 method 지정 통해서 Custom Logic 적용 가능
- ConstraintValidator를 적용해 재사용이 가능한 Custom Logic 적용 가능

```
// AssertTrue어노테이션 사용시 is라는 이름으로 메소드가 시작되어야 동작함.
    @AssertTrue(message = "yyyyMM의 형식에 맞지 않습니다.")
    public boolean isReqYearMonthValidation() {
        System.out.println("assert true call");

        try {
            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01",
                    DateTimeFormatter.ofPattern(
                            "yyyyMMdd"));
        } catch (Exception e) {
            return false;
        }

        return true;
    }

```
@YearMonth라는 커스텀 어노테이션을 만들 예정.
@Email을 들어가서 아래 어노테이션 복사

```
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface YearMonth {

    // 아래 코드도 가져옴
	String message() default "{javax.validation.constraints.Email.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}

```