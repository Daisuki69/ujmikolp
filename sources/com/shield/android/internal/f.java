package com.shield.android.internal;

import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15415d = {42260952, 778866713, 1200211451, 1094881996, 2051377105, 2128421689};

    /* JADX INFO: renamed from: gb, reason: collision with root package name */
    private static f f15416gb = new f();

    /* JADX INFO: renamed from: gc, reason: collision with root package name */
    private static boolean f15417gc;

    private f() {
    }

    public static final boolean bI() {
        return bJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean bJ() {
        if (f15417gc) {
            return ((int) f15415d[0]) ^ 42260953;
        }
        try {
            System.loadLibrary(d("Չ˴Ĺ胍쀡恁끽\ud86f\uec69癦㭠鷢亣❍鏞즹\ue498\uf21f祍본\ude63潋럺\udbab"));
            f15417gc = ((int) f15415d[0]) ^ 42260953;
        } catch (Exception e) {
            f15417gc = ((int) f15415d[1]) ^ 778866713;
            com.shield.android.k.a.dL().a(e);
        }
        return f15417gc;
    }

    public static String d(String str) {
        int i = ((int) f15415d[2]) ^ 1200213934;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15415d[1]) ^ 778866713;
        while (i4 < str.length()) {
            long[] jArr = f15415d;
            int i6 = (((i >> (((int) jArr[1]) ^ 778866713)) ^ (i >> (((int) jArr[3]) ^ 1094881998))) ^ (i >> (((int) jArr[4]) ^ 2051377106))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 42260953)) | (((char) (i6 & (((int) j) ^ 42260953))) << (((int) jArr[5]) ^ 2128421686)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15415d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 42260953, i11, i10, (((int) j6) ^ 42260953) + i10 + i11));
            long j7 = f15415d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 42260953) + (((int) j7) ^ 42260953) + ((~(((int) j7) ^ 42260953)) | i12) + (((((int) j7) ^ 42260953) + i4) - ((((((int) j7) ^ 42260953) + i4) + (((int) j7) ^ 42260953)) + ((~(((int) j7) ^ 42260953)) | i12)));
        }
        return sb2.toString();
    }
}
