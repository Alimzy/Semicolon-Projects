package alimzyEstore;

public class CreditCardInformation {
    private int cvv;
    private int expirationYearAndMonth;
    private int number;
    private String name;
    private CardType type;

    CreditCardInformation(int cvv, int expirationYearAndMonth, int number, String name, CardType type){
        this.cvv = cvv;
        this.expirationYearAndMonth = expirationYearAndMonth;
        this.number = number;
        this.name = name;
        this.type = type;


    }

}
