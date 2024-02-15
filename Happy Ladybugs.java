class Result {

    /*
     * The 'happyLadybugs' function below.
     * Happy Ladybugs is a board game exercise from HackerRank
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */

    public static String happyLadybugs(String b) {
    // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (Character ch : b.toCharArray()) {
            if(map.computeIfPresent(ch, (key, val) -> val += 1) == null)
                map.put(ch, 1);
        }
        
        System.out.println(map);
        
        for (Character entry : map.keySet()) {
            if(entry != '_' && map.get(entry) == 1)
                return "NO";
        }
        
        if(!map.containsKey('_')) {
            for (int i = 1; i < b.length() - 1;i++) {
                if(b.charAt(i - 1) != b.charAt(i) && 
                    b.charAt(i + 1) != b.charAt(i))
                        return "NO";
            }
        }
    
        return "YES";
    }

}
