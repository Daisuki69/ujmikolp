package c1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f9227b;
    public final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9228d;
    public final long e;
    public final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f9229g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public h(String str, Integer num, k kVar, long j, long j6, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f9226a = str;
        this.f9227b = num;
        this.c = kVar;
        this.f9228d = j;
        this.e = j6;
        this.f = map;
        this.f9229g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final Xh.g c() {
        Xh.g gVar = new Xh.g();
        String str = this.f9226a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        gVar.f6640a = str;
        gVar.f6641b = this.f9227b;
        gVar.f6643g = this.f9229g;
        gVar.h = this.h;
        gVar.i = this.i;
        gVar.j = this.j;
        k kVar = this.c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        gVar.c = kVar;
        gVar.f6642d = Long.valueOf(this.f9228d);
        gVar.e = Long.valueOf(this.e);
        gVar.f = new HashMap(this.f);
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f9226a.equals(hVar.f9226a)) {
            return false;
        }
        Integer num = hVar.f9227b;
        Integer num2 = this.f9227b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.c.equals(hVar.c) || this.f9228d != hVar.f9228d || this.e != hVar.e || !this.f.equals(hVar.f)) {
            return false;
        }
        Integer num3 = hVar.f9229g;
        Integer num4 = this.f9229g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = hVar.h;
        String str2 = this.h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.i, hVar.i) && Arrays.equals(this.j, hVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f9226a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f9227b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.f9228d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.e;
        int iHashCode3 = (((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.f9229g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f9226a + ", code=" + this.f9227b + ", encodedPayload=" + this.c + ", eventMillis=" + this.f9228d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.f9229g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
