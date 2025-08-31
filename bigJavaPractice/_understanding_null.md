### ✅ Can be `null` (objects)

- `String`
- `Character` (wrapper for `char`)
- `Integer` (wrapper for `int`)
- `Double` (wrapper for `double`)
- Arrays (`int[]`, `String[]`, etc.)
- Any custom class (`BankAccount`, `CashRegister`, etc.)

### ❌ Cannot be `null` (primitives)

- `int`
- `double`
- `long`
- `char`
- `boolean`
- etc.

---

### Example

<pre class="overflow-visible!" data-start="471" data-end="707"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>String</span><span></span><span>s</span><span></span><span>=</span><span></span><span>null</span><span>;       </span><span>// ✅ fine</span><span>
</span><span>Character</span><span></span><span>c</span><span></span><span>=</span><span></span><span>null</span><span>;    </span><span>// ✅ fine</span><span>
</span><span>Integer</span><span></span><span>n</span><span></span><span>=</span><span></span><span>null</span><span>;      </span><span>// ✅ fine</span><span>
</span><span>BankAccount</span><span></span><span>b</span><span></span><span>=</span><span></span><span>null</span><span>;  </span><span>// ✅ fine</span><span>

</span><span>int</span><span></span><span>x</span><span></span><span>=</span><span></span><span>null</span><span>;          </span><span>// ❌ error (primitive)</span><span>
</span><span>char</span><span></span><span>y</span><span></span><span>=</span><span></span><span>null</span><span>;         </span><span>// ❌ error (primitive)</span><span>
</span></span></code></div></div></pre>

👉 So `null` is for **objects only** , never for primitives.

🚫 Null vs Empty String

- `null` 👉 means the variable points to **nothing at all** (no object).
- `""` 👉 is a **real String object** with length `0`.

<pre class="overflow-visible!" data-start="218" data-end="519"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>String</span><span></span><span>a</span><span></span><span>=</span><span></span><span>null</span><span>;     </span><span>// not a string at all</span><span>
</span><span>String</span><span></span><span>b</span><span></span><span>=</span><span></span><span>""</span><span>;       </span><span>// empty string, length 0</span><span>

System.out.println(a);        </span><span>// prints: null</span><span>
System.out.println(b);        </span><span>// prints: (blank line)</span><span>

System.out.println(b.length()); </span><span>// ✅ 0</span><span>
System.out.println(a.length()); </span><span>// ❌ NullPointerException</span></span></code></div></div></pre>
