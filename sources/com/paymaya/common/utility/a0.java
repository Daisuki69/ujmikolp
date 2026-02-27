package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a0[] f10692a;

    static {
        a0[] a0VarArr = {new a0("INVALID_LENGTH", 0), new a0("MISSING_REQUIRED_FIELD", 1), new a0("INVALID_VALUE", 2), new a0("PARSING_ERROR", 3), new a0("TAMPERED_QR", 4), new a0("QRPH_TYPE_NOT_ALLOWED", 5)};
        f10692a = a0VarArr;
        v0.h(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f10692a.clone();
    }
}
