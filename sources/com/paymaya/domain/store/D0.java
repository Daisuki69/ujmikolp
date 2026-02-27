package com.paymaya.domain.store;

import com.paymaya.domain.model.Registration;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D0 implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f11344b;

    public /* synthetic */ D0(E0 e02, int i) {
        this.f11343a = i;
        this.f11344b = e02;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        Registration registration = (Registration) obj;
        switch (this.f11343a) {
            case 0:
                E0 e02 = this.f11344b;
                e02.getClass();
                String strMValue = registration.mIdentity().mValue();
                com.paymaya.data.preference.a aVar = e02.c;
                aVar.f11330b.edit().putString("key_registration_mobile_number", strMValue).apply();
                aVar.o0(registration.mRegistrationId());
                break;
            default:
                this.f11344b.c.o0(registration.mRegistrationId());
                break;
        }
    }
}
