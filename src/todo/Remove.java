package todo;

public class Remove extends Commands {

  @Override
  public String getName() {
    this.name = "-r";
    return name;
  }

  @Override
  public String getDescription() {
    this.description = "Removes a task";
    return description;
  }
}
