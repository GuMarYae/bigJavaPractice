So here’s what’s happening:

---

### **Parent class: `Questions`**

- **Variables:** `text`, `answer`
- **Methods it already has:**
  - `setText()`
  - `setAnswer()`
  - `checkAnswer()`
  - `display()` → just prints the text

---

### **Child class: `ChoiceQuestion`**

<pre class="overflow-visible!" data-start="331" data-end="1068"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>ChoiceQuestion</span><span></span><span>extends</span><span></span><span>Questions</span><span> {
    </span><span>// New variable</span><span>
    </span><span>private</span><span> ArrayList<String> choices = </span><span>new</span><span></span><span>ArrayList</span><span><>();

    </span><span>// New method (parent don’t got this)</span><span>
    </span><span>public</span><span></span><span>void</span><span></span><span>addChoice</span><span>(String choice, boolean</span><span> correct) {
        choices.add(choice);
        </span><span>if</span><span> (correct) {
            </span><span>// use parent method to set the right answer</span><span>
            setAnswer(choice);
        }
    }

    </span><span>// Override parent display()</span><span>
    </span><span>@Override</span><span>
    </span><span>public</span><span></span><span>void</span><span></span><span>display</span><span>()</span><span> {
        </span><span>// first, show the question text (parent had this)</span><span>
        </span><span>super</span><span>.display(); 

        </span><span>// then, show the choices (new stuff)</span><span>
        </span><span>for</span><span> (</span><span>int</span><span></span><span>i</span><span></span><span>=</span><span></span><span>0</span><span>; i < choices.size(); i++) {
            System.out.println((i+</span><span>1</span><span>) + </span><span>": "</span><span> + choices.get(i));
        }
    }
}</span></span></code></div></div></pre>
