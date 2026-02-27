package O4;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f4643a;

    public c(IOException iOException) {
        this.f4643a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f4643a.equals(((c) obj).f4643a);
    }

    public final int hashCode() {
        return this.f4643a.hashCode();
    }

    public final String toString() {
        return "NetworkError(throwable=" + this.f4643a + ')';
    }
}
