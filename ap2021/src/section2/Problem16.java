package section2;

import java.util.ArrayList;

public class Problem16 {

	public static void main(String[] args) {
		Cookbook book = new Cookbook();
		Recipe recipe = new Recipe("recipe-1", 4);
		Ingredient ingred = new Ingredient("ingred-1", 35.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-2", 5.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-3", 3.14);
		recipe.addIngredient(ingred);
		book.addRecipe(recipe);
		
		recipe = new Recipe("recipe-2", 2);
		ingred = new Ingredient("ingred-4", 15.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-5", 51.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-6", 13.14);
		recipe.addIngredient(ingred);
		book.addRecipe(recipe);
		
		recipe = new Recipe("recipe-3", 3);
		ingred = new Ingredient("ingred-7", 5.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-8", 53.4);
		recipe.addIngredient(ingred);
		ingred = new Ingredient("ingred-9", 33.14);
		recipe.addIngredient(ingred);
		book.addRecipe(recipe);
		
		System.out.println(book.getRecipeList());
		book.standardize(3);
		System.out.println(book.getRecipeList());
	}

}

class Cookbook {
	private ArrayList<Recipe> recipeList; // each entry is an instance of a Recipe representing one recipe in the cookbook
	
	public Cookbook() {
		recipeList = new ArrayList<Recipe>();
	}
	public void addRecipe(Recipe recipe) {
		recipeList.add(recipe);
	}
	/*
	 * precondition: numPeople^ 0 postcondition: All recipes in recipeList have been
	 * converted to serve numPeople number of people
	 */
	public void standardize(int numPeople) {
		int j = 0;
		while (j < recipeList.size()) {
			for (int k = 0; k < recipeList.size(); k++) {
				Ingredient ingred = ((Recipe) recipeList.get(j)).getlngredientList().get(k);
				double oldAmount = ingred.getAmount();
				double newAmount = numPeople / oldAmount;
				ingred.setAmount(newAmount);
			}
			((Recipe) recipeList.get(j)).setNumberServed(numPeople);
			j++;
		}
	}
	public ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}

	// ... constructors, other methods, and other private data not shown
}

class Ingredient {
	private String name; // the name of this ingredient
	private double amount; // the amount of this ingredient needed in the recipe

	public Ingredient(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	// @returns the amount of this ingredient needed in the recipe
	public double getAmount() {
		return amount;
	}

	/**
	 * precondition:amt > 0.0 postcondition: amount has been set to amt
	 */
	public void setAmount(double amt) {
		amount = amt;
	}

	/*
	 * precondition:newNumber > 0 postcondition: numberServed has been set to
	 * newNumber
	 */
	public void setNumberServed(int newNumber) {
		/* code not shown */}

//... constructors and other methods not shown 
}

class Recipe {
	private String name;
	private ArrayList<Ingredient> ingredientList = new ArrayList<>();
	private String preparationProcess;
	private int numberServed;

	public ArrayList<Ingredient> getlngredientList() {
		return ingredientList;
	}

	public Recipe(String recipeName, int numServed) {
		name = recipeName;
		numberServed = numServed;
	}

	public void addIngredient(Ingredient newlngredient) {
		ingredientList.add(newlngredient);
	}

	public void setPreparationProcess(String newPreparationProcess) {
		preparationProcess = newPreparationProcess;
	}

	public String getName() {
		return name;
	}

	public int getNumberServed() {
		return numberServed;
	}

	public void setNumberServed(int numberServed) {
		this.numberServed = numberServed;
	}

	public void scale(int newNumberServed) {
		double oldAmount;
		double newAmount;

		for (int k = 0; k < ingredientList.size(); k++) {
			Ingredient ingred = ingredientList.get(k);
			oldAmount = ingred.getAmount();
			newAmount = newNumberServed * (oldAmount / numberServed);
			ingred.setAmount(newAmount);
		}
		numberServed = newNumberServed;
	}

	@Override
	public String toString() {
		return "Recipe [name=" + name + ", numberServed=" + numberServed + "]";
	}

}