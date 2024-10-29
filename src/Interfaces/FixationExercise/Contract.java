package Interfaces.FixationExercise;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contract {
    private int number;
    private LocalDate contractDate;
    private double totalValue;

    private List<Installment> installmentList;
    private int monthsDuration;
    
    public Contract(int number, LocalDate contractDate, double totalValue, int monthsDuration) {
        this.number = number;
        this.contractDate = contractDate;
        this.totalValue = totalValue;
        this.monthsDuration = monthsDuration;
        this.createInstallments();
    }

    private void createInstallments(){
        installmentList = new ArrayList<>();
        for(int i = 1; i <= monthsDuration; i++){
            installmentList.add(new Installment(contractDate.plusMonths(i), totalValue / monthsDuration));
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void setInstallmentList(List<Installment> installmentList) {
        this.installmentList = installmentList;
    }

    public int getMonthsDuration() {
        return monthsDuration;
    }

    public void setMonthsDuration(int monthsDuration) {
        this.monthsDuration = monthsDuration;
    }

    @Override
    public String toString(){
        return this.installmentList.get(0).toString();
    }

}
