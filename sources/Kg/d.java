package Kg;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wg.a f2663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2664b;

    public d(Wg.a expectedType, Object response) {
        j.g(expectedType, "expectedType");
        j.g(response, "response");
        this.f2663a = expectedType;
        this.f2664b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.b(this.f2663a, dVar.f2663a) && j.b(this.f2664b, dVar.f2664b);
    }

    public final int hashCode() {
        return this.f2664b.hashCode() + (this.f2663a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f2663a + ", response=" + this.f2664b + ')';
    }
}
