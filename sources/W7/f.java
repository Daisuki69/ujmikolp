package W7;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f6333b;
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f6334d;
    public static final f e;
    public static final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f6335g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6336a;

    static {
        f fVar = new f("VIEW_TYPE_HEADER", 0, 0);
        f6333b = fVar;
        f fVar2 = new f("VIEW_TYPE_TOP", 1, 1);
        c = fVar2;
        f fVar3 = new f("VIEW_TYPE_ITEM", 2, 2);
        f6334d = fVar3;
        f fVar4 = new f("VIEW_TYPE_BOTTOM", 3, 3);
        e = fVar4;
        f fVar5 = new f("VIEW_TYPE_FOOTER", 4, 4);
        f = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f6335g = fVarArr;
        v0.h(fVarArr);
    }

    public f(String str, int i, int i4) {
        this.f6336a = i4;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6335g.clone();
    }
}
