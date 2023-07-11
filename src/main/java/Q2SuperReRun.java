public class Q2SuperReRun {
    public static void main(String[] args) {

        int[] array = {-100, -50, -150, -300, -200, -450, -350};
        int max=array[0];
        int secondMax=array[1];

        for (int i=0;i<array.length;i++){
            if (array[i]>max){max=array[i];}
         for (int j=1;j<array.length;j++){
             if (array[j]<max && array[j]>secondMax){
                 secondMax=array[j];
             }
         }
        }
        System.out.println(secondMax);
    }
}
