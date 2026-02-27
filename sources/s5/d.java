package s5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC2237a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20008b;
    public static final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f20009d;
    public static final d e;
    public static final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f20010g;
    public static final d h;
    public static final /* synthetic */ d[] i;

    static {
        d dVar = new d("WALLET_DASHBOARD", 0);
        f20007a = dVar;
        d dVar2 = new d("BILLS_PAY_LANDING_PAGE", 1);
        f20008b = dVar2;
        d dVar3 = new d("CASH_IN_LANDING_PAGE", 2);
        c = dVar3;
        d dVar4 = new d("SEND_MONEY", 3);
        f20009d = dVar4;
        d dVar5 = new d("SERVICES_SCREEN", 4);
        e = dVar5;
        d dVar6 = new d("SHOP_LANDING_PAGE", 5);
        f = dVar6;
        d dVar7 = new d("EASY_CREDIT_SCREEN", 6);
        f20010g = dVar7;
        d dVar8 = new d("INTERNAL_AD_SCREEN", 7);
        h = dVar8;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        i = dVarArr;
        v0.h(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }
}
