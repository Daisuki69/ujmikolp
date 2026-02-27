package Vj;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A3.i f6143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uj.b f6144b;
    public final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h[] f6145d;
    public final Uj.d e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6146g;
    public String h;

    public h(A3.i composer, Uj.b json, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.g(composer, "composer");
        kotlin.jvm.internal.j.g(json, "json");
        this.f6143a = composer;
        this.f6144b = json;
        this.c = jVar;
        this.f6145d = hVarArr;
        this.e = json.f6006a;
        int iOrdinal = jVar.ordinal();
        if (hVarArr != null) {
            h hVar = hVarArr[iOrdinal];
            if (hVar == null && hVar == this) {
                return;
            }
            hVarArr[iOrdinal] = this;
        }
    }

    public final h a(Rj.d descriptor) {
        h hVar;
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        Uj.b bVar = this.f6144b;
        j jVarG = f.g(descriptor, bVar);
        char c = jVarG.f6151a;
        A3.i iVar = this.f6143a;
        iVar.g(c);
        iVar.f41b = true;
        String str = this.f6146g;
        if (str != null) {
            String strH = this.h;
            if (strH == null) {
                strH = descriptor.h();
            }
            iVar.d();
            k(str);
            iVar.g(':');
            k(strH);
            this.f6146g = null;
            this.h = null;
        }
        if (this.c == jVarG) {
            return this;
        }
        h[] hVarArr = this.f6145d;
        return (hVarArr == null || (hVar = hVarArr[jVarG.ordinal()]) == null) ? new h(iVar, bVar, jVarG, hVarArr) : hVar;
    }

    public final void b(Rj.d descriptor, int i) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        int iOrdinal = this.c.ordinal();
        boolean z4 = true;
        A3.i iVar = this.f6143a;
        if (iOrdinal == 1) {
            if (!iVar.f41b) {
                iVar.g(',');
            }
            iVar.d();
            return;
        }
        if (iOrdinal == 2) {
            if (iVar.f41b) {
                this.f = true;
                iVar.d();
                return;
            }
            if (i % 2 == 0) {
                iVar.g(',');
                iVar.d();
            } else {
                iVar.g(':');
                iVar.h();
                z4 = false;
            }
            this.f = z4;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.f = true;
            }
            if (i == 1) {
                iVar.g(',');
                iVar.h();
                this.f = false;
                return;
            }
            return;
        }
        if (!iVar.f41b) {
            iVar.g(',');
        }
        iVar.d();
        Uj.b json = this.f6144b;
        kotlin.jvm.internal.j.g(json, "json");
        f.f(descriptor, json);
        k(descriptor.e(i));
        iVar.g(':');
        iVar.h();
    }

    public final void c(int i) {
        if (this.f) {
            k(String.valueOf(i));
        } else {
            ((Ri.a) this.f6143a.c).r(String.valueOf(i));
        }
    }

    public final void d(int i, int i4, Rj.d descriptor) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        b(descriptor, i);
        c(i4);
    }

    public final void e(long j) {
        if (this.f) {
            k(String.valueOf(j));
        } else {
            ((Ri.a) this.f6143a.c).r(String.valueOf(j));
        }
    }

    public final void f(Rj.d descriptor, int i, long j) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        b(descriptor, i);
        e(j);
    }

    public final void g() {
        A3.i iVar = this.f6143a;
        iVar.getClass();
        kotlin.jvm.internal.j.g("null", "v");
        ((Ri.a) iVar.c).r("null");
    }

    public final void h(Rj.d descriptor, int i, Pj.a serializer, Object obj) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        kotlin.jvm.internal.j.g(serializer, "serializer");
        if (obj != null || this.e.f6008a) {
            kotlin.jvm.internal.j.g(descriptor, "descriptor");
            kotlin.jvm.internal.j.g(serializer, "serializer");
            b(descriptor, i);
            if (serializer.d().b()) {
                j(serializer, obj);
            } else if (obj == null) {
                g();
            } else {
                j(serializer, obj);
            }
        }
    }

    public final void i(Rj.d descriptor, int i, Pj.a serializer, Object obj) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        kotlin.jvm.internal.j.g(serializer, "serializer");
        b(descriptor, i);
        j(serializer, obj);
    }

    public final void j(Pj.a serializer, Object obj) {
        String strDiscriminator;
        kotlin.jvm.internal.j.g(serializer, "serializer");
        Uj.b bVar = this.f6144b;
        int iOrdinal = bVar.f6006a.f.ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                AbstractC1955a kind = serializer.d().getKind();
                if (kotlin.jvm.internal.j.b(kind, Rj.i.c) || kotlin.jvm.internal.j.b(kind, Rj.i.f)) {
                    Rj.d dVarD = serializer.d();
                    kotlin.jvm.internal.j.g(dVarD, "<this>");
                    Iterator it = dVarD.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = bVar.f6006a.c;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof Uj.c) {
                            strDiscriminator = ((Uj.c) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strH = serializer.d().h();
            this.f6146g = strDiscriminator;
            this.h = strH;
        }
        serializer.c(this, obj);
    }

    public final void k(String value) {
        byte b8;
        kotlin.jvm.internal.j.g(value, "value");
        A3.i iVar = this.f6143a;
        iVar.getClass();
        kotlin.jvm.internal.j.g(value, "value");
        Ri.a aVar = (Ri.a) iVar.c;
        aVar.j(aVar.f5558b, value.length() + 2);
        char[] cArr = (char[]) aVar.c;
        int i = aVar.f5558b;
        int i4 = i + 1;
        cArr[i] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i4);
        int i6 = length + i4;
        int i10 = i4;
        while (i10 < i6) {
            char c = cArr[i10];
            byte[] bArr = i.f6148b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = value.length();
                for (int i11 = i10 - i4; i11 < length2; i11++) {
                    aVar.j(i10, 2);
                    char cCharAt = value.charAt(i11);
                    byte[] bArr2 = i.f6148b;
                    if (cCharAt >= bArr2.length || (b8 = bArr2[cCharAt]) == 0) {
                        int i12 = i10 + 1;
                        ((char[]) aVar.c)[i10] = cCharAt;
                        i10 = i12;
                    } else {
                        if (b8 == 1) {
                            String str = i.f6147a[cCharAt];
                            kotlin.jvm.internal.j.d(str);
                            aVar.j(i10, str.length());
                            str.getChars(0, str.length(), (char[]) aVar.c, i10);
                            int length3 = str.length() + i10;
                            aVar.f5558b = length3;
                            i10 = length3;
                        } else {
                            char[] cArr2 = (char[]) aVar.c;
                            cArr2[i10] = '\\';
                            cArr2[i10 + 1] = (char) b8;
                            i10 += 2;
                            aVar.f5558b = i10;
                        }
                    }
                }
                aVar.j(i10, 1);
                ((char[]) aVar.c)[i10] = '\"';
                aVar.f5558b = i10 + 1;
                return;
            }
            i10++;
        }
        cArr[i6] = '\"';
        aVar.f5558b = i6 + 1;
    }

    public final void l(Rj.d descriptor, int i, String value) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        kotlin.jvm.internal.j.g(value, "value");
        b(descriptor, i);
        k(value);
    }

    public final void m(Rj.d descriptor) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        j jVar = this.c;
        A3.i iVar = this.f6143a;
        iVar.getClass();
        iVar.f41b = false;
        iVar.g(jVar.f6152b);
    }

    public final boolean n(Rj.d dVar) {
        return false;
    }
}
