package ReadAgain.设计模式.行为型.Memento;

public interface Calculator {
    // Create Memento
    PreviousCalculationToCareTaker backupLastCalculation();
    // setMemento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);
    int getCalculationResult();
    void setFirstNumber(int firstNumber);
    void setSecondNumber(int secondNumber);
}
