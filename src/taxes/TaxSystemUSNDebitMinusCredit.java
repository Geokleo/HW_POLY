package taxes;

public class TaxSystemUSNDebitMinusCredit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit)*15/100;
        return tax > 0 ? tax : 0;
    }
}