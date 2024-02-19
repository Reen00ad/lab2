import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //ex1 done
//          String [] names ={"cat","dog","red","is","am"};
//          System.out.print(longer(names));

        //ex2 done

//        int count = 0;
//        int [] num = {1,1,1,3,3,5};
//        int enternum=s.nextInt();
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] == enternum){
//                count++;
//            }
//        }
//        System.out.print(enternum+" occurs "+count+" time");

        //ex3 done

//        Integer [] num ={1,4,17,7,25,3,100};
//        int num1=s.nextInt();
//        System.out.println(num1+" largest elements of the said array are : ");
//        Arrays.sort(num, Collections.reverseOrder());
//        for (int i = 0; i < num1; i++) {
//
//            System.out.println(num[i]);
//        }

        //ex4 done

//        int [] num={5,4,3,2,1};
//        System.out.println("the reverse array : ");
//        arrnum(num);

        //ex5 done
//        System.out.println("enter the size of array ");
//        int size=s.nextInt();
//        int [] arr=new int[size];
//        int ke=0;
//        loop : while (true) {
//            System.out.println("1-Accept elements of an array .");
//        System.out.println("2-Display elements of an array .");
//        System.out.println("3-Search the element within array .");
//        System.out.println("4-sort the array");
//        System.out.println("5- to stop");
//
//        System.out.print("choose a number ");
//        int num=s.nextInt();
//
//
//        switch (num){
//            case 1 :
//                System.out.println("enter the element of array : ");
//                for (int i = 0; i < size; i++) {
//                    arr[i]=s.nextInt();
//                }break;
//            case 2 :
//                System.out.println("array elements are : ");
//                for (int i = 0; i < size; i++)
//                    System.out.println(arr[i]);
//                break;
//            case 3 :
//                System.out.println("enter a number you want to search : ");
//                int sear=s.nextInt();
//                for (int i = 0; i < size; i++) {
//                    if(arr[i]==sear){
//                        ke=i;
//                    }
//
//                }
//                System.out.println("the element is present in "+ke+" index");
//                break;
//            case 4 :
//                Arrays.sort(arr);
//                System.out.println("the sort array is : ");
//                for(int sor:arr){
//                    System.out.println(sor+" ");
//                }
//            default:
//                System.out.println("program terminated");
//                break loop;
//                }
//        }
        //ex6 done
//        Random rand = new Random();
//        System.out.println("enter the minimum value of range : ");
//        int min=s.nextInt();
//        System.out.println("enter the maximum value of range : ");
//        int max=s.nextInt();
//        System.out.println("enter the number of random numbers to generate : ");
//        int num=s.nextInt();
//
//        System.out.println("random numbers within the specified range : ");
//        for (int i = 0; i < num; i++)
//        System.out.println(" "+ran(min,max));

        //ex7 not

//        System.out.println("Enter a password : ");
//        String pass=s.nextLine();
//        int count=0;
//       checklength(pass,count);
//       checkspecialcharacters(pass,count);
//        checkuppercaselowercase(pass,count);
//
//        if(count >= 8)
//            System.out.print("password is strong ");
//         else if (count >=5 || count <8)
//           System.out.print("password is moderately strong");
//        else if (count > 5)
//            System.out.print("password is weak");

        //ex8 done

//        System.out.println("enter the number of Fibonacci term to generate : ");
//        int num=s.nextInt();
//        System.out.println("Fibonacci sequence with "+num+" terms : ");
//        fibonacci(num);


    }
   //ex1
    public static ArrayList longer(String [] na){
         ArrayList list = new ArrayList();
         int longest=0;
         for(String n : na){
            int length=n.length();
            if(length>longest){
                longest=length;
            }
            if(length==longest)
                list.add(n);
         } return list;

    }
    //ex4
    public static void arrnum(int [] n){
        for (int i = n.length-1; i >=0 ; i--) {

            System.out.print(n[i]);
        }

    }
    //ex6
    public static int ran(int mi , int ma ){

        int n = (int) (Math.random() *(ma-mi)) +mi;
        return n;

    }
    //ex7
    public static int checklength(String p,int co){

       if (p.length()>0 || p.length()<=5)
           co+=0;
       else if (p.length()>=6 || p.length()<=7)
           co+=2;
       else if (p.length()>=8)
           co+=3;
        return co;
    }
    public static int checkspecialcharacters(String p, int c){


        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i)))
                c+=2;
            else
                c+=0;
    }
        return c;

    }
    public static int checkuppercaselowercase(String pp,int ccc){

        for (int i = 0; i < pp.length(); i++) {
            if(Character.isUpperCase(pp.charAt(i))&&Character.isLowerCase(pp.charAt(i)))
                ccc+=3;
            else ccc+=0;
        }return ccc;
    }
    //ex8
    public static void fibonacci(int a){
        int num1=0;
        int num2=1;
        for (int i = 0; i < a ; i++) {
            System.out.print(num1+" ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }

    }
}