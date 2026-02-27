package s5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2239c f20017b;
    public static final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f20018d;
    public static final /* synthetic */ i[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20019a;

    static {
        i iVar = new i("EXTERNAL", 0, "external");
        c = iVar;
        i iVar2 = new i("IN_APP", 1, "in-app");
        i iVar3 = new i("DEEPLINK", 2, "deeplink");
        f20018d = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        e = iVarArr;
        v0.h(iVarArr);
        f20017b = new C2239c();
    }

    public i(String str, int i, String str2) {
        this.f20019a = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) e.clone();
    }
}
