package Vj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f6149d;
    public static final j e;
    public static final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j[] f6150g;
    public static final /* synthetic */ jj.b h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f6151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f6152b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        f6149d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f6150g = jVarArr;
        h = v0.h(jVarArr);
    }

    public j(String str, int i, char c10, char c11) {
        this.f6151a = c10;
        this.f6152b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f6150g.clone();
    }
}
