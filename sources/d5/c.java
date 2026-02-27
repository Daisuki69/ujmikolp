package d5;

import We.s;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("message")
    private final String f16279a;

    public final String a() {
        return this.f16279a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.b(this.f16279a, ((c) obj).f16279a);
    }

    public final int hashCode() {
        return this.f16279a.hashCode();
    }

    public final String toString() {
        return s.j("ErrorData(message=", this.f16279a, ")");
    }
}
