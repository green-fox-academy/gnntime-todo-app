package todo;

public class PrintCommands {

  public void printCommands() {

    List list = new List();
    Add add = new Add();
    Remove remove = new Remove();
    Complete complete = new Complete();

    System.out.println("Command Line ToDo application");
    System.out.println("------------------------------");
    System.out.println(list.getName() + " " + list.getDescription());
    System.out.println(add.getName() + " " + add.getDescription());
    System.out.println(remove.getName() + " " + remove.getDescription());
    System.out.println(complete.getName() + " " + remove.getDescription());

  }
}
