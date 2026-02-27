package J7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2446b;

    public h(ArrayList arrayList) {
        super(0);
        this.f2446b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f2446b.equals(((h) obj).f2446b);
    }

    public final int hashCode() {
        return this.f2446b.hashCode();
    }

    public final String toString() {
        return "CoreItems(coreItems=" + this.f2446b + ")";
    }
}
