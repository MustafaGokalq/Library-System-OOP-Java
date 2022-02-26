import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static App app = new App();

    public static void main(String[] args) {
        try {
            boolean run = true;
            int choice;
            do {
                System.out.println("**********************");
                System.out.println("enter number for task");
                System.out.println("Library System menu \n");
                System.out.println("1.) find member by id \n");
                System.out.println("2.) find book by id \n");
                System.out.println("3.) find supplier by id \n");
                System.out.println("4.) borrow book \n");
                System.out.println("5.) purchase book\n");
                System.out.println("6.) show all member\n");
                System.out.println("7.) show all book\n");
                System.out.println("8.) show all supplier\n");
                System.out.println("0.) exit\n");
                System.out.println("***********************");

                System.out.println("Choice: ");
                choice = scan.nextInt();

                switch (choice){
                    case 1: {
                        System.out.println(App.getMember());
                        break;

                    }
                    case 2:{
                        System.out.println(App.getBook());
                        break;
                    }
                    case 3:{
                        System.out.println(App.getSupplier());
                        break;
                    }
                    case 4:{
                        System.out.println(App.createNewBorrow());
                        break;
                    }
                    case 5:{
                        System.out.println(App.purchaseBook());
                        break;
                    }
                    case 6:{
                        App.showMembers();
                        break;
                    }
                    case 7:{
                        App.showBooks();
                        break;
                    }
                    case 8:{
                        App.showSuppliers();
                        break;
                    }
                    case 0:{
                        run =false;
                        break;
                    }
                    default:
                        break;
                }
            }while (run);
            System.out.println("Good bye : ");
        }catch (
                Exception e){
            System.out.println(e);
        }finally {
            scan.close();
        }



    }
}
