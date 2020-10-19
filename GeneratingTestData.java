//csv파일 랜덤난수 생성해서 저장

import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class Main {
  private static final int ROWS = 8, COLS = 5;
  private static final Random RANDOM = new Random();

  public static void main(String[] args) {
    File outputFile = new File("Output.csv");
    try {
      PrintWriter writer = new PrintWriter(outputFile);
      for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS-1; j++) {
          writer.printf("%.6f,",RANDOM.nextDouble());
        }
        writer.printf("%.6f%n",RANDOM.nextDouble());
      }
      writer.close();
    }catch (FileNotFoundException e) {
      System.err.println(e);
    }
  }
}
