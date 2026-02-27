package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ L[] f10423a;

    static {
        L[] lArr = {new L("ONBOARDING", 0), new L("REFERRAL", 1)};
        f10423a = lArr;
        v0.h(lArr);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f10423a.clone();
    }
}
