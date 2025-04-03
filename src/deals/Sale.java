package deals;

public class Sale extends Deal {
    private String title;
    public Sale(String comment, int debitChange, String title) {
        super(comment, 0, debitChange);
        this.title = title;
    }
}