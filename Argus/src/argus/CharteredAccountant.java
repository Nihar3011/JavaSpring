/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author nihar
 */
@Component
public class CharteredAccountant implements Employee{
     
     EmployeeSalary employeesalary;
    int salary=employeesalary.salary(15000);
    
    @Autowired
    public void setEmployeesalary(EmployeeSalary employeesalary) {
        this.employeesalary = employeesalary;
    }
    
    
    @Override
    public String type() {
       return "I am CharteredAccountant";
    }

    @Override
    public void showSalary() {
        System.out.println(salary);
    }
    
}
