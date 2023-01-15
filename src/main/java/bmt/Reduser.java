package bmt;

public class Reduser {

    public static String Reduse(String pagesNum){
        if(CorrecterForSplit(pagesNum)){
            String[] strPage = pagesNum.split(",");
            for(int i = 0; i < strPage.length; i++){
                if(strPage[i] == "")
                    pagesNum = "Error: incorrected data";
                else{}
            }
            return pagesNum;
        }
        else{
            return "Error: incorrected data";
        }
        
    }

    static boolean CorrecterForSplit(String str){
        boolean indicate = false;
        int ind = 0;
        if(str == ""){
            indicate = false;
        }
        else{
            char[] chArray = str.toCharArray();
            int first = (int)(chArray[0]);
            int last = (int)(chArray[str.length()-1]);
            if((first<49 || first>57) || (last<48 || last>57))
                indicate = false;
            else{
                char[] correct = {'0','1','2','3','4','5','6','7','8','9',','};
                for(int i = 0; i < str.length(); i++){
                    ind = 0;
                    for(int j = 0; j < 11; j++){
                        if(chArray[i] == correct[j])
                            ind++;
                    }
                    if(ind!=1)
                        break;
                }
            }
        }
        if(ind==1)
            indicate = true;
        return indicate;
    }
}
