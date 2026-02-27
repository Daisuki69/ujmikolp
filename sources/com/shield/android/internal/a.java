package com.shield.android.internal;

import com.shield.android.Shield;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15409d = {506414119, 1251817166, 1546254040, 1648563173, 1018397418, 1540497277};

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str, Object... objArr) {
        if ((Shield.LOG_LEVEL.ordinal() >= Shield.LogLevel.INFO.ordinal() ? ((int) f15409d[0]) ^ 506414118 : ((int) f15409d[1]) ^ 1251817166) != 0) {
            com.shield.android.k.a.dL().a(((int) f15409d[0]) ^ 506414118, str, objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Throwable th2, String str, Object... objArr) {
        if ((Shield.LOG_LEVEL.ordinal() >= Shield.LogLevel.INFO.ordinal() ? ((int) f15409d[0]) ^ 506414118 : ((int) f15409d[1]) ^ 1251817166) != 0) {
            com.shield.android.k.a.dL().a(((int) f15409d[0]) ^ 506414118, th2, str, objArr);
        }
    }
}
