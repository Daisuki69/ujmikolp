package oi;

import dOYHB6.tiZVw8.numX49;
import g3.InterfaceC1498b;
import io.split.android.client.dtos.Identifiable;

/* JADX INFO: renamed from: oi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1985c implements Identifiable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient long f18894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("f")
    public final String f18895b;

    @InterfaceC1498b("m")
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1498b("rc")
    public final int f18896d;

    public C1985c(String str, long j, int i) {
        this.f18895b = str;
        this.c = j;
        this.f18896d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1985c c1985c = (C1985c) obj;
            if (this.f18895b.equals(c1985c.f18895b) && this.c == c1985c.c && this.f18896d == c1985c.f18896d) {
                return true;
            }
        }
        return false;
    }

    @Override // io.split.android.client.dtos.Identifiable
    public final long getId() {
        return this.f18894a;
    }

    public final int hashCode() {
        return String.format(numX49.tnTj78("bQjP"), this.f18895b, Long.valueOf(this.c), Integer.valueOf(this.f18896d)).hashCode();
    }
}
