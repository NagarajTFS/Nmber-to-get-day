public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a no.= ");
        int no=scanner.nextInt();
        switch(no) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("THUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATUERDAY");
			break;
		default:
			System.out.print("INCORRENT");
		}
        

	}
