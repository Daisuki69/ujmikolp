package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ M[] f10424b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10425a;

    static {
        M[] mArr = {new M("LANDERS", 0, "LANDERS"), new M("GIGA", 1, "GIGA")};
        f10424b = mArr;
        v0.h(mArr);
    }

    public M(String str, int i, String str2) {
        this.f10425a = str2;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f10424b.clone();
    }
}
