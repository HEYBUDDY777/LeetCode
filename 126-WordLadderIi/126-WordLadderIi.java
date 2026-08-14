// Last updated: 8/14/2026, 10:52:45 AM
class Solution {

    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> parents = new HashMap<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Set<String> dict = new HashSet<>(wordList);

        if (!dict.contains(endWord))
            return result;

        bfs(beginWord, endWord, dict);

        if (!parents.containsKey(endWord))
            return result;

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, path);

        return result;
    }

    private void bfs(String beginWord, String endWord, Set<String> dict) {

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        boolean found = false;

        while (!queue.isEmpty() && !found) {

            int size = queue.size();

            Set<String> currentLevelVisited = new HashSet<>();

            for (int i = 0; i < size; i++) {

                String word = queue.poll();
                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {

                    char original = arr[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        arr[j] = ch;
                        String nextWord = new String(arr);

                        if (!dict.contains(nextWord))
                            continue;

                        if (!visited.contains(nextWord)) {

                            if (!currentLevelVisited.contains(nextWord)) {
                                queue.offer(nextWord);
                                currentLevelVisited.add(nextWord);
                            }

                            parents.computeIfAbsent(nextWord,
                                    k -> new ArrayList<>()).add(word);

                            if (nextWord.equals(endWord))
                                found = true;
                        }
                    }

                    arr[j] = original;
                }
            }

            visited.addAll(currentLevelVisited);
        }
    }

    private void dfs(String word, String beginWord, List<String> path) {

        if (word.equals(beginWord)) {

            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            result.add(temp);
            return;
        }

        if (!parents.containsKey(word))
            return;

        for (String parent : parents.get(word)) {

            path.add(parent);
            dfs(parent, beginWord, path);
            path.remove(path.size() - 1);
        }
    }
}