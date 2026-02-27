package O4;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerializationException f4644a;

    public d(SerializationException serializationException) {
        this.f4644a = serializationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f4644a.equals(((d) obj).f4644a);
    }

    public final int hashCode() {
        return this.f4644a.hashCode();
    }

    public final String toString() {
        return "SerializationError(throwable=" + this.f4644a + ')';
    }
}
