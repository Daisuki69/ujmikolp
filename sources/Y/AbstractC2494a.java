package y;

import We.s;
import dOYHB6.tiZVw8.numX49;
import java.io.Closeable;
import java.util.Arrays;
import pg.C2038a;
import w4.C2378b;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2494a implements Closeable {
    public static final String[] e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21029b;
    public String[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21030d;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format(numX49.tnTj78("bb3n"), Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = numX49.tnTj78("bb3x");
        strArr[92] = numX49.tnTj78("bb3s");
        strArr[9] = numX49.tnTj78("bb35");
        strArr[8] = numX49.tnTj78("bb3J");
        strArr[10] = numX49.tnTj78("bb3I");
        strArr[13] = numX49.tnTj78("bb3q");
        strArr[12] = numX49.tnTj78("bb3z");
    }

    public final void B(String str) throws C2378b {
        StringBuilder sbV = s.v(str, numX49.tnTj78("bb3l"));
        sbV.append(getPath());
        throw new C2378b(sbV.toString());
    }

    public abstract void b();

    public abstract void c();

    public abstract void f();

    public abstract void g();

    public final String getPath() {
        int i = this.f21028a;
        int[] iArr = this.f21029b;
        String[] strArr = this.c;
        int[] iArr2 = this.f21030d;
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bb3W"));
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = iArr[i4];
            if (i6 == 1 || i6 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i4]);
                sb2.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb2.append('.');
                String str = strArr[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean i();

    public abstract boolean k();

    public abstract double m();

    public abstract int peek();

    public abstract int q();

    public abstract String r();

    public final void t(int i) {
        int i4 = this.f21028a;
        int[] iArr = this.f21029b;
        if (i4 == iArr.length) {
            if (i4 == 256) {
                throw new Bh.a(numX49.tnTj78("bb3P9") + getPath(), 2);
            }
            this.f21029b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f21030d;
            this.f21030d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f21029b;
        int i6 = this.f21028a;
        this.f21028a = i6 + 1;
        iArr3[i6] = i;
    }

    public abstract int w(C2038a c2038a);

    public abstract void y();

    public abstract void z();
}
