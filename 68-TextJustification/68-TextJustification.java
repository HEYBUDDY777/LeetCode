// Last updated: 9/2/2026, 11:15:44 AM
1public class Solution {
2    public List<String> fullJustify(String[] words, int L) {
3        List<String> lines = new ArrayList<String>();
4        
5        int index = 0;
6        while (index < words.length) {
7            int count = words[index].length();
8            int last = index + 1;
9            while (last < words.length) {
10                if (words[last].length() + count + 1 > L) break;
11                count += words[last].length() + 1;
12                last++;
13            }
14            
15            StringBuilder builder = new StringBuilder();
16            int diff = last - index - 1;
17            // if last line or number of words in the line is 1, left-justified
18            if (last == words.length || diff == 0) {
19                for (int i = index; i < last; i++) {
20                    builder.append(words[i] + " ");
21                }
22                builder.deleteCharAt(builder.length() - 1);
23                for (int i = builder.length(); i < L; i++) {
24                    builder.append(" ");
25                }
26            } else {
27                // middle justified
28                int spaces = (L - count) / diff;
29                int r = (L - count) % diff;
30                for (int i = index; i < last; i++) {
31                    builder.append(words[i]);
32                    if (i < last - 1) {
33                        for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
34                            builder.append(" ");
35                        }
36                    }
37                }
38            }
39            lines.add(builder.toString());
40            index = last;
41        }
42        
43        
44        return lines;
45    }
46}