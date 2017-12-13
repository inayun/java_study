package refrigerator_project;

import java.util.ArrayList;
import java.util.List;

public class Food {

	private String foodName; //���� �̸�
	private String ingredient; //���
	private int calorie; //Į�θ�
	private String nutrient; //�����
	private String recipe; //������
	
	public Food() {}
	
	public Food (String foodName, String ingredient, int calorie, String nutrient, String recipe){
		this.foodName = foodName;
		this.ingredient = ingredient;
		this.calorie = calorie;
		this.nutrient = nutrient;
		this.recipe = recipe;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getNutrient() {
		return nutrient;
	}
	public void setNutrient(String nutrient) {
		this.nutrient = nutrient;
	}
	
	
	
}
