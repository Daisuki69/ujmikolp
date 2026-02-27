package gk;

import java.io.File;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16849a = 0;

    static {
        char c = File.separatorChar;
        hk.a aVar = new hk.a();
        PrintWriter printWriter = new PrintWriter(aVar);
        try {
            printWriter.println();
            aVar.toString();
            printWriter.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    printWriter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
