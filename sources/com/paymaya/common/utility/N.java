package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ N[] f10426a;

    static {
        N[] nArr = {new N("ONBOARDING", 0), new N("REFERRAL", 1)};
        f10426a = nArr;
        v0.h(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f10426a.clone();
    }
}
