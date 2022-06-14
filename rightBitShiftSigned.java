class rightBitShiftSigned{
    public static void main(String[] args) {
        int x=-0b1010; // -10
        int y=0;
        
        y = x >>> 1;// right shift X signed bit by one, assign to y
        
        System.out.println(String.format("%s", Integer.toBinaryString(x))); 
        System.out.println(String.format("%s", Integer.toBinaryString(y)));
    }
}
