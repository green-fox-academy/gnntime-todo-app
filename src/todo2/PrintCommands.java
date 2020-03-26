package todo2;

public class PrintCommands {

  List list = new List();
  Add add = new Add();
  Remove remove = new Remove();
  Complete complete = new Complete();

  public void printCommands() {
    System.out.println("Command Line Todo application");
    System.out.println("----------------------");
    System.out.println(list.name + " " + list.description);
    System.out.println(add.name + " " + add.description);
    System.out.println(remove.name + " " + remove.description);
    System.out.println(complete.name +" " + remove.description);

  }

}
