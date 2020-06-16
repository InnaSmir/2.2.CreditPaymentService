public class CreditPaymentService {
    public long calculate(long amount, long creditPeriod) {
        double yearRate = 0.0999;
        // Формула аннуитетного платежа:
        // Сумма кредита * ежемесячная процентная ставка / (1 - (1 / (1 + ежемесячная процентная ставка)^срок кредита))

        double monthRate = yearRate / 12;
        double totalPaymentRate = amount * monthRate;
        double loanPaymentPeriod = (1 - (1 / Math.pow(monthRate + 1, creditPeriod)));
        long monthlyPayment = (long) (totalPaymentRate / loanPaymentPeriod);
        return monthlyPayment;
    }
}
