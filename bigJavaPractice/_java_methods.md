# 📘 Java Useful Methods Cheat-Sheet (Complete)

### 🔡 String

- `equals()` / `equalsIgnoreCase()` — compare values
- `length()` — length
- `charAt(i)` — char at index
- `substring(begin,end)` — slice
- `toLowerCase()` / `toUpperCase()` — case change
- `trim()` — strip ends
- `contains("...")` — has substring
- `startsWith(...)` / `endsWith(...)` — prefix/suffix
- `indexOf(...)` / `lastIndexOf(...)` — find position
- `split("...")` — tokenize
- `replace("a","b")` — swap

---

### 🔢 Math

- `Math.max(a,b)` / `Math.min(a,b)`
- `Math.abs(x)`
- `Math.pow(a,b)`
- `Math.sqrt(x)`
- `Math.random()`
- `Math.round(x)`, `Math.ceil(x)`, `Math.floor(x)`

---

### 📦 Collections

**ArrayList** — `add(x)`, `get(i)`, `set(i,x)`, `remove(i)`, `size()`, `contains(x)`, `isEmpty()`

**HashMap** — `put(k,v)`, `get(k)`, `containsKey(k)`

**HashSet** — `add(x)`, `contains(x)`, `remove(x)` (unique only)

---

### 📅 Date & Time (`java.time`)

- `LocalDate.now()`, `LocalTime.now()`, `LocalDateTime.now()`
- `plusDays(n)`, `minusDays(n)`
- `format(formatter)`

---

### 📄 Files (`java.nio.file`)

- `Files.readAllLines(Path)`
- `Files.write(Path, data)`
- `new File("name.txt").exists()`

---

### 🎲 Random & UUID

- `new Random().nextInt(n)`
- `new Random().nextDouble()`
- `UUID.randomUUID()`

---

### 📥 Scanner (`java.util.Scanner`)

**Read:**

- `next()` — next word (stops at space)
- `nextLine()` — whole line
- `nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`, `nextByte()`, `nextShort()`

**Check before read:**

- `hasNext()` / `hasNextLine()`
- `hasNextInt()` / `hasNextDouble()` / `hasNextFloat()` / `hasNextLong()` / `hasNextByte()` / `hasNextShort()`

> Tip: After `nextInt()`/`nextDouble()` etc., run `sc.nextLine()` once to eat the leftover newline.

---

### 🧾 System & Object

- `System.out.println(x)`
- `System.currentTimeMillis()`
- `System.exit(0)`
- `Objects.isNull(x)` / `Objects.nonNull(x)`
- `Objects.equals(a,b)` (null-safe)---

// 📦 Import statements
import java.util._; // Scanner, ArrayList, HashMap, HashSet, Random, UUID, Arrays, Objects
import java.nio.file._; // Paths, Files (read/write text files)
import java.io._; // IOException / File
import java.time._; // LocalDate, LocalTime, LocalDateTime

public class Main {
public static void main(String[] args) throws Exception {
// =====================
// 📥 SCANNER — FULL DEMO
// =====================
Scanner sc = new Scanner(System.in);

    // Read a single word
        System.out.print("Enter a word: ");
        String word = sc.next();                 // stops at whitespace
        System.out.println("Word: " + word);

    sc.nextLine(); // consume leftover newline after next()

    // Read a full sentence
        System.out.print("Enter a full line: ");
        String line = sc.nextLine();             // entire line
        System.out.println("Line: " + line);

    // Guarded numeric reads
        System.out.print("Enter an int: ");
        int i;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println("Int: " + i);
        } else {
            System.out.println("Not an int, skipping: " + sc.next());
        }

    System.out.print("Enter a double: ");
        double d;
        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
            System.out.println("Double: " + d);
        } else {
            System.out.println("Not a double, skipping: " + sc.next());
        }

    System.out.print("Enter a long: ");
        long lg;
        if (sc.hasNextLong()) {
            lg = sc.nextLong();
            System.out.println("Long: " + lg);
        } else {
            System.out.println("Not a long, skipping: " + sc.next());
        }

    System.out.print("Enter a float: ");
        float f;
        if (sc.hasNextFloat()) {
            f = sc.nextFloat();
            System.out.println("Float: " + f);
        } else {
            System.out.println("Not a float, skipping: " + sc.next());
        }

    System.out.print("Enter a byte: ");
        byte by;
        if (sc.hasNextByte()) {
            by = sc.nextByte();
            System.out.println("Byte: " + by);
        } else {
            System.out.println("Not a byte, skipping: " + sc.next());
        }

    System.out.print("Enter a short: ");
        short sh;
        if (sc.hasNextShort()) {
            sh = sc.nextShort();
            System.out.println("Short: " + sh);
        } else {
            System.out.println("Not a short, skipping: " + sc.next());
        }

    // After numeric reads, clear newline before nextLine()
        if (sc.hasNextLine()) sc.nextLine();

    System.out.println("Has another token? " + sc.hasNext());
        System.out.println("Has another line? " + sc.hasNextLine());

    // =====================
        // 🔡 STRING
        // =====================
        String s = " Harry ";
        System.out.println("equals: " + "harry".equals("harry"));
        System.out.println("equalsIgnoreCase: " + "harry".equalsIgnoreCase("HARRY"));
        System.out.println("length: " + s.length());
        System.out.println("charAt: " + s.charAt(1));
        System.out.println("substring: " + s.substring(1, 4));
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("trim: '" + s.trim() + "'");
        System.out.println("contains: " + s.contains("rr"));
        System.out.println("startsWith: " + s.trim().startsWith("Ha"));
        System.out.println("endsWith: " + s.trim().endsWith("ry"));
        System.out.println("indexOf: " + s.indexOf("r"));
        System.out.println("split: " + Arrays.toString("a,b,c".split(",")));
        System.out.println("replace: " + "dog".replace("d", "f"));

    // =====================
        // 🔢 MATH
        // =====================
        System.out.println("Math.max: " + Math.max(5, 9));
        System.out.println("Math.min: " + Math.min(5, 9));
        System.out.println("Math.abs: " + Math.abs(-42));
        System.out.println("Math.pow: " + Math.pow(2, 3));
        System.out.println("Math.sqrt: " + Math.sqrt(16));
        System.out.println("Math.random: " + Math.random());
        System.out.println("Math.round: " + Math.round(3.6));
        System.out.println("Math.ceil: " + Math.ceil(3.1));
        System.out.println("Math.floor: " + Math.floor(3.9));

    // =====================
        // 📦 COLLECTIONS
        // =====================
        ArrayList`<String>` list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.set(1, "green");
        System.out.println("ArrayList get: " + list.get(0));
        System.out.println("ArrayList size: " + list.size());
        System.out.println("ArrayList contains: " + list.contains("red"));
        list.remove("red");
        System.out.println("ArrayList after remove: " + list);

    HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println("HashMap get: " + map.get("a"));
        System.out.println("HashMap containsKey: " + map.containsKey("b"));

    HashSet`<String>` set = new HashSet<>();
        set.add("dog");
        set.add("cat");
        set.add("dog"); // duplicate ignored
        System.out.println("HashSet: " + set);

    // =====================
        // 📅 DATE & TIME
        // =====================
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today: " + today);
        System.out.println("Now: " + now);
        System.out.println("DateTime: " + dateTime);
        System.out.println("Plus days: " + today.plusDays(5));

    // =====================
        // 📄 FILES
        // =====================
        Path path = Paths.get("demo.txt");
        Files.write(path, Arrays.asList("line1", "line2"));
        System.out.println("Read file: " + Files.readAllLines(path));
        System.out.println("File exists via java.io.File: " + new File("demo.txt").exists());

    // =====================
        // 🎲 RANDOM & UUID
        // =====================
        Random rand = new Random();
        System.out.println("Random int [0..9]: " + rand.nextInt(10));
        System.out.println("Random double [0..1): " + rand.nextDouble());
        System.out.println("UUID: " + UUID.randomUUID());

    // =====================
        // 🧾 SYSTEM & OBJECT
        // =====================
        System.out.println("Time millis: " + System.currentTimeMillis());
        System.out.println("Objects.equals: " + Objects.equals("hi","hi"));

    sc.close();
    }

}
