public class ManagerApp {
    public static void main (String[]args) throws Exception{
    var manager = new Manager ();
    manager.name = "fidaa";
    manager.sayHello("User1");
    System.out.println(manager.getSalary());
    
    var vp = new VicePresident();
    vp.name = "fidaa";
    vp.sayHello("User1");
    System.out.println(vp.getSalary());
    System.out.println(vp.getParentSalary());
    }
}
