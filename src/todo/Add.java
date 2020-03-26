package todo;

import todo.Commands;

public class Add extends Commands {

  @Override
  public String getName() {
    this.name = "-a";
    return this.name;
  }

  @Override
  public String getDescription() {
    this.description = "Adds a new task";
    return this.description;
  }
}
