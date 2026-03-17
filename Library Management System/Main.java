public class Main{
   public static void main(String args[]){
     //Book b1=new Book("Civics","usama",Type.HISTORY,true);
     //System.out.println(b1);


     //Shelf s1=new Shelf("Shelf 1");
     //Book b =s1.findbook("Book 4");
     //System.out.println(b);

     Section s2=new Section("Section 1",2,5);
     //System.out.println(s2);
     Book b2 =s2.findbook(2,4,"Book 1");
     System.out.println(b2);
    }
}