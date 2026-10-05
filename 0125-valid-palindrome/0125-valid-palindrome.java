class Solution {
    public boolean isPalindrome(String s) {
    int i = 0;
    int e = s.length()-1;

    while(i<e){

        if(Character.isLetter(s.charAt(i))&& (Character.isLetter(s.charAt(e)))){


            if(Character.toLowerCase(s.charAt(i)) != (Character.toLowerCase(s.charAt(e)))) return false;
            i+=1;
            e-=1;
        }
        else if (Character.isDigit(s.charAt(i))&& (Character.isDigit(s.charAt(e)))){

            if(s.charAt(i)!= (s.charAt(e)))  return false;
            i+=1;
            e-=1;           
        }
        else if(!Character.isLetter(s.charAt(i))&& (!Character.isDigit(s.charAt(i)))){
            i+=1;
        }
        else if (!Character.isLetter(s.charAt(e))&& (!Character.isDigit(s.charAt(e)))){
            e-=1;
        }
        else{
            return false;
        }
    }
    return true;
        
    }
}