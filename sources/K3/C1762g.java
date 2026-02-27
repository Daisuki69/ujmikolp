package k3;

import defpackage.AbstractC1414e;
import java.io.Serializable;
import s.AbstractC2217b;

/* JADX INFO: renamed from: k3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1762g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18104b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18105d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18106g;
    public int h;
    public String i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18107k;

    public final boolean equals(Object obj) {
        C1762g c1762g;
        if (!(obj instanceof C1762g) || (c1762g = (C1762g) obj) == null) {
            return false;
        }
        if (this == c1762g) {
            return true;
        }
        return this.f18103a == c1762g.f18103a && this.f18104b == c1762g.f18104b && this.f18105d.equals(c1762g.f18105d) && this.f == c1762g.f && this.h == c1762g.h && this.i.equals(c1762g.i) && this.j == c1762g.j && this.f18107k.equals(c1762g.f18107k);
    }

    public final int hashCode() {
        return ((this.f18107k.hashCode() + ((AbstractC2217b.c(this.j) + AbstractC1414e.c((((AbstractC1414e.c((Long.valueOf(this.f18104b).hashCode() + ((2173 + this.f18103a) * 53)) * 53, 53, this.f18105d) + (this.f ? 1231 : 1237)) * 53) + this.h) * 53, 53, this.i)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f18103a);
        sb2.append(" National Number: ");
        sb2.append(this.f18104b);
        if (this.e && this.f) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.f18106g) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.h);
        }
        if (this.c) {
            sb2.append(" Extension: ");
            sb2.append(this.f18105d);
        }
        return sb2.toString();
    }
}
