package Day3;
//Write a function which returns a character of a given index,from a given String.
//Pass as a parameters String str, int index
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(returnCharacter("Amazon",3));
    }
    public static char returnCharacter(String str,int index){
        return str.charAt(index);
    }
}
