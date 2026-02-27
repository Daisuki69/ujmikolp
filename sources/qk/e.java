package qk;

import java.io.PrintStream;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19813b;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i4 = 2;
        if (property == null || property.isEmpty()) {
            i = 1;
        } else {
            for (int i6 = 0; i6 < 3; i6++) {
                if (strArr[i6].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                }
            }
            i = 1;
        }
        f19812a = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i4 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i4 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i4 = 3;
            }
        }
        f19813b = i4;
    }

    public static final void a(String str) {
        c().println("SLF4J(E): " + str);
    }

    public static final void b(String str, Throwable th2) {
        c().println("SLF4J(E): " + str);
        c().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(c());
    }

    public static PrintStream c() {
        return AbstractC2217b.c(f19812a) != 1 ? System.err : System.out;
    }

    public static final void d(String str) {
        if (AbstractC2217b.c(3) >= AbstractC2217b.c(f19813b)) {
            c().println("SLF4J(W): " + str);
        }
    }
}
