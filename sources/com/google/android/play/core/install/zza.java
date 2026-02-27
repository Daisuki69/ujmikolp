package com.google.android.play.core.install;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9730b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9731d;
    public final String e;

    public zza(int i, long j, long j6, int i4, String str) {
        this.f9729a = i;
        this.f9730b = j;
        this.c = j6;
        this.f9731d = i4;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f9729a == zzaVar.f9729a && this.f9730b == zzaVar.f9730b && this.c == zzaVar.c && this.f9731d == zzaVar.f9731d && this.e.equals(zzaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9729a ^ 1000003;
        long j = this.f9730b;
        long j6 = this.c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f9731d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallState{installStatus=");
        sb2.append(this.f9729a);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f9730b);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.c);
        sb2.append(", installErrorCode=");
        sb2.append(this.f9731d);
        sb2.append(", packageName=");
        return s.p(sb2, this.e, "}");
    }
}
