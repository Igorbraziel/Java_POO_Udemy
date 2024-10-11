package Enumerations_Compositions.Exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Worker {
    public String name;
    public WorkerLevel level;
    public Double baseSalary;
    public List<HourContract> hourContractList = new ArrayList<>();
    public Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract hourContract){
        hourContractList.add(hourContract);
    }

    public void removeContract(HourContract hourContract){
        hourContractList.remove(hourContract);
    }

    public Double income(Integer year, Integer month){
        double incomeValue = 0;
        List<HourContract> hourContractNewList = this.hourContractList.stream().filter(x -> x.date.getMonthValue() == month && x.date.getYear() == year).collect(Collectors.toList());
        for(HourContract hourContract : hourContractNewList){
            incomeValue += hourContract.totalValue();
        }
        return incomeValue + this.baseSalary;
    }
}
