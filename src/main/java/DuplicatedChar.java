public class DuplicatedChar {
    public static void main(String[] args) {

        String a="techtorialandcodefish";
        String duplicated="";

        for (int i=0;i<a.length();i++){
            for (int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    duplicated+=a.charAt(j);
                    break;
                }
            }

        }
        System.out.println(duplicated);
    }
}
