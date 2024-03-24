//import java.util.*;
//
//public class Hello {
//    static Map<Integer, String> numberPronunciationMap = null;
//    static Map<Integer, String> lengthPronunciationMap = null;
//
//    public static void main(String[] args) {
////        // Remove duplicates and print position
////        List<Integer> nums = Arrays.asList(10,12, 14, 10, 45, 67, 78,67,43,56,14);
////
////        Set<Integer> numsNoDuplicates = new LinkedHashSet<>();
////        List<Integer> duplicatePostion = new ArrayList<>();
////
////        for(int i=0; i<nums.size(); i++) {
////            if(numsNoDuplicates.contains(nums.get(i))) {
////                duplicatePostion.add(i);
////            } else {
////                numsNoDuplicates.add(nums.get(i));
////            }
////        }
////
////        numsNoDuplicates.forEach(e -> System.out.print(e+", "));
////        System.out.println();
////        duplicatePostion.forEach(p -> System.out.print(p+", "));
//
//    // 0 <= num <= 231
//
//      // map numbers and its pronunciation
//       numberPronunciationMap = new HashMap<>();
//       numberPronunciationMap.put(1, "One");
//        numberPronunciationMap.put(2, "Two");
//        numberPronunciationMap.put(10, "Ten");
//        numberPronunciationMap.put(11, "Eleven");
//        numberPronunciationMap.put(19, "Ninteen");
//        numberPronunciationMap.put(20, "Twenty");
//        numberPronunciationMap.put(30, "Thirty");
//        numberPronunciationMap.put(90, "Ninty");
//
//        // Input: num = 12345O utput: "Twelve Thousand Three Hundred Forty Five"
//        // map roundings and pronunciation
//        lengthPronunciationMap = new HashMap<>();
//        numberPronunciationMap.put(3, "Hundred");
//        numberPronunciationMap.put(4, "Thousand");
//        numberPronunciationMap.put(5, "Ten Thousand");
//        numberPronunciationMap.put(6, "Hundred Thousand");
//        numberPronunciationMap.put(7, "Million");
//
//
//    }
//
//     private static String printNumPronunciation() {
//         //int num = 123450;
//         int num = 123;
//         int rem = 0;
//
//         StringBuffer wordPronun = new StringBuffer();
//
//         if(String.valueOf(num).length() > 2) {
//             int numLength = String.valueOf(num).length();
//             if(numLength < 3) {
//                 return getPronunciation(num);
//                 //123 - 123 / 100 - 1 hud
//                 // 2234 - 2234 / 1000 - 2
//                 wordPronun.append(numberPronunciationMap.get(num / (numLength - 1)+" "); // One
//                 wordPronun.append(lengthPronunciationMap.get(numLength)+" "); // Hundered
//
//             }
//
//         }
//    // less than 99
//    private static String getPronunciation(int num) {
//        StringBuffer wordPro = new StringBuffer();
//        wordPro.append(numberPronunciationMap.get((num/10 * 10) )+" "); // seventy
//        wordPro.append(numberPronunciationMap.get((num%10) ));
//    }
//}
