//Excepting Handling in Java
public class MyExceptional {
	public static void main (String[] args){
		try{
			int a[] = new int[2];
			System,out.println(a[5]);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("If you want to customize your error message!");
		}
	}
}