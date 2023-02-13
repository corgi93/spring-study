package com.example.ioc.springioc;import org.springframework.stereotype.Component;import java.util.Base64;/** * @Component * 즉. Component로 관리를 해줘 == Spring Bean으로 관리를 해줘 라는 뜻 * 스프링에서 Bean으로 등록해서 이 클래스는 너가 관리를 해! 라는 뜻. * 스프링이 실행 될 때 어노테이션을 붙은 클래스를 찾아서 직접 객체를 싱글톤 형태로 만들어 스프링 컨테이너에서 관리함. * * 그렇다면 어떻게 가져와서 사용? * SpringApplicationContext로 스프링 컨테이너에 접근해서 가져와야함. ApplicationContextProvider을 만들어 제공. */@Componentpublic class Base64Encoder implements IEncoder {    @Override    public String encode(String message) {        return Base64.getEncoder().encodeToString(message.getBytes());    }}