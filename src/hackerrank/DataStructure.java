package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DataStructure {

    public static void array1D() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        for (int anA : a) {
            System.out.println(anA);
        }
    }

    public static void array2D() {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                arr[i][j] = in.nextInt();
                if (i > 1 && j > 1) {
                    int sum = arr[i][j]
                            + arr[i][j - 1]
                            + arr[i][j - 2]
                            + arr[i - 1][j - 1]
                            + arr[i - 2][j]
                            + arr[i - 2][j - 1]
                            + arr[i - 2][j - 2];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void subArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int numberOfSubArrays = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    ++numberOfSubArrays;
                }
            }
        }
        System.out.println(numberOfSubArrays);
    }

    public static void arrayList() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int d = in.nextInt();
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; ++j) {
                row.add(in.nextInt());
            }

            rows.add(row);
        }

        int q = in.nextInt();

        for (int i = 0; i < q; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();

            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }

    public static void array1dPart2() {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for (int j = 0; j < q; j++) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            if (canWin(leap, game, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }

    private static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        if ((i == game.length - 1) || i + leap > game.length - 1) {
            return true;
        }

        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }

    public static void list() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            int value = scan.nextInt();
            list.add(value);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; ++i) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    public static void map() throws IOException {

        BufferedReader inputValues = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(inputValues.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String name = inputValues.readLine();
            int phone = Integer.valueOf(inputValues.readLine());
            map.put(name, phone);
        }


        String s;
        while ((s = inputValues.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        inputValues.close();
    }

    public static void stack() {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false");
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, Map<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void hashSet() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> set = new HashSet<>(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }

    class genericPrinter {
        public <T> void printArray(T[] array) {
            for (T item : array) {
                System.out.println(item);
            }
        }
    }

    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        class PlayerComparator implements Comparator<Player> {
            @Override
            public int compare(Player p1, Player p2) {
                if (p1.score == p2.score) {
                    return p1.name.compareTo(p2.name);
                } else {
                    return p2.score - p1.score;
                }
            }
        }
    } // Challenge "Comparator"

    class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        int getId() {
            return id;
        }

        String getFname() {
            return fname;
        }

        double getCgpa() {
            return cgpa;
        }

        class StudentComparator implements Comparator<Student> {
            double precision = 0.001;

            @Override
            public int compare(Student s1, Student s2) {
                if (Math.abs(s1.getCgpa() - s2.getCgpa()) > precision) {
                    return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                } else {
                    return s1.getId() - s2.getId();
                }
            }
        }
    } // Challenge "Sort"

    public static void dequeue() {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashSet set = new HashSet();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m + 1) {
                int q_out = (int) deque.remove();
                if (!deque.contains(q_out)) {
                    set.remove(q_out);
                }
            }
            max = Math.max(set.size(), max);
        }
        System.out.println(max);
    }

    public static void bitSet() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while (M-- > 0) {

            String str = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch (str) {
                case "AND":
                    if (a == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        B1.flip(b);
                    } else {
                        B2.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        B1.set(b);
                    } else {
                        B2.set(b);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close();
    }

    class PrioritiesQueue{
        public ArrayList<Student> getStudents(List<String> events)
        {
            int n = events.size();
            PriorityQueue<Student> pq = new PriorityQueue<Student>();
            for(String i:events)
            {
                String[] s = new String[4];
                s = i.split("\\s");
                if(s.length>1)
                {
                    pq.add(new Student(Integer.valueOf(s[3]), s[1],Double.valueOf(s[2])));
                }
                else
                {
                    pq.poll();
                }
            }
            while(pq.size()>1)
            {
                System.out.println(pq.poll());
            }
            return new ArrayList<Student>(pq);
        }
    } // Challenge "PriorityQueue"

}

