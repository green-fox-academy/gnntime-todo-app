package todo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class List extends Commands {

  ArrayList<Todo> todo;
  private java.util.List linesWithoutCheck;

  @Override
  public String getName() {
    this.name = "-l";
    return name;
  }

  @Override
  public String getDescription() {
    this.description = "Lists all the tasks";
    return description;
    }


  public void readfile(String origin) throws IOException {
    Path filepath = Paths.get(origin);
    java.util.List<String> lines = Files.readAllLines(filepath);
    this.linesWithoutCheck = lines;
  }
}
