package todo;

public class Todo {

  String name;
  int id = 0;
  String body;
  boolean completed;

  public Todo() {
    this.name = "example task";
    this.id = id++;
    this.body = "description of an example task";
  }
  public Todo(String name, String description, boolean completed) {
    this.name = name;
    this.id = id++;
    this.body = description;
    this.completed = completed;
  }
}
