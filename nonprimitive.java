public class nonprimitive {

    public static void main(String[] args) {
        String name1 = "Rohit";
        String name2 = "Varun";
        String name3 = name1 + " and " + name2;

        System.out.println(name3);
        System.out.println(name3.charAt(0));

        String name = "Aman"; 
        System.out.println(name.length()); 

        String name4 = name.replace('a', 'b');
        System.out.println(name4);

        //string substring 
        String name5 = "Aman and Akku";
        System.out.println(name.substring(0,4));
    }

}

//note : String are immutable 