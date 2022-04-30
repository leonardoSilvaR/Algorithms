public class BitShifting {

    private static Integer bitShift() {
        //int can store a number with max size of 32 bits
        int someNumber = 10;//Binary Representation => 00000000 00000000 00000000 00001010
        System.out.println(String.format("%32s", Integer.toBinaryString(someNumber)).replace(" ", "0"));
        int newNumber = someNumber << 1;//Binary Representation => 00000000 00000000 00000000 00010100
        System.out.println(String.format("%32s", Integer.toBinaryString(newNumber)).replace(" ", "0"));
        System.out.println(newNumber);

        return null;
    }


    public static void main(String[] args) {
        BitShifting.bitShift();
    }
}
