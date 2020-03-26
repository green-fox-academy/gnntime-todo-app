package todo2;


import java.io.IOException;

public class Todo {



  public static void main(String[] args) throws IOException {
    PrintCommands printCommands = new PrintCommands();
    if (args.length == 0) {
      printCommands.printCommands();

    } else if (args[0].equals("-l")) {
      List list = new List();
      list.printLines();
    } else if (args[0].equals("-a")) {
      Add add = new Add();
      add.add(args[1]);
    }


  }
  public void checkInput() {
  }
}
