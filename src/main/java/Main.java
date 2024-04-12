import java.util.Scanner;
class add
{
    int a , b;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    void putdata(){
        System.out.println("Additin = " + (a+b));
    }
}

public class Main {
  public static void main(String[] args) {
    add aa = new add();
    aa.getdata();
    aa.putdata();
  }

}