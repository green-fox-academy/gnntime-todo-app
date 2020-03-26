package todo2;


import java.io.IOException;

public class Todo {


  public static void main(String[] args) throws IOException {
    PrintCommands printCommands = new PrintCommands();
    RemoveLogic remove = new RemoveLogic();
    try {
      remove.readFile("files/tasks.txt");
    } catch (IOException e) {
      System.out.println("Cannot read file");
    }
    if (args.length == 0) {
      printCommands.printCommands();

    } else if (isArgumentNotSupported(args[0])) {
      System.out.println("Unsupported argument");
      printCommands.printCommands();
    } else if (args[0].equals("-l")) {
      ListLogic list = new ListLogic();
      try {
        list.printLines();
      } catch (IOException e) {
        System.out.println("Cannot read file");
      }
    } else if ((args.length == 1) && (args[0].equals("-a"))) {
      System.out.println("Unable to add: no task provided");
    } else if (args[0].equals("-a")) {
      AddLogic add = new AddLogic();
      try {
        add.add(args[1]);
      } catch (IOException e) {
        System.out.println("Cannot write to file");
      }
    } else if ((args.length == 1) && (args[0].equals("r"))) {
      System.out.println("Unable to remove: No index provided");
    } else if (!isInputNumeric(args[1])) {
      System.out.println("Unable to remove: Input is not a number");
    } else if ((Integer.parseInt(args[1]) > remove.numberOfTasks)) {
      System.out.println("Unable to remove: Index is out of bound");
    } else if (args[0].equals("-r")) {
      try {
        int taskNumber = Integer.parseInt(args[1]);
        remove.remove(taskNumber);
      }
      catch (IOException e) {
        System.out.println("Cannot read file");
      }
    }

  }

  public static Boolean isInputNumeric(String input) {
      if (input == null) {
        return false;
      }
      try {
        int i = Integer.parseInt(input);
      } catch (NumberFormatException nfe) {
        return false;
      }
      return true;
  }
  public static Boolean isArgumentNotSupported(String input) {
    switch (input) {
      case "-l":
      case "-c":
      case "-r":
      case "-a":
        return true;
      default:
        return false;
    }
  }
}
