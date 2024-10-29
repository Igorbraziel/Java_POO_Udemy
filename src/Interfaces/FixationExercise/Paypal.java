package Interfaces.FixationExercise;

import java.time.Duration;
import java.time.LocalDate;

public class Paypal implements PaymentService {
    public double monthlyInterest(Installment installment, LocalDate contractDate){
        return installment.getValue() + 
        0.01 * installment.getValue() * (int) (Duration.between(contractDate.atStartOfDay(), installment.getDate().atStartOfDay()).toDays() / 30);
    }

    public double paymentFee(Installment installment, LocalDate contractDate){
        return monthlyInterest(installment, contractDate) + 0.02 * monthlyInterest(installment, contractDate);
    }
}
