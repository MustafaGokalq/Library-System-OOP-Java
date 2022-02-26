public class Book {
    private int ID;
    private String name;
    private int Inventory;
    private int year;
    private int available;

    public Book(){
        this.ID = 0;
        this.name="Default";
        this.Inventory= 10;
        this.available=this.Inventory;
        this.year=2020;
    }
    public Book(int ID , String name, int Inventory, int year, int available){
        this.name=name;
        this.Inventory=Inventory;
        this.year=year;
        this.available=available;

    }

    public Book(String name){
        this.ID = 0;
        this.name=name;
        this.Inventory = 10;
        this.year=2020;
        this.available=Inventory;

    }

    public int getAvailable() {
        return this.available;
    }

    void decreaseAmount(int amount){
        try {
            this.available = this.available - amount;
        }catch (Exception e){

        }
    }
    public String toString(){
        return "Book - ID: "+ID+",name: "+name+", avaliable: "+available+" out of "+Inventory+",year: "+year;
    }

    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
}
