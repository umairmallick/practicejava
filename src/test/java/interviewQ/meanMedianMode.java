package interviewQ;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class meanMedianMode {

    public static void main(String[] args) {
        double[] value = new double[]{1,2,9,2,43,4,34,4,5};


        System.out.println("Mean is = " + mean(value));
        System.out.println("Median is = " + median(value));
        System.out.println("Mode is = " + mode(value));
        System.out.println(Arrays.toString(sortArray(value)));

//        Integer[] as={2,1,4,5,1,2,6,8,4,5,2,1,6,3};
//        for (Integer each : as) {
//            int  count = Collections.frequency(Arrays.asList(as),each);
//            System.out.println(count);
//
//            System.out.println(each+ "is "+ count+" times");
//        }


    }

        public static double mean(double[] arr){

            double sum = 0;
            for (double each : arr) {
                sum+=each;
            }

            return sum/ arr.length;
        }

        public static double median(double[] arr){
            double[] newArr = sortArray(arr);
            double sum=0;
            int n = newArr.length;
            if(n%2==0){
                sum = newArr[(n/2)-1]+newArr[n/2];
                return sum/2;
            }
            return newArr[n/2];

        }

        public static ArrayList<Double> mode(double[] arr){
//        if(arr.length<=2) return null;
//        ArrayList<Double> list = new ArrayList<>();
//        Double[] newArr = new Double[arr.length];
//        Arrays.setAll(newArr, e->arr[e]);
//        Map<Double,Integer> lmap = new LinkedHashMap<>();
//        int max = 2;
//            for (double each : arr) {
//                int count = Collections.frequency(Arrays.asList(newArr), each);
//                if (count >= max) {
//                    max = count;
//                    lmap.put(each, count);
//                }
//            }
//
//                for (Map.Entry<Double, Integer> each : lmap.entrySet()) {
//                    if (each.getValue()==max) {
//                        list.add(each.getKey());
//                    }
//            }
//                if(list.isEmpty()) return null;
//                return list;
            if(arr.length<=2) return null;
            ArrayList<Double> list = new ArrayList<>();
            Double[] newArr = new Double[arr.length];
            LinkedHashMap<Double,Integer> map = new LinkedHashMap<>();
            Arrays.setAll(newArr,i->arr[i]);
            int max=0;
            for (Double each : newArr) {
                int count = Collections.frequency(Arrays.asList(newArr), each);
                if (count >= max) {
                    max = count;
                    map.put(each, count);
                }
            }
                for (Map.Entry<Double, Integer> each : map.entrySet()) {
                    if(each.getValue() == max) list.add(each.getKey());
                }
            return list;
        }

        public static double[] sortArray(double[] arr){
        int n = arr.length;

            for (int i = 0; i < n; i++) {
                double count =0;
                for (int j = i+1; j < n; j++) {
                    if(arr[i]>arr[j]){
                        count = arr[i];
                        arr[i] = arr[j];
                        arr[j] = count;
                    }
                }
            }
            return arr;
        }




}
