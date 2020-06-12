public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {1, 2, 3};
        dot.setLocationCells(locations);

        String userGuess = "3";
        String result = dot.checkYourself(userGuess);
        String testResult = "Failed";
        if (result.equals("Hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);
    }
}
