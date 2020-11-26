# ase-spring-02
Spring Tutorial Dependency Injection

## Version

spring frame work version: 5.2.7.RELEASE


## Project 21 Auto

The tutorial project shows three options on how to work with instantiate new objects:

- option 1: Auto creates _Benzin_
- option 2: Benzin is created outside of _Auto_
- option 3: using dependency injection by the file _resources/beans03.xml_
```xml
	<bean id="A3" class="edu.spring.auto03.model.Auto">
		<property name="name" value="A3"></property>
		<property name="reifen">
			<list>
				<bean class="edu.spring.auto03.model.Reifen" />
				<bean class="edu.spring.auto03.model.Reifen" />
				<bean class="edu.spring.auto03.model.Reifen" />
				<bean class="edu.spring.auto03.model.Reifen" />

			</list>
		</property>
		<property name="motor" ref="a3_motor" />
		<property name="kraftstoff" ref="benzin" />
	</bean>
	<bean id="a3_motor" class="edu.spring.auto03.model.Motor" autowire="byName" />
	<bean id="benzin" class="edu.spring.auto03.model.fuel.Benzin" scope="prototype" />
	<bean id="oel" class="edu.spring.auto03.model.Oel" scope="prototype" />
```

The bean _Auto_ is initialized with 4 beans _Reifen_, a _Motor_ bean and a _Kraftstoff_ bean.
The referenced beans _a3_motor_ and _benzin_ are separate beans. The Motor has a property Oel, which is initialized through autowire.
It means the bean _oel_ is taken by this.


## Project 22 HelloWorld

The HelloWorld project shows how we can initialize the property _message_ in _resources/beans.xml_ with _Hello World!_.

```xml
   <bean id="helloWorld" class="edu.spring.helloworld.HelloWorld">
       <property name="message" value="Hello World!"/>
   </bean>
```

## Project 23 Dreieck

The project Dreieck consists of 8 examples how to initialize the object _Dreieck_ with one _Point_ or a list of points.
It contains also an example about _BeanNameAware_ and _ApplicationContextAware_ for getting the own bean name and the _application context_.
The _InitializingBean_ and _DisposableBean_ are explained in _Lifecyle Events_. The _Beans Post Processor_ explains how to initialize the beans programmatically.

All beans are under _resources/xml_:

- 01 Basics: Initialize Dreieck and Punkt individually. Link the Point into Dreieck with a _ref_.
```xml
	<bean id="dreieck" class="edu.spring.dreieck.xml.basics.Dreieck">
		<property name="start" ref="startPunkt"></property>
	</bean>
	<bean id="startPunkt" class="edu.spring.dreieck.xml.basics.Punkt">
		<property name="x" value="0"></property>
		<property name="y" value="1"></property>
	</bean>
```

- 01 Basics inner: Initialize Dreieck and Punkt all together in Dreieck.
```xml
```
- 02 Collection: Initialize Dreieck and Punkt as a list.
```xml
```
- 04 Inheritance: Inherit a second point and initialize it with a different point.
```xml
```
- 05 Aware Interfaces: _BeanNameAware_ and _ApplicationContextAware_ for getting the own bean name and the application context.
```xml
```
- 06 Lifecyle Events: Shows _custom init_ and _destroy_ methods through _InitializingBean_ and _DisposableBean_.
```xml
```
- 07 Beans Post Processor: Initialize the beans programmatically in a separate class.
```xml
```

## Project 24 HelloWorldAnnotation

The project is showing how to use the _jsr250_ and the _jsr330_ compatible annotations instead of the standard spring annotations.

- _MainAppHelloWorldAnnotation_: is using a SpringConfiguration class with the annotation _@Configuration_ instead of the _beans.xml_. The beans _HelloWorldService_
  and HelloWorldServiceExtended are created with the annotation _@Bean_. The class consists of a package scan annotation.
- _MainAppHellWorldXMLAnnotation_: The beans _HelloWorldService_ and _HelloWorldServiceExtended_ are defined in the _beans.xml_ file.
```xml
```

