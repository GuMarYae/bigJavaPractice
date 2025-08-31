# Abstract Classes (Quick Note)

### Abstract Method

- **Abstract method** = declared in the parent but has **no body** .
  <pre class="overflow-visible!" data-start="218" data-end="268"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>abstract</span><span></span><span>void</span><span></span><span>deductFees</span><span>()</span><span>;
  </span></span></code></div></div></pre>
- Forces all child classes to **override and implement it** .
- Prevents “silent defaults” (like a do-nothing method that could be forgotten).---

### What’s happening here

- You got a parent class: `Account`.
- You _want every account type_ (Checking, Savings, Business, etc.) to have its own **monthly fee rule** .
- But the parent (`Account`) **doesn’t know how** to deduct fees (because it’s different for each account).

If you wrote:

<pre class="overflow-visible!" data-start="359" data-end="399"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>void</span><span></span><span>deductFees</span><span>()</span><span> { }
</span></span></code></div></div></pre>

That just does nothing. A lazy programmer might forget to override it, and boom — fees never get deducted.

---

### The fix → Abstract method

<pre class="overflow-visible!" data-start="547" data-end="593"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>abstract</span><span></span><span>void</span><span></span><span>deductFees</span><span>()</span><span>;
</span></span></code></div></div></pre>

This says:

- “Yo, any subclass of `Account` **MUST** write its own `deductFees()`.”
- If they don’t, the code won’t even compile.
- No defaults, no laziness — subclasses are forced to override.

  **EXAMPLE**

abstract class Account {
public abstract void deductFees(); // no body, just a promise
}

class CheckingAccount extends Account {
@Override
public void deductFees() {
System.out.println("Deducting $10 monthly fee for Checking.");
}
}

class SavingsAccount extends Account {
@Override
public void deductFees() {
System.out.println("Deducting $5 monthly fee for Savings.");
}
}

---

### Abstract Class

- A class with at least one abstract method must be declared `abstract`.
  <pre class="overflow-visible!" data-start="517" data-end="609"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>abstract</span><span></span><span>class</span><span></span><span>Account</span><span> {
      </span><span>public</span><span></span><span>abstract</span><span></span><span>void</span><span></span><span>deductFees</span><span>()</span><span>;
  }
  </span></span></code></div></div></pre>
- **You cannot make objects** of an abstract class.
  <pre class="overflow-visible!" data-start="666" data-end="719"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>Account</span><span></span><span>a</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Account</span><span>(); </span><span>// ❌ error</span><span>
  </span></span></code></div></div></pre>
- But you can still use an **abstract class reference** to point to a concrete subclass:
  <pre class="overflow-visible!" data-start="813" data-end="931"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>Account a;                  </span><span>// ✅ ok</span><span>
  a = </span><span>new</span><span></span><span>SavingsAccount</span><span>();   </span><span>// ✅ ok (SavingsAccount is concrete)</span><span>
  </span></span></code></div></div></pre>

---

### Concrete Class

- A **concrete class** is a subclass that actually implements all abstract methods.
- Example:
  <pre class="overflow-visible!" data-start="1058" data-end="1232"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>class</span><span></span><span>SavingsAccount</span><span></span><span>extends</span><span></span><span>Account</span><span> {
      </span><span>@Override</span><span>
      </span><span>public</span><span></span><span>void</span><span></span><span>deductFees</span><span>()</span><span> {
          System.out.println(</span><span>"Deducting savings fees..."</span><span>);
      }
  }
  </span></span></code></div></div></pre>

---

⚡ One-liner takeaway:

**Abstract class = a blueprint you can’t `new`, but you can extend it — subclasses must fill in the missing abstract methods.**
