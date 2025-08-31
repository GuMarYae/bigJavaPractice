**“Nobody can extend this class — no subclasses, no kids.”**

final class Ant {
void move() {
System.out.println("Ant crawls on the ground.");
}
}

// ❌ Not allowed
class FireAnt extends Ant { // ERROR: cannot subclass final class
@Override
void move() {
System.out.println("FireAnt bites hard!");
}
}

### Difference

- `final class` → no subclasses at all.
- `final method` → you can make subclasses, but they **can’t override that method** .

---

⚡ One-liner takeaway:

**`final` on a class = no children; `final` on a method = children allowed, but can’t change that method.**

---

you can write a `final` class **with or without** `public`, depends on what you want for access.

---

### 1. With `public`

public final class Ant {
void move() {
System.out.println("Ant crawls on the ground.");
}
}

- Means **any code** (even in other packages) can use `Ant`.
- But no one can subclass it.

---

### 2. Without `public`

final class Ant {
void move() {
System.out.println("Ant crawls on the ground.");
}
}

- This makes `Ant` **package-private** (only code in the same package can use it).
- Still **no subclasses** allowed.

---

⚡ Rule:

- `public final class` = visible everywhere, no kids.
- `final class` (no modifier) = only visible inside its package, no kids.
