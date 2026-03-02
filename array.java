public class array {
    public static void main(String[] args) {
        int age = 19;
        int physics = 99;
        int chemistry = 90;
        int maths = 92;
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 99;
        marks[2] = 92;
        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);//this will show error becuase index 3 out of bound for length 3 
       
    }
}
