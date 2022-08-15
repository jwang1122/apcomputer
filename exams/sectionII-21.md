A parabola is a graph defined by the equation $ y = ax^2 + bx + c$, where a, b, and c are all integers and a is non-zero. The x-value of the axis of symmetry of a parabola is defined by the double -blla. A point is a pair of integer values, x and y- A point is defined to be on a parabola if it satisfies the equation of the parabola. Consider the examples in the table below: 

Equation | Axis of symmetry (-b/2a) | Is point (4,3) on parabola?
|---|---|---|
$y=2x^2-6x-5$|-(-6)/(2(2))=1.5| Yes, $2(4)^2-6(4)-5$
$y=4x^2+2x-3$|-(-2)/(2(4))=-0.25| No, $3\neq 4(4)^2+2(4)-3$

The following code segment is from a method outside the class Parabola and demonstrates how the Parabola class can be used to represent the two equations above: 

```java
Parabola par1 = new Parabola (2, -6, -5) ;
double axisl = pari .getAxis () ; //assigns 1.5 to axis 1  
boolean onGraph1 = par1.isOnGraph (4 , 3);//assigns true to onGraph1 

Parabola par2 = new Parabola (4, 2, -3) ;
double axis2 = par2.getAxis () ; //assigns -0.25 to axis2  
boolean onGraph2 = par2.isOnGraph (4 , 3);//assigns false to onGraph2 
```

Write the Parabola class. The constructor class of Parabola must take three integer parameters that represent a, b, and c, successively. You may assume as a precondition that a be a non-zero integer. You must include a get Axis method that returns the x-coordinate of the axis of symmetry as a double and an isOnGraph method that takes a point represented by two integer parameters, x and y, and returns true if the point is on the parabola and returns false if it is not. Your class methods must be able to return the values indicated in the examples above. You can ignore any overflow issues. 


```