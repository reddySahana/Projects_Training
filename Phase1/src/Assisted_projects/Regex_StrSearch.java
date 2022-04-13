package Assisted_projects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex_StrSearch {
    public static void main(String[] args){

        String regex = "Mohandas KaramChand Gandhi (.*?) Gandhiji";

        String strToSearch = "Mohandas KaramChand Gandhi also known as Gandhiji. Mohandas KaramChand Gandhi is famous as  Gandhiji";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(strToSearch);

        while (matcher.find()) {

            System.out.println("Text is at "+matcher.group()+"::"+matcher.start()+"::     "+matcher.end());
            System.out.println(matcher.groupCount());

            System.out.println(matcher.group(1));
        }
    }
}



