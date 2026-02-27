package com.paymaya.domain.store;

import com.paymaya.domain.model.CreditTransaction;

/* JADX INFO: renamed from: com.paymaya.domain.store.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1296z implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f11505b;

    public /* synthetic */ C1296z(A a8, int i) {
        this.f11504a = i;
        this.f11505b = a8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        CreditTransaction creditTransaction = (CreditTransaction) obj;
        switch (this.f11504a) {
            case 0:
                com.paymaya.data.database.repository.m mVar = this.f11505b.f11332d;
                mVar.getClass();
                mVar.f11315a.b("credit_transaction", "", null);
                mVar.a(creditTransaction.getItems());
                break;
            default:
                this.f11505b.f11332d.a(creditTransaction.getItems());
                break;
        }
    }
}
