package May23;

public class ArrayBasics {
    static void main() {
//        int marks[] = {70,40,30,50};
//        for(int i = 0; i< marks.length; i++){
//            System.out.println(marks[i]);
//        }
//            System.out.println(marks.length);
//    }

//        // Question = sum of array elements
//        int marks[] = {80, 40, 30, 50};
//        int sum = 0;
//        for (int i = 0; i < marks.length; i++) {
//            sum += marks[i];
//        }
//        System.out.println(sum);

        //Question = odd and even
        /*
        int marks[] = {10,15,20,25,30,35};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        // Output:
//        Odd: 3
//        Even: 3
*/

        // Question = max and min
//        int marks[] = {70,30,60,50,90,40};
//        int max = marks[0];
//        int min = marks[0];
//
//        for (int i = 0; i<marks.length; i++){
//            if(marks[i]>max)
//                max = marks[i];
//            if(marks[i]<min)
//                min = marks[i];
//        }
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);

        // Question:
        int marks[] = {70, 30, 40, 60, 50, 90,40};
        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks.length; j++){
                if(i!=j && marks[i]==marks[j]){
                    System.out.println("Duplicate: " + marks[j]);
                }
            }
        }
    }
}
