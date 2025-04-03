package taxes;

public class TaxSystemUSNDebit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = debit*6/100;
        return tax > 0 ? tax : 0;
    }
}