import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
//브라질의 인구수 가져오기

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
    System.out.printf("Population of Brazil : %,d%n", dataset.get("Brazil"));
  }
}
