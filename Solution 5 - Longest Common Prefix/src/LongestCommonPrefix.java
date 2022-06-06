public class LongestCommonPrefix {

    public static String arrayToString(String [] stringArray){
        StringBuilder myString = new StringBuilder("[");
        for(int i = 0; i < stringArray.length; ++i){
            myString.append(stringArray[i]);
            if(i != stringArray.length - 1){
                myString.append(", ");
            }
        }
        return myString + "]";
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 0; i < strs.length; ++i){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }





    public static void main(String [] args){


        //Returns "fl"
        String [] test1 = {"flower", "flow", "flight"};

        //Returns "arc"
        String [] test2 = {"arcing", "arc", "arctic", "arcs"};

        //Returns ""
        String [] test3 = {"dog", "racecar", "car"};

        //Returns ""
        String [] test4 = {"there", "is", "no", "common", "prefix"};

        System.out.println();
        System.out.printf("The given array is: %s\n", arrayToString(test1));
        System.out.printf("The longest common prefix is: %s\n\n", longestCommonPrefix(test1));

        System.out.printf("The given array is: %s\n", arrayToString(test2));
        System.out.printf("The longest common prefix is: %s\n\n", longestCommonPrefix(test2));

        System.out.printf("The given array is: %s\n", arrayToString(test3));
        System.out.printf("The longest common prefix is: %s\n\n", longestCommonPrefix(test3));

        System.out.printf("The given array is: %s\n", arrayToString(test4));
        System.out.printf("The longest common prefix is: %s\n\n", longestCommonPrefix(test4));
    }
}
