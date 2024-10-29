package Interfaces.FixationExercise;

import java.time.LocalDate;

public interface PaymentService {
    public abstract double monthlyInterest(Installment installment, LocalDate contractDate);
    public abstract double paymentFee(Installment installment, LocalDate contractDate);
}
