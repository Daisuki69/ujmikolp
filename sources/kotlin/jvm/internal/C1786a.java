package kotlin.jvm.internal;

import defpackage.AbstractC1414e;
import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1786a implements InterfaceC1792g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f18183b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18184d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18185g;

    public C1786a(Class cls, String str) {
        this(AbstractC1788c.NO_RECEIVER, "<init>", 0, str, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1786a)) {
            return false;
        }
        C1786a c1786a = (C1786a) obj;
        return this.e == c1786a.e && this.f == c1786a.f && this.f18185g == c1786a.f18185g && j.b(this.f18182a, c1786a.f18182a) && j.b(this.f18183b, c1786a.f18183b) && this.c.equals(c1786a.c) && this.f18184d.equals(c1786a.f18184d);
    }

    @Override // kotlin.jvm.internal.InterfaceC1792g
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.f18182a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f18183b;
        return ((((AbstractC1414e.c(AbstractC1414e.c((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.f18184d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.f18185g;
    }

    public final String toString() {
        z.f18196a.getClass();
        return A.a(this);
    }

    public C1786a(Object obj, String str, int i, String str2, int i4, Class cls) {
        this.f18182a = obj;
        this.f18183b = cls;
        this.c = str;
        this.f18184d = str2;
        this.e = false;
        this.f = i;
        this.f18185g = i4 >> 1;
    }
}
