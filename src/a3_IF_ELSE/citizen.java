package a3_IF_ELSE;

public class citizen {
    public static void main(String[] args) {

        boolean isSenierCitizen = false;
        boolean isAdult = true ;

        if (isSenierCitizen){
            System.out.println("Hey Senior Citizen");
        }
        else {
            if (isAdult){
                System.out.println("Hey Adult");
            }
            else {
                System.out.println("Hey Child");
            }
        }
    }
}
