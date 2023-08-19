package _03_cat;

public class catRunner {
public static void main(String[] args) {
	Cat busky = new Cat("busky");
	busky.meow();
	busky.printName();
	while(busky.lives>-1) {
	busky.kill();
	}
}
}
