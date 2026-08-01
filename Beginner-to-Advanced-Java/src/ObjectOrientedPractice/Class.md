-- Instance variables - Variables defined inside a class; aka object fields or object attributes
public class Person {
    private String name;
    private int age;
-- each variable is preceded by the keyword "private"
-- "private" means that the variables are 'hidden' inside the object -- which is known as encapsulation

-- The constructor is defined after the instance variables.
-- The constructor's name is always the same as the class name.

-- a method is a named section of source code inside a class which can be invoked.
-- A method is written inside the class beneath the constructor. 
-- The method name is preceded by public void, since the method is intended to be visible to the outside world ( public), and it does not return a value ( void).

-- Objects and the Static Modifier:
--- The staticmodifier indicates that the method in question does not belong to an object and thus cannot be used to access any variables that belong to objects.
--- If a method receives as parameters all the variables whose values ​​it uses, it can have a static modifier.