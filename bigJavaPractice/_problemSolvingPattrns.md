### 🧠 Problem Solving Patterns (Now w/ Must-Have Tools)

#### 1. **Keeping a Total**

➤ Needs: `int`, maybe a getter if tracking total from outside

<pre class="overflow-visible!" data-start="370" data-end="618"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>ScoreTracker</span><span> {
    </span><span>private</span><span></span><span>int</span><span> total;

    </span><span>public</span><span></span><span>ScoreTracker</span><span>()</span><span> { total = </span><span>0</span><span>; } </span><span>// constructor w/ no return type</span><span>

    </span><span>public</span><span></span><span>void</span><span></span><span>add</span><span>(int</span><span> points) { total += points; }

    </span><span>public</span><span></span><span>int</span><span></span><span>getTotal</span><span>()</span><span> { </span><span>return</span><span> total; } </span><span>// getter</span><span>
}
</span></span></code></div></div></pre>

---

#### 2. **Counting Events**

➤ Needs: `int counter`, optional getter

<pre class="overflow-visible!" data-start="697" data-end="886"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>ClickCounter</span><span> {
    </span><span>private</span><span></span><span>int</span><span> count;

    </span><span>public</span><span></span><span>ClickCounter</span><span>()</span><span> { count = </span><span>0</span><span>; }

    </span><span>public</span><span></span><span>void</span><span></span><span>click</span><span>()</span><span> { count++; }

    </span><span>public</span><span></span><span>int</span><span></span><span>getCount</span><span>()</span><span> { </span><span>return</span><span> count; }
}
</span></span></code></div></div></pre>

---

#### 3. **Collecting Values**

➤ Needs: `ArrayList`, constructor, maybe `getAll()`

<pre class="overflow-visible!" data-start="979" data-end="1271"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>NameCollector</span><span> {
    </span><span>private</span><span> ArrayList<String> names;

    </span><span>public</span><span></span><span>NameCollector</span><span>()</span><span> {
        names = </span><span>new</span><span></span><span>ArrayList</span><span><>();
    }

    </span><span>public</span><span></span><span>void</span><span></span><span>addName</span><span>(String name)</span><span> {
        names.add(name);
    }

    </span><span>public</span><span> ArrayList<String> </span><span>getNames</span><span>()</span><span> {
        </span><span>return</span><span> names;
    }
}
</span></span></code></div></div></pre>

---

#### 4. **Managing Object Properties**

➤ Needs: instance vars, constructor, **getters/setters**

<pre class="overflow-visible!" data-start="1378" data-end="1734"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Player</span><span> {
    </span><span>private</span><span> String name;
    </span><span>private</span><span></span><span>int</span><span> health;

    </span><span>public</span><span></span><span>Player</span><span>(String n, int</span><span> h) {
        name = n;
        health = h;
    }

    </span><span>public</span><span> String </span><span>getName</span><span>()</span><span> { </span><span>return</span><span> name; }
    </span><span>public</span><span></span><span>void</span><span></span><span>setName</span><span>(String n)</span><span> { name = n; }

    </span><span>public</span><span></span><span>int</span><span></span><span>getHealth</span><span>()</span><span> { </span><span>return</span><span> health; }
    </span><span>public</span><span></span><span>void</span><span></span><span>setHealth</span><span>(int</span><span> h) { health = h; }
}
</span></span></code></div></div></pre>

---

#### 5. **Modeling Objects w/ Distinct States**

➤ Needs: `String` or `enum`, constructor, state methods

<pre class="overflow-visible!" data-start="1849" data-end="2097"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Light</span><span> {
    </span><span>private</span><span> String state;

    </span><span>public</span><span></span><span>Light</span><span>()</span><span> {
        state = </span><span>"OFF"</span><span>;
    }

    </span><span>public</span><span></span><span>void</span><span></span><span>turnOn</span><span>()</span><span> { state = </span><span>"ON"</span><span>; }
    </span><span>public</span><span></span><span>void</span><span></span><span>turnOff</span><span>()</span><span> { state = </span><span>"OFF"</span><span>; }

    </span><span>public</span><span> String </span><span>getState</span><span>()</span><span> { </span><span>return</span><span> state; }
}
</span></span></code></div></div></pre>

---

#### 6. **Describing Position of Object**

➤ Needs: coordinates, constructor, maybe move methods

<pre class="overflow-visible!" data-start="2204" data-end="2518"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Position</span><span> {
    </span><span>private</span><span></span><span>int</span><span> x, y;

    </span><span>public</span><span></span><span>Position</span><span>(int</span><span> startX, </span><span>int</span><span> startY) {
        x = startX;
        y = startY;
    }

    </span><span>public</span><span></span><span>void</span><span></span><span>move</span><span>(int</span><span> dx, </span><span>int</span><span> dy) {
        x += dx;
        y += dy;
    }

    </span><span>public</span><span> String </span><span>getPosition</span><span>()</span><span> {
        </span><span>return</span><span></span><span>"("</span><span> + x + </span><span>", "</span><span> + y + </span><span>")"</span><span>;
    }
}
</span></span></code></div></div></pre>

---

### 🔑 Real Talk Notes

- **Constructors** :

  ➤ Never use `void`

  ➤ No return types — name **must match** the class

- **Getters/Setters** :

  ➤ Use to protect and access private variables

  ➤ Java rule: keep fields private, expose access safely

- **Comments** :

  ➤ Leave notes above classes/methods so others (and future you) know WTF is going on
