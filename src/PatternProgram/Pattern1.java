package PatternProgram;
public class Pattern1 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){

            for (int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j<i)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
/// 3rd pattern
        System.out.println();

        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                /*if (i==j||i+j==5-1){
                    System.out.print("*");
                }
                else System.out.print(" ");*/
                //System.out.print("*");

                if (i>=2&&j>=2&&i<=4&&j<=4)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
