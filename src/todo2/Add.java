package todo2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Add {

  String name = "-a";
  String description = "Adds a task";

  public void add(String task) throws IOException {
    String taskLine = System.lineSeparator() + task;
    Path filepath = Paths.get("files/tasks.txt");
    BufferedWriter writer = Files.newBufferedWriter(filepath, StandardOpenOption.APPEND);
    writer.write(taskLine);
    writer.close();
  }



}
