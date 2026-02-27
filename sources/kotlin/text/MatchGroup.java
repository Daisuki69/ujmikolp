package kotlin.text;

import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f18207b;

    public MatchGroup(String str, IntRange intRange) {
        this.f18206a = str;
        this.f18207b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return j.b(this.f18206a, matchGroup.f18206a) && j.b(this.f18207b, matchGroup.f18207b);
    }

    public final int hashCode() {
        return this.f18207b.hashCode() + (this.f18206a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f18206a + ", range=" + this.f18207b + ')';
    }
}
