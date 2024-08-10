package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.format.DateTimeFormatter;

import static java.lang.String.format;

public class ContractService {
    private Contract contract;

    private OnlinePaymentService ops;

    public ContractService(Contract contract, OnlinePaymentService ops) {
        this.contract = contract;
        this.ops = ops;
    }

    public void processContract(Contract contract, Integer month) {
        Double total;
        Double comImposto;
        System.out.println("Parcelas");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 1; i<=month; i++) {
            comImposto = ops.interest(contract.getTotalValue() / month, i);
            total = ops.paymentFee(comImposto);
            //i + mes/Contract = dueDate/installment
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), total));
        }

    }

}
