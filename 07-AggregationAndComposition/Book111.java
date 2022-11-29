public class Book111 {

    // Attributes

    private String title;
    private String writer;
    private int numOfPages;
    private String category;
    private int currPage;

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    // Methods

    public void nextPage(){
        this.currPage += 1;
    }

    public void prevPage(){
        this.currPage -= 1;
    }

    public void goToPage(int page){
        this.currPage = page;
    }

}
