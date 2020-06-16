public class Main {
        public static void main(String[] args) {
            CreditPaymentService service = new CreditPaymentService();

            long monthlyPayment1year = service.calculate(1_000_000,12);
            System.out.println(monthlyPayment1year);

            long monthlyPayment2years = service.calculate(1_000_000,24);
            System.out.println(monthlyPayment2years);

            long monthlyPayment3years = service.calculate(1_000_000,36);
            System.out.println(monthlyPayment3years);
        }
    }

