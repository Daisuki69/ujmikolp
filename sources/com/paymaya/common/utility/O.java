package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ O[] f10427b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10428a;

    static {
        O[] oArr = {new O("LANDERS", 0, "LANDERS"), new O("GIGA", 1, "GIGA")};
        f10427b = oArr;
        v0.h(oArr);
    }

    public O(String str, int i, String str2) {
        this.f10428a = str2;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f10427b.clone();
    }
}
