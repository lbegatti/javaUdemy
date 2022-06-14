public class currencyConverter {
    // Currency exchange rates of different currencies relative to 1 USD
    double[] exchangeRates = {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0}; // at the beginning it is null.

    void setExchangeRates(double[] rates){
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal){
        exchangeRates[arrayIndex] = newVal; // exchange rate of a specific index is changed
    }

    double getExchangeRate(int countryIndex){
        return exchangeRates[countryIndex]; // it will return the exchange rate corresponding to the index you choose.
    }

    double computeTransferAmount(int countryIndex, double amount){
        return amount * getExchangeRate(countryIndex);
    }


    // instance method
    void printCurrencies(){
        System.out.println("\nrupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]);
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("$austrialian: " + exchangeRates[6]);

    }

    /*public static void main(String[] args) {
        // instantiating currencyConverter class
        currencyConverter cc = new currencyConverter();

        // Jan 1st
        // variable declaration
        double[] rates = {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0}; // the name does not have to be rates as long as you pass it below
        // access the instance method
        cc.setExchangeRates(rates);
        // access the instance method
        cc.printCurrencies();

        // Jan 2nd
        // variable assignment
        rates = new double[]{65.0, 5.0, 6.0, 598.5, 18.0, 107.0, 2.0}; // the name does not have to be rates as long as you pass it below
        // access the instance method
        cc.setExchangeRates(rates);
        // access the instance method
        cc.printCurrencies();

        cc.updateExchangeRates(0,69);
        cc.printCurrencies();

        double amount = cc.computeTransferAmount(0,1000);
        System.out.println("\nTransferred Amount: " + amount);
    }*/
}
