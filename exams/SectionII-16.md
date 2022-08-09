Consider the design of an electronic cookbook modeled with the following class declarations: 

```java
public class Cookbook 
{
    private ArrayList recipeList; // each entry is an instance of a Recipe representing one recipe in the cookbook

    /* precondition: numPeople^ 0 
     * postcondition: All recipes in recipeList have been converted to serve numPeople number of people
     */
     public void standardize (int numPeople) 
     {/*code not shown */}

     //... constructors, other methods, and other private data not shown  
}

public class Ingredient 
{
    private String name; //the name of this ingredient 
    private double amount; // the amount of this ingredient needed in the recipe 

    // @returns the amount of this ingredient needed in the recipe 
    public double getAmount () 
     {/*code not shown */}

    /** precondition:amt > 0.0 
      * postcondition: amount has been set to amt
      */
      public voidsetAmount (doubleamt) 
     {/*code not shown */}

    /* precondition:newNumber > 0
    * postcondition: numberServed has been set to newNumber 
    */
    public void setNumberServed (int newNumber) 
     {/*code not shown */}

//... constructors and other methods not shown 
}
```

(a) A recipe in the cookbook is modeled by the class Recipe with the following data and operations: 

**Data**
* the name of the recipe 
* the list of ingredients used in the recipe 
* the description of the preparation proce^ ss for the recipe 
* the number of people served by the recipe 

**Operations**
* create a recipe with a given name and number of people served 
* add an ingredient to the recipe 
* set the description of the preparation process for the recipe 
* return the name of the recipe 
* return the list of ingredients 
* return the number of people served by the recipe 
* scale the recipe to serve a given new number of people by changing the amount of each ingredient appropriately 

Write the definition of the class Recipe, showing the appropriate data definitions and constructor and method signatures. You should not write the implementations of the constructor or methods for the Recipe class. 

(b) Using the signature you wrote in part (a), write the implementation for the method that scales the recipe to serve a given new number of people. 

In writing this method, you may call any of the methods in the Recipe class (as you defined it in part (a)) or in the Ingredient class. Assume that these methods work as specified. 

(c) Write the Cookbook method standardize as described at the beginning of the question. 

In writing this method, you may call any of the methods in the Recipe class (as you defined it in part (a)) or in the Ingredient class. Assume that these methods work as specified. 

Complete method standardize below. 

```java
// precondition: numPeople > 0
// postcondition: All recipes in 
// recipeList have been scaled to 
// serve numPeople number of people  
public void standardize (int numPeople) 
```

