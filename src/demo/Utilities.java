package demo;

public class Utilities {

    public char[] everyNthChar(char[] sourceArray, int n) {

        if(sourceArray == null || sourceArray.length < n) {
          return  sourceArray;
        }

        int returnetLenth = sourceArray.length /n;
        char[] result = new char[returnetLenth];
        int index = 0;

        for (int i = n -1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }


    //przyklad -> AABBCCDD -> ABCD
    public String removePairs(String source) {
        if (source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length -1; i++) {
            System.out.println(string[i]); //reczny debagging :)
            if(string[i] != string[i+1]) {
                sb.append(string[i]);
            }

        }

        System.out.println(string[string.length-1]);
        sb.append(string[string.length-1]);
        return sb.toString();
    }


    //pseudo logika biznesowa:)
    public int converter(int a, int b) {
        return (a/b) + (a*30 )-2;
    }

    public String nullOfOddLenth(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }
        return null;
    }
}
