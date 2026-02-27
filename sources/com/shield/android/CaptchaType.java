package com.shield.android;

import com.paymaya.common.utility.AbstractC1213b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CaptchaType {
    public static final CaptchaType MATH_CHALLENGE;
    public static final CaptchaType TEXT_CAPTCHA;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f14964d = {538202036, 1030213288, 1442963965, 866368539, 105565446, 337723193};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ CaptchaType[] f14965l;

    static {
        CaptchaType captchaType = new CaptchaType(d("墘Ⱓᙫ୍דʅ脢䃡\u200c遯졞\ue44a"), ((int) f14964d[0]) ^ 538202036);
        TEXT_CAPTCHA = captchaType;
        CaptchaType captchaType2 = new CaptchaType(d("墁Ⱗᙧ\u0b51דʅ脫䃰—遠졓\ue445牂㥇"), ((int) f14964d[1]) ^ 1030213289);
        MATH_CHALLENGE = captchaType2;
        long[] jArr = f14964d;
        CaptchaType[] captchaTypeArr = new CaptchaType[((int) jArr[2]) ^ 1442963967];
        captchaTypeArr[((int) jArr[0]) ^ 538202036] = captchaType;
        captchaTypeArr[((int) jArr[1]) ^ 1030213289] = captchaType2;
        f14965l = captchaTypeArr;
    }

    private CaptchaType(String str, int i) {
    }

    public static String d(String str) {
        int i = ((int) f14964d[3]) ^ 866323842;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f14964d[0]) ^ 538202036;
        while (i4 < str.length()) {
            long[] jArr = f14964d;
            int i6 = (((i >> (((int) jArr[0]) ^ 538202036)) ^ (i >> (((int) jArr[2]) ^ 1442963967))) ^ (i >> (((int) jArr[4]) ^ 105565445))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1030213289)) | (((char) (i6 & (((int) j) ^ 1030213289))) << (((int) jArr[5]) ^ 337723190)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f14964d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1030213289, i11, i10, (((int) j6) ^ 1030213289) + i10 + i11));
            long j7 = f14964d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1030213289) + (((int) j7) ^ 1030213289) + ((~(((int) j7) ^ 1030213289)) | i12) + (((((int) j7) ^ 1030213289) + i4) - ((((((int) j7) ^ 1030213289) + i4) + (((int) j7) ^ 1030213289)) + ((~(((int) j7) ^ 1030213289)) | i12)));
        }
        return sb2.toString();
    }

    public static CaptchaType valueOf(String str) {
        return (CaptchaType) Enum.valueOf(CaptchaType.class, str);
    }

    public static CaptchaType[] values() {
        return (CaptchaType[]) f14965l.clone();
    }
}
