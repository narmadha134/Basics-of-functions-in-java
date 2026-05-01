import java.util.Scanner;
class expensive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expense Name: ");
        String name = sc.nextLine();  
        expenser_track x = new expenser_track();
        x.expenser(sc, name);
    }
}
class expenser_track {
    void expenser(Scanner sc, String name) {
        int a;
        int total = 0;
        do {
            System.out.println("Enter expense amount: ");
            a = sc.nextInt();
            total = total + a;
        } while (a != 0);
        System.out.println(name + " Total Expenses: " + total);
    }
}