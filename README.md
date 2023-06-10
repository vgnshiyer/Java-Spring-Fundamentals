# Java-Spring-Fundamentals

### Dependancy Injection

The relationship between two objects where one object depends on the other is called as a dependancy. Injection is the concept of injecting the dependant object with the object instance it is dependant on.

For example

```
class A {
    B b;

    ...
}

// class A is dependant on class B
// We can either create a new instance of the object inside class A, or we can inject the dependancy directly inside class A.
class B {
    ...
}
```

The Java Spring framework helps us to do just that. It will handle instantiating the object and injecting it inside the dependant class.

Using the new keyword can help us but it makes our application tightly coupled.

The Spring IOC (Inversion of Control) container can inject dependancies in two ways.

1. Setter injection 
Every attribute in a class has a setter method. The IOC container will call the setter methods to set data.

2. Constructor injection
The IOC container uses the constructor of the class to set attributes for the object.

