package miniproject;

public class emailmain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    email emp1=new email("Smita","Senapati");
   emp1.setalternateEmail("aditi.dutta@gmail.com");
    System.out.println(emp1.getalternateEmail());
    
    emp1.changePassword("165grsgh!@#");
    System.out.println(emp1.getPassword());
   
    System.out.println( emp1.showdetails());

}
}
