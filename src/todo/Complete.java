package todo;

public class Complete extends Commands {


  @Override
  public String getName() {
    this.name = "-c";
    return name;
  }

  @Override
  public String getDescription() {
    this.description = "Completes a task";
    return description;
  }
}
