# 어노테이션(Annotation)이란? 
- @를 이용한 주석, 자바코드에 주석을 달아 특별한 의미를 부여한 것(클래스,메소드,변수 등 모든 요소에 선언이 가능하다)
- 컴파일러가 특정 오류를 억제하도록 지시하는것과 같이 프로그램 코드의 일부가 아닌 프로그램에 관한 데이터를 제공 , 코드에 정보를 추가하는 방법.

#### 나오게 된 이유는 ?
- IT가 발전하면서 프로그램 규모가 커지고, XML이 가지는 설정정보의 양이 많아진다.
> 어노테이션은 소스코드와 같이 쓰기 때문에 직관적인 메타데이터 설정이 가능하다.
>> 시스템 전반에 영향을 주는 메타데이터는 XML로 설정하여 코드로부터 독립적으로 분리되는것이 바람직하다.
- 변경사항이 있을때 유지보수성이 높아지며, 설계시 확정되는 부분은 어노테이션 기반 설정으로 개발의 생산성을 향상 시키는것이 바람직하다.

##### 어노테이션 사용시 장점

- 데이터에 대한 유효성 검사조건을 어노테이션을 사용하여 Model 클래스에 직접 명시함으로써 해당 데이터들에 대한 유효 조건을 쉽게 파악할수 있고, 코드의 양도 줄어든다.

### 자주 사용되는 Annotation의 사용 방법.

- @Component
> Component-scan의 선언에 의해, 특정 패키지 안의 클래스들을 스캔하고    
> @Component 어노테이션이 있는 클래스에 대하여 bean 인스턴스를 생성한다.    
> Spring IoC 컨테이너가 IoC컨테이너를 만들고 그 안에 빈을 등록할때 사용하는 인터페이스들을 '라이프 사이클 콜백' 이라고 부른다.    
> 그 중에는 @Component 어노테이션을 찾아서, 이 어노테이션이 붙어있는 모든 클래스의 인스턴스를 생성해 빈으로 등록하는 작업을
> 수행하는 어노테이션 프로세서가 등록 되어있고, @ComponentScan이 붙어있는 클래스가 이에 해당한다.    
>> 어디서부터 컴포넌트를 찾아볼 것인지 알려주는 역할, @ComponentScan이 붙어있는 클래스가 있는    패키지부터 모든 하위패키지의 모든    
>> 클래스를 훑으며 @Component 어노테이션이 붙은 클래스를 찾는다.    
>> @SpringBootApplication 어노테이션 안에 내부적으로 ComponentScan 어노테이션을 사용한다.


- @Controller
> 컨트롤러를 지정해주는 어노테이션
> * 컨트롤러란 사용자의 요청이 진입하는 지점, 요청에 따라 어떤 처리를 할지 결정해주며, Controller는 단지 결정만 해주고,
> 실질적 처리는 Service에서 담당, 사용자에게 View를 응답으로 보내준다.
>> @MVC 컨트롤러는 Controller로 만든다.
>> 컨트롤러 역할을 담당하는 메소드의 파라미터 개수와 타입, 리턴 타입등을 자유롭게 결정할수 있다.
>> 주로 View를 반환하기 위해 사용
![다운로드 (6)](https://user-images.githubusercontent.com/32286904/132447338-53b5e24c-5714-4c3c-aebe-bd06821f2ca2.png)

- @Service

>서비스 레이어, 비즈니스 로직을 가진 클래스
>> - Client가 Request를 보낸다.
>> - Request URL에 알맞은 Controller가 수신한다.
>> - Controller는 넘어온 요청을 처리하기 위해 Service를 호출한다.
>> - Service는 알맞은 정보를 가공하여 Controller에게 데이터를 넘긴다.
>> - *Service 가 Client의 요청에 대한 정보를 제공하기 위한 처리를 하는것을 '비즈니스 로직'을 수행한다고 한다.*
>> - Controller는 Service의 결과물을 Client 에게 전달해준다.
>>> Service Interface 만들기, 구현하기
>>> 구현 클래스에 꼭 @Service 어노테이션을 붙혀야 스프링에서 Service 역할을 하는 클래스라고 인지한다.
>>> Interface를 만들 때 자신이 원하는 값을 입력받고, 원하는 값을 리턴 할 함수를 선언해주고    
>>> Class를 만들어 Implements 해서 선언해둔 함수를 구현해 원하는 방식대로 동작하도록 설정
>>> *@Controller가 붙은 Class에서 @Autowired(어떤 컴포넌트를 스프링에 자동 등록할거다) 를 통해서 해당 서비스를 스프링에 등록한다.*

- @Configuration
> - 설정파일을 만들기 위한 어노테이션 or Bean을 등록하기 위한 어노테이션이다.
> - 1개 이상의 Bean을 제공하는 경우 반드시 @Configuration을 명시해 주어야 한다.
> - 스프링 설정 클래스를 선언하는 어노테이션
> - 이때 설정파일중에 @Bean이 붙어있는 메소드들을 AnnotationConfigApplicationContext는 자동으로 실행하여,
> 그 결과로 리턴하는 객체들을 기본적으로 싱글톤 으로 관리한다.

- @Bean
> - SpringContainer에 Bean을 등록하도록 하는 어노테이션
> - 개발자가 직접 제어 불가능한 외부 라이브러리를 Bean으로 만들려할때 사용한다.

- @Interceptor
> - Controller의 Handler를 호출하기 전과 후에 요청과 응답을 참조하거나 가공할 수 있는 필터
> - 서버에 들어온 Request가 Handler로 도달하기 전에 낚아채서 개발자가 원하는 추가 작업을 한 후 핸들러로 보낼 수 있도록 하는것.
> - Dispatcher Servlet과 Controller 사이에서 동작

- @RequestMapping

> 특정 uri로 요청을 보내면 Controller 에서 어떠한 방식으로 처리할지 정의한다. 
> 이때 들어온 요청을 특정 메서드와 매핑하기위해 사용하는것이 @RequestMapping 이다.
>> - @RequestMapping 에서 가장 많이 사용하는 부분은 value 와 method 이다.
>> - value는 요청받을 url을 설정하고, method는 어떤 요청으로 받을지 정의한다.(GET,POST,PUT,....)
>> - EX) @RequestMapping(value="/hello" , method= RequestMethod.GET)


