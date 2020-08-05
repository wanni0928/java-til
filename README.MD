# JAVA

1. #### Variable [소스코드](https://github.com/wanni0928/java-til/blob/master/day01/01_variable/Main.java)
    * 변하는 수, 수학의 변수와 유사하다.
    * 변수의 타입, 변수명, 값 할당
    * 변수의 선언
    * 변수에 값 할당 (리터럴 : 의미가 부여되지 않은 값)
    * 변수명 규칙

2. #### DataType [소스코드](https://github.com/wanni0928/java-til/blob/master/day01/02_dataType/Main.java)
    * 기본형(Primitive), 참조형(Reference)
    * 기본형 자료형 - 정수형, 실수형, 문자형, 논리형
    * 참조형 자료형 - 문자형 (String)

3. #### DataInputOutput [소스코드](https://github.com/wanni0928/java-til/blob/master/day02/01_data_input_output/Main.java)
    * 자료 입출력
    * 출력 - print, println, printf, 포맷팅 방법
    * 입력 - 키보드 입력 받기(Scanner - 클래스 익힐 때, 이 부분 다시 복습)

4. #### Operator [소스코드](https://github.com/wanni0928/java-til/blob/master/day02/02_operator/Main.java#)
    * 연산자(operator)
    * 연산자(Operator), 피연산자(Operator) -> 연산식(Expression)
    * 사칙 연산자 : + - * /     
    * 비교 연산자 : > < <= >=        
    * 증감 연산자 : ++num, --num, num++, num--
    * 삼황 연산자 : 조건식 ? 참 : 거짓
        * 참 : 거짓 영역에는 값만 들어갈 수 있다.
            * 예) 10 > 1 ? 10 : 1
            * 삼항연산자와 if문
                1. 삼항연산자가 속도는 더 빠르지만, 메모리를 많이 사용한다.
                2. if문은 더 느리지만 메모리를 덜 사용한다.
    * 비트 연산자
        * 부호비트
            1. 비트는 우에서 좌로 읽는다.
            2. 좌측비트가 최상위 비트이며, 0이면 양수, 1이면 음수로 판단한다.
        * 논리 연산자 (여기서 ~은 단향연산자)
            1. & : AND(논리곱) : 두 비트 모두 1이면 1
            2. | : OR(논리합) : 둘 중 하나라도 1이면 1
            3. ^ : XOR(배타합) : 둘 중 하나가 1이여야만 1
            4. ~ : NOT(논리부정) : 0은 1로 1은 0으로 (ex ~a = -a-1)
        * 쉬프트 연산자
            1. a << b : a를 b만큼 좌로 비트 이동.
            2. a >> b : a를 b만큼 우로 비트 이동.
            3. 빈 칸은 0으로 채워지고(음수는 1로) 비트를 넘어가면 자동으로 잘린다.
        
        * 2의 보수
            * 예시 문제
                * 1 1110 1010
                    1. 우에서 좌로 읽으면서 1을 찾는다.
                    2. 그 다음 비트부터 반대로 바꿔준다.
                        * 예) 0 0001 0110
                    3. 10진수로 변경한다.
                        * 예) 22
                    4. -를 붙여준다.
                        * 정답) -22
        
        * 실사용 분야
            * 개발(안드로이드), 빅데이터, 색상표, 네트워크, 정보보안
5. #### 조건문

6. #### 반복문

7. #### 배열
    * 특성
        1. 하나의 변수로 여러 개의 값을 다룰 수 있다.
        2. 동일 자료 형만 다룰 수 있다.
        3. 한번 생성한 배열의 크기는 변하지 않는다.
        4. 배열에 속한 값은 메모리에 연속으로 위치한다.
    
    * N-D 배열(다차원 배열)
        1. 배열의 배열을 달고 있으며, 다차원 배열이라 한다.
        2. 수학에서 말하는 전->선->공간->4차원->5차원
    
    * 배열의 사용
        * int[] arData = {1, 2, 3};
        * int[][] arrData = {{1, 2, 3}, {7, 8, 9}};

8. #### 객체지향 프로그래밍 (Obiject Oriented Programming; OOP)
    * ###### 객체지향 프로그래밍이란?
        * 컴퓨터 프로그램밍 패러다임 중 하나 (oop가 꼭 정답은 아니다.)
        * 프로그램을 독립된 단위인 객체의 모임으로 파악
        * 각각의 객체는 메세지를 주고받고, 데이터를 처리
    * ###### 객체지향의 기본 구성 요소
        * 클래스 (Class)
            * 같은 종류의 집단에 속하는 속성과 행위를 정의한 것
            * 클래스는 다른 클래스 또는 외부 요소와 독립적으로 디자인 되어야 한다.
        * 객체 (Object)
            * 클래스의 인스턴스로, 실제로 메모리상에 할당된 것
            * 자신 공유의 속성을 가지며, 클래스에 정의된 행위를 수행
        * 메소드 (Method)
            * 클래스로부터 생성된 객체를 사용하는 방법
            * 메소드는 한 객체의 속성을 조작하는 데에 사용
    * ###### 객체지향의 특징
        * OOP is A.P.I.E
            * Abstraction (추상화): 자료 표현을 추상적으로 나타내는 추상 자료형을 사용한다.
            * Polymorphism (다형성): 오버로딩과 오버라이딩을 하여 하나의 메소드명으로 다양한 동작을 구현할 수 있다.
            * Inheritence (상속): 부모 클래스로부터 속성과 메소드를 상속받아 사용할 수 있다.
            * Encapsulation (캡슐화): 사용자에게 불필요한 정보를 은닉/보호해야 한다.
    * ###### 클래스와 객체
        * 클래스 : 객체를 생성하기 위해 사용하는 추상화된 설계도
        * 객체 : 클래스가 구체화하여 값으로 생성된 것
            * Instantiation : 클래스에서 객체를 생성하는 과정
            * Object, Instance : Instantiation으로 인해 생성된 객체

        * 클래스의 구성
        ```java
        public class Car {
            int speed = 0; // 멤버 변수 (속성)

            void move() { // 멤버 함수 (메소드)
                this.speed = 10;
            }
        }
        ```
        * 속성(attribute, field) : 클래스에 속하는 멤버 변수, 상태, 필드
        * 메소드(Method) - 클래스에 속하는 멤버 함수, 행동
    * ###### 객체의 생성
        ```java
        Car car = new Car();
        //클래스명 변수명 = new 클래스명();
        ``` 
        * 클래스를 구체화하여 값을 생성한 것을 객체라 한다.
        * 하나의 클래스로 여러개의 객체를 만들 경우, 같은 타입의 독립적인 객체가 된다.
    * ###### 클래스와 객체의 메모리 구조
        * 클래스 영역 (Class Area, Method Area, Code Area, Static Area)
            * Field 정보
            * Method 정보
            * Type 정보
            * Constant Pool
        * 스택 영역(Stack Area)
            * 메소드 호출 시 선언도니 로컬 변수
        * 힙 영역(Heap Area)
            * new 키워드로 생성된 객체
    * ###### 인스턴스 멤버 변수 (Instance Variables)
        * 인스턴스 변수는 객체를 생성할 때 힙 영역에 생성됨.
        * 인스턴스 변수는 힙 영역에 생성되므로 초기화가 이루어짐.(초기화는 각 자료형의 defalut 값으로)
    * ###### 클래스 멤버 변수 (Class Variables)
        * 클래스 멤버 변수는 프로그램 시작 시 클래스 영역에 생성됨
        * 객체가 아닌 클래스로 접근하는 것이 권장됨 (객체로 접근도 가능하나 비권장)
            ```java
            public class Foo {
                static int classVar = 10;
            }

            Foo.classVar = 0; // Recommended

            Foo foo = new Foo();
            foo.classVar = 0; // Not recommended
            ``` 
        * 로컬 변수 (Local Variable)
            * 메소드 또는 중괄호 블록 내부에서 생성되는 변수
            * 스택영역에 생성되며, 초기화가 이루어지지 않음
            * 생명주기는 생성된 중고라호 블록이 종료될 때 까지
            ```java
            void method(int paramVar) {
                int localVar;
                // System.out.println(localVar);  // 초기화가 이루어지지 않음
                localVar = 10;
                System.out.println(localVar);
                {
                    int localVar2 = 10;
                    System.out.println(localVar2);
                }
                // System.out.println(localVar2); // 생명주기가 끝남
            }
            ```
        * ###### 메소드 (Methods)
            * 메소드란
                * 객체가 하는 동작을 정의하는 어떠한 작업을 수행하는 코드의 집합
                * 코드의 중복을 방지하고 유지보수성을 향상시키기 위해 사용.
                    ```java
                    public class Car {
                        String name;

                        void printModel() { // 메소드의 정의 (Method definition)
                            System.out.println(name);
                        }
                    }

                    Car hyundai = new Car();
                    Car kia = new Car();

                    hyundai.name = "Hyundai";
                    kia.name = "Kia";

                    hyundai.printModel(); // 메소드의 호출 (Method call)
                    kia.printModel();

                    ```
            * 메소드의 구현
                * 메소드는 함수의 형태로 구성된다.
                    * 파라미터 (Parameters, 입력)
                    * 실행문 (Executional Statements)
                    * 리턴 값 (Return Value, 출력)
                * 함수의 작성
                ```java
                public int add(int x, int y){
                    return x + y;

                }

                제한자 리턴타입 메소드명(파라미터타입1 파라미터이름1, 파라미터타입2 파라미터이름2, ...) {
                    // 실행문
                }
                ```
                * 가변 인자(Variable Arguments)
                    * 입력 인자의 개수가 정해지지 않은 경우
                    ```java
                    public int sumAll(int... params){
                        int sum = 0;
                        for(int i : params){
                            sum += i;
                        }
                        return sum
                    }
                    ```
                * 기본형 vs 참조형 변수
                    * 기본형: 메소드 인자로 값이 전달됨 (Call by value)
                    * 참조형: 메소드 인자로 참조가 전달됨 (Call by reference)
                    ```java
                    public class Foo {
                        int value;
                    }

                    public class Bar {
                        public void swapPrimitive(int x, int y) {
                            int temp = x;
                            x = y;
                            y = temp;
                        }

                        public void swapReference(Foo x, Foo y) {
                            int temp = x.value;
                            x.value = y.value;
                            y.value = temp;
                        }
                    }
                    
                    Bar bar = new Bar();

                    int x = 1, y = 10;
                    bar.swapPrimitive(x, y);
                    System.out.println(x); // 1
                    System.out.println(y); // 10

                    Foo foo1 = new Foo(1);
                    Foo foo2 = new Foo(10);
                    bar.swapReference(foo1, foo2);
                    System.out.println(foo1.value); // 10
                    System.out.println(foo2.value); // 1
                    ```
                * 클래스 메소드 (Class method)
                    * static 키워드를 이용하여 선언된 메소드
                    * 인스턴스가 아닌 클래스에 속하는 메소드
                    * 대표적으로 main 메소드가 클래스 메소드이다.
                    ```java
                    public class Foo {
                        static void main(String args[]){
                            // call method
                        }
                    }
                    ```
                * 메소드 호출 스택 (Method Call Stack)
                    * 동일 기능의 함수를 추가로 구현하는 방법
                    * 입력 파라미터를 달리하는 동일 함수명으로 구현한다.
                    ```java
                    public class Foo {
                        public int sumAll(int ... params) {
                            int sum = 0;
                            for (int i: params) {
                                sum += i;
                            }
                            return sum;
                        }

                        public float sumAll(float ... params) {
                            float sum = 0.0f;
                            for (float x: params) {
                                sum += x;
                            }
                            return sum;
                        }
                    }

                    Foo foo = Foo();
                    int sum1 = foo.sumAll(1, 2, 3, 4, 5);
                    float sum2 = foo.sumAll(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
                    ```
        * ###### 생성자 (Constructor)
            * 클래스에서 인스턴스를 생성할 때 사용되는 메소드
                * new 키워드를 이용해 호출
            * 기본 생성자 (Default Constructor)
                * 구현하지 않아도 자동으로 생성되는 생성자
                * 아무런 동작도 하지 않고, 객체만을 생성
            * 파라미터 생성자 (Parameter Constructors)
                * 입력 파라미터를 받는 생성자
                * 여러개의 파라미터 생성자를 오버로딩할 수 있음
                * 보통 멤버 변수를 초기화하는 동작 수행
            ```java
            public class Foo{
                int x;
                int y;
                String z;

                // public Foo(){} //Default Constructor
                public Foo(int a, int b, String c) { // Parameter Constructor
                    x = a;
                    y = b;
                    z = c;
                }
            }
            ```
        * ###### this 키워드
            * 객체가 스스로를 가르키는 참조
            * 멤버 변수와 로컬 변수의 이름이 같을 때, 멤버 변수임을 명시
            ```java
            public class Foo{
                int x;
                int y;

                public Foo(int x, int y){
                    this.x = x;
                    this.y = y;
                }
            }
            ```
            * 생성자를 호출하는 데에도 사용할 수 있다.
            * 반드시 생성자의 첫 줄에서만 사용해야 한다.
            ```java
            public class Foo {
                int x;
                int y;
                String z;

                public Foo(int x, int y, String z){
                    this.x = x;
                    this.y = y;
                    this.z = z;
                }

                public Foo(String z){
                    this(0, 0, z);
                }

                public Foo(int x, int y){
                    this(x, y, "Noting");
                }
            }
            ```
        * ###### Getter와 Setter
            * 클래스의 멤버 변수를 간접적으로 다룰 수 있게 하는 메소드
            * 멤버 변수의 캡슐화(Encapsulation)을 구현하기 위해 사용.
            ```java
            public class Foo {
                private int x;

                public void setX(int x){
                    this.x = x;
                }

                putlic int getX(){
                    return x;
                }
            }
            ```
        * ###### 초기화 블록 (Initializer)
            * 클래스 또는 인스턴스를 생성할 때 한번 실행되는 코드 블록
            ```java
            public class Foo {
                static int classVar;
                int instanceVar;

                static {// Class Initializer
                    classVar = 100;
                }

                {// Instance Initializer
                    instanceVar = 10;
                }

                static{
                    // May be more than one block
                }
            }
            ```
        
    

