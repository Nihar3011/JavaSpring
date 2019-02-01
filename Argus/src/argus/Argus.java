/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nihar
 */
public class Argus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("argusData.xml");
        
        Employee ba=context.getBean("businessAnalyst",Employee.class);
        
        System.out.println(ba.type());
        ba.showSalary();
    }
    
}
