public class currency {

    enum Currency {
        DOLLAR("USD", "D", "US"),
        RUPEE("INR", "R", "IN"),
        EURO("EUR", "E", "EU");

        final String code;
        final String symbol;
        final String country;

        // constructor
        Currency(String code, String symbol, String country) {
            this.code = code;
            this.symbol = symbol;
            this.country = country;
        }

        public String getDetails() {
            return code + " ===> " + symbol + " ===> " + country;
        }
    }

    public static void main(String[] args) {
        System.out.println(Currency.RUPEE.getDetails());
        System.out.println(Currency.DOLLAR.getDetails());
        System.out.println(Currency.EURO.getDetails());
    }
}
