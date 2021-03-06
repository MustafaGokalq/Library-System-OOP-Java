public class Member {
    private int id;
    private String name;
    private int bookLimit;
    private int bookOut;
    private int age;
    private String phone;
    private String address;

    public Member(){
        this.id=0;
        this.name = null;
        this.bookLimit = 3;
        this.bookOut = 0;
        this.age = 18;
        this.phone="null";
        this.address = "null";


    }

    public Member(int id , String name, int bookLimit, int bookOut, int age, String phone, String address){
        this.id = id;
        this.name = name;
        this.bookLimit=bookLimit;
        this.bookOut = bookOut;
        this.age=age;
        this.phone=phone;
        this.address=address;
    }
    public boolean barromBook(Book book, int amount){
        if (book.getAvailable() < amount){
            System.out.println("don't have enough on inventory to borrow.");
            return false;
        }else if (this.bookOut >= this.bookLimit){
            System.out.println("Limit of"+ this.bookLimit+ "for member passed");
            return false;
        }else{
            if (amount>(this.bookLimit - this.bookOut)){
                this.bookOut += (this.bookLimit - this.bookOut);
                System.out.println("booked only"+ (this.bookLimit - this.bookOut)+ " books");
                book.decreaseAmount(this.bookLimit - this.bookOut);
                return true;
            }else{
                book.decreaseAmount(this.bookLimit - this.bookOut);
                this.bookOut += amount;
                System.out.println(amount + "of the book"+book.getName()+ "have booked");
                return true;
            }
        }
    }
    public String toString(){
        return "member -id:"+id+"name"+name+"age"+age+"phone"+phone+"address"+address+
                 "bookOut:"+bookOut+"out of"+bookLimit;
    }
    public int getId(){
        return this.id;
    }
}
