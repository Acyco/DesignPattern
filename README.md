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
