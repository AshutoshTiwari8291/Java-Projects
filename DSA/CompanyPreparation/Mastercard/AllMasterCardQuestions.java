package CompanyPreparation.Mastercard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllMasterCardQuestions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> a = list.stream().filter(e -> e%2==0).map(e -> e*e).collect(Collectors.toList());
        System.out.println(a);

        List<String> listOfString = Arrays.asList("New York", "New Jersey", "New Town");

        List<String> sortedListOfString  = listOfString.stream().sorted().toList();
        System.out.println(listOfString);
        System.out.println(sortedListOfString);

        int n = listOfString.size();

        for (int i=0; i< n-1; i++) {
            for (int j=0; j< n-i-1; j++) {
                if (listOfString.get(j).compareTo(listOfString.get(j+1)) > 0) {
                    String temp = listOfString.get(j);
                    listOfString.set(j, listOfString.get(j+1));
                    listOfString.set(j+1, temp);
                }
            }
        }
        System.out.println(listOfString);

    }

}
