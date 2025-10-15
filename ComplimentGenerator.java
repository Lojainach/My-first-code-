import java.util.Random;
public class ComplimentGenerator {
public static void main(String[] args) {
String[] compliments = {
"You have a beautiful smile",
"You're doing amazing, keep it up ",
"You’re smarter than you think ",           
"You bring light wherever you go ",
"You're unstoppable, Lojain! "
};
Random rand = new Random();
int index = rand.nextInt(compliments.length);
System.out.println(compliments[index]);
}
}
