package university;

public class Result {
    private int marks; 

    public Result(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }


    void updateMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
