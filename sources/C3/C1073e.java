package c3;

import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9284a;

    public C1073e(String sessionId) {
        j.g(sessionId, "sessionId");
        this.f9284a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1073e) && j.b(this.f9284a, ((C1073e) obj).f9284a);
    }

    public final int hashCode() {
        return this.f9284a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("SessionDetails(sessionId="), this.f9284a, ')');
    }
}
