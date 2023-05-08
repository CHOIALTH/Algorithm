class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] arr = binomial.split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[2]);
        if(arr[1].equals("+")){
            answer = A + B;
        }
        else if(arr[1].equals("-")){
            answer = A - B;
        }
        else if(arr[1].equals("*")){
            answer = A * B;
        }
        return answer;
    }
}