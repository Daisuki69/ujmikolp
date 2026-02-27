package com.paymaya.domain.store;

import com.paymaya.domain.model.Profile;

/* JADX INFO: renamed from: com.paymaya.domain.store.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1289v0 implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1293x0 f11489b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11490d;
    public final /* synthetic */ String e;

    public /* synthetic */ C1289v0(C1293x0 c1293x0, boolean z4, String str, String str2, int i) {
        this.f11488a = i;
        this.f11489b = c1293x0;
        this.c = z4;
        this.f11490d = str;
        this.e = str2;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Profile profile = (Profile) obj;
        switch (this.f11488a) {
            case 0:
                this.f11489b.m(profile, this.c, this.f11490d, this.e);
                break;
            default:
                this.f11489b.m(profile, this.c, this.f11490d, this.e);
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        Profile profile = (Profile) obj;
        switch (this.f11488a) {
            case 1:
                return this.f11489b.h(profile, this.c, this.f11490d, this.e).d(new androidx.work.impl.e(profile, 25));
            default:
                return this.f11489b.h(profile, this.c, this.f11490d, this.e).d(new androidx.work.impl.e(profile, 25));
        }
    }
}
