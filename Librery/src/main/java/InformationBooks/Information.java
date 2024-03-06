package InformationBooks;

public class Information {
    String title;
    String author;
    String genre;
    String datepub;
    String avaible;
    String quanty;
    String loantime;
    String user;
    String loandate;
    String returndate;
    
    public Information ( String title, String author, String genre, String datepub, String avaible, String quanty, String loantime, String user, String loandate, String returndate){

        this.title=title;
        this.author=author;
        this.genre=genre;
        this.datepub=datepub;
        this.avaible=avaible;
        this.quanty=quanty;
        this.loantime=loantime;
        this.user=user;
        this.loandate=loandate;
        this.returndate=returndate;
    }
    public  Information () {
        
        }
        public void saySomething(){
            System.out.println(this.title );
            System.out.println(this.author);
            System.out.println(this.genre);
            System.out.println( this.datepub);
            System.out.println(this.avaible);
            System.out.println(this.quanty);
            System.out.println(this.loantime);
            System.out.println( this.user);
            System.out.println( this.loandate);
            System.out.println(this.returndate); 
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDatepub() {
        return datepub;
    }

    public void setDatepub(String datepub) {
        this.datepub = datepub;
    }

    public String getAvaible() {
        return avaible;
    }

    public void setAvaible(String avaible) {
        this.avaible = avaible;
    }

    public String getQuanty() {
        return quanty;
    }

    public void setQuanty(String quanty) {
        this.quanty = quanty;
    }

    public String getLoantime() {
        return loantime;
    }

    public void setLoantime(String loantime) {
        this.loantime = loantime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }
    
}
