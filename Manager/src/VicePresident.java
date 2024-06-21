class VicePresident extends Manager{
    
    void sayHello(String name) throws Exception {
        System.out.println("Hello "+ name+", My VicePresident name is"+this.name);

    }

    int getSalary(){
        return 200000;

    }

    int getParentSalary() {
        return super.getSalary();
    }

    VicePresident(){
        super(null);
    }
}
