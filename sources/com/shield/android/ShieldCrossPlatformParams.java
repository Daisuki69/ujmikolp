package com.shield.android;

import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class ShieldCrossPlatformParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15008d = {1665146655, 1860333389, 1372365408, 1365953275, 560178569, 1008556859, 957343923};
    private final String be;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private final String f15009bf;

    public ShieldCrossPlatformParams(String str, String str2) {
        kotlin.jvm.internal.j.g(str, f("ᗓᗝᗒᗛ"));
        kotlin.jvm.internal.j.g(str2, f("ᗋᗙᗍᗍᗐᗗᗕ"));
        this.be = str;
        this.f15009bf = str2;
    }

    public static /* synthetic */ ShieldCrossPlatformParams copy$default(ShieldCrossPlatformParams shieldCrossPlatformParams, String str, String str2, int i, Object obj) {
        long[] jArr = f15008d;
        long j = jArr[0];
        int i4 = (((int) j) ^ 1665146654) + i + (((int) j) ^ 1665146654);
        int i6 = ~i;
        if (((((int) j) ^ 1665146654) + i) - (i4 + ((~(((int) j) ^ 1665146654)) | i6)) != 0) {
            str = shieldCrossPlatformParams.be;
        }
        long j6 = jArr[1];
        if (((((int) j6) ^ 1860333391) + i) - (((i + (((int) j6) ^ 1860333391)) + (((int) j) ^ 1665146654)) + ((~(((int) j6) ^ 1860333391)) | i6)) != 0) {
            str2 = shieldCrossPlatformParams.f15009bf;
        }
        return shieldCrossPlatformParams.copy(str, str2);
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15008d[4]) ^ 560178569;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15008d;
            long j = jArr[5];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1008553606) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1008553606)) + (((int) j6) ^ 1665146654), (~(((int) j) ^ 1008553606)) | i4, i6, (((((int) j) ^ 1008553606) + cCharAt) + (((int) j6) ^ 1665146654)) + ((~(((int) j) ^ 1008553606)) | i4)) ^ (i % (((int) jArr[6]) ^ 957290316))));
            long j7 = f15008d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1665146654) + (((int) j7) ^ 1665146654) + ((~(((int) j7) ^ 1665146654)) | i10) + (((((int) j7) ^ 1665146654) + i) - ((((((int) j7) ^ 1665146654) + i) + (((int) j7) ^ 1665146654)) + ((~(((int) j7) ^ 1665146654)) | i10)));
        }
        return sb2.toString();
    }

    public final String component1() {
        return this.be;
    }

    public final String component2() {
        return this.f15009bf;
    }

    public final ShieldCrossPlatformParams copy(String str, String str2) {
        kotlin.jvm.internal.j.g(str, f("ᗓᗝᗒᗛ"));
        kotlin.jvm.internal.j.g(str2, f("ᗋᗙᗍᗍᗐᗗᗕ"));
        return new ShieldCrossPlatformParams(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return ((int) f15008d[0]) ^ 1665146654;
        }
        if (!(obj instanceof ShieldCrossPlatformParams)) {
            return ((int) f15008d[4]) ^ 560178569;
        }
        ShieldCrossPlatformParams shieldCrossPlatformParams = (ShieldCrossPlatformParams) obj;
        if (kotlin.jvm.internal.j.b(this.be, shieldCrossPlatformParams.be) && kotlin.jvm.internal.j.b(this.f15009bf, shieldCrossPlatformParams.f15009bf)) {
            return ((int) f15008d[0]) ^ 1665146654;
        }
        return ((int) f15008d[4]) ^ 560178569;
    }

    public final String getName() {
        return this.be;
    }

    public final String getVersion() {
        return this.f15009bf;
    }

    public final int hashCode() {
        return this.f15009bf.hashCode() + (this.be.hashCode() * (((int) f15008d[3]) ^ 1365953252));
    }

    public final String toString() {
        return f("ᗮᗔᗖᗛᗕᗜᗸᗈᗚᗇᗄᗦᗝᗑᗇᗔᗂᗞᗂᗾᗈᗚᗊᗇᗖᖌᗉᗇᗌᗅᖞ") + this.be + f("ᖑᖜᗉᗛᗋᗋᗒᗕᗛᖉ") + this.f15009bf + ((((int) f15008d[2]) ^ 1372365385) == true ? (char) 1 : (char) 0);
    }
}
