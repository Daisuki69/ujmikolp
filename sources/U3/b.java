package U3;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5929b;

    public b(int i, int i4) {
        this.f5928a = i;
        this.f5929b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5928a == bVar.f5928a && this.f5929b == bVar.f5929b;
    }

    public final int hashCode() {
        return this.f5928a ^ this.f5929b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5928a);
        sb2.append("(");
        return s.m(sb2, this.f5929b, ')');
    }
}
