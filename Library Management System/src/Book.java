public class Book{
        private String title;
        private String author;
        private Type type;
        private boolean available;


        Book(String title,String author,Type type,boolean available){
           this.title=title;
           this.author=author;
           this.type=type;
           this.available=true;
        }

        
        public String toString(){
           String status=available?"Available":"Not available";
           return String.format("Title: %s  Author: %s  Type: %s  Status: %s",title,author,type,status);
        }


        public boolean getavailable(){
            return available;
        }


        public String gettitle(){
           return title;
        }


        public Type gettype(){
          return type;
        }


        public String getauthor(){
            return author;
        }

        public boolean issuebook(){
          if(available){
             available=false;
             return true; 
          }
          else
             return false;
        }


        public boolean returnbook(){
          if(!available){
             available=true;
             return true; 
          }
          else
             return false;
        }
}