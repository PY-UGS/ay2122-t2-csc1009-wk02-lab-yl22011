import java.util.Scanner;

class q2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float a[] = new float[3];
        
        


        float no = 0f;
        for(int i =0 ;i <3 ; i++)
        {
            a[i] = input.nextFloat();
            no = no + a[i];
        }

        input.close();
        no = no/3;
        System.out.println("The average of " +a[0]+" " +a[1]+" "+a[2] + " is " +no);
    }

}