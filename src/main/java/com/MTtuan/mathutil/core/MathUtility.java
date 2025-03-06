package com.MTtuan.mathutil.core;

public class MathUtility {
    //class này cung cấp các hàm liên quan toán hoạc.
    //nó là thư viện toán học. Mà thư viện tính toán thì các hàm thường sẽ là static
    //hàm tính n!
    //n! = 1.2.3...n, trong đ
    //0! = 1! = 1
    //mình không tính quá 20! vì 21! kiểu long chứa không nổi, sẽ tính sai
    //mình chỉ tính từ 0...20!
    //hàm nhận vào n, trả về n! (n trong oạn từ [0...20]
//    public static long getFactorial(int n) {
//        //kĩ thuật nhồi nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
//        //kĩ thuật nhân dồn, cộng dồn giá trị
//        long fact = 1;
//        if (n == 0) return 1; //thoát sớm khi có thể
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }
    public static long getFactorial(int n) {
        //kĩ thuật nhồi nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        //kĩ thuật nhân dồn, cộng dồn giá trị
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
