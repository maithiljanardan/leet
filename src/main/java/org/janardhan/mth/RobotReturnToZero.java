package org.janardhan.mth;

public class RobotReturnToZero {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UDL"));
    }

    public static boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        if (x == 0 && x == y)
            return true;
        else
            return false;

    }
}
