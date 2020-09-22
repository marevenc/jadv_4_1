import java.util.Random;

public class StringGenerator {
    int leftLimit = 97;
    int rightLimit = 122;
    int stringLength = 15;
    Random random = new Random();

    public String generateString(){
        StringBuilder builder = new StringBuilder(stringLength);
        for(int i = 0; i < stringLength; i++){
            int randomInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            builder.append((char) randomInt);
        }
        return builder.toString();
    }
}
