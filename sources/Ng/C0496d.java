package Ng;

import androidx.webkit.ProxyConfig;
import cj.C1112C;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: Ng.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0496d extends j {
    public static final C0496d f = new C0496d(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES, C1112C.f9377a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4425d;
    public final String e;

    public C0496d(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f4425d = str;
        this.e = str2;
    }

    public final boolean c(C0496d pattern) {
        boolean zO;
        kotlin.jvm.internal.j.g(pattern, "pattern");
        String str = pattern.f4425d;
        if (!kotlin.jvm.internal.j.b(str, ProxyConfig.MATCH_ALL_SCHEMES) && !zj.z.o(str, this.f4425d, true)) {
            return false;
        }
        String str2 = pattern.e;
        if (!kotlin.jvm.internal.j.b(str2, ProxyConfig.MATCH_ALL_SCHEMES) && !zj.z.o(str2, this.e, true)) {
            return false;
        }
        for (i iVar : (List) pattern.c) {
            String str3 = iVar.f4428a;
            boolean zB = kotlin.jvm.internal.j.b(str3, ProxyConfig.MATCH_ALL_SCHEMES);
            String str4 = iVar.f4429b;
            if (zB) {
                if (!kotlin.jvm.internal.j.b(str4, ProxyConfig.MATCH_ALL_SCHEMES)) {
                    List list = (List) this.c;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (zj.z.o(((i) it.next()).f4429b, str4, true)) {
                            }
                        }
                    }
                    zO = false;
                }
                zO = true;
                break;
            }
            String strA = a(str3);
            if (!kotlin.jvm.internal.j.b(str4, ProxyConfig.MATCH_ALL_SCHEMES)) {
                zO = zj.z.o(strA, str4, true);
            } else {
                if (strA != null) {
                    zO = true;
                    break;
                    break;
                }
                zO = false;
            }
            if (!zO) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (zj.z.o(r1.f4429b, r7, true) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ng.C0496d d(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L59
            r3 = 1
            if (r1 == r3) goto L41
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L20
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L20
            goto L59
        L20:
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r1.next()
            Ng.i r4 = (Ng.i) r4
            java.lang.String r5 = r4.f4428a
            boolean r5 = zj.z.o(r5, r2, r3)
            if (r5 == 0) goto L24
            java.lang.String r4 = r4.f4429b
            boolean r4 = zj.z.o(r4, r7, r3)
            if (r4 == 0) goto L24
            goto L58
        L41:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            Ng.i r1 = (Ng.i) r1
            java.lang.String r4 = r1.f4428a
            boolean r4 = zj.z.o(r4, r2, r3)
            if (r4 == 0) goto L59
            java.lang.String r1 = r1.f4429b
            boolean r1 = zj.z.o(r1, r7, r3)
            if (r1 == 0) goto L59
        L58:
            return r6
        L59:
            Ng.d r1 = new Ng.d
            java.util.Collection r0 = (java.util.Collection) r0
            Ng.i r3 = new Ng.i
            r3.<init>(r2, r7)
            java.util.ArrayList r7 = cj.C1110A.M(r3, r0)
            java.lang.String r0 = r6.e
            java.lang.Object r2 = r6.f4431b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r6.f4425d
            r1.<init>(r3, r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ng.C0496d.d(java.lang.String):Ng.d");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0496d)) {
            return false;
        }
        C0496d c0496d = (C0496d) obj;
        if (zj.z.o(this.f4425d, c0496d.f4425d, true) && zj.z.o(this.e, c0496d.e, true)) {
            return kotlin.jvm.internal.j.b((List) this.c, (List) c0496d.c);
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f4425d.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.e.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
        return (((List) this.c).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0496d(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        kotlin.jvm.internal.j.g(contentType, "contentType");
        kotlin.jvm.internal.j.g(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.j.g(parameters, "parameters");
    }
}
