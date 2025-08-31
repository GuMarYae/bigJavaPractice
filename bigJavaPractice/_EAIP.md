**Encapsulation (Hiding)**

Crayon box keeps all crayons inside. You don’t touch the factory, just use what’s in the box.

**Abstraction (Simplifying)**

You just say “give me a red crayon.” You don’t care how wax + dye made it.

**Inheritance (Reusing)**

A “ColorCrayon” class makes “RedCrayon,” “BlueCrayon,” etc. They all reuse what a crayon does (draw, break, melt).

**Polymorphism (Adapting)**

You call `crayon.draw()`.

* Red draws red.
* Blue draws blue.
* Same call, different result.

---

👉 That’s EAIP, crayon edition. Short, simple, and stupid.

You want me to code up that crayon example in **Java** so you can literally see it in action?

### 🖍 Encapsulation (Hiding)

Keep fields private, expose only needed methods.

<pre class="overflow-visible!" data-start="218" data-end="377"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>class</span><span></span><span>CrayonBox</span><span> {
    </span><span>private</span><span> String[] crayons = {</span><span>"Red"</span><span>, </span><span>"Blue"</span><span>, </span><span>"Green"</span><span>};

    </span><span>public</span><span> String </span><span>getCrayon</span><span>(int</span><span> i) {
        </span><span>return</span><span> crayons[i];
    }
}
</span></span></code></div></div></pre>

---

### 🖍 Abstraction (Simplifying)

We only say “draw,” don’t care how it works inside.

<pre class="overflow-visible!" data-start="471" data-end="534"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>abstract</span><span></span><span>class</span><span></span><span>Crayon</span><span> {
    </span><span>abstract</span><span></span><span>void</span><span></span><span>draw</span><span>()</span><span>;
}
</span></span></code></div></div></pre>

---

### 🖍 Inheritance (Reusing)

RedCrayon and BlueCrayon reuse Crayon’s structure.

<pre class="overflow-visible!" data-start="623" data-end="847"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>class</span><span></span><span>RedCrayon</span><span></span><span>extends</span><span></span><span>Crayon</span><span> {
    </span><span>void</span><span></span><span>draw</span><span>()</span><span> {
        System.out.println(</span><span>"Drawing in Red"</span><span>);
    }
}

</span><span>class</span><span></span><span>BlueCrayon</span><span></span><span>extends</span><span></span><span>Crayon</span><span> {
    </span><span>void</span><span></span><span>draw</span><span>()</span><span> {
        System.out.println(</span><span>"Drawing in Blue"</span><span>);
    }
}
</span></span></code></div></div></pre>

---

### 🖍 Polymorphism (Adapting)

Same call → different behavior.

<pre class="overflow-visible!" data-start="919" data-end="1179"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Main</span><span> {
    </span><span>public</span><span></span><span>static</span><span></span><span>void</span><span></span><span>main</span><span>(String[] args)</span><span> {
        </span><span>Crayon</span><span></span><span>red</span><span></span><span>=</span><span></span><span>new</span><span></span><span>RedCrayon</span><span>();
        </span><span>Crayon</span><span></span><span>blue</span><span></span><span>=</span><span></span><span>new</span><span></span><span>BlueCrayon</span><span>();

        red.draw();   </span><span>// Output: Drawing in Red</span><span>
        blue.draw();  </span><span>// Output: Drawing in Blue</span><span>
    }
}</span></span></code></div></div></pre>
