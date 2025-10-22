package bus;
import home.*;
import java.util.*;
public class Bus{
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

    	public static final String RESET = "\033[0m";  // Text Reset

    	public static final String blink = "\u001b[6m";// Blink

	public static Scanner sc=new Scanner(System.in);
	static Bus obj1=new Bus();
	static home home=new home();
	static int count=0;
	static int bedno=0;
	static long pay=0;
	public static int mainroute=0;
	static int[][][] seats=new int[7][5][4];

	static {
		seats[1][0][0]=0;
		seats[1][0][1]=1;
		seats[1][0][2]=0;
		seats[1][0][3]=0;
		seats[1][1][0]=0;
		seats[1][1][1]=2;
		seats[1][1][2]=0;
		seats[1][1][3]=1;
		seats[1][2][0]=1;
		seats[1][2][1]=0;
		seats[1][2][2]=0;
		seats[1][2][3]=2;
		seats[1][3][0]=1;
		seats[1][3][1]=0;
		seats[1][3][2]=0;
		seats[1][3][3]=0;
		seats[1][4][0]=1;
		seats[1][4][1]=0;
		seats[1][4][2]=2;
		seats[1][4][3]=2;

		seats[2][0][0]=0;
		seats[2][0][1]=1;
		seats[2][0][2]=0;
		seats[2][0][3]=0;
		seats[2][1][0]=0;
		seats[2][1][1]=2;
		seats[2][1][2]=0;
		seats[2][1][3]=1;
		seats[2][2][0]=1;
		seats[2][2][1]=0;
		seats[2][2][2]=0;
		seats[2][2][3]=2;
		seats[2][3][0]=1;
		seats[2][3][1]=0;
		seats[2][3][2]=0;
		seats[2][3][3]=0;
		seats[2][4][0]=1;
		seats[2][4][1]=0;
		seats[2][4][2]=2;
		seats[2][4][3]=2;

		seats[3][0][0]=0;
		seats[3][0][1]=1;
		seats[3][0][2]=0;
		seats[3][0][3]=0;
		seats[3][1][0]=0;
		seats[3][1][1]=2;
		seats[3][1][2]=0;
		seats[3][1][3]=1;
		seats[3][2][0]=1;
		seats[3][2][1]=0;
		seats[3][2][2]=0;
		seats[3][2][3]=2;
		seats[3][3][0]=1;
		seats[3][3][1]=0;
		seats[3][3][2]=0;
		seats[3][3][3]=0;
		seats[3][4][0]=1;
		seats[3][4][1]=0;
		seats[3][4][2]=2;
		seats[3][4][3]=2;

		seats[4][0][0]=0;
		seats[4][0][1]=1;
		seats[4][0][2]=0;
		seats[4][0][3]=0;
		seats[4][1][0]=0;
		seats[4][1][1]=2;
		seats[4][1][2]=0;
		seats[4][1][3]=1;
		seats[4][2][0]=1;
		seats[4][2][1]=0;
		seats[4][2][2]=0;
		seats[4][2][3]=2;
		seats[4][3][0]=1;
		seats[4][3][1]=0;
		seats[4][3][2]=0;
		seats[4][3][3]=0;
		seats[4][4][0]=1;
		seats[4][4][1]=0;
		seats[4][4][2]=2;
		seats[4][4][3]=2;
	
		seats[5][0][0]=0;
		seats[5][0][1]=1;
		seats[5][0][2]=0;
		seats[5][0][3]=0;
		seats[5][1][0]=0;
		seats[5][1][1]=2;
		seats[5][1][2]=0;
		seats[5][1][3]=1;
		seats[5][2][0]=1;
		seats[5][2][1]=0;
		seats[5][2][2]=0;
		seats[5][2][3]=2;
		seats[5][3][0]=1;
		seats[5][3][1]=0;
		seats[5][3][2]=0;
		seats[5][3][3]=0;
		seats[5][4][0]=1;
		seats[5][4][1]=0;
		seats[5][4][2]=2;
		seats[5][4][3]=2;
	
		seats[6][0][0]=0;
		seats[6][0][1]=1;
		seats[6][0][2]=0;
		seats[6][0][3]=0;
		seats[6][1][0]=0;
		seats[6][1][1]=2;
		seats[6][1][2]=0;
		seats[6][1][3]=1;
		seats[6][2][0]=1;
		seats[6][2][1]=0;
		seats[6][2][2]=0;
		seats[6][2][3]=2;
		seats[6][3][0]=1;
		seats[6][3][1]=0;
		seats[6][3][2]=0;
		seats[6][3][3]=0;
		seats[6][4][0]=1;
		seats[6][4][1]=0;
		seats[6][4][2]=2;
		seats[6][4][3]=2;
	}
	public void route(){
		System.out.println( PURPLE+"enter 1 for hyberbad to vizag");
		System.out.println("enter 2 for vizag to  hyberbad");
		System.out.println("enter 3 for hyberbad to tirupati");
		System.out.println("enter 4 for tirupati to hyberbad");
		System.out.println("enter 5 for hyberbad to bengulru");
		System.out.println("enter 6 for bengulru to hyberbad"+RESET);
	}




	public void seat(){
		System.out.println(GREEN+"enter route"+RESET);
		int route=sc.nextInt();
		if(route<=6){
			display(seats,route);
		}
		else{
			System.out.println(RED+blink+"enter wrong route!"+RESET);
			home.home();
			return;
		}
		System.out.println(GREEN+"enter 1 for male and 2 for female"+RESET);
	    	int gen=sc.nextInt();
		if(gen!=1 && gen!=2){
			System.out.println(RED+blink+"wrong gender!"+RESET);
			home.home();
			return;
		}
		while(true){
    			System.out.println(GREEN+"enter seat number:"+RESET);
    			int seatno=sc.nextInt();
			if(seatno<1 || seatno>20){
				System.out.println(RED+blink+"wrong seatno!"+RESET);
				home.home();
				break;
			}
    			int count=0;
    			int a=0;
    			int b=0;
            		for(int i=0;i<5;i++){
    				for(int j=0;j<4;j++){
    				    count++;
    				    if(count==seatno){
    			        
    				        a=i;
    				        b=j;
    				        //System.out.println(a+" "+b);
    				    }
    				}
        	    	}
            		if(seats[route][a][b]==1 || seats[route][a][b]==2){
                		System.out.println(RED+blink+"seat already booked\n"+RESET);
                		System.out.println(BLUE+"enter 1 for re-booking \n2 and any number for exit"+RESET);
                		int i=sc.nextInt();
          		      	if(i==1){
                		    continue;
                		}
                		else{
                			   home.home();
					   break;
                		}
            		}
           		else if(gen==1){
                		if(b==0){
                			if(seats[route][a][b+1]== 2){
                				System.out.println(RED+"pink seats  reserved for ladies\n"+RESET);
                        			System.out.println(BLUE+"enter 1 for re-booking \n2 and any number for exit"+RESET);
                        			int i=sc.nextInt();
                        			if(i==1){
                        			    continue;
                        			}
                       				else{
                			   		home.home();
					   		break;
                     				}
                    			}
					else{
						System.out.println(BLUE+"enter 1 for payment \nenter 2 and any number for exit"+RESET);
						int ip=sc.nextInt();
						if(ip==1){
							if(!payment(route)){
								home.home();
								break;
							}
                					seats[route][a][b]=1;
                					display(seats,route);
							bedno=seatno;
							booking(route,pay);
							break;
						}
						else{
							home.home();
							break;
						}
                    			}
                		}
                		else if(b==3){
                    			if(seats[route][a][b-1]==2){
                        			System.out.println(RED+blink+"pink seats reserved for ladies\n"+RESET);
                        			System.out.println(BLUE+"enter 1 for re-booking \n2 and any number for exit"+RESET);
                        			int i=sc.nextInt();
                       				if(i==1){
                       				     continue;
                       				}
                        			else{
                       					home.home();
							break;
                       				}
                    			}
					else{
						System.out.println(BLUE+"enter 1 for payement \nenter 2 and any number for exit"+RESET);
						int ip=sc.nextInt();
						if(ip==1){
							if(!payment(route)){
								home.home();
								break;
							}
                					seats[route][a][b]=1;
                					display(seats,route);
							bedno=seatno;
							booking(route,pay);
							break;
						}
						else{
							home.home();
							break;
						}
                    			}
                		}
                		else{
                			if(seats[route][a][b+1]==2 || seats[route][a][b-1]==2){
                        			System.out.println(RED+blink+"pink seat reserved for ladies\n"+RESET);
                        			System.out.println(BLUE+"enter 1 for re-booking \n2 and any number for exit"+RESET);
                        			int i=sc.nextInt();
                        			if(i==1){
                        			    	continue;
                        			}
                        			else{
                        				home.home();
							break;
                        			}
                    			}
                    			else{
						System.out.println(BLUE+"enter 1 for payement \nenter 2 and any number for exit"+RESET);
						int ip=sc.nextInt();
						if(ip==1){
							if(!payment(route)){
								home.home();
								break;
							}
                					seats[route][a][b]=1;
                					display(seats,route);
							bedno=seatno;
							booking(route,pay);
							break;
						}
						else{
							home.home();
							break;
						}
                    			}
                		}
            		}
            		else{
				System.out.println(BLUE+"enter 1 for payement \nenter 2 and any number for exit"+RESET);
				int ip=sc.nextInt();
				if(ip==1){
					
					if(!payment(route)){
						home.home();
						break;
					}
                			seats[route][a][b]=2;
                			display(seats,route);
					bedno=seatno;
					booking(route,pay);
					break;
				}
				else{
					home.home();
					break;
				}
		       	}
     		}
		return;
	}



	public static void display(int[][][] seats,int route){
        	int count=0;
	        for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				count++;
				String formattedCount = String.format("%2d", count); 
                		if (seats[route][i][j] == 1) {
            				System.out.print("\u001B[41;97m " + formattedCount + " \u001B[0m"+" " );
            			} 
               			else if (seats[route][i][j] == 0) {
               			 	System.out.print("\u001B[42;30m " + formattedCount + " \u001B[0m"+" " );
                		} 
                		else if (seats[route][i][j] == 2) {
                			System.out.print("\u001B[48;5;125m\u001B[97m " + formattedCount + " \u001B[0m"+" " );
                		}
				if(j==1){
					System.out.print(" | ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.print("\u001B[41;97m  "+RESET+" This seat are for booking  " );
		System.out.print("\u001B[42;30m  "+RESET+" This seat are booked  ");
		System.out.println("\u001B[48;5;125m\u001B[97m  "+RESET+" This seat are booked by ladies, males can book beside seat");
	}


	public boolean payment(int a){
		int pin=1234;
		if(a==1 || a==2){
			pay=599;
		}
		else if(a==3 || a==4){
			pay=699;
		}
		else if(a==5 || a==6){
				pay=799;
		}
		float gst=pay*0.1f;
		int pt=24;
		System.out.println("------------------------------");
		System.out.println(PINK+"your cost of seat is : "+pay);
		System.out.println("GST : "+gst);
		System.out.println("Platform charges : "+pt+RESET);
		System.out.println("------------------------------");
		System.out.println(PINK+"Total money : "+(pay+gst+pt)+RESET);
		System.out.println("------------------------------");
		System.out.println(BLUE+"enter 1 for continue\nenter 2 and any number for exit "+RESET);
		int con=sc.nextInt();
		if(con!=1){
			return false;
		}
		while(true){
			System.out.println(GREEN+"enter enter pin"+RESET);
			int i=sc.nextInt();
			if(i==pin){
				System.out.println(GREEN+blink+"payment successfull\n"+RESET);
				return true;
			}
			else{
				System.out.println(RED+blink+"wrong pin!"+RESET);
				System.out.println(BLUE+"enter 1 for re-enter pin");
				System.out.println("enter 2 and any number for exit"+RESET);
				int b=sc.nextInt();
				if(b==1){
					continue;
				}
				else{
					return false;
				}
			}
		}
	}
	passenger[] pass=new passenger[8];
	public void booking(int a,long pay){
		String route="";
		String bus_no="";
		if(a==1){
			route="Hyderbad to Vizag";
			bus_no="TS 01 ZA 2342";
		}
		else if(a==2){
			route="Vizag to Hyderbad";
			bus_no="Ap 02 Tx 1212";
		}
		else if(a==3){
			route="Hyderbad to Tirupati";
			bus_no="TS 05 GH 5333";
		}
		else if(a==4){
			route="Tirupati to Hyderbad";
			bus_no="Ap 44 HF 9443";
		}
		else if(a==5){
			route="Hyderbad to Bengulru";
			bus_no="TS 07 HR 3453";
		}
		else if(a==6){
			route="Bengulru to Hyderbad";
			bus_no="AP 02 TD 4674";
		}
		if(count<8){
			pass[count++]=new passenger(count,route,pay,bedno,a,bus_no);
			System.out.println(GREEN+blink+"booking successfull"+RESET);
			home.home();
		}
		else{
			System.out.println(RED+blink+"booking over!"+RESET);
		}
	}
	public void displaybooking(){
		System.out.println(ORANGE+"\nAll Booking"+RESET);
		System.out.println("--------------------------------------\n");
		for(int i=0;i<count;i++){
			pass[i].display();
			System.out.println();
		}
		System.out.println("--------------------------------------");
		home.home();
		return;
	}
	public void cancelBooking(){
		System.out.println(GREEN+"enter booking  Id : "+RESET);
		int a=sc.nextInt();
		boolean b=false;
		int route=0;
		int seat=0;
		for(int i=0;i<count;i++){
			if(pass[i].bookId==a){
				b=true;
				route=pass[i].routeId;
				seat=pass[i].seatno;
				for(int j=i;j<count-1;j++){
					pass[j]=pass[j+1];
				}
			}
			pass[count-1]=null;
			count--;
			System.out.println(RED+blink+"Booking cancelled of Id : "+a+RESET);
			int count1=0;
    			int a1=0;
    			int b1=0;
            		for(int j=0;j<5;j++){
    				for(int k=0;k<4;k++){
    				    count1++;
    				    if(count1==seat){
    			        
    				        a1=j;
    				        b1=k;
    				        //System.out.println(a+" "+b);
    				    }
    				}
        	    	}
			seats[route][a1][b1]=0;
		}
		if(!b){
			System.out.println(RED+blink+"no booking is there for the id : "+a+RESET);
		}
		home.home();
	}

}
class passenger extends Bus{
	String route;
	double pay;
	int seatno;
	int bookId;
	int routeId;
	String bus_no;
	passenger(int bookId,String route,double pay,int seatno,int routeId,String bus_no){
		this.bookId=Bus.count;
		this.route=route;
		this.pay=pay;
		this.seatno=seatno;
		this.routeId=routeId;
		this.bus_no=bus_no;
	}
	void display(){
		System.out.println(DARK_GRAY+"Booking Id : "+bookId);
		System.out.println("vechicle Number : "+bus_no);
		System.out.println("seat_no : "+seatno);
		System.out.println("Route : "+route);
		System.out.println("pay : "+pay+RESET);
	}
}

