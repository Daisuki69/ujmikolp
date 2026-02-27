package com.shield.android.internal;

import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15412d = {1158781939, 356060476, 1688787534, 677521009, 484626639};
    private final String fU;
    private final String fV;

    public d(String str, String str2) {
        kotlin.jvm.internal.j.g(str, g("\udf87\udf80\udf9e"));
        kotlin.jvm.internal.j.g(str2, g("\udf84\udf97\udf80\udf81\udf9b\udf9d\udf9c"));
        this.fU = str;
        this.fV = str2;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15412d[3]) ^ 677521009;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15412d;
            long j = jArr[4];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 484577085) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 484577085) + (((int) j6) ^ 1688787535), i4 | (~(((int) j) ^ 484577085)), i6, (((int) j) ^ 484577085) + cCharAt + (((int) j6) ^ 1688787535) + ((~(((int) j) ^ 484577085)) | i4)));
            long j7 = f15412d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1688787535) + (((int) j7) ^ 1688787535) + ((~(((int) j7) ^ 1688787535)) | i10) + (((((int) j7) ^ 1688787535) + i) - ((((((int) j7) ^ 1688787535) + i) + (((int) j7) ^ 1688787535)) + ((~(((int) j7) ^ 1688787535)) | i10)));
        }
        return sb2.toString();
    }

    public final String bG() {
        return this.fU;
    }

    public final String bH() {
        return this.fV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return ((int) f15412d[2]) ^ 1688787535;
        }
        if (!(obj instanceof d)) {
            return ((int) f15412d[3]) ^ 677521009;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.j.b(this.fU, dVar.fU) && kotlin.jvm.internal.j.b(this.fV, dVar.fV)) {
            return ((int) f15412d[2]) ^ 1688787535;
        }
        return ((int) f15412d[3]) ^ 677521009;
    }

    public final int hashCode() {
        return this.fV.hashCode() + (this.fU.hashCode() * (((int) f15412d[1]) ^ 356060451));
    }

    public final String toString() {
        return g("\udfb4\udfa2\udfa7\udf80\udf9e\udfda\udf87\udf80\udf9e\udfcf") + this.fU + g("\udfde\udfd2\udf84\udf97\udf80\udf81\udf9b\udf9d\udf9c\udfcf") + this.fV + ((((int) f15412d[0]) ^ 1158781914) == true ? (char) 1 : (char) 0);
    }
}
