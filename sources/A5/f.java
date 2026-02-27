package A5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Y5.d {
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f158d;
    public static final f e;
    public static final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f159g;
    public static final f h;
    public static final /* synthetic */ f[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W5.e f161b;

    static {
        a[] aVarArr = a.f48a;
        W5.e eVar = W5.e.c;
        f fVar = new f("DASHBOARD_TABS", 0, "experiment-dashboard-tabs-arrangement", eVar);
        c = fVar;
        W5.e eVar2 = W5.e.f6314b;
        f fVar2 = new f("MAINTENANCE_SCREEN_ACTIVE", 1, "permanent-maintenance-screen-android", eVar2);
        f158d = fVar2;
        f fVar3 = new f("SERVICES_BANNER_INDEX", 2, "release-banner-index", eVar);
        e = fVar3;
        f fVar4 = new f("UPDATER_DETAILS", 3, "permanent-updater-details-android", eVar2);
        f = fVar4;
        f fVar5 = new f("TRANSACTION_LIMITS_MAINTENANCE_MODE", 4, "permanent-sct-transaction-limits-maintenance-mode", eVar);
        f159g = fVar5;
        f fVar6 = new f("PMS_INTERNAL_VERTICAL_BANNER_CONFIG", 5, "release-internal-vertical-banner-config", eVar);
        h = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        i = fVarArr;
        v0.h(fVarArr);
    }

    public f(String str, int i4, String str2, W5.e eVar) {
        this.f160a = str2;
        this.f161b = eVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) i.clone();
    }

    @Override // Y5.d
    public final Y5.a a() {
        return this.f161b;
    }

    @Override // Y5.d
    public final String getKey() {
        return this.f160a;
    }
}
