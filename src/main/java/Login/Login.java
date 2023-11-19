package Login;

/// UPDATED 19 NOV 3:13AM


import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import Staff.StaffMain;
import Student.StudentMain;

public class Login {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String userID = null;
		String password;
		
		System.out.println(" ____   ____ _   _  ___   ___  _        ____    _    __  __ ____    ______   ______ _____ _____ __  __ \r\n"
				+ "/ ___| / ___| | | |/ _ \\ / _ \\| |      / ___|  / \\  |  \\/  |  _ \\  / ___\\ \\ / / ___|_   _| ____|  \\/  |\r\n"
				+ "\\___ \\| |   | |_| | | | | | | | |     | |     / _ \\ | |\\/| | |_) | \\___ \\\\ V /\\___ \\ | | |  _| | |\\/| |\r\n"
				+ " ___) | |___|  _  | |_| | |_| | |___  | |___ / ___ \\| |  | |  __/   ___) || |  ___) || | | |___| |  | |\r\n"
				+ "|____/ \\____|_| |_|\\___/ \\___/|_____|  \\____/_/   \\_\\_|  |_|_|     |____/ |_| |____/ |_| |_____|_|  |_|");
		//System.out.println("Initialising Database!");
		Database.initializeDatabase();
		//System.out.println("Initialising Complete!");

		
		boolean loginValid = false;
		while (!loginValid) {
			System.out.println();
			System.out.println("================================================");
			System.out.println("Login");
			System.out.print("Enter USERID: ");
			userID = scanner.nextLine();
			System.out.print("Enter password: ");
			password = scanner.nextLine();
			System.out.println("================================================");
			loginValid = loginCheck(userID, password);
		}

		List<String> user = Database.getUser(userID);
		User curUser = new User(user.get(0), user.get(2), user.get(3), user.get(4), user.get(5));

		int loginChoice = 2;

		while (loginChoice != 0) {
			
			
			System.out.println();
			System.out.println("\n#################################################");
			System.out.println("0. Log Out");
			System.out.println("1. Change Password");
			System.out.println("2. Go to Main Menu");
			System.out.println("#################################################");
			System.out.print("\nENTER YOU CHOICE: ");
			loginChoice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch(loginChoice) {
			case 0:
				System.out.println("LOGGING OUT. HAVE A GREAT DAY!!!");
				break;
			case 1:
				Database.changePassword(curUser.getUserID());
				break;
			case 2:
				if (curUser.getUserType().equalsIgnoreCase("t")){
					StaffMain.createStaff(curUser.getUserID(), curUser.getName(), curUser.getEmail(), curUser.getFaculty(), curUser.getUserType());
					StaffMain.main(new String[] {});
				}
				
				else if (curUser.getUserType().equalsIgnoreCase("s")){
					StudentMain.createStudent(curUser.getUserID(), curUser.getName(), curUser.getEmail(), curUser.getFaculty(), curUser.getUserType());
					StudentMain.main(new String[] {});
				}
				else {
					System.out.println("You do have the relevant rights. Contact support!");
				}
				break;
					
			default:
				System.out.println("Invalid choice.");
			}
			
		}

		scanner.close();
	}

	public static boolean loginCheck(String userID, String password) throws IOException {
		if (!Database.checkUserID(userID)) {
			System.out.println("Invalid UserID!");
			return false;
		}
		else {
			if (!Database.checkPassword(userID, password)) {
				System.out.println("Wrong Password. Try again");
				return false;
			}
			else {

				System.out.println("You have successfully logged in " + userID + "!!");
				return true;
			}
		}
	}
}
