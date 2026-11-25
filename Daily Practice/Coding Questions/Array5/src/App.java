import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static void reverse(int start,int end,int[] array){
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] array={1,2,3,4,5};
        int k=3;
        reverse(0,array.length-1,array);//54321
        reverse(0,array.length-k,array);//34521
        reverse(k,array.length-1,array);//34512
        System.out.println(Arrays.toString(array));

        int[] array2={0,1,0,3,0,1,2};

        //move zeros to end
        int j=0;
        for(int i=0;i<array2.length;i++){

            if(array2[i]!=0){
                int temp=array2[j];
                array2[j]=array2[i];
                array2[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));
        //integer
        Integer[] array3={1,2,3,4,3,9,7,8,9,10};
        List<Integer> list=Arrays.asList(array3);
        IntStream.range(1, 10)
        .mapToObj(e->(int)e)
        .filter(e->!list.contains(e))
        .collect(Collectors.toList())
        .stream()
        .forEach(System.out::println);
    }
}
