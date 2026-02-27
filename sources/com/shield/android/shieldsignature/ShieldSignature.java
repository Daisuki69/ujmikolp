package com.shield.android.shieldsignature;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ShieldSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15488b;
    public final String c;

    public ShieldSignature(long j, boolean z4, String signature) {
        j.g(signature, "signature");
        this.f15487a = j;
        this.f15488b = z4;
        this.c = signature;
    }

    public static /* synthetic */ ShieldSignature copy$default(ShieldSignature shieldSignature, long j, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = shieldSignature.f15487a;
        }
        if ((i & 2) != 0) {
            z4 = shieldSignature.f15488b;
        }
        if ((i & 4) != 0) {
            str = shieldSignature.c;
        }
        return shieldSignature.copy(j, z4, str);
    }

    public final long component1() {
        return this.f15487a;
    }

    public final boolean component2() {
        return this.f15488b;
    }

    public final String component3() {
        return this.c;
    }

    public final ShieldSignature copy(long j, boolean z4, String signature) {
        j.g(signature, "signature");
        return new ShieldSignature(j, z4, signature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShieldSignature)) {
            return false;
        }
        ShieldSignature shieldSignature = (ShieldSignature) obj;
        return this.f15487a == shieldSignature.f15487a && this.f15488b == shieldSignature.f15488b && j.b(this.c, shieldSignature.c);
    }

    public final String getSignature() {
        return this.c;
    }

    public final long getTimestamp() {
        return this.f15487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        long j = this.f15487a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z4 = this.f15488b;
        ?? r1 = z4;
        if (z4) {
            r1 = 1;
        }
        return this.c.hashCode() + ((i + r1) * 31);
    }

    public final boolean isNTP() {
        return this.f15488b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShieldSignature(timestamp=");
        sb2.append(this.f15487a);
        sb2.append(", isNTP=");
        sb2.append(this.f15488b);
        sb2.append(", signature=");
        return androidx.camera.core.impl.a.n(sb2, this.c, ')');
    }
}
