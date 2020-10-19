import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    File dataFile = new File("Countries.dat");
    HashMap<String,Integer> dataset = new HashMap();
    try{
      Scanner input = new Scanner(dataFile);
      while (input.hasNext()) {
        String country = input.next();
        int population = input.nextInt();
        dataset.put(country, population);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    System.out.printf("dataset.size(): %d%n", dataset.size());
    System.out.printf("dataset.get(\"Peru\"): %,d%n", dataset.get("Peru"));
  }
}
