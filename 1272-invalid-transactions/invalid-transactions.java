class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        ArrayList<String> res = new ArrayList<>();
        String[] name = new String[n];
        int[] time = new int[n];
        int[] money = new int[n];
        String[] location = new String[n];
        for (int i = 0; i < n; i++) {
            String[] parts = transactions[i].split(",");
            name[i] = parts[0];
            time[i] = Integer.parseInt(parts[1]);
            money[i] = Integer.parseInt(parts[2]);
            location[i] = parts[3];
        }

        for (int i = 0; i < n; i++) {
        boolean InValid = false;
            if (money[i] > 1000) InValid = true;
            for (int j = 0; j < n && !InValid; j++) {
                if (i == j) continue;
                if (name[i].equals(name[j]) && Math.abs(time[i] - time[j]) <= 60 && !location[i].equals(location[j]))
                    InValid = true;
            }
            if (InValid) res.add(transactions[i]);
        }
        return res;
    }
}