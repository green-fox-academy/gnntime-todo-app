package todo2;


import java.io.IOException;

public class Todo {


  public static void main(String[] args) throws IOException {
    PrintCommands printCommands = new PrintCommands();

    if (args.length == 0) {
      printCommands.printCommands();


    } else if (args[0].equals("-l")) {
      List list = new List();
      try {
        list.printLines();
      } catch (IOException e) {
        System.out.println("Cannot read file");
      }

    } else if ((args.length == 1) && (args[0].equals("-a"))) {
      System.out.println("Unable to add: no task provided");

    } else if (args[0].equals("-a")) {
      Add add = new Add();
      try {
        add.add(args[1]);
      } catch (IOException e) {
        System.out.println("Cannot write to file");
      }

    } else if ((args.length == 1) && (args[0].equals("r"))) {
      System.out.println("Unable to remove: No index provided");
    }

    /*else if (args[0].equals("-r"))*/

  }

  public void checkInput() {

  }
}
