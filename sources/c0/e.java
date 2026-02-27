package c0;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f9187b;
    public static final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f9188d;
    public static final e e;
    public static final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f9189g;
    public static final /* synthetic */ e[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9190a;

    static {
        e eVar = new e("NO_IMAGE", 0, "NO_IMAGE");
        f9187b = eVar;
        e eVar2 = new e("SUCCESS", 1, "SUCCESS");
        c = eVar2;
        e eVar3 = new e("DOWNLOAD_FAILED", 2, "DOWNLOAD_FAILED");
        f9188d = eVar3;
        e eVar4 = new e("NO_NETWORK", 3, "NO_NETWORK");
        e = eVar4;
        e eVar5 = new e("INIT_ERROR", 4, "INIT_ERROR");
        f = eVar5;
        e eVar6 = new e("SIZE_LIMIT_EXCEEDED", 5, "SIZE_LIMIT_EXCEEDED");
        f9189g = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, new e("GIF_SUCCESS", 6, "GIF_SUCCESS")};
        h = eVarArr;
        v0.h(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.f9190a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) h.clone();
    }
}
