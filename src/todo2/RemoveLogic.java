package todo2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RemoveLogic {

  protected String name = "-r";
  protected String description = "Removes a task";
  protected List<String> lines = new ArrayList<>();
  protected int numberOfTasks;

  public void setNumberOfTasks(){
    this.numberOfTasks = lines.size()-1;
  }

  public Boolean areThereTwoTasks() throws IOException {
    readFile("files/tasks.txt");
    if (this.lines.size() >= 2) {
      return true;
    }
    return false;
  }

  public void remove(int taskNumber) throws IOException {
    if (areThereTwoTasks()) {
      readFile("files/tasks.txt");
      this.lines.remove(taskNumber -1);
    }
    writeFile();
  }

  public void writeFile() throws IOException {
    FileWriter writer = new FileWriter("files/tasks.txt");
    for (String line : lines) {
      writer.write(line + System.lineSeparator());
    }
    writer.close();
  }

  public void readFile(String origin) throws IOException {
    Path filepath = Paths.get(origin);
    java.util.List<String> lines = Files.readAllLines(filepath);
    this.lines = lines;
    setNumberOfTasks();
  }
}