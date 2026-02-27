package com.paymaya.common.utility;

/* JADX INFO: renamed from: com.paymaya.common.utility.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1218g implements InterfaceC1214c {
    SHARED_ROW("SHARED_ROW"),
    FLOATING_NAVIGATION("FLOATING_NAVIGATION");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11201a;

    EnumC1218g(String str) {
        this.f11201a = str;
    }

    @Override // com.paymaya.common.utility.InterfaceC1214c
    public final String getValue() {
        return this.f11201a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return We.s.p(new StringBuilder("WIDGET{value='"), this.f11201a, "'}");
    }
}
