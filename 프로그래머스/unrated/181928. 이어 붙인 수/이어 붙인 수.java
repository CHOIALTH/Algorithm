class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String x="", y="";
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                x += num_list[i];
            }
            else{
                y += num_list[i];
            }
        }
        answer = Integer.parseInt(x) + Integer.parseInt(y);
        return answer;
    }
}