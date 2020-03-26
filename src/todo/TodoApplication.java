package todo;

public class TodoApplication {

  public static void main(String[] args) {

    int counter =1;
    for (String arg: args) {
      System.out.println(counter + arg);
      counter++;
    }
    PrintCommands printCommands = new PrintCommands();

    if (args.length == 0) {
      printCommands.printCommands();
    }

    Todo todo = new Todo();
    Todo todo2 = new Todo();
    Todo todo3 = new Todo();


  }
}
