package q0;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f19738b;
    public static final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f19739d;

    static {
        d dVar = new d("EXOPLAYER", 0);
        f19737a = dVar;
        d dVar2 = new d("MEDIA3", 1);
        f19738b = dVar2;
        d dVar3 = new d("NONE", 2);
        c = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f19739d = dVarArr;
        v0.h(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19739d.clone();
    }
}
