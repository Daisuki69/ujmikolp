package A5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class e implements Y5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f156b;
    public static final /* synthetic */ e[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157a;

    static {
        a[] aVarArr = a.f48a;
        W5.e eVar = W5.e.f6314b;
        e eVar2 = new e("FACTORY_CONFIG_READY_TIMEOUT", 0, "factory-config-ready-timeout");
        d dVar = new d("THREAT_EXTRACTION_INTERVAL", 1, "release-threat-extraction-interval");
        f156b = dVar;
        e[] eVarArr = {eVar2, dVar};
        c = eVarArr;
        v0.h(eVarArr);
    }

    public e(String str, int i, String str2) {
        W5.e eVar = W5.e.f6314b;
        this.f157a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) c.clone();
    }

    @Override // Y5.d
    public final Y5.a a() {
        return W5.e.f6314b;
    }

    @Override // Y5.d
    public final String getKey() {
        return this.f157a;
    }
}
