# 设计模式 （Design Pattern）

 由于对自己之前感觉对设计模式学得不怎么系统（以前是用PHP，但Java的设计模式好像比较复杂），有点不大自信，所以现在来观看老韩的视频。
 
## 设计模式介绍

 * 设计模式是程序员在面对同类软件工程设计问题所总结出来的有用经验，模式不是代码，而是某类问题的通用解决方案，设计模式（Design Pattern）
 代表了**最佳的实践**。 这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。
 * 设计模式的本质是提高 软件的维护性，通用性和扩展性，并降低软件的复杂度。
 * 《设计模式》是经典的书，作者是 Erich Gammka、Richard Helm、Ralph Johnsom和John Vlissides Design(俗称 “四人组GOF”)。
 * 设计模式并不局限于某种语言， java,php,c++都有设计模式。
##设计模式的目的

 编写软件过程中， 程序员面临着来自耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性等多方面挑战，
 设计模式是为了让程序（软件）既有更好：

- 代码重用性 (相同功能的代码，不用多次编写)
- 可读性 （编程规范性， 便于其他程序员的阅读和理解）
- 可扩展性 （当需要增加新的功能时，非常的方便，称为可维护性）
- 可靠性 （当我们增加新的内容后，对原来的功能没有影响）
- 使程序呈现**高内聚**，**低耦合**的特性

 设计模式包含了面向对象的精髓

 懂了设计模式，你就懂了面向对象分析和设计(OOA/D)的精要

Scott Mayers : C++老手和C++新手的区别就是前者手背上有很多伤疤

## 设计模式的七大原则 

### 单一职责原则 (Single Responsibility Principle)

#### 基本介绍

 对类来说的，即一个类应该只负责一项职责，如类A负责两个不同职责，职责1 职责2。
 当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1,A2

#### 单一职责原则注意事项和细节

 - 降低类的复杂度，一个类只负责一项职责
 - 提高类的可读性，可维护性
 - 降低变更带来的风险，
 - 通常情况下，我们应当遵守单一原则， 只有逻辑足够简单，才可以在代码级违反单一职责原则；
 只有在**类中方法数量足够少**，可以在方法级别保持单一职责原则 

### 接口隔离原则 (Interface Segregation Principle)

#### 基本介绍

 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上

#### 应对传统方法问题和使用接口隔离原则改进

 - 类A通过接口Interface1依赖类B， 类C通过接口Interface1依赖类D，如果接口
 Interface1对于类A和类C来说不是最小接口，那么类B和类D必须实现他们不需要的方法
 - 将接口Interface1拆分为独立的几个接口 类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则

### 依赖倒转原则 （Dependence Inversion Principle）

#### 基本介绍

 - 高层模块不应该依赖低层模块， 二者都应该依赖其抽象
 - 抽象不应该依赖细节，细节应该依赖抽象
 - 依赖倒转（倒置）的中心思想是面向接口编程
 - 依赖倒转原则是基于这样的理念：相对于细节的多变性，抽象的东西要稳定的多。
 以抽象为基础搭建的架构比以细节为基础的架构要稳定的多，在java中，抽象指的是接口或抽象类，
 细节就是具体的实现类。
 - 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。
 
##### 依赖倒置原则的注意事项和细节

 - 低层模块尽量都要有抽象类或接口 或者两者都有，程序稳定性更好
 - 变量声明类型尽量是抽象 类或接口， 这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
 - 继承时遵循里氏替换原则 

### 里氏替换原则 （Liskov Substitution Principle）

#### OO中的继承性的思考和说明

 - 继承包含这样一层含义： 父类中凡是已经实现好的方法，实际上是在设定规范和契约，
 虽然它不强制要求所有子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，
 就会对整个继承体系造成破坏
 - 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，
 程序的可移植性降低，增加对象间的耦合性，如果一个类被其他的类所继承，则当这个类需要修改时，
 必须考虑到所有子类，并且父类修改后，所有涉及到子类的功能都有可能产生故障。
 - 问题提出：在编程中，如何正确的使用继承？ => 里氏替换原则
 
 #### 基本介绍
 
 - 里氏替换原则（Liskov Substitution Principle）在1988年，由麻省理工学院的以为姓里的女士提出的。
 - 如果对每个类型为T1的对象o1，都有类型为T2的对象o2,使得以T1定义的所有程序P在所有的对象o1都代换成o2时，
 程序P的行为没有发生变化，那么类型T2的类型是T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
 - 在使用继承时，遵循里氏替换原则，**在子类中尽量不要重写父类的方法**
 - 里氏替换原则告诉我们，继承实际上让两个类耦合性增加了，在适当的情况下，可以能过聚合，组合，依赖来解决问题。
 


### 开闭原则 （Open Closed Principle）

 #### 基本介绍
 
 - 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则。
 - 一个软件实体如类、模块和函数应该对扩展开放（对提供方），对修改关闭（对使用方）。用抽象构建框架，用实现扩展细节。
 - 当软件需要变化时，**尽量通过扩展**软件实体的行为来实现变化，而**不是通过修改**已有的代码来实现变化。
 - 编程中遵循其他原则，以及使用设计模式的目的就是遵循**开闭原则**。
 
### 迪米特法则 （Demeter Principle）

 #### 基本介绍
 
 - 一个对象应该对其他对象保持最少的了解
 - 类与类的关系越密切，耦合度越大
 - 迪米特法则（**Demeter Principle**) 又叫**最少知道原则** 即一个类对自己依赖的类知道的越少越好，也就是说，
 对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄漏任何信息。
 - 迪米特法则还个更简单的定义：只与直接的朋友通信
 - **直接的朋友**： 每个对象都会与其他对象有**耦合关系**，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，
 依赖，关联，组合，聚合等。其中，我们称出现**成员变量**，**方法参数**，**方法返回值**中的类为直接的朋友，而出现在**局部变量中的类不是直接朋友**。
 也就是说，陌生的类最好 不要以局部变量的形式出现在类的内部。
 
  
##### 迪米特法则的注意事项和细节

 - 迪米特法则的核心是**降低**类之间的**耦合**
 - 但是注意，由于每个类都减少不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，**并不是要求完全没有依赖**。
 
### 合成复用原则 （Composite Reuse Principle）

#### 基本介绍 
  
 原则是尽量使用合成/聚合的方式， 而不是使用继承
 
## 设计原则核心思想
 - 找出应用中可能需要变化之处，把它们实现出来，不要和那些不需要变化的代码混在一起
 - 针对接口接口编程，而不是针对实现编程。
 - 为了交互对象之间的**松耦合**设计而努力
 

## 掌握设计模式的层次
 * 第1层：刚开始学编程不久，听说过什么是设计模式
 * 第2层：有很长时间的编程经验，自己写了很多代码，其中用到了设计模式，但是自己却不知道。
 * 第3层：学习过了设计模式，发现自己已经在使用了，并且发现了一些新的模式挺好用的。
 * 第4层：阅读了很多别人写的源码和框架，在其中看到别人设计模式，并且能够领会**设计模式的精妙和带来的好处**。
 * 第5层：代码写着写着，自己都没有意识到使用了设计模式，并且熟练的写了出来

## 设计模式类型
### 设计模式分为三种类型，共23种
 - **创建型模式：** _单例模式_、抽象工厂模式、原型模式、建造者模式、_工厂模式_。
 - **结构型模式：** 适配器模式、桥接模式、_装饰模式_、组合模式、外观模式、享元模式、_代理模式_。
 - **行为型模式：** 模板方法模式、命令模式、访问者模式、迭代器模式、_观察者模式_、中介者模式、备忘录模式、解释器模式（Interpreter模式）、
 状态模式、策略模式、职责链模式（责任链模式）。
 **注意** 不同的书籍上对分类和名称略有差别
 
## 单例模式
### 基本介绍
所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法（静态方法）
### 单例模式八种方式
 - **饿汉式（静态常量）**
 - **饿汉式（静态代码块）**
 - 懒汉式（线程不安全）
 - 懒汉式（线程安全，同步方法）
 - 懒汉式（线程安全，同步代码块）
 - **双重检查**
 - **静态内部类**
 - **枚举**
 
 加粗的 表示推荐使用 具体细节请看代码
 
 
### 单例模式注意事项和细节说明

 - 单例模式保证了系统内存中该类只存在一个对象，节省了系统的资源，对于一些需要频繁创建资源的对象，使用单例模式可以提高系统性能。
 - 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new。
 - 单例模式使用的场景： 需要频繁的进行创建和销毁的对象，创建对象时耗时过多或耗费资源过多（即：重量级对象），但又经常用到的对象、
 工具类对象、频繁访问数据库或文件对象（比如数据源、sesson工厂等）。
 
##工厂模式
 
### 简单工厂模式

#### 基本介绍

 - 简单工厂模式是属于创建开模式，是工厂模式的一种。 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式。
 - 简单工厂模式： 定义了一个创建对象的类，由这个类来封闭实例化对象的行为（代码）。
 - 在软件开发中，当我们会用到大量的创建某种，某类或者某批对象时，就会使用到工厂模式。
 
### 工厂方法模式

  **工厂方法模式** 定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将**对象的实例化推    迟到子类** 。
  
### 抽象工厂模式

 - 抽象工厂模式：定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体类。
 - 抽象工厂模式可以将**简单工厂模式**和**工厂方法模式**进行整合。
 - 从设计层面看，抽象工厂模式是对简单工厂模式的改进）（或者称为进一步的抽象）
 - 将工厂抽象成两成，AbsFactory(抽象工厂) 和 具体实现的工厂子类 。程序员可以根据创建对象类型使用对应的工厂子类。这样将单个的简单工厂类变成了**工厂簇**，
 更利于代码的维护和扩展。
  
### 工厂模式小结 

 - 工厂模式的意义 将实例化对象的代码提取出来， 放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦，从而提高项目的扩展和维护性。
 - 三种工厂模式 （**简单工厂模式**、**工厂方法模式**、**抽象工厂模式**）。
 - 设计模式的**依赖抽象**原则   
 - 创建对象实例时，不要直接new类，而是把这个new类的动作放在一个工厂的方法，并返回。有的书上说，变量不要直接持有具体类的引用。
 - 不要让类继承具体类，而是继承抽象类或者是实现interface(接口)。
 - 不要覆盖类中已经实现的方法。

## 原型模式

### 基本介绍 

 - 原型模式（Prototype模式）是指:用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象。
 - 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象。无需知道如何创建的细节
 - 工作原理是:通过将一个原型对象传绘那个发动创建的对象，这个要发动创建的对象通过请求原型对象都由它们自己来实施创建，即 对象.clone()
 - 形象的理解： 孙大圣拔出猴毛，变出其他孙大圣。
 
### 浅拷贝的介绍

 - 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
 - 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值
 （内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值 。
 - 浅拷贝是使用默认的clone()方法来实现 
 
### 深拷贝基本介绍
 - 复制对象的所有基本数据类型的成员变量值。
 - 为了所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对待进行深拷贝要对整个对象进行拷贝
 - 深拷贝实现方式1：重写clone方法来实现深拷贝
 - 深拷贝实现方式2：**通过对象序列化实现深拷贝（推荐）**
### 原型模式的注意事项和细节
 - 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。
 - 不用重新初始化对象，而是动态地获得对象运行时的状态。
 - 如果原始对象发生变化 （增加或者减少属性），其他克隆对象的也会发生相应的变化，无需修改代码。
 - 在实现深克隆的时候可能 需要比较复杂的代码。
 - **缺点：** 需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源码。违背了ocp原则。
 
## 建造者模式

###基本介绍

 - **建造者模式（Builder Pattern）** 又叫生成器模式，是一种对象构建模式。它可以将复杂对象的建行过程抽象出来 （抽象类别），
 使这个对象过程的不同实现方法可以构造不同表现（属性）的对象。
 - 建造者模式是一步一步创建一个复杂的对象，允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 
### 建造者模式的四个角色

 - **Product(产品角色)**： 一个具体的产品对象。
 - **Builder(抽象建造者)**：创建一个Product对象的各个部件指定接口/抽象类。
 - **ConcreteBuilder(具体建造者)**：实现接口，构建和装配各个部件。
 - **Director(指挥者)**：构建一个使用Builder接口的对象。它主要是用于创建一个复杂对象。它主要有两个作用，一是：隔离了客户与对象产生过程，
 二是： 负责控制产品对象的生产过程。
 
### 建造者模式的注意事项和细节

 - 客户端（使用程序）**不必知道产品内部组成的细节。将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象**。
 - 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的建造者，**用户使用不同的具体建行者即可得到不同的产品对象**。
 - **可以更精细地控制产品的创建过程**。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。
 - 增加新的具体建造者无须修改原有类库的代码，指挥者针对抽象建造者类编程，系统扩展方便，符合“**开闭原则**”
 - 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，**如果产品之间的差异性很大，则不适合使用建造者模式**，因此使用范围受到一定的限制。
 - 如果产品的内部变化复杂，可能会导致需要定义很多具体建行者类来实现这种变化，导致系统变得很庞大，因此在这种情况下，要考虑是否选择建造者模式。
 - 抽象工厂模式vs建造模式
  抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类维度的产品组合，采用抽象工厂模式不需要关心构建过程，只关心什么产品由什么工厂生产即可。
  而建造者模式则是要求按照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生一个新产品。
  
## 适配器模式

### 基本介绍

 - 适配器模式（Adapter Pattern） 将某个类的接口转换成客户端期望的另一个接口表示，主要的目的是兼容性，让原本因接口不匹配不能在一起工作的两个类可以协调工作。其别名为包装器（Wrapper）
 - 适配器模式属于结构型模式。
 - 主要分为三类：类适配器模式、对象适配器模式、接口适配器模式。
 
### 适配器模式工作原理

 - 适配器模式:将一个类的接口转换成另一种接口。让**原本接口不兼容的类可以兼容**。
 - 从用户的角度看不到被适配者，是解耦的。
 - 用户调用适配器转化出来 的目标接口方法，适配器再调用被适配者的相关接口方法。
 - 用户收到反馈结果，感觉只是和目标接口交互。
 
### 类适配器模式介绍 

 - Adapter类，通过继承src类，实现dst接口，完成src->dst的适配 

### 类适配器的注意事项和细节

 - Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点，因为这要求dst必须是接口有一定局限性。
 - src类的方法在Adapter中都会暴露出来， 也增加了使用的成本。
 - 由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了。
 
### 对象适配器模式介绍

- 基本思路和类适配器模式相同，只是将Adapter类作修改，不是继承src类，面是持有src类的实例，以解决兼容性的问题。即：持有src类，实现dst类接口,完成src->dst的适配。
- 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系。
- **对象适配器模式是适配器模式常用的一种**。
 
### 对象适配器的注意事项和细节

- 对象适配器和类适配器其实算是同一种思想，只是实现方式不同。根据合成复用原则，使用组合代替继承，所以它解决了类适配器必须继承src的局限性问题，也不再要求dst必须是接口。
- 使用成本更低，更灵活。
 
### 接口适配器模式介绍

 - 一些书籍称为：适配器模式（Default Adapter Pattern）或缺省适配器模式。
 - 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需要。
 - 适用于一个接口不想使用其所有的方法的情况。
 
### 适配器模式的注意事项和细节 

 - 三种命名方式，是根据src是怎样的形式给到Adapter（在Apapter里的形式）来命名。
 - 类适配器：以类给到，在Apapter里，就是将类src当做类，继承。
 - 对象适配器：以对象给到，在Apapter里，就是将类src作为一个对象，持有。
 - 接口适配器：以接口给到，在Apapter里，就是将类src作为一个接口，实现。
 - Adapter模式最大的作用还是将原本不兼容的接口融合在一起工作。
 - 实际开发中，实现起来不拘泥于代码中写的那三种经典形式。
 
## 桥接模式

### 基本介绍 

 - 桥接模式（Bridge模式）是指：将**实现**与**抽象**放在两个不同的类层次中，全两个层次可以独立改变。
 - 是一种结构型模式。
 - Bridge模式基于**类的最小设计原则**，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。它的主要特点是把抽象（Abstraction）与行为实现（Implementation）分离开来，
 从而可以保持各部分的独立性以及应对他们的功能扩展。

### 桥接模式的注意事项和细节 

 - 实现了抽象和实现部分的分离，从而极大的提供了系统的灵活性，让抽象部分和实现部分独立开来，这有助于系统进行分层设计，从而产生更好的结构化系统。
 - 对于系统的高层部分，只需要知道抽象部分和实现部分的接口就可以了，其它的部分由具体业务来完成。
 - **桥接模式替代多层继承方案**，可以**减少子类的个数** ，降低系统的管理和维护成本。
 - 桥接模式的想入增加了系统的理解和设计难度，由于聚合关联关系建立 在抽象层，要求开发者针对抽象进行设计和编程。
 - 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围有一定的局限性，即需要有这样的应用场景。
 
## 装饰者模式

### 装饰者模式定义

 - 装饰者模式：**动态的将新功能附加到对象上**。在对象功能扩展方面，它比继承更有弹性，装饰者模式也体现了开闭原则（ocp）。
 - 这里提到的动态的将新功能附加到对象和ocp原则，在后面的代码中体现出来 。

### 装饰者模式的原理

 * 装饰者模式就像打包一个快递
    - 主体： 比如：陶瓷、衣服（Component) //被装饰者
    - 包装： 比如：报纸填充，塑料泡沫、纸板、木板 （Decorator）
 * Component 主体：抽象
 * ConcreteComponent具体的主体
 * Decorator 装饰者
 * Component与ConcreeteComponent之间，如果ConcreteCompponent类很多，还可以设计一个缓冲层，将共有的部分提取出来，抽象成一个类。
 
 大致理解意思  但这个文档没弄图可能不知道我在写啥。。。。
 
## 组合模式 

### 基本介绍

 - 组合模式（Composite Pattern），又叫部分整体模式，它创建了对象组的树形结构，将对象组合成树状结构以表示“整体-部分” 的层次关系。
 - 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 - 这种类型的设计模式属于结构型模式。
 - 组合模式使得用户对单个对象和组合对象的访问具有一致性，即：组合能让客户以一致的方式处理个别对象以及组合对象。
 
### 组合模式解决的问题

 - 组合模式解决这样的问题，当我们的要处理的对象可以生成一颗树形结构，而我们要对树上的节点和叶子进行操作时，它能够提供一致的方式，而不用考虑它是节点还是叶子。
 
### 组合模式的注意事项和细节

 - 简化客户端操作，客户端只需要面对一致的对象而不用考虑整体部分或节点叶子的问题。
 - 具有较强的扩展性。当我们要更改组合对象时，我们只需要调整内部的层次关系，客户端不用做任何的改动。
 - 方便创建出复杂的层次结构。客户端不用理会组合里面的组成细节，容易添加节点或者叶子从而创建出复杂的树形结构。
 - 需要遍历组织结构，或者处理的对象具有树形结构时，非常适合使用组合模式。
 - 要求较高的抽象性，**如果节点和叶子有很多差异性的话**，比如很多方法和属性都不一样，**不适合使用组合模式。**
 
## 外观模式

### 基本介绍

 - 外观模式（Facade），也叫“过程模式”:外观模式为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 - 外观模式通过定义一个一致的接口，用心屏蔽内部子系统的细节，使得调用端面只需跟这个接口发生调用，而无需关心这个子系统的内部细节。
 
### 外观模式的注意事项和细节

 - 外观模式**对外屏蔽了子系统的细节**，因此外观模式降低了客户端对子系统使用的复杂度
 - 外观模式对客户端与子系统的耦合关系-解耦，让子系统内部的模块更易维护和扩展。
 - 通过合理使用外观模式，可以帮我们更好的**划分访问的*层次* **。
 - 当系统需要进行分层设计时，可以考虑使用Facade模式。
 - 在维护一个遗留的大型系统时，可能这个系统已经变得非常难以维护和扩展，此时可以考虑为新系统开发一个Facade类，来提供遗留系统的比较清晰简单的接口，
 让新系统 与Facade类交互，提高复用性。
 - 不能过多的或者不合理的使用外观模式，使用外观模式好，还是直接调用模块好，要以让系统有层次，利于维护为目的。
 