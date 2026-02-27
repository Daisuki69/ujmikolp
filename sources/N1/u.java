package n1;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f18581a = new SparseBooleanArray();

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.f18581a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f18581a.equals(((u) obj).f18581a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18581a.hashCode();
    }
}
