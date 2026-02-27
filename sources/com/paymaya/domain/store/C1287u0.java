package com.paymaya.domain.store;

import com.google.firebase.messaging.FirebaseMessaging;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.Restriction;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.paymaya.domain.store.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1287u0 implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1293x0 f11485b;

    public /* synthetic */ C1287u0(C1293x0 c1293x0, int i) {
        this.f11484a = i;
        this.f11485b = c1293x0;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f11484a) {
            case 0:
                this.f11485b.o((Profile) obj);
                break;
            case 1:
                List list = (List) obj;
                C1293x0 c1293x0 = this.f11485b;
                c1293x0.getClass();
                c1293x0.f11496b.p0(list.isEmpty() ? "" : ((Restriction) list.get(0)).getReason());
                break;
            case 2:
                this.f11485b.n((Throwable) obj);
                break;
            case 3:
                Profile profile = (Profile) obj;
                C1293x0 c1293x02 = this.f11485b;
                c1293x02.o(profile);
                FirebaseMessaging.c().e().addOnCompleteListener(new C1291w0(c1293x02));
                c1293x02.p(profile.mWalletId(), "REGISTRATION");
                break;
            case 4:
            default:
                this.f11485b.n((Throwable) obj);
                break;
            case 5:
                List list2 = (List) obj;
                C1293x0 c1293x03 = this.f11485b;
                c1293x03.getClass();
                c1293x03.f11496b.p0(list2.isEmpty() ? "" : ((Restriction) list2.get(0)).getReason());
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Profile profile = (Profile) obj;
        C1293x0 c1293x0 = this.f11485b;
        c1293x0.o(profile);
        FirebaseMessaging.c().e().addOnCompleteListener(new C1291w0(c1293x0));
        c1293x0.p(profile.mWalletId(), "REGISTRATION");
        boolean zIsCustomerRestrictionsEnabled = c1293x0.f11496b.e().isCustomerRestrictionsEnabled();
        F0 f02 = c1293x0.j;
        Ah.p pVarA = (zIsCustomerRestrictionsEnabled || profile.mAccountStatus().equals("LIMITED")) ? f02.a() : Ah.p.c(Collections.EMPTY_LIST);
        Lh.d dVar = new Lh.d(new Lh.d(pVarA, new C1287u0(c1293x0, 1), 2), new C1287u0(c1293x0, 2), 0);
        List list = Collections.EMPTY_LIST;
        Objects.requireNonNull(list, "item is null");
        return new Lh.i(dVar, null, list).d(new androidx.work.impl.e(profile, 25));
    }
}
