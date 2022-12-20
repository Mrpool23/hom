package homework2.home;

import java.util.*;

public class _String {
        public static void main(String[] args)
        {
            List<String> string = new ArrayList<>(
                    Arrays.asList(
                            "QWERetrew",
                            "fgregsgr",
                            "fefeaewea"
                    )
            );
            System.out.println(string);
            Collections.reverse(string);
            System.out.println(string);
        }
}