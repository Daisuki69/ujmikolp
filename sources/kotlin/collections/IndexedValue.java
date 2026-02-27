package kotlin.collections;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18164b;

    public IndexedValue(int i, Object obj) {
        this.f18163a = i;
        this.f18164b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f18163a == indexedValue.f18163a && j.b(this.f18164b, indexedValue.f18164b);
    }

    public final int hashCode() {
        int i = this.f18163a * 31;
        Object obj = this.f18164b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f18163a + ", value=" + this.f18164b + ')';
    }
}
