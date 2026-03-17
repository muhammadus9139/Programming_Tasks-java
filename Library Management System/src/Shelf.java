public class Shelf{
       private String shelfname;
       private Book[] books;
       

       Shelf(String shelfname,int n){
         String[]aut={"usama","ali","muhammad","hasan"};
         this.shelfname=shelfname;
         books=new Book[n];
          for(int i=0;i<books.length;i++){

        Type type;
           if(i==books.length-1){
               type=Type.FICTION;
           }
 
          else if(i==books.length-2){
               type=Type.SCIENCE;
           }

         else if(i==books.length-3){
               type=Type.HISTORY;
           }

           else if(i==books.length-4){
               type=Type.LITERATURE;
           }

             else if(i==books.length-5){
               type=Type.ART;
           }

          else if(i==books.length-6){
               type=Type.TECHNOLOGY;
           }

           else{
              type=Type.OTHERS;
           }
          
             books[i]=new Book("Book "+(i+1),aut[i % aut.length],type,true);
          }
       }


       Shelf(String shelfname){
         this(shelfname,6);
         
       }


      public String getshelfname(){
          return shelfname;
      }

      public Book[] getbook(){
       return books;
     }
 

      public String toString(){
         StringBuilder str=new StringBuilder();
         str.append(shelfname+"\n");
         for(int i=0;i<books.length;i++){
         str.append(books[i].toString());
        str.append("\n");
       }
          return str.toString();
      }

     
      public Book findbook(String title){
          for(int i=0;i<books.length;i++){
             if(books[i]!=null && books[i].gettitle().equals(title)){
               return books[i];
            }
         }
           return null;
      }

}