package todo2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class List {

  protected String name = "-l";
  protected String description = "Lists all the tasks";

  java.util.List<String> linesWithoutCheck;
  public java.util.List<String> lines = new ArrayList<String>();

  public void printLines() throws IOException {
    checkLines();
    if (lines.size() == 0) {
      System.out.println("No todo for today :)");
    }
    int numbers = 1;
    for (String print: lines) {
      System.out.println(numbers + " " + print);
      numbers++;
    }
    System.out.println();
  }

  public void checkLines() throws IOException {
    readFile("files/tasks.txt");
    for (String line : linesWithoutCheck) {
      if (line.equals("Walk the dog")) {
        lines.add(line);
      }
      else if (line.equals("Buy milk")) {
        lines.add(line);
      }
      else if (line.equals("Do homework")) {
        lines.add(line);
      }
    }
  }

  public void readFile(String origin) throws IOException {
    Path filepath = Paths.get(origin);
    java.util.List<String> lines = Files.readAllLines(filepath);
    this.linesWithoutCheck = lines;
  }

}
