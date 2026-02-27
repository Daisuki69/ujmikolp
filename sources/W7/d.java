package W7;

import com.paymaya.domain.model.Favorite;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Favorite f6329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6330b;
    public final f c;

    public d(Favorite favorite, boolean z4) {
        j.g(favorite, "favorite");
        this.f6329a = favorite;
        this.f6330b = z4;
        this.c = f.f6334d;
    }

    @Override // W7.g
    public final f a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.b(this.f6329a, dVar.f6329a) && this.f6330b == dVar.f6330b;
    }

    public final int hashCode() {
        return (this.f6329a.hashCode() * 31) + (this.f6330b ? 1231 : 1237);
    }

    public final String toString() {
        return "Item(favorite=" + this.f6329a + ", isLast=" + this.f6330b + ")";
    }
}
