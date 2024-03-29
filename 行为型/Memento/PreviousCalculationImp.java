package ReadAgain.设计模式.行为型.Memento;

public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
        PreviousCalculationToOriginator {
    private int firstNumber;
    private int secondNumber;
    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    } @
            Override
    public int getFirstNumber() {
        return firstNumber;
    } @
            Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
