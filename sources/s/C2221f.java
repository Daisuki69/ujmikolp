package s;

import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2221f {
    public static final C2221f c = new C2221f(numX49.tnTj78("b2f2"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2222g f19976b;

    public C2221f(String... strArr) {
        this.f19975a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f19975a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L8f
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "b2fL"
            java.lang.String r5 = dOYHB6.tiZVw8.numX49.tnTj78(r5)
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L57
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L3d
            java.lang.String r9 = "b2fr"
            java.lang.String r9 = dOYHB6.tiZVw8.numX49.tnTj78(r9)
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L3b
            goto L3d
        L3b:
            r9 = r2
            goto L3e
        L3d:
            r9 = r3
        L3e:
            if (r1 != 0) goto L54
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L8f
            java.lang.Object r8 = We.s.e(r3, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L8f
        L54:
            if (r9 == 0) goto L8f
            goto L86
        L57:
            if (r1 != 0) goto L84
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L84
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L86
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L8f
            java.lang.Object r8 = We.s.e(r3, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L8f
            goto L86
        L84:
            if (r1 == 0) goto L87
        L86:
            return r3
        L87:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L90
        L8f:
            return r2
        L90:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C2221f.a(int, java.lang.String):boolean");
    }

    public final int b(int i, String str) {
        if (numX49.tnTj78("b2fZ").equals(str)) {
            return 0;
        }
        List list = this.f19975a;
        if (((String) list.get(i)).equals(numX49.tnTj78("b2fk"))) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if (numX49.tnTj78("b2fB").equals(str)) {
            return true;
        }
        List list = this.f19975a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals(numX49.tnTj78("b2fu")) || ((String) list.get(i)).equals(numX49.tnTj78("b2fV"));
    }

    public final boolean d(int i, String str) {
        if (numX49.tnTj78("b2fS").equals(str)) {
            return true;
        }
        List list = this.f19975a;
        return i < list.size() - 1 || ((String) list.get(i)).equals(numX49.tnTj78("b2fj"));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b2fd"));
        sb2.append(this.f19975a);
        sb2.append(numX49.tnTj78("b2fi"));
        return androidx.camera.core.impl.a.q(sb2, this.f19976b != null, '}');
    }

    public C2221f(C2221f c2221f) {
        this.f19975a = new ArrayList(c2221f.f19975a);
        this.f19976b = c2221f.f19976b;
    }
}
