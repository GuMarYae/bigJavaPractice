## 🔧 Java Packages – What They Are & What They Do

| **Package**   | **Purpose**                         | **Sample Class** | **What It’s Useful For**                        |
| ------------- | ----------------------------------- | ---------------- | ----------------------------------------------- |
| `java.lang`   | Language support (core features)    | `Math`           | Math ops, Strings, basic stuff — auto-imported  |
| `java.util`   | Utilities                           | `Random`         | Lists, Maps, Dates, Scanner, etc.               |
| `java.io`     | Input/Output                        | `PrintStream`    | Reading/writing files, streams                  |
| `java.awt`    | Abstract Window Toolkit (GUI stuff) | `Color`          | Drawing, graphics, UI (older than Swing)        |
| `java.applet` | Web applets (deprecated now)        | `Applet`         | Old Java browser applets – mostly dead tech now |
| `java.net`    | Networking                          | `Socket`         | Communicating over network (chat, web stuff)    |
| `java.sql`    | Database access                     | `ResultSet`      | Connecting & working with SQL databases         |
| `javax.swing` | GUI user interface (newer than AWT) | `JButton`        | Desktop apps, buttons, windows, labels          |
| `org.w3c.dom` | XML document parsing                | `Document`       | Reading/modifying XML docs                      |

### ⚠️ About `import java.util.*;`

- Imports **everything** in `java.util`
- Makes it easy, **but bloats memory**
- ✅ Good for quick testing or small apps
- ❌ Better to **import only what you need** like:
  <pre class="overflow-visible!" data-start="1925" data-end="1996"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span>import</span><span> java.util.Scanner;
  </span><span>import</span><span> java.util.ArrayList;
  </span></span></code></div></div></pre>

---

## 🔑 How to Think About Packages

| **Think of it like…**     | **Explanation**                                                            |
| ------------------------- | -------------------------------------------------------------------------- |
| 🧰**Toolbox**             | A package is a**group of related tools (classes)**                         |
| 🛠️**Tools**               | Each class is a**tool**you use from the toolbox                            |
| 🧭**Job-Oriented**        | Toolboxes are made for specific jobs (math, files, GUIs, networking, etc.) |
| 📦**Organized Folders**   | Keeps code**clean and organized**— no need to memorize 1000 classes        |
| ✍️**Import What You Use** | You gotta**import a toolbox or tool**to use it                             |
