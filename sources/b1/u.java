package b1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8338b;
    public final p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8339d;
    public final byte[] e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8340g;
    public final x h;
    public final q i;

    public u(long j, Integer num, p pVar, long j6, byte[] bArr, String str, long j7, x xVar, q qVar) {
        this.f8337a = j;
        this.f8338b = num;
        this.c = pVar;
        this.f8339d = j6;
        this.e = bArr;
        this.f = str;
        this.f8340g = j7;
        this.h = xVar;
        this.i = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        u uVar = (u) g8;
        if (this.f8337a != uVar.f8337a) {
            return false;
        }
        Integer num = this.f8338b;
        if (num == null) {
            if (uVar.f8338b != null) {
                return false;
            }
        } else if (!num.equals(uVar.f8338b)) {
            return false;
        }
        p pVar = this.c;
        if (pVar == null) {
            if (uVar.c != null) {
                return false;
            }
        } else if (!pVar.equals(uVar.c)) {
            return false;
        }
        if (this.f8339d != uVar.f8339d) {
            return false;
        }
        if (!Arrays.equals(this.e, g8 instanceof u ? ((u) g8).e : uVar.e)) {
            return false;
        }
        String str = uVar.f;
        String str2 = this.f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f8340g != uVar.f8340g) {
            return false;
        }
        x xVar = uVar.h;
        x xVar2 = this.h;
        if (xVar2 == null) {
            if (xVar != null) {
                return false;
            }
        } else if (!xVar2.equals(xVar)) {
            return false;
        }
        q qVar = uVar.i;
        q qVar2 = this.i;
        return qVar2 == null ? qVar == null : qVar2.equals(qVar);
    }

    public final int hashCode() {
        long j = this.f8337a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8338b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.c;
        int iHashCode2 = (iHashCode ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        long j6 = this.f8339d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f8340g;
        int i4 = (iHashCode4 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        x xVar = this.h;
        int iHashCode5 = (i4 ^ (xVar == null ? 0 : xVar.hashCode())) * 1000003;
        q qVar = this.i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f8337a + ", eventCode=" + this.f8338b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.f8339d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.f8340g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
