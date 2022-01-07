# Design Patterns

## adsfasdf

| Category | Pattern | Keywords | 
| :---: | :---: | :--- | 
| Creational    | Abstract Factory          | `Abstract`, `Create` |
|               | Builder                   | `builder`, `build`, `생산자 오버로딩` |
|               | Factory Method            | - |
|               | Prototype                 | `clone` |
|               | Singleton                 | `getInstance`, `instance` |
| Structural    | Adapter                   | `Adapter`, `Adaptee` | 
|               | Bridge                    | `Abstraction`, `Implementor`, `RefineMethod` | 
|               | Composite                 | `Component`, `Composite`, `Recursive` | 
|               | Decorator                 | `Component 와 Decorator 의 Interface 가 같다.` | 
|               | Facade                    | `하나의 method 에서 절차를 처리함` |
|               | Flyweight                 | `가상 인스턴스`, `재사용` |
|               | Proxy                     | `접근 제어` |
| Behavioral    | Chain of Responsibility   | `Request`, `Next` | 
|               | Command                   | `Invoker`, `Command`, `Receiver`, `Client`, `logging`, `undo` | 
|               | Interpreter               | `Context` | 
|               | Iterator                  | `Aggreate`, `반복` | 
|               | Mediator                  | `Colleague`, `상호 작용` |
|               | Memento                   | `복원` |
|               | Observer                  | `Update` |
|               | State                     | | 
|               | Strategy                  | `Algorithm` | 
|               | Template Method           | | 
|               | Visitor                   | `Accept` |

## Creational Patterns

### [Abstract Factory Pattern](./docs/abstract_factory.adoc)

* 서로 관련성이 있는 다양한 객체(재료)를 생성하기 위한 인터페이스를 제공한다.
* `Abstract`, `Create`

### [Factory Method Pattern](./docs/factory_method.adoc)

* 객체를 생성하기 위한 Method의 인터페이스를 정의하고, 인스턴스 생성은 서브클래스가 결정하게 한다.

### [Builder Pattern](./docs/builder.md)

* `생성자 오버로딩` : 객체의 생성 방법과 표현 방법을 분리한다.
* `builder`, `build`

### [Prototype Pattern](./docs/prototype.md)

* Original 객체를 새로운 객체에 복사하여 우리의 필요에 따라 수정하는 패턴
* `new()` 가 비쌀 때 또는, 같은 객체가 많이 필요 할 때
* `clone`

### [Singleton Pattern](./docs/singleton.md)

* 인스턴스를 하나만 만들어 사용하기 위한 패턴이다.
* `getInstance`, `instance`

---

## Structural Patterns

### [Adapter Pattern](./docs/adapter.md)

* 클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 적응(변환) 시킵니다.
* `Adapter`, `Adaptee`

### [Bridge Pattern](./docs/bridge.md)

* (실제)기능을 담당 클래스 계층과 구현(개체) 클래스를 분리 하는 패턴.
* `Abstraction`, `Implementor`, `RefineMethod`

### [Composite Pattern](./docs/composite.md)

* 전체-부분 패턴, 단일 객체와 복합 객체 모두 동일하게 처리.
* `Component`, `Composite`, `recursive`

### [Decorator Pattern](./docs/decorator.md)

* 동적으로 새로운 책임을 추가.
* `Component 와 Decorator 의 Interface 가 같다.`

### [Facade Pattern](./docs/facade.md)

* 간략화된 인터페이스를 제공.
* `하나의 method 에서 절차를 처리함`

### [Flyweight Pattern](./docs/flyweight.md)

* 가상 인스턴스 제공. 생성된 객체를 생성한 후 저장하여 재활용하는 팩토리.
* `가상 인스턴스`, `재사용`

### [Proxy Pattern](./docs/proxy.md)

* 다른 객체에 대한 접근을 제어.
* cf> Decorator 는 기능 추가, Proxy 는 접근 제어

---

## Behavioral Patterns

### [Chain of Responsibility Pattern](./docs/chain_of_responsibility.md)

* 요청을 수신하는 객체가 처리할 수 없는 경우, 다음 객체에게 요청을 넘김.
* `Request`, `Next`
* `Filter`, `Spring Security Filter`

### [Command Pattern](./docs/command.md)

* 요청을 객체의 형태로 캡슐화하여 사용자가 보낸 요청을 나중에 이용할 수 있도록 매서드 이름,
* 매개변수 등 요청에 필요한 정보를 저장 또는 로깅, 취소할 수 있게 하는 패턴이다.
* `Invoker`, `Command`, `Receiver`, `Client`
* `execute`, `logging`, `undo`

### [Interpreter Pattern](./docs/interpreter.md)

### [Iterator Pattern](./docs/interator.md)

* `Aggreate`

### [Mediator Pattern](./docs/mediator.md)

* 객체들의 집합이 상호작용하는지를 함축해놓은 객체를 정의
* `Colleague`

### [Memento Pattern](./docs/memento.md)

* 메멘토 패턴은 객체의 상태 정보를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원 할 수 있는 패턴을 의미합니다.

### [Observer Pattern](./docs/observer.md)

* 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만듭니다.

### [State Pattern](./docs/state.md)

* 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로, 이렇게 하면 객체는 마치 자신의 클래스를 바꾸는 것처럼 보입니다.
* state 패턴을 구현한다는 것은 각 상태에 대응하는 별도의 클래스를 만들고 상태 전이 로직을 그 클래스들로 옮기는 작업을 뜻한다.

### [Strategy Pattern](./docs/strategy.md)

* 알고리즘 변경
* 동일 계열의 알고리즘을 정의하고 상호교환이 가능하게 한다
* `Algorithm`

### [Template Method Pattern](./docs/template_method.md)

* 객체의 연산에는 알고리즘의 뼈대만을 정의하고 각 단계에서 수행할 구체적 처리는 서브클래스 쪽으로 미룹니다.

### [Visitor Pattern](./docs/visitor.md)

* 알고리즘을 객체 구조에서 분리
* 객체 구조를 이루는 원소에 대해 수행할 연산을 표현합니다.
* 연산을 적용할 원소의 클래스를 변경하지 않고도 새로운 연산을 정의할 수 있게 합니다.
* Visitor 패턴내의 메소드는 Concrete element 개수만큼 존재한다
* `Accept`