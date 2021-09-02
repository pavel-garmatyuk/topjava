public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 21;
        boolean manSex = true;
        double height = 1.79;
        char firstCharSet = 'M';
        if (age > 20) {
        System.out.println("You age > 20");
}

if (manSex) {
    System.out.println("You man");
}

if(!manSex) {
    System.out.println("You wooman");
}

if(height < 1.80) {
    System.out.println("You large");
} else {
    System.out.println("You short");
}

if(firstCharSet == 'M') {
    System.out.println("M");
} if else (firstCharSet == 'I') {
    System.out.println("I");
} else {
    System.out.println("Other");
}
}
}