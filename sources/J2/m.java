package j2;

import android.util.Log;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC1665d {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f17692b;

    public m(File file) {
        this.f17691a = file;
    }

    public final void a() {
        File file = this.f17691a;
        if (this.f17692b == null) {
            try {
                this.f17692b = new l(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // j2.InterfaceC1665d
    public final void b() {
        h2.f.b(this.f17692b, "There was a problem closing the Crashlytics log file.");
        this.f17692b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // j2.InterfaceC1665d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.io.File r0 = r7.f17691a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.a()
            j2.l r0 = r7.f17692b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.w()
            byte[] r0 = new byte[r0]
            j2.l r4 = r7.f17692b     // Catch: java.io.IOException -> L29
            j2.f r5 = new j2.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.g(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            O3.a r4 = new O3.a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L45
        L3c:
            int r0 = r4.f4631b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f4630a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L45:
            if (r3 == 0) goto L4f
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = j2.m.c
            r0.<init>(r3, r1)
            return r0
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.m.f():java.lang.String");
    }

    @Override // j2.InterfaceC1665d
    public final void i(long j, String str) {
        a();
        if (this.f17692b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f17692b.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", Global.BLANK).replaceAll(Global.NEWLINE, Global.BLANK)).getBytes(c));
            while (!this.f17692b.i() && this.f17692b.w() > 65536) {
                this.f17692b.q();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
