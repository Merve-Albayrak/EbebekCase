package com.company;

public class Employee {
   private String name;
   private int salary;
   private  int workHours;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "Adı=" + name + '\n' +
                "Maaşı=" + salary + '\n' +
                "Çalışma Saati=" + workHours + '\n' +
                "Başlangıç Yılı=" + hireYear + '\n' +
                        "Vergi:" +tax(this.salary)+'\n' +
                        "Bonus:" +bonus(this.workHours) +'\n' +

                        "Maaş Artışı:"+raiseSalary(this.hireYear,this.salary) +'\n' +
                        "Vergi ve Bonuslarla Birlikte Maaş:"+(salary+bonus(this.workHours) -tax(this.salary))+'\n'+
                        "Toplam Maaş:"+ (salary+raiseSalary(this.hireYear,this.salary)+bonus(this.workHours));



    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    private  int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    public  int tax(int salary){

salary=this.salary;
       if(salary<1000){


           return  0;
       }
       else {


           return salary*3/100;
       }

   }

   public  int bonus(int workHours){
   workHours=this.workHours;
      if(workHours>40){

        return  ((workHours-40) *30)*4;

      }
       return 0;

   }

   public int raiseSalary(int hireYear,int salary){
   hireYear=this.hireYear;
   salary=this.salary;
       int now=2021;

       if(now-hireYear<10){

           return salary*5/100;

       }

       else if(now-hireYear>9&&now-hireYear<20){


           return salary*10/100;
       }
       else {


           return salary*15/100;
       }
   }

}
