package Y5;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6758a;

    public c(String str) {
        this.f6758a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.b(this.f6758a, ((c) obj).f6758a);
    }

    public final int hashCode() {
        String str = this.f6758a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "OptionalValue(value=" + ((Object) this.f6758a) + ")";
    }
}
