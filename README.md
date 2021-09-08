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
>> 어디서부터 컴포넌트를 찾아볼 것인지 알려주는 역할, @ComponentScan이 붙어있는 클래스가 있는 패키지부터 모든 하위패키지의 모든    
>> 클래스를 훑으며 @Component 어노테이션이 붙은 클래스를 찾는다.    
>> @SpringBootApplication 어노테이션 안에 내부적으로 ComponentScan 어노테이션을 사용한다.


- @Controller
> 컨트롤러를 지정해주는 어노테이션




