import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_11_27_1 {

    public static void main(String[] args)    {
        Scanner scanner=new Scanner(System.in);
    while(scanner.hasNext())
    {
        int numPeople=scanner.nextInt();
        int option=scanner.nextInt();
        List<Student> stuList=new ArrayList<Student>();
        for(int i=0;i<numPeople;i++)            {
            stuList.add(new Student(scanner.next(), scanner.nextInt()));
        }
        if(option==0)
        {
            stuList.stream().sorted((e1,e2)->{ return e2.score - e1.score;  }).forEach(System.out::println);
        }   else if(option==1) {
            stuList.stream().sorted((e1,e2)->{ return e1.score - e2.score; }).forEach(System.out::println);
            }
         }
    }
}
    class Student {
        public String name;
        public int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String toString() {
            return this.name + " " + this.score;
        }
    }