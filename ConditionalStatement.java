public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("You age > 20");
        }
        boolean male = true;
        if (male) {
            System.out.println("You man");
        }
        if(!male) {
            System.out.println("You wooman");
        }
        double height = 1.79;
        if(height < 1.80) {
            System.out.println("You large");
        } else {
            System.out.println("You short");
        }
        char firstLetterName = 'M';
        if(firstLetterName == 'M') {
            System.out.println("M");
        } if else (firstLetterName == 'I') {
            System.out.println("I");
        } else {
            System.out.println("Other");
        }
    }
}