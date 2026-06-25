class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char head=s.charAt(left);
            char tail=s.charAt(right);
            if(head>='A' && head<='Z'){
                head=(char) (head+32);
            }
            
            else if(!((head>='a' && head <='z')|| (head>='0' && head <='9'))){
                left++;
                continue;
            }
            
            if(tail>='A' && tail<='Z'){
                tail=(char)(tail+32);
            }
            else if(!((tail>='a' && tail<='z') ||(tail>='0' && tail<='9'))){
                right--;
                continue;
            }
            
            if(head!=tail){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}