package s5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC2237a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f20013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20014b;
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f20015d;
    public static final f e;
    public static final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f20016g;
    public static final f h;
    public static final /* synthetic */ f[] i;

    static {
        f fVar = new f("WALLET_DASHBOARD", 0);
        f20013a = fVar;
        f fVar2 = new f("SERVICES_SCREEN", 1);
        f20014b = fVar2;
        f fVar3 = new f("SAVINGS_DASHBOARD", 2);
        c = fVar3;
        f fVar4 = new f("EASY_CREDIT", 3);
        f20015d = fVar4;
        f fVar5 = new f("LOANS", 4);
        e = fVar5;
        f fVar6 = new f("INTERNAL_AD_SCREEN", 5);
        f = fVar6;
        f fVar7 = new f("BANK_TRANSFER_LIST", 6);
        f20016g = fVar7;
        f fVar8 = new f("SEND_MONEY", 7);
        h = fVar8;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
        i = fVarArr;
        v0.h(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) i.clone();
    }
}
