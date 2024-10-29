package Interfaces.FixationExercise;

public class Enterprise {
    private Contract contract;
    private PaymentService paymentService;  

    public Enterprise(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void contractProcessing(){
        for(Installment installment : contract.getInstallmentList()){
            installment.setValue(paymentService.paymentFee(installment, contract.getContractDate()));
        }
    }

    public void setContract(Contract contract){
        this.contract = contract;
    }

    public Contract getContract(){
        return contract;
    }
}
