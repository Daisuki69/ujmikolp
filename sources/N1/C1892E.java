package n1;

import com.paymaya.domain.model.MfaTencentErrorResult;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: n1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1892E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f18552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18553b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18554d;
    public t1.b e = t1.b.f20146d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1892E.class.equals(obj.getClass())) {
            return false;
        }
        C1892E c1892e = (C1892E) obj;
        return AbstractC2550e.a(this.f18552a, c1892e.f18552a) && AbstractC2550e.a(this.f18553b, c1892e.f18553b) && this.c == c1892e.c && this.f18554d == c1892e.f18554d && AbstractC2550e.a(this.e, c1892e.e);
    }

    public final int hashCode() {
        Integer num = this.f18552a;
        int iHashCode = (MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f18553b;
        int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.f18554d;
        return this.e.hashCode() + ((((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) 0)) * 31);
    }
}
