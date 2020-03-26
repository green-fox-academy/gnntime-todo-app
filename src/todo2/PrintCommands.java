package todo2;

public class PrintCommands {

  public void printCommands() {
    ListLogic list = new ListLogic();
    AddLogic add = new AddLogic();
    RemoveLogic remove = new RemoveLogic();
    CompleteLogic complete = new CompleteLogic();

    System.out.println("Command Line Todo application");
    System.out.println("----------------------");
    System.out.println(list.name + " " + list.description);
    System.out.println(add.name + " " + add.description);
    System.out.println(remove.name + " " + remove.description);
    System.out.println(complete.name + " " + remove.description);
  }
}
