import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array={3,5,4,1,9};

        // finding Maximum & minimum in single iteration
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){

            if(array[i]<min){
                min=array[i];            
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(min +" <==> "+max);

        Arrays.stream(array)
        .max()
        .ifPresent(System.out::println);

        Arrays.stream(array)
        .min()
        .ifPresent(System.out::println);


        // highest & second Highest
        Integer a=Arrays.stream(array)
        .sorted()
        .boxed()
        .skip(1)
        .findFirst()
        .orElse(null);

        System.out.println(a);

        max=Integer.MIN_VALUE;
        int secondMax=max;

        for(int i=0;i<array.length;i++){

            if(array[i]>max){
                max=array[i];
            }
            if(array[i]!=max&&array[i]>secondMax){
                secondMax=max;
            }

        }
        System.out.println(secondMax);

        int array2[]={1,1,2,2,3,3,4,4,5};
        int i=0;
    for(int j=1;j<array2.length;j++){
        if(array2[i]!=array2[j]){
            i++;
            System.out.println("Value of I is ->"+i);
            array2[i]=array2[j];
        }
    }
    System.out.println(Arrays.toString(Arrays.copyOfRange(array2,0, i)));

    int[] array3={1,2,3,4,5};
    int k=3;
    reverse(array3,0,array3.length-1);
    System.out.println(Arrays.toString(array3));
    reverse(array3,0,array3.length-k-1);
    System.out.println(Arrays.toString(array3));
    reverse(array3,array3.length-k,array3.length-1);
    
    System.out.println(Arrays.toString(array3));
}
public static void reverse(int[] inputArray,int start,int end){
    while(start<=end){
    int temp=inputArray[start];
    inputArray[start]=inputArray[end];
    inputArray[end]=temp;
    start++;
    end--;
    }
}
}
