public class CurrencyConverter {
    private final ExchangeRateService exchangeRateService;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        double conversionRate = exchangeRateService.getConversionRate(fromCurrency, toCurrency);
        return amount * conversionRate;
    }
}
