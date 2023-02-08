
import java.util.Scanner;

class HelloWorld {
public static void main(String[] args) {
    System.out.println("Hello, World!"); 
   Student st1 = new Student();
   st1.menu();
    }
}
class Getset
{
     int Roll_no ;
     String Name ;
     double Physics, Chemistry , Maths, Percentage = ((Physics + Chemistry + Maths )/300)*100;
    public void setRoll(int roll)
    {
        Roll_no = roll;
    }
    public int getRoll()
    {
        return Roll_no;
    }
    public void setName(String na)
    {
        Name = na;
    }
    public String getName()
    {
        return Name;
    }
    public void setPhysics(double phy)
    {
        Physics = phy;
    }
    public double getPhysics()
    {
        return Physics;
    }
    public void setChemistry(double chem)
    {
        Chemistry = chem;
    }
    public double getChemistry()
    {
        return Chemistry;
    }
    public void setMaths(double mth)
    {
        Maths = mth;
    }
    public double getMaths()
    {
        return Maths;
    }
    public void setPercentage(double per)
    {
        Percentage = per;
    }
    public double getPercentage()
    {
        return Percentage;
    }
 }
class Student
{
    Getset Gs[];
     int choice,s , i;
     Scanner sc = new Scanner(System.in);
    void menu()
    {
        System.out.println("1. Add Student Details");
        System.out.println("2. Show Student Details");
        System.out.println("3. Update Student Details");
        System.out.println("4. Search Student Details");
        System.out.println("0. Exit");
        
        System.out.println("Enter the Choice");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice)
        {
            case 1 :
                AddStud();
                break;
            case 2 :
                ShowStud();
                break;
            case 3 :
                updateStud();
                break;
            case 4 :
                searchStud();
                break;
            case 0 :
                exitStud();
                break;
            default :
            {
                System.out.println("Please Enter Valid Option");
            }
        }
    }
        void AddStud()
        { 
            int roll_no,no;
            String name;
            double physics, chemistry, maths,percentage;
            System.out.println("Enter the No. of Student");
            no = Integer.parseInt(sc.nextLine());
            Gs = new Getset[no];
            for(i =0; i<Gs.length ; i++)
            {
                Gs[i] = new Getset();
            
            System.out.println("Enter the Roll No. of Student");
            roll_no = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Student Name");
            name = sc.nextLine();
            System.out.println("Enter the Physics Marks");
            physics = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Chemistry Marks");
            chemistry = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Maths Marks");
            maths = Double.parseDouble(sc.nextLine());
            percentage = ((physics + chemistry + maths)/300)*100;
            
            
            Gs[i].setRoll(roll_no);
            Gs[i].setName(name);
            Gs[i].setPhysics(physics);
            Gs[i].setChemistry(chemistry);
            Gs[i].setMaths(maths);
            Gs[i].setPercentage(percentage);
             
        
              }menu();
          
        }
    
       void ShowStud()
        {
            System.out.println("Sr no . "+"\t\tName "+"\t\tRoll no. "+"\t\tPhysics "+"\t\tChemistry "+"\t\tMaths "+"\t\tPercentage");
        for(i =0; i<Gs.length ; i++)
        {
         System.out.println((i+1)+"\t\t"+Gs[i].getName()+"\t\t"+Gs[i].getRoll()+"\t\t"+Gs[i].getPhysics()+"\t\t"+Gs[i].getChemistry()+"\t\t"+Gs[i].getMaths()+"\t\t"+Gs[i].getPercentage());
        }
        menu();
}
        
        void updateStud()
        {
            int roll1,ch1,ch2;
            String n1;
            double phy1, chem1, math1,perc;
            System.out.println("Enter the student Roll Number");
            roll1 = Integer.parseInt(sc.nextLine());
            for(i =0; i<Gs.length ; i++)
            {
            if(roll1 == Gs[i].getRoll())
            {
            System.out.println("What do you want to Update ?");
            System.out.println("1. Name ");
            System.out.println("2. Physics Marks");
            System.out.println("3. Chemistry Marks");
            System.out.println("4. Maths Marks");
            ch1 = Integer.parseInt(sc.nextLine());
            switch(ch1)
            {
                case 1 :
                    {
                        System.out.println("Your old name is "+Gs[i].getName());
                        System.out.println("Enter your correct Name");
                        n1 = sc.nextLine();
                        System.out.println("Are you sure to update Name.\n1. Yes\n2. No");
                        ch2 =  Integer.parseInt(sc.nextLine());
                        switch(ch2)
                        {
                            case 1:
                                {
                                    Gs[i].setName(n1);
                                    
                                    break;
                                }
                            case 2:
                                {
                                    menu();
                                    break;
                                }
                        }
                        break;
                    }
                case 2 :
                    {
                        System.out.println("Your old Physic marks is "+Gs[i].getPhysics());
                        System.out.println("Enter your correct Physics marks");
                        phy1 = Double.parseDouble(sc.nextLine());
                        perc=((phy1+Gs[i].getChemistry()+Gs[i].getMaths())/300)*100;
                        System.out.println("Are you sure to update Physics marks.\n1. Yes\n2. No");
                        ch2 =  Integer.parseInt(sc.nextLine());
                        switch(ch2)
                        {
                            case 1:
                                {
                                    Gs[i].setPhysics(phy1);
                                    Gs[i].setPercentage(perc);
                                    break;
                                }
                            case 2:
                                {
                                    menu();
                                    break;
                                }
                        }
                        break;
                    }
                case 3 :
                    {
                        System.out.println("Your old Chemistry marks is "+Gs[i].getChemistry());
                        System.out.println("Enter your correct Chemistry marks");
                        chem1 = Double.parseDouble(sc.nextLine());
                        perc=((chem1+Gs[i].getPhysics()+Gs[i].getMaths())/300)*100;
                        System.out.println("Are you sure to update Chemistry marks.\n1. Yes\n2. No");
                        ch2 =  Integer.parseInt(sc.nextLine());
                        switch(ch2)
                        {
                            case 1:
                                {
                                    Gs[i].setChemistry(chem1);
                                    Gs[i].setPercentage(perc);

                                    break;
                                }
                            case 2:
                                {
                                    menu();
                                    break;
                                }
                        }
                        break;
                    }
                case 4 :
                    {
                        System.out.println("Your old Maths marks is "+Gs[i].getMaths());
                        System.out.println("Enter your correct Maths marks");
                        math1 = Double.parseDouble(sc.nextLine());
                        perc=((Gs[i].getPhysics()+Gs[i].getChemistry()+math1)/300)*100;
                        System.out.println("Are you sure to update Maths marks.\n1. Yes\n2. No");
                        ch2 =  Integer.parseInt(sc.nextLine());
                        switch(ch2)
                        {
                            case 1:
                                {
                                    Gs[i].setMaths(math1);
                                    Gs[i].setPercentage(perc);

                                    break;
                                }
                            case 2:
                                {
                                    menu();
                                    break;
                                }
                        }
                        break;
                    }
                    default :
                    {
                        System.out.println("You Entered Invalid Option ");
                        menu();
                        break;
                    }
            }
            menu();
            }
            
            }
             if(roll1 != Gs[i].getRoll())
            {
             System.out.println("You Entered Invalid Option ");
                        menu();
            }
        }
        
        void searchStud()
        {
            int tmpRoll;
            System.out.println("Search by Roll Number");
            System.out.println("Enter the Roll Number");
            tmpRoll = Integer.parseInt(sc.nextLine());
            for(i =0; i<Gs.length ; i++)
            {
            if(tmpRoll == Gs[i].getRoll())
            {
            System.out.println("Sr no . "+"\t\tName "+"\t\tRoll no. "+"\t\tPhysics "+"\t\tChemistry "+"\t\tMaths "+"\t\tPercentage");
            
            System.out.println((i+1)+"\t\t"+Gs[i].getName()+"\t\t"+Gs[i].getRoll()+"\t\t"+Gs[i].getPhysics()+"\t\t"+Gs[i].getChemistry()+"\t\t"+Gs[i].getMaths()+"\t\t"+Gs[i].getPercentage());
            }
            }
            menu();
        }
        void exitStud()
        {
            
        }
}

