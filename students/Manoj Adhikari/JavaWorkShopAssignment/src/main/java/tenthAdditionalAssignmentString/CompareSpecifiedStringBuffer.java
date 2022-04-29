package tenthAdditionalAssignmentString;

public class CompareSpecifiedStringBuffer {
    public static void main(String[] args) {

        String str1 = "Takeo.com", str2 = "takeo.com";
        StringBuffer strbuf = new StringBuffer(str1);

        System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));

        System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));

    }
}
