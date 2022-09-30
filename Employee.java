package practicum.ebebek;

/**
 * @author BozdemirHome
 */
public class Employee {
  
    String name; 
    double salary;
    int workHours;
    int hireYear;
    

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
         if(salary < 1000){
            return 0;
        }
        else{
            return this.salary * 0.03;
        }
    }
    public double bonus(){
       if (workHours >= 40){
            return  ((workHours-40)*30);
        }
        else return 0;
    }
    public double raiseSalary(){
        int nowYear=2021;
        
        int year= nowYear-this.hireYear;
        
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>9&&year<20){
            return this.salary*0.1;
        }
        else return this.salary*0.15;
    }
    
    
    public  void ToString(){
    
        double totalSalary=(this.salary-tax()+bonus()+raiseSalary());
        double taxBonusSalary=(this.salary-tax()+bonus());
        
        System.out.println("----------------->>");
        System.out.println("Adı : "+this.name );
        System.out.println("Maaşı : "+this.salary ); 
        System.out.println("Çalışma Saati : "+this.workHours ); 
        System.out.println("Başlangıç Yılı : "+this.name );     
        System.out.println("Vergi : "+this.tax() ); 
        System.out.println("Bonus : "+this.bonus() );
        System.out.println("Maaş Artışı  : " + this.raiseSalary() );
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonusSalary );
        System.out.println("Toplam Maaş : "+ totalSalary );
        System.out.println("----------------->>");
        System.out.println();
    }
    
}