
import java.util.Scanner;

class emailapp {
    private String name;
    private String surname;
    private String password;
    private String mailboxCapacity;
    private String department;
    private String alternate_email;

    public emailapp(String naame, String surnaame) {
        this.name = naame;
        this.surname = surnaame;

        System.out.println("Lets Begin, Input your phone number");
        Scanner sc = new Scanner(System.in);
        String phonenum = sc.nextLine();
        System.out.println("Enter the OTP send to your respective phone number");
        int otp = sc.nextInt();
        System.out.println("which EMAIL will you like to choose ?? ");
        System.out.println("1)Email Created :-" + this.name + "" + this.surname + "@gmail.com");
        System.out.println("2)Email Created :-" + this.surname + "" + this.name + "@gmail.com");
        System.out.println("3)Email Created :-" + "123" + this.surname + "" + this.name + "@gmail.com");
        System.out.println("4)Email Created :-" + this.surname + "" + this.name + "77@gmail.com");
        int choose = sc.nextInt();

        switch (choose) {
            case 1: {
                System.out.println("Email Created :-" + this.name + "" + this.surname + "@gmail.com");
            }
                break;
            case 2: {
                System.out.println("Email Created :-" + this.surname + "" + this.name + "@gmail.com");
            }
                break;
            case 3: {
                System.out.println("3)Email Created :-" + "123" + this.surname + "" + this.name + "@gmail.com");
            }
                break;
            case 4: {
                System.out.println("4)Email Created :-" + this.surname + "" + this.name + "77@gmail.com");
            }
                break;
            default:
                System.out.println("No more username availabe do you want to proceed with one of it");
                System.out.println("1)Yes \n2)No");
                int value = sc.nextInt();
                if (value == 1) {
                    System.out.println("Select email again");
                    System.out.println("which EMAIL will you like to choose ?? ");
                    System.out.println("1)Email Created :-" + this.name + "" + this.surname + "@gmail.com");
                    System.out.println("2)Email Created :-" + this.surname + "" + this.name + "@gmail.com");
                    System.out.println("3)Email Created :-" + "123" + this.surname + "" + this.name + "@gmail.com");
                    System.out.println("4)Email Created :-" + this.surname + "" + this.name + "77@gmail.com");
                    int choosee = sc.nextInt();

                    switch (choosee) {
                        case 1: {
                            System.out.println("Email Created :-" + this.name + "" + this.surname + "@gmail.com");
                        }
                            break;
                        case 2: {
                            System.out.println("Email Created :-" + this.surname + "" + this.name + "@gmail.com");
                        }
                            break;
                        case 3: {
                            System.out.println(
                                    "3)Email Created :-" + "123" + this.surname + "" + this.name + "@gmail.com");
                        }
                            break;
                        case 4: {
                            System.out.println("4)Email Created :-" + this.surname + "" + this.name + "77@gmail.com");
                        }
                            break;
                        default:
                            System.out.println(" ");
                    }
                } else {
                    System.out.println("Try with different name later");
                    System.exit(0);
                }

        }

        System.out.print("Your Email generation is in process...");

        this.department = setDepartment(); // we call a method in the constructor
        System.out.println(this.department);
        this.password = GenratePassword();
        System.out.println("GMAIL is created\nThank You!!");

    }

    private String setDepartment() { // method
        System.out.println("To ensure safety setup alternate email \n1)Yes \n2)No");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        if (value == 1) {
            System.out.println("Enter an alternate email");
            String name = sc.nextLine(); // Now it will correctly take input for 'name'
            System.out.println("Alternate email is setup: " + name);
        } else {
            System.out.println("Let's proceed further");
        }

        return "......";

    }

    private String GenratePassword() {
        System.out.println("Generate a strong password for your Email-ID");
        System.out.println("Use uppercase, lowercase, numbers, and special characters, with sufficient length");
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        System.out.println("Strong one ");

        return pass;

    }

}

public class Email {
    public static void main(String[] args) {
        System.out.println("Welcome, Lets Create A Gmail Account On JAVA");
        emailapp v2 = new emailapp("Puspa", "Raj");
    }
}