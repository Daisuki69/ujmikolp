package bj;

import java.io.Serializable;

/* JADX INFO: renamed from: bj.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1038i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f9168a;

    public C1038i(Throwable exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        this.f9168a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1038i) {
            return kotlin.jvm.internal.j.b(this.f9168a, ((C1038i) obj).f9168a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9168a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9168a + ')';
    }
}
