package K4;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2609b;
    public final HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2610d;

    public /* synthetic */ B(boolean z4, HashMap map, int i) {
        this(z4, (i & 2) != 0 ? null : map, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return this.f2609b == b8.f2609b && kotlin.jvm.internal.j.b(this.c, b8.c) && kotlin.jvm.internal.j.b(this.f2610d, b8.f2610d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z4 = this.f2609b;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i = r02 * 31;
        HashMap map = this.c;
        int iHashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f2610d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ExtractDeviceInfo(isStart=" + this.f2609b + ", extractorsPerformance=" + this.c + ", payloadSize=" + this.f2610d + ')';
    }

    public B(boolean z4, HashMap map, Integer num) {
        super("extract_device_info", z4);
        this.f2609b = z4;
        this.c = map;
        this.f2610d = num;
    }
}
