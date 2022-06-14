public class moneyTransferService {
    currencyConverter cc = new currencyConverter();

    double computeTransferAmount(int countryIndex, double amount){
        return cc.computeTransferAmount(countryIndex,amount);
    }
    double computerTransferFee(){
        double transferAmount = computeTransferAmount(0,1000);
        return transferAmount * 0.02;
    }


    public static void main(String[] args) {
        moneyTransferService transferService = new moneyTransferService();
        double transferAmount = transferService.computeTransferAmount(0,1000);
        double transferFees = transferService.computerTransferFee();
        System.out.println("\nTransfer Amount: " + transferAmount);
        System.out.println("\nTransfer Fee: " + transferFees);
    }

}

