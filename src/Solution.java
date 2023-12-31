public class Solution {
    public static void main(String[] args) {
        int [] array = {3, 6, 1, 1, 7, 12};
        System.out.println("The Total Sum of the Array Elements: " + getTotalSum(array));
        System.out.println("The Largest Element in Array: " + getLargestElement(array));
        boolean b = getEvenOddNumber(33);
        getEvenOddNumbersinArray(array);
        reverseArray(array);
        System.out.println("The Factorial Value is: " + getFactorialValue(5));
        System.out.println("The Factorial Value in Recursive Way: " + getFactValue(7));
        char [] palindromString = {'M', 'O', 'M'};
        System.out.println("The Given String is Palindrome: " + isPalindrome(palindromString));
        System.out.println("The Given Number is a Prime Number: " + getPrimeNumber(17));
        fibonacciSeries(13);
        // fibonacci series in recursive way
        int element = 8;
        System.out.println("The Fibonacci Series of " + element+ " is in Recursive Way: ");
        for(int i = 0; i < element; i++){
            System.out.print(generateFibonacciSeries(i) + " ");
        }
        System.out.println();
        System.out.println("The Element of the Array is Present: " + getTheElement(array,7));
        binarySearchElement(array,1);
        System.out.println("The Duplicate Elements is: " + findDuplicateElement(array));
        countVowelConsonant("apple");
        multiplication(2);
        // Add two matrix
        int[][] matrix1 = { {1, 2, 3, 4, 5},
                {4, 5, 6, 7, 8},
                {7, 8, 9, 10, 11},
                {10, 11, 12, 13, 14},
                {13, 14, 15, 16, 17} };
        int[][] matrix2 = {{17, 23, 25, 24, 13},
                {24, 23, 22, 27, 21},
                {27, 28, 29, 30, 11},
                {24, 25, 26, 27, 28},
                {21, 22, 23, 24, 25} };
        addTwoMatrix(matrix1, matrix2);
        System.out.println("Average of the Array Elements: " + averageCalculation(array));
        System.out.println("The Year is a Leap Year: " + checkLeapYear(2024));
        patternPrint();
        stringReversal("apple");
        checkArmstrongNumber(1634);
        findMaxandMin(array);
        System.out.println("The Simple Interest Value is: " + calculateSimpleInterest(2400, 5, 2));
        System.out.println("Convert Temperature from Celsius to Fahrenheit: " + getTemperature(34.2) + "F" );
        checkInput('S');
        System.out.println("The Second Largest Element: " + findSecondLargestElement(array));
        char[] string = {'h','2','3','l','l','4','o','6','9','w','o','7','r','8','0','l','d','4'};
        System.out.println("The Summation of All the Numbers in the String is: " + getSumInString(string));
    }
    // 1. Sum of Array Elements
   public static int getTotalSum (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    // 2. Largest Element in Array
    public static int getLargestElement (int[] arr){
        int large = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
    // 3. A Given Number is Even or Odd
    public static boolean getEvenOddNumber (int a){
        if(a % 2 == 0){
            System.out.println("The Number " + a + " is Even");
            return true;

        }
        else{
            System.out.println("The Number " + a + " is Odd");
            return false;
        }
    }
    // 3.1 Number of even or odd numbers in Array
    public static void getEvenOddNumbersinArray(int[] arr){
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;

            }
            else {
                count2++;
            }
        }
        System.out.println("The Number of Even Numbers in Array: " + count);
        System.out.println("The Number of Odd Numbers in Array: " + count2);
    }
    // 4. Reverse an Array
    public static void reverseArray(int[] arr){
        System.out.println("After Reversing The Array: ");
        for(int i = arr.length - 1; i >= 0; i-- ){
            System.out.print(arr[i] + " ");
        }
    }
    // 5. Factorial Calculation
    public static int getFactorialValue (int n){
        int factorialValue = 1;
        for(int i = n; i >= 1; i--){
           factorialValue *= i;
        }
        return factorialValue;
    }
    // 5.1 Factorial Calculation in Recursive Way
    public static int getFactValue (int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * getFactValue(n-1);
        }
    }
    // 6. Palindrome Check
    public static boolean isPalindrome (char[] x){
            boolean palindrome = false;
        for(int i = 0, j = x.length - 1; j >= 0; i++, j--){
            if (x[i] == x[j]){
                 palindrome = true;
            }
            else {
                 palindrome = false;
            }
        }
        return palindrome;
    }
    // 7. Prime Number Check
    public static boolean getPrimeNumber (int n) {
        boolean primeNumber = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primeNumber = false;
                break;
            } else {
                primeNumber = true;
            }

        }
        return primeNumber;
    }
    // 8. Generate Fibonacci Series
    public static void fibonacciSeries(int n){
        int n1 = 0, n2 = 1, temp = 0;
        System.out.println("The Fibanacci Series of " + n + " is: ");
        System.out.print(n1 + " " + n2);
        for(int i = 2; i < n; i++){
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(" " + temp);
        }
        System.out.println();
    }
    // 8.1 Fibonacci Series in Recursive Way
    public static int generateFibonacciSeries(int n){
        if (n <= 1){
            return n;
        }
        else{
            return generateFibonacciSeries(n - 1) + generateFibonacciSeries(n - 2);

        }
    }
    // 9. Linear Search
    public static boolean getTheElement(int[]arr, int x){
        boolean element = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                element = true;
                break;
            }
            else {
                element = false;
            }
        }
        return element;
    }
    // 10. Binary Search
    public static void binarySearchElement(int[]arr, int n){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if (n == arr[mid]){
                System.out.println("The element is found at the " + mid + " position");
                break;
            }
            else if(n < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("The Element is not Found in the Array");
    }
    // 11. Find Duplicate Elements
    public static int findDuplicateElement(int[]arr){
        int duplicate = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1) break;
            if(arr[i] == arr[i+1]){
                duplicate = arr[i];
                break;
            }
            else{
                duplicate = 0;
            }
        }
        return duplicate;
    }
    // 12. Count Vowel or Consonant of a given String
    public static void countVowelConsonant(String word){
        int vowelCount = 0, consCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowelCount++;

            } else {
                consCount++;

            }
        }
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants:" + consCount);

    }
    // 13. Multiplication Table
    public static void multiplication(int n){
        System.out.println("Multiplication Table for " + n);
        for (int i = 1; i <= 10; i++){
            System.out.println(n+" x "+i +" = "+ n * i);
        }
    }
    // 14. Add Two Matrix and return 2d array
    public static void addTwoMatrix(int[][]matrix1, int[][]matrix2){
        int rows = matrix1.length;
        int column = matrix1.length;
        int[][] result = new int[rows][column];
        System.out.println("After Adding Two Matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    // 15. Calculate Average Value of the Array Elements
    public static double averageCalculation (int[]arr){
        double average = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
    }
    // 16. Leap Year Check
    public static boolean checkLeapYear(int year){
        boolean leapYear = false;
        if (year % 4 == 0 && year % 100 != 0){
            leapYear = true;
        }
        else {
            leapYear = false;
        }
        return leapYear;
    }
    // 17. Pattern Print Using Loop
    public static void patternPrint(){
        int rows  = 5;
        System.out.println("Pyramid Pattern");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++) {
                    System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }
    // 18. String Reversal
    public static void stringReversal(String word){
        System.out.print("After Reversing the String: ");
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));

        }
        System.out.println();
    }
    //Check if a number is Armstrong number or not
    public static void checkArmstrongNumber(int n){
        int r, power= 0, sum = 0;
        int temp = n;
        for(int i = n; i != 0; i = i /10){
            power++;
        }
        while (n > 0){
            r = n % 10;
            n = n / 10;
            sum = (int) (sum + Math.pow(r, power));

        }
        if(sum == temp){
            System.out.println("The Number " + temp+ " is an Armstrong Number");
        }
        else {
            System.out.println("The Number " + temp+ " is  not an Armstrong Number");
        }
    }
    // 20. Find the Maximum and Minimum element in the Array
    public static void findMaxandMin(int[]arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The Maximum Element of the Array: " + max);
        System.out.println("The Minimum Element of the Array: " + min);
    }
    // 21. Calculate Simple Interest
    public static int calculateSimpleInterest(int principle, int interestRate, int time){
        int simple_interest = (principle + interestRate + time) / 100;
        return simple_interest;
    }
    // 22. Convert Temperature Celsius to Fahrenheit
    public static double getTemperature(double c){
        double f;
        f = (9 / c) + 32;
        return f;

    }
    // 23. checks whether an input character is an uppercase letter or lowercase letter or a special 24. character
    public static void checkInput(char c){
        if(c >= 'A' && c <= 'Z'){
            System.out.println(c + " is an Uppercase Letter");
        }
        else if(c >= 'a' && c <= 'z'){
            System.out.println(c + " is a Lowercase Letter");
        }
        else if(c == (char) 24){
            System.out.println(c + " character is a Special 24. Character");
        }
        else {
            System.out.println(c + " is neither uppercase, lowercase or special character");
        }
    }
    // 24. Find Second Largest Number in Array
    public static int findSecondLargestElement(int[] arr){
        int max = arr[0];
        int secondMax = arr[1];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > secondMax && secondMax > max){
                secondMax = arr[i];
                max = secondMax;
            }
        }
        return secondMax;
    }
    // 25. Summation of All the Numbers in a string
    public static int getSumInString(char[] s){
        int sum = 0, intValue;
        char c;
        for(int i = 0; i < s.length; i++){
            if(s[i] >= '0' && s[i] <= '9'){
                c = s[i];
                intValue = c - '0'; //using ascii value of c and 0
                sum = sum + intValue;
            }
        }
        return sum;
    }


}
