package A5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Y5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f162d;
    public static final g e;
    public static final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f163g;
    public static final g h;
    public static final g i;
    public static final /* synthetic */ g[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W5.e f165b;
    public final String c;

    static {
        a[] aVarArr = a.f48a;
        W5.e eVar = W5.e.c;
        g gVar = new g("CRYPTO_V2_MAINTENANCE_OVERRIDE", 0, "segmentation-crypto-v2-maintenance-bypass", eVar);
        f162d = gVar;
        W5.e eVar2 = W5.e.f6314b;
        g gVar2 = new g("DDP_VERSION", 1, "release-ddp-version", eVar2);
        g gVar3 = new g("KYC_USER_PROFILE_BOTTOM_SHEET_BUTTON_LABEL_REG", 2, "experiment-user-profiles-bottomsheet-button-label-reg", eVar2);
        e = gVar3;
        g gVar4 = new g("KYC_USER_PROFILE_WELCOME_SCREEN_BUTTON_LABEL", 3, "experiment-user-profiles-welcome-screen-button-label", eVar);
        f = gVar4;
        g gVar5 = new g("LOGIN_HISTORY_TTL", 4, "release-login-history-ttl", eVar, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16095W0);
        f163g = gVar5;
        g gVar6 = new g("WALLET_REWARDS_REORDER_V2", 5, "experiment-wallet-rewards-reorder-v2", eVar);
        h = gVar6;
        g gVar7 = new g("SAVINGS_TERMS_AND_CONDITIONS_VERSION", 6, "config-savings-terms-conditions-version", eVar2);
        i = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        j = gVarArr;
        v0.h(gVarArr);
    }

    public /* synthetic */ g(String str, int i4, String str2, W5.e eVar) {
        this(str, i4, str2, eVar, "default");
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) j.clone();
    }

    @Override // Y5.d
    public final Y5.a a() {
        return this.f165b;
    }

    @Override // Y5.d
    public final String getKey() {
        return this.f164a;
    }

    public g(String str, int i4, String str2, W5.e eVar, String str3) {
        this.f164a = str2;
        this.f165b = eVar;
        this.c = str3;
    }
}
