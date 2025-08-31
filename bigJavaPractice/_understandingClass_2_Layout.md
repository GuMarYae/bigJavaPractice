### Standard Class Layout (Java or C++)

1. **class definition**
   <pre class="overflow-visible!" data-start="170" data-end="209"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Pencil</span><span> {
   </span></span></code></div></div></pre>
2. **member variables / instance variables (usually private)**
   <pre class="overflow-visible!" data-start="279" data-end="349"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span></span><span>private</span><span> String color;
       </span><span>private</span><span></span><span>int</span><span> length;
   </span></span></code></div></div></pre>
3. **constructors (same name as class, no return type)**
   <pre class="overflow-visible!" data-start="413" data-end="649"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span></span><span>public</span><span></span><span>Pencil</span><span>()</span><span> {           </span><span>// default</span><span>
           color = </span><span>"Yellow"</span><span>;
           length = </span><span>10</span><span>;
       }
   
       </span><span>public</span><span></span><span>Pencil</span><span>(String c, int</span><span> l) {   </span><span>// parameterized</span><span>
           color = c;
           length = l;
       }
   </span></span></code></div></div></pre>

4. **member methods / instance methods (usually public)**
   <pre class="overflow-visible!" data-start="714" data-end="975"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span></span><span>public</span><span></span><span>void</span><span></span><span>write</span><span>()</span><span> {
           System.out.println(</span><span>"Writing with a "</span><span> + color + </span><span>" pencil."</span><span>);
       }
   
       </span><span>public</span><span></span><span>int</span><span></span><span>getLength</span><span>()</span><span> {
           </span><span>return</span><span> length;
       }
   
       </span><span>public</span><span></span><span>void</span><span></span><span>sharpen</span><span>()</span><span> {
           length -= </span><span>1</span><span>;
       }
   }
   </span></span></code></div></div></pre>

---

### ✅ Example usage

<pre class="overflow-visible!" data-start="1002" data-end="1363"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"><span class="" data-state="closed"></span></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Main</span><span> {
    </span><span>public</span><span></span><span>static</span><span></span><span>void</span><span></span><span>main</span><span>(String[] args)</span><span> {
        </span><span>Pencil</span><span></span><span>p1</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Pencil</span><span>();            </span><span>// default</span><span>
        </span><span>Pencil</span><span></span><span>p2</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Pencil</span><span>(</span><span>"Red"</span><span>, </span><span>5</span><span>);    </span><span>// custom</span><span>

        p1.write();                          </span><span>// method</span><span>
        p2.sharpen();                        </span><span>// method</span><span>
        System.out.println(p2.getLength());  </span><span>// method</span><span>
    }
}</span></span></code></div></div></pre>
