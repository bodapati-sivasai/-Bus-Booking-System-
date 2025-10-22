package home;
import java.util.*;
import bus.*;
class Register{
	private String user_name="bodapati_sivasai";
	private String password="Sai@123";
	public String getuser(){
		return user_name;
	}
	public String getpassword(){
		return password;
	}
	public void setuser(String user){
		this.user_name=user;
	}
	public void setpassword(String password){
		this.password=password;
	}
}
class Login extends Register{
 // Regular Colors   
    	public static final String BLACK = "\033[0;30m";   // BLACK
    	public static final String RED = "\033[0;31m";     // RED
    	public static final String GREEN = "\033[0;32m";   // GREEN
    	public static final String YELLOW = "\033[0;33m";  // YELLOW
    	public static final String BLUE = "\033[0;34m";    // BLUE
   	public static final String PURPLE = "\033[0;35m";  // PURPLE
    	public static final String CYAN = "\033[0;36m";    // CYAN
    	public static final String WHITE = "\033[0;37m";   // WHITE
	public static final String DARK_GRAY = "\033[38;5;240m";// Dark Gray
	public static final String BROWN = "\033[38;5;94m";// Brown
	public static final String ORANGE = "\033[38;5;208m";// Orange
	public static final String PINK = "\033[38;5;205m";// Pink
	public static final String GOLD = "\033[38;5;178m";// Gold
	public static final String RGB_SILVER = "\033[38;2;192;192;192m";  // Silver

	public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
	public static final String RED_BACKGROUND = "\033[41m";    // RED
    	public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    	public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    	public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    	public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    	public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    	public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    	public static final String RESET = "\033[0m";  // Text Reset

    	public static final String blink = "\u001b[5m";// Blink
	static home obj1=new home();
	static Bus obj2=new Bus();
	static Scanner sc=new Scanner(System.in);
	public static Login obj=new Login();
	static long phoneno=123456789;
	static String user_name="";
	static String password="";
	boolean login(){
		System.out.println(GREEN+"enter user_name"+RESET);
		String user_name=sc.next();
		System.out.println(GREEN+"enter password"+RESET);
		String password=sc.next();
		String old_user_name=obj.getuser();
		String old_password=obj.getpassword();
		if(user_name.equals(old_user_name)  && password.equals(old_password)){
			return true;
		}
		else if(!(user_name.equals(old_user_name))  && password.equals(old_password) ){
			System.out.println(RED+blink+"user_name was wrong!"+RESET);
			System.out.println(BLUE+"enter 1 for re-try \nenter 2  for forget user_name  \nenter 3 and any number for exit"+RESET);
			int a=sc.nextInt();
			if(a==1){
				return login();
			}
			else if(a==2){
				while(true){
					System.out.println(GREEN+"enter your phone_number"+RESET);
					long l=sc.nextLong();
					if(l==phoneno){
						System.out.println(GREEN+"enter 1 for dispaly of user_name\nenter 2 for new user_name"+RESET);
						int b=sc.nextInt();
						if(b==1){
							System.out.println("user_name : "+obj.getuser());
							return login();
						}
						else{
							System.out.println(GREEN+"enter new user_name"+RESET);
							String new_user_name=sc.next();
							obj.setuser(new_user_name);
							return login();
						}
					}
					else{
						System.out.println(RED+blink+"wrong phone number"+RESET);
						System.out.println(BLUE+"enter 1 for re-enter \n2 for exit"+RESET);
						int i=sc.nextInt();
						if(i==2){
							return false;
						}
					}
				}	
				
			}
			else {
				System.exit(0);
			}
		}
		else if(user_name.equals(old_user_name)  && !(password.equals(old_password))){
			System.out.println(RED+blink+"password was wrong!"+RESET);
			System.out.println(BLUE+"enter 1 for re-try \nenter 2  for forget pasword  \nenter 3 and number  for exit"+RESET);
			int a=sc.nextInt();
			if(a==1){
				return login();
			}
			else if(a==2){
				while(true){
					System.out.println(GREEN+"enter your phone_number"+RESET);
					long l=sc.nextLong();
					if(l==phoneno){
						System.out.println(GREEN+"enter 1 for dispaly of password\nenter 2 for new password"+RESET);
						int b=sc.nextInt();
						if(b==1){
							System.out.println("password : "+obj.getpassword());
							return login();
						}
						else{
							System.out.println(GREEN+"enter new password"+RESET);
							obj.setpassword(sc.next());
							return login();
						}
					}
					else{
						System.out.println(RED+blink+"wrong phone number"+RESET);
						System.out.println(BLUE+"enter 1 for re-enter \n2 for exit"+RESET);
						int i=sc.nextInt();
						if(i==2){
							return false;
						}
					}
				}	
				
			}
			else{
				return false;
			}
		}
		else if(!(user_name.equals(old_user_name))  && !(password.equals(old_password))){
			System.out.println(RED+blink+"user_name was wrong!"+RESET);
			System.out.println(RED+blink+"password was wrong!"+RESET);
			System.out.println(BLUE+"enter 1 for re-try \nenter 2  for forget user_name and password  \nenter 3 and any number for exit"+RESET);
			int a=sc.nextInt();
			if(a==1){
				return login();
			}
			else if(a==2){
				while(true){
					System.out.println(GREEN+"enter your phone_number"+RESET);
					long l=sc.nextLong();
					if(l==phoneno){
						System.out.println(GREEN+"enter 1 for dispaly of user_name & password\nenter 2 for new user_name & password"+RESET);
						int b=sc.nextInt();
						if(b==1){
							System.out.println("user_name : "+obj.getuser());
							System.out.println("password : "+obj.getpassword());
							return login();
						}
						else{
							System.out.println(GREEN+"enter new user_name"+RESET);
							String new_user_name=sc.next();
							obj.setuser(new_user_name);
							System.out.println(GREEN+"enter new password"+RESET);
							obj.setpassword(sc.next());
							return login();
							//break;
						}
					}
					else{
						System.out.println(RED+blink+"wrong phone number!"+RESET);
						System.out.println(BLUE+"enter 1 for re-enter \n2 for exit"+RESET);
						int i=sc.nextInt();
						if(i==2){
							return false;
						}
					}
				}	
				
			}
			else {
				return false;
			}
		}
		return false;
	}




	void sign_up(){
		System.out.println(CYAN+"username must be more than 8 character \nfirst letter must be captial letter");
		System.out.println("first letter must not be a number\nusername must contain one underscore\nThe username must not contains spaces .\n"+RESET);
		System.out.println(GREEN+"enter the user_name "+RESET);
		if(!(userNameChecker())){
			return;
		}
		System.out.println(CYAN+"password must contains one capital letter\npassword must contains one small letter ");
		System.out.println("password must contains one special character\npassword must contains one digit ");
		System.out.println("password must not contains spaces\nfirst letter of the password must not be a digit\n"+RESET);
		System.out.println(GREEN+"enter the password"+RESET);
		if(!(passwordChecker())){
			return;	
		}
		while(true){
			try{
				System.out.println(GREEN+"enter phone number"+RESET);
				long number=sc.nextLong();
				if(numberChecker(number)){
					phoneno=number;
					System.out.println(GREEN+blink+"registion successfull "+RESET);
					System.out.println(BLUE+"enter 1 for login\nenter 2 for signup \nenter 3 and any number for exit"+RESET);
					int a=sc.nextInt();
					if(a==1){
						if(login()){
							obj.home();
							break;
						}	
					}
					else if(a==2){
						sign_up();
					}
					else{
						System.exit(0);
					}
				}
				else{
					System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
					int noi=sc.nextInt();
					if(noi==1){
						continue;
					}
					else{
						System.exit(0);
					}
				}
			}
			catch(InputMismatchException e){
				sc.next();
				System.out.println(RED+blink+"your enter is not a mobile number.\n"+RESET);
				System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
				int i1=sc.nextInt();
				if(i1!=1){
					System.exit(0);
				}
			}
		}	
	}



	boolean userNameChecker(){
		Scanner sc1=new Scanner(System.in);
		while(true){
			String user=sc1.nextLine();
			//sc.next();
			int len=user.length();
			if(len<8){
				System.out.println(RED+blink+"user must be greater than 8 digits."+RESET);
				System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
				int i2=sc.nextInt();
				sc.nextLine();
				if(i2==1){
					System.out.println(GREEN+"enter user_name"+RESET);
				}
				else{
					return false;
				}
			}
			else {
				if(user.charAt(0)<='A' || user.charAt(0)>='Z'){
					System.out.println(RED+blink+"The first letter of the username should be capital letter!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
					int i2=sc.nextInt();
					sc.nextLine();
					if(i2==1){
						System.out.println(GREEN+"enter user_name"+RESET);
					}
					else{
						return false;
					}
				}
				else if(user.charAt(0)>='0' && user.charAt(0)<='9'){
					System.out.println(RED+blink+"The first letter of the username not be should be number! "+RESET);
					System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
					int i2=sc.nextInt();
					sc.nextLine();
					if(i2==1){
						System.out.println(GREEN+"enter user_name"+RESET);
					}
					else{
						return false;
					}
				}
				else{
					int count=0;
					for(int i=0;i<len;i++){
						if(user.charAt(i)=='_'){
							count++;
						}
						else if(user.charAt(i)==' '){
							count=-1;
							break;
						}
					}
					if(count==0){
						System.out.println(RED+blink+"The username must contain one underscore! "+RESET);
						System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
						int i2=sc.nextInt();
						sc.nextLine();
						if(i2==1){
							System.out.println(GREEN+"enter user_name"+RESET);
						}
						else{
							return false;
						}
					}
					else if(count==-1){
						System.out.println(RED+blink+"The username must not contains spaces! "+RESET);
						System.out.println(BLUE+"enter 1 for re-enter\nenter 2 for exit"+RESET);
						int i2=sc.nextInt();
						sc.nextLine();
						if(i2==1){
							System.out.println(GREEN+"enter user_name"+RESET);
						}
						else{
							return false;
						}
					}
					else{	
						obj.setuser(user);
						return true;
					}
				}
			}
		}
		
	}



	boolean passwordChecker(){
		Scanner sc1=new Scanner(System.in);
		while(true){
			String password=sc1.nextLine();
			int len=password.length();
			if(len<8){
				System.out.println(RED+blink+"password contains less than 8 characters "+RESET);
				System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
				int i=sc.nextInt();
				sc.nextLine();
				if(i==1){
					System.out.println(GREEN+"enter password"+RESET);	
				}
				else{
					return false;
				}
			}
			else{
				boolean boolc=false,booln=false,bools=false,boolsp=false,boolspace=false,boolx=false;
				if(password.charAt(0)=='0' && password .charAt(0)<='9'){
					System.out.println(RED+blink+"the first letter of the password must not be a digit"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else{
				for(int i=0;i<len;i++){
					char ch=password.charAt(i);
					//System.out.println("1--- "+password);
					if(ch>='A' && ch<='Z'){
						boolc=true;
					}
					else if(ch>='0' && ch<='9'){
						booln=true;
					}
					else if(ch>='a' && ch<='z'){
						bools=true;
					}
					else if((ch>=33 && ch<=47) || (ch>=58 && ch<=64) ||(ch>=91 && ch<=96)||(ch>=123 && ch<=126) ){
						boolsp=true;
					}
					else if(ch==' '){
						boolspace=true;
					}
					else {
						boolx=true;
					}
				}
				if(boolc && booln && bools && boolsp && !boolspace &&!boolx){
					obj.setpassword(password);
					return true;
				}
				else if(boolspace){
					System.out.println(RED+blink+"password must not contain spaces!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else if(boolx){
					System.out.println(RED+blink+"password must only contain special chacters!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else if(!boolc){
					System.out.println(RED+blink+"password must contains atleast one capital letter!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else if(!booln){
					System.out.println(RED+blink+"password must contains atleat one digit!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else if(!bools){
					System.out.println(RED+blink+"password must contains atleast one small leter!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
				else if(!boolsp){
					System.out.println(RED+blink+"password must contain atleat one special chacters!"+RESET);
					System.out.println(BLUE+"enter 1 for re-enter \nenter 2 for exit"+RESET);
					int i=sc.nextInt();
					sc.nextLine();
					if(i==1){
						System.out.println(GREEN+"enter password"+RESET);	
					}
					else{
						return false;
					
					}
				}
			}
			}
		}
		
	}





	boolean numberChecker(long number){
		String nums=""+number;
		if(nums.length()!=10){
			if(nums.length()<10){
				System.out.println(RED+blink+"your enter number has only "+nums.length()+" digits the phone number contains 10 digits."+RESET);
			}
			else{
				System.out.println(RED+blink+"your enter number has more than "+nums.length()+" digits the phone number contains 10 digits."+RESET);
			}
			return false;
		}
		else{
			if(nums.charAt(0)>='6'){
				return true;
			}
			else{
				System.out.println(RED+blink+"your enter in not a mobile number the number contain starting number less than 6 "+RESET);
				return false;
			}
		}
	}





	public void home(){
		System.out.println(YELLOW+"\n--- Home Menu ---");
            	System.out.println(" enter 1 for search for bus routes");
          	System.out.println(" enter 2 for bus seat booking");
     		System.out.println(" enter 3 to view your bookings");
     		System.out.println(" enter 4 to cancel a booking");
            	System.out.println(" enter 5 for help");
            	System.out.println(" enter 6 any number to exit"+RESET);
		System.out.println(GREEN+"\nenter your choice"+RESET);
		int ch = sc.nextInt();
		if(ch==1){
			obj2.route();
			obj1.home();
			
		}
		else if(ch==2){
			obj2.seat();
		}
		else if(ch==3){
			obj2.displaybooking(); 
			obj1.home();
		}
		else if(ch==4){
			obj2.cancelBooking();
		}
		else if(ch==5){
			help();
			obj1.home();
		}
		else {
			home.main(null);
		}
	}
	void help(){
		System.out.println(BLUE+"customer care1 : 12355667");
		System.out.println("customer care2 : 12355665");
		System.out.println("customer care3 : 12355666");
		System.out.println("customer care4 : 12355668");
		System.out.println("customer care5 : nonumber"+RESET);
	}	
}
public class home extends Login{
	static Scanner sc=new Scanner(System.in);
	static{
		System.out.println(RED+"               ------------welcome to manaBus app------------"+RESET);
	}
	public static void main(String[] args){
		System.out.println(GREEN+"    1 for login                2 for sign up      3 and any number for exit"+RESET);
		int enter=sc.nextInt();
		if(enter==1){
			if(obj1.login()){
				obj1.home();
			}
		}
		else if(enter ==2){
			obj1.sign_up();
		}	
		else{
			System.exit(0) ;
		}
	}
}







