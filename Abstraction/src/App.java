import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Shape square=new Square(3.0);
        square.displayInfo();

        int[] array={1,1,2,3,4,4,4,4,5,7,8,8,9,9,9,9,9,99,9,1};
        Arrays.stream(array)
        .distinct()
        .forEach(e->System.out.print(e+","));


        int[] array1={-1,0,3,5,9,12};
        int start=0;
        int end=array1.length-1;
        int mid=end-(end-start)/2;
        int k=0;

        while(start<=end){

            if(array1[mid]==k){
                System.out.print("FOUND IT AT "+mid);
                break;
            }
            if(k<array1[mid]){
                end=mid-1;
            }
            else
                start=mid+1;

            mid=end-(end-start)/2;
        }

        int[] array3={1,2,3,4,5,6,7,8,9};

        Arrays.stream(array3)
        .mapToObj(e->(int)e)
        .collect(Collectors.groupingBy(e->{
            if(e%2==0)
                return "EVEN";
            else
                return "ODD";

        },Collectors.toList()))
        .entrySet()
        .stream()
        .forEach(System.out::println);

        //merge two sorted arrays
        int[] array4={1,2,3,0,0,0};
        int[] array5={2,4,6};
        int i=array5.length-1;
        int j=array4.length-1;
        for(int k1=array5.length-1;k1>=0;k1--){
            if(array4[i]<array5[k1]){
                array4[j]=array5[k1];
                j--;
            }
            else{
                array4[j]=array4[i];
                array4[i]=array5[k1];
                i--;
            }
        }
        System.out.println(Arrays.toString(array4));
        int[] array6={17,18,5,4,6,1};
        int maxSoFar=Integer.MIN_VALUE;
        for(int k2=array6.length-1;k2>=0;k2--){
            if(k2==array6.length-1){
                maxSoFar=array6[k2];
                array6[k2]=-1;
                continue;
            }
            if(array6[k2]>maxSoFar){
                maxSoFar=array6[k2];
            }
            array6[k2]=maxSoFar;
        }
        System.out.println(Arrays.toString(array6));

    }
}
