import java.util.Scanner;
//Class BirthMonth
//  main()
//      num birthDayMonth = 0
//      output "Please give the number of the month you were born in: "
//      input birthDayMonth
//      if (birthdayMonth > 12 || birthdayMonth < 1)
//          output "You entered an incorrect month value: " + birthDayMonth
//      else
//          output "Your birth month is: " + birthDayMonth
//      endif
//  return
//EndClass
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthDayMonth = 0;
        System.out.println("Please give the number of the month you were born in: ");
        birthDayMonth = in.nextInt();
        if (birthDayMonth > 12 || birthDayMonth < 1) {
            System.out.println("You entered an incorrect month value: " + birthDayMonth);
        } else {
            System.out.println("Your birth month is: " + birthDayMonth);
        }
    }
}
