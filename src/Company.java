import taxes.TaxSystem;
import deals.Deal;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit += amount;
        } else if (amount < 0) {
            this.credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        this.debit = 0;
        this.credit = 0;
    }

    public int applyDeals(Deal[] deals){
        for (Deal deal : deals) {
            this.debit += deal.getDebitChange();
            this.credit += deal.getCreditChange();
        }
        int payDiff = this.debit - this.credit;
        this.payTaxes();
        return payDiff;
    }
}
