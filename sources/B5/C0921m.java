package b5;

import java.util.Map;

/* JADX INFO: renamed from: b5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0921m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8534a;

    public C0921m(Map tags) {
        kotlin.jvm.internal.j.g(tags, "tags");
        this.f8534a = tags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0921m) && kotlin.jvm.internal.j.b(this.f8534a, ((C0921m) obj).f8534a);
    }

    public final int hashCode() {
        return this.f8534a.hashCode();
    }

    public final String toString() {
        return "Success(tags=" + this.f8534a + ")";
    }
}
