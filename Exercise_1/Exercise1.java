public class Exercise1 {

    static boolean iwillNotCheat = false;
    static boolean iwillWin = false;

    public static void main(String[] args) throws Exception {
        
        assert iwillNotCheat == true: " i will not cheat!!";

        assert iwillWin== true: "i will do everything to win!!!";
        
        enterCompetition();
    
    }

    static void enterCompetition(){
        iwillNotCheat = false;
    }
}
