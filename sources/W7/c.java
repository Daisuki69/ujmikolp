package W7;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6328b;

    public c(String title) {
        j.g(title, "title");
        this.f6327a = title;
        this.f6328b = f.f6333b;
    }

    @Override // W7.g
    public final f a() {
        return this.f6328b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.b(this.f6327a, ((c) obj).f6327a);
    }

    public final int hashCode() {
        return this.f6327a.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder("Header(title="), this.f6327a, ")");
    }
}
