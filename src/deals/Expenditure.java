package deals;

public class Expenditure extends Deal {
    private String title;
    public Expenditure(String comment, int creditChange, String title) {
        super(comment, creditChange, 0);
        this.title = title;
    }
}