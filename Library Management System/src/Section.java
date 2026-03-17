public class Section{
     private String sectionname;
     private Shelf[][] shelfs;
 

      //fixed number of rows and cols
     Section(String sectionname,int row,int col){
        this.sectionname=sectionname;
        shelfs=new Shelf[row][col];

         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              String name=String.format("%d-%03d",i+1,j+1);
             shelfs[i][j]=new Shelf(name);
            }
         } 
     }

    Section(String sectionname){
       this(sectionname,2,3);
    }


    public String toString(){
         StringBuilder str=new StringBuilder();
         str.append(sectionname+"\n");
         for(int i=0;i<shelfs.length;i++){
           for(int j=0;j<shelfs[i].length;j++)
         str.append(shelfs[i][j].toString());
        str.append("\n");
       }
          return str.toString();
      }
   

    public Book findbook(int r, int c, String title) {
      int row = r - 1;
    int col = c - 1;

    if (row < shelfs.length && col < shelfs[row].length) {
         
        Book b = shelfs[row][col].findbook(title); // us shelf me title se search
        return b;
    }
    return null; // agar invalid row/col ya na mile
}

   
   
}