import java.util.Scanner;

public class cout_Number_Studer_Exam {
    public static void print_Array(double[] arr) {
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int size;
        int studer = sc.nextInt();
        do{
            System.out.println("nhập  số lượng sinh viên :");
             size =sc.nextInt();
            if(size >30) System.out.println("nhập lại số lượng  sinh viên");
        }while (size >30);
        double [] array = new double[size];

        for(int  i =0; i  <array.length;i++){
            System.out.println("Sinh viên thứ"+(i+1));
            array[i] =sc. nextDouble();
//            if(array[i] >11 && array[i]<0){
//                System.out.println("nhập điểm không hợp  lệ");
//                return;
//            }

        }
        printl(array);
        getScore(array);

    }
    public static void printl(double [] arry){
        System.out.println("in điểm");
        for(int i = 0;i< arry.length;i++){
            System.out.print(arry[i]+"\t"+"\t");
        }
        System.out.println();
    }
    public static void getScore(double[] arry){
        System.out.println("số  lượng sinh viên đạt điểm");
         int count = 0;
        for(int i =0 ;i <arry.length;i++){
            if(arry[i]>=5 && arry[i]<10){
                count++;
            }
        }
        System.out.println("Số lượng  sinh viên đạt  điểm thi qua  môn : "+count);
    }
}
