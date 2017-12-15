package refrigerator_project;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{

	private String id;
	private ArrayList<Food> foodList = null;

	public User() {
		foodList = new ArrayList<Food>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setFoodList(Food food) {
		foodList.add(food);
	}
	public void deleteFoodList(int i) {
		foodList.remove(i);
	}
	public ArrayList<Food> getFoodList() {
		return foodList;
	}
	
}
