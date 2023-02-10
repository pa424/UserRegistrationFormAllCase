package junit.Bridglab;
public class MoodAnalyser {

    public String analyseMood(String msg) {
        if(msg.contains("sad")){
            return "Sad";
        }
        return "Happy";
    }
}