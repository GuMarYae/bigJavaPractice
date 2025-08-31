### ✅ If the parent has a **default constructor** :

You **don’t have to** call `super()` — Java will do it for you.

<pre class="overflow-visible!" data-start="221" data-end="404"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Parent</span><span> {
    </span><span>public</span><span></span><span>Parent</span><span>()</span><span> { } </span><span>// default constructor</span><span>
}

</span><span>public</span><span></span><span>class</span><span></span><span>Child</span><span></span><span>extends</span><span></span><span>Parent</span><span> {
    </span><span>public</span><span></span><span>Child</span><span>()</span><span> {
        </span><span>// Java auto calls super()</span><span>
    }
}
</span></span></code></div></div></pre>

---

### ✅ You **can** call it yourself too (optional):

<pre class="overflow-visible!" data-start="463" data-end="526"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>Child</span><span>()</span><span> {
    </span><span>super</span><span>(); </span><span>// still works fine</span><span>
}
</span></span></code></div></div></pre>

---

### ❌ If parent only has a constructor **with parameters** :

You **must** call it with `super(...)` or you'll get an error:

<pre class="overflow-visible!" data-start="658" data-end="872"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>class</span><span></span><span>Parent</span><span> {
    </span><span>public</span><span></span><span>Parent</span><span>(String text)</span><span> { } </span><span>// no default constructor!</span><span>
}

</span><span>public</span><span></span><span>class</span><span></span><span>Child</span><span></span><span>extends</span><span></span><span>Parent</span><span> {
    </span><span>public</span><span></span><span>Child</span><span>()</span><span> {
        </span><span>super</span><span>(</span><span>"hello"</span><span>); </span><span>// ✅ required or it breaks</span><span>
    }
}</span></span></code></div></div></pre>
