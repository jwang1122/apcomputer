6. This question involves the implementation of a calorie counter system that is represented by the CalorietCount class. A CalorieOunt object is created with 5 parameters:
* Daily Calories limit—the recommended number of calories per day
* paily Calories intake—the number of calories a person has eaten in a day 
* Grams of protein per day
* Grams of Carbohydrate per day 
* Grams of fat per day 

The CalorieCount class provides a constructor and the following methods: 
* addMeal—takes in calories, grams of protein, grams of carbs, and grams of fat from a meal and updates corresponding instance fields 
* getProteinPercentage—returns the percent of protein in a given day (4 * grams protein / daily calorie intake) 
* onTrack—returns true if the calorie intake does not exceed the daily calories limit, otherwise returns false 

The following table contains a sample code and the expected results. 

Statementsand Expressions |Value Returned (blank if no value) |Comment 
|---|---|---|
CalorieCount sunday= new CalorieCount(1500); | |Creates an instance with a 1500 calorie limit
sunday.addMeal(716,38,38,45) ||Adds 716 calories, 38 grams protein. 8 grams of carbs, 45 grams of fat to the appropriate in stance fields 
sunday.addMeal(230,16,8,16) ||Adds 230 calories, 16 grams protein. 8 grams of carbs, 16 grams of fat to the appropriate in stance fields
sunday.addMeal(568,38,50,24) ||Adds 568 calories, 38 grams protein. 50 grams of carbs, 24 grams of fat to the appropriate in stance fields
onTrack() |False |Returns true if calorie intake does not exceed calorie limit 
getProteinPercentage() |.24 | Multiplies grams of protein by 4 then divides by calorie intak 

Write the entire CalorieCount class. Your implementation must meet all specifications and conform to all examples. 
---
