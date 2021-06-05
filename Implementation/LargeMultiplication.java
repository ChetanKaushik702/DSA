class Multiply {

    void multiply(String num1, String num2) {
        int res[] = new int[num1.length() + num2.length() + 1] ;
        int carry = 0, indic = 1, index = 1 ;

        for (int i = num2.length() - 1 ; i >= 0 ; i--) {

            for (int j = num1.length() - 1 ; j >= 0 ; j--) {
                int prod = (num1.charAt(j) - 48) * (num2.charAt(i) - 48) + carry + res[index] ;
                res[index] = prod % 10 ; 
                carry = prod / 10 ;
                index += 1;
            }

            while (carry != 0) {
                res[index] = carry % 10 ;
                carry /= 10 ;
            }

            indic += 1 ;
            index = indic ;
        }

        for (int i = res.length - 1 ; i >= 1 ; i --)
            System.out.print(res[i]);
    }

    public static void main(String[] args) {
        var ob = new Multiply();
        ob.multiply("1234567892973923623826463826386268368837487389999", "1234567892973923623826463826386268368837487389999");
    }
}

/*
    num1 = "1234", num2 = "59"
    res[7];
    c = 0, ind = 1, id = 1 ;
    i = 1
        j = 3 -> prod = 4 * 9 + 0 = 36 -> prod = 36 + 0 -> res[1] = 6 -> c = 3 -> index = 2
        j = 2 -> prod = 3 * 9 + 3 = 30 -> prod = 30 + 0 -> res[2] = 0 -> c = 3 -> index = 3
        j = 1 -> prod = 2 * 9 + 3 = 21 -> prod = 21 + 0 -> res[3] = 1 -> c = 2 -> index = 4
        j = 0 -> prod = 1 * 9 + 2 = 11 -> prod = 11 + 0 -> res[4] = 1 -> c = 1 -> index = 5
        res[5] = 1 -> c = 0
    c = 0, ind = 2, id = 2 ;
    i = 0
        j = 3 -> prod = 4 * 5 + 0 = 20 -> prod = 20 + 
*/