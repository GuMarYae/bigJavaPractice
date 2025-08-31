# Polymorphism in Java (Notes)

note this is not poly but highly important:

That process = **dynamic method lookup** (aka **dynamic dispatch** , **late binding** , or **runtime polymorphism** ).

### n Java

- All non-`static`, non-`final`, non-`private` methods use dynamic method lookup automatically.
- You don’t need to mark them like `virtual`.

---

### In C++

- By default, methods are **statically bound** (compile-time).
- You must mark the parent method as `virtual` to activate **dynamic method lookup** .

<pre class="overflow-visible!" data-start="801" data-end="835"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-cpp"><span><span>virtual</span><span></span><span>void</span><span></span><span>display</span><span>()</span><span>;</span></span></code></div></div></pre>

class ChoiceQuestion extends Question {
@Override
void display() {
System.out.println("This is a multiple-choice question.");
}
}

// another child class
class TrueFalseQuestion extends Question {
@Override
void display() {
System.out.println("This is a true/false question.");
}
}

public class Demo {
// Parent parameter
public static void presentQuestion(**Question** q) {
q.display(); // runs whichever child’s version
}

    public static void main(String[] args) {
        // Declare child objects **ChoiceQuestion cq = new ChoiceQuestion();
        TrueFalseQuestion tfq = new TrueFalseQuestion()**;

    // Pass them into the parent parameter**presentQuestion(cq)**;   // Output: This is a multiple-choice question.
        **presentQuestion(tfq);**  // Output: This is a true/false question.
    }

}

⚡ One line takeaway:
A parent parameter (Question q) can always take a child argument (new ChoiceQuestion()).

---

##### OK NOW POLYMPRPHISM

- **Polymorphism = “many forms.”**
- Lets you use a **parent class type** to refer to **different child objects** .
- At **runtime** , Java decides which method to run (runtime polymorphism).
- 🔥 It’s way more powerful than **monomorphism** (where a variable can only ever point to _one_ type, like `Ant ant = new Ant();`).

---

### When does polymorphism happen?

- You have a **parent class / interface** .
- You have **child classes** that override parent methods.
- You create a variable with the **parent type** but assign it a **child object** .
- You call an **overridden method** → the child’s version runs.

---

### Key formula

<pre class="overflow-visible!" data-start="885" data-end="977"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>ParentType</span><span></span><span>var</span><span></span><span>=</span><span></span><span>new</span><span></span><span>ChildType</span><span>();
</span><span>var</span><span>.overriddenMethod(); </span><span>// child’s method runs</span><span>
</span></span></code></div></div></pre>

---

### Example with Insects

<pre class="overflow-visible!" data-start="1009" data-end="2188"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>class</span><span></span><span>Insect</span><span> {
    </span><span>void</span><span></span><span>move</span><span>()</span><span> {
        System.out.println(</span><span>"Insect moves around."</span><span>);
    }
}

</span><span>class</span><span></span><span>Ant</span><span></span><span>extends</span><span></span><span>Insect</span><span> {
    </span><span>@Override</span><span>
    </span><span>void</span><span></span><span>move</span><span>()</span><span> {
        System.out.println(</span><span>"Ant crawls on the ground."</span><span>);
    }
}

</span><span>class</span><span></span><span>Bee</span><span></span><span>extends</span><span></span><span>Insect</span><span> {
    </span><span>@Override</span><span>
    </span><span>void</span><span></span><span>move</span><span>()</span><span> {
        System.out.println(</span><span>"Bee flies from flower to flower."</span><span>);
    }
}

</span><span>class</span><span></span><span>Grasshopper</span><span></span><span>extends</span><span></span><span>Insect</span><span> {
    </span><span>@Override</span><span>
    </span><span>void</span><span></span><span>move</span><span>()</span><span> {
        System.out.println(</span><span>"Grasshopper jumps long distances."</span><span>);
    }
}

</span><span>public</span><span></span><span>class</span><span></span><span>InsectWorld</span><span> {
    </span><span>public</span><span></span><span>static</span><span></span><span>void</span><span></span><span>main</span><span>(String[] args)</span><span> {
        </span><span>// ❌ Monomorphism: each variable only holds one type</span><span>
        </span><span>// Ant ant1 = new Ant();</span><span>
        </span><span>// Bee bee1 = new Bee();</span><span>
        </span><span>// Grasshopper hopper1 = new Grasshopper();</span><span>

        </span><span>// ✅ Polymorphism: parent type holds different child objects</span><span>
        </span><span>Insect</span><span></span><span>insect1</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Ant</span><span>();
        </span><span>Insect</span><span></span><span>insect2</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Bee</span><span>();
        </span><span>Insect</span><span></span><span>insect3</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Grasshopper</span><span>();

        </span><span>// Polymorphism: correct method runs at runtime</span><span>
        insect1.move(); </span><span>// Ant crawls on the ground.</span><span>
        insect2.move(); </span><span>// Bee flies from flower to flower.</span><span>
        insect3.move(); </span><span>// Grasshopper jumps long distances.</span><span>
    }
}
</span></span></code></div></div></pre>

---

### Example with Questions

<pre class="overflow-visible!" data-start="2222" data-end="2830"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>public</span><span></span><span>static</span><span></span><span>void</span><span></span><span>presentQuestion</span><span>(Question q)</span><span> {
    q.display(); </span><span>// runtime decides which display() to run</span><span>
    System.out.print(</span><span>"Your answer: "</span><span>);
    </span><span>Scanner</span><span></span><span>in</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Scanner</span><span>(System.in);
    </span><span>String</span><span></span><span>response</span><span></span><span>=</span><span> in.nextLine();
    </span><span>// q.checkAnswer(response);</span><span>
}

</span><span>Question</span><span></span><span>question1</span><span></span><span>=</span><span></span><span>new</span><span></span><span>Question</span><span>(</span><span>"Who was the first president?"</span><span>, </span><span>"George Washington"</span><span>);
</span><span>ChoiceQuestion</span><span></span><span>question2</span><span></span><span>=</span><span></span><span>new</span><span></span><span>ChoiceQuestion</span><span>(</span><span>"What is 2 + 2?"</span><span>);
question2.addChoice(</span><span>"3"</span><span>, </span><span>false</span><span>);
question2.addChoice(</span><span>"4"</span><span>, </span><span>true</span><span>);

presentQuestion(question1); </span><span>// calls Question.display()</span><span>
presentQuestion(question2); </span><span>// calls ChoiceQuestion.display()</span><span>
</span></span></code></div></div></pre>

---

### How to _spot_ polymorphism

1. **Parent type variable** (`Insect`, `Question`).
2. **Child object assigned** (`new Ant()`, `new ChoiceQuestion()`).
3. **Overridden method called** → child version executes.

---

🔥 Polymorphism > Monomorphism:

- With **monomorphism** → each variable/array can only hold one type (boring, rigid).
- With **polymorphism** → one variable/array can handle many forms (flexible, scalable).class Question {

      void display() {
          System.out.println("This is a generic question.");
      }

  }
