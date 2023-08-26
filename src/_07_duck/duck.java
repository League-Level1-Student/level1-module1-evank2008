package _07_duck;

public class duck {
	duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
int numberOfFriends;
String favoriteFood;
void quack() {
	System.out.println("QUACK! I want " + favoriteFood + "!");
}
void waddle() {
	for(int i =numberOfFriends;i>0;i--) {
		System.out.println("waddle ");
	}
}
}
