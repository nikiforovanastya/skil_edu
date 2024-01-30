package Lesson4_problem3;

public class Printer {
    private String queue = "";
    private int pageQueue = 0;
    private int pageCount = 0;
    public void append(String text, String name, int countPgDoc) {
        queue = queue + "\n" + name + " - " + text;
        pageQueue = pageQueue + countPgDoc;
    }
    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pageQueue = pageQueue + 1;
    }
    public void append(String text, int countPgDoc) {
        queue = queue + "\n" + "Документ без имени - " + text;
        pageQueue = pageQueue + countPgDoc;
    }
    public void append(String text) {
        queue = queue + "\n" + "Документ без имени - " + text;
        pageQueue = pageQueue + 1;
    }
    public void clear(){
        queue = "";
        pageQueue = 0;
    }
    public void print(){
        System.out.println(queue);
        pageCount = pageCount + pageQueue;
        clear();
    }
    public int getPendingPagesCount(){
        return pageQueue;
    }
    public int getPrintedPagesCount(){
        return pageCount;
    }


}
