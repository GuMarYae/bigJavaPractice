- Normally, every object gets its **own copy** of a variable.
- But sometimes, you want **all objects to share one variable** (like keeping track of the “next account number”).
- That’s where **`static`** comes in — it means “this belongs to the class, not just one object.”

---

### Example

<pre class="overflow-visible!" data-start="347" data-end="716"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>BankAccount</span><span> {
    </span><span>private</span><span></span><span>int</span><span> accountNumber;
    </span><span>private</span><span></span><span>static</span><span></span><span>int</span><span></span><span>lastAssignedNumber</span><span></span><span>=</span><span></span><span>1000</span><span>; </span><span>// shared by all accounts</span><span>

    </span><span>public</span><span></span><span>BankAccount</span><span>()</span><span> {
        lastAssignedNumber++;          </span><span>// bump the number</span><span>
        accountNumber = lastAssignedNumber; </span><span>// assign it</span><span>
    }

    </span><span>public</span><span></span><span>int</span><span></span><span>getAccountNumber</span><span>()</span><span> {
        </span><span>return</span><span> accountNumber;
    }
}
</span></span></code></div></div></pre>

---

### Usage

<pre class="overflow-visible!" data-start="733" data-end="900"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>BankAccount</span><span></span><span>a</span><span></span><span>=</span><span></span><span>new</span><span></span><span>BankAccount</span><span>(); </span><span>// account #1001</span><span>
</span><span>BankAccount</span><span></span><span>b</span><span></span><span>=</span><span></span><span>new</span><span></span><span>BankAccount</span><span>(); </span><span>// account #1002</span><span>
</span><span>BankAccount</span><span></span><span>c</span><span></span><span>=</span><span></span><span>new</span><span></span><span>BankAccount</span><span>(); </span><span>// account #1003</span><span>
</span></span></code></div></div></pre>

👉 `lastAssignedNumber` is **static** , so it’s one counter that all accounts use together.

---

Every `BankAccount` object has its own `balance` and `accountNumber` instance variables, but there is only a single copy of the `lastAssignedNumber` variable. That variable is stored in a separate location, outside any `BankAccount` objects.

Static variables should **always be declared as private** so that other classes can’t directly change their values.

However, static **constants** (declared with `final`) may be either private or public. For example, the `BankAccount` class can define a public constant like:

<pre class="overflow-visible!" data-start="592" data-end="688"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>BankAccount</span><span> {
    </span><span>public</span><span></span><span>static</span><span></span><span>final</span><span></span><span>double</span><span></span><span>OVERDRAFT_FEE</span><span></span><span>=</span><span></span><span>29.95</span><span>;
}</span></span></code></div></div></pre>

---

public class Financial {

    // This is a static method
    public static double percentOf(double rate, double amount) {
        return (rate / 100.0) * amount;
    }

}
Breakdown:
public → anyone can call it.

static → it belongs to the class itself, not any one object.

double percentOf(...) → method signature and return type.

**That’s why you can call it like this, without creating a Financial object:**

java
Copy code
**double tax = Financial.percentOf(taxRate, total);**
👉 Because it’s static, Java lets you use the class name instead of an object.
