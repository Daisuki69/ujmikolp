package bj;

import java.io.PrintWriter;
import java.io.StringWriter;
import kj.AbstractC1785b;

/* JADX INFO: renamed from: bj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1030a {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.j.g(th2, "<this>");
        kotlin.jvm.internal.j.g(exception, "exception");
        if (th2 != exception) {
            AbstractC1785b.f18153a.a(th2, exception);
        }
    }

    public static String b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }
}
