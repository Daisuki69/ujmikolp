package D2;

import We.s;
import d4.AbstractC1331a;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f971b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f972d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f973g;

    static {
        byte b8 = (byte) (((byte) (0 | 2)) | 1);
        if (b8 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b8 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public b(String str, int i, String str2, String str3, long j, long j6, String str4) {
        this.f970a = str;
        this.f971b = i;
        this.c = str2;
        this.f972d = str3;
        this.e = j;
        this.f = j6;
        this.f973g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f966a = this.f970a;
        aVar.f967b = this.f971b;
        aVar.c = this.c;
        aVar.f968d = this.f972d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.f969g = this.f973g;
        aVar.h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f970a;
        if (str == null) {
            if (bVar.f970a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f970a)) {
            return false;
        }
        if (!AbstractC2217b.b(this.f971b, bVar.f971b)) {
            return false;
        }
        String str2 = bVar.c;
        String str3 = this.c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = bVar.f972d;
        String str5 = this.f972d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.e != bVar.e || this.f != bVar.f) {
            return false;
        }
        String str6 = bVar.f973g;
        String str7 = this.f973g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f970a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC2217b.c(this.f971b)) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f972d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f;
        int i4 = (i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f973g;
        return (str4 != null ? str4.hashCode() : 0) ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f970a);
        sb2.append(", registrationStatus=");
        int i = this.f971b;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.c);
        sb2.append(", refreshToken=");
        sb2.append(this.f972d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f);
        sb2.append(", fisError=");
        return s.p(sb2, this.f973g, "}");
    }
}
