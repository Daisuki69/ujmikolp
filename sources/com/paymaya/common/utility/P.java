package com.paymaya.common.utility;

/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f10429a;

    public P(com.paymaya.data.preference.a preference) {
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f10429a = preference;
    }

    public final void a() {
        com.paymaya.data.preference.a aVar = this.f10429a;
        if (aVar.e().isSavingsAutoProvisioningEnabled() && aVar.f11330b.getBoolean("savings_auto_provision_opt_in_sent", false)) {
            aVar.M();
            aVar.N();
        }
    }
}
