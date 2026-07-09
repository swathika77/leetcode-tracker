// Last updated: 09/07/2026, 10:11:12
class Solution {
    public static final String[][] board = {
        {"","M","MM","MMM","","","","","",""},
        {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        {"","I","II","III","IV","V","VI","VII","VIII","IX"},
    };
    public String intToRoman(int num) {
        //StringBuilder sb = new StringBuilder();
        //sb.append(board[0][num/1000]);
        //sb.append(board[1][(num%1000)/100]);
        //sb.append(board[2][(num%100)/10]);
        //sb.append(board[3][(num%10)]);
        //return sb.toString();
        return board[0][num/1000].concat(board[1][(num%1000)/100]).concat(board[2][(num%100)/10]).concat(board[3][(num%10)]);
    }
}