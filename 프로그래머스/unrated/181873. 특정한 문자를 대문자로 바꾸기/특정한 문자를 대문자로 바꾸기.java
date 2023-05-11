class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(String.valueOf(arr[i]).equals(alp)){
                answer += String.valueOf(arr[i]).toUpperCase();
            }
            else{
                answer += String.valueOf(arr[i]);
            }
        }
        return answer;
    }
}