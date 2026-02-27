package R;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mg.c f5419b;
    public static final j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f5420d;
    public static final /* synthetic */ j[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5421a;

    static {
        j jVar = new j(numX49.tnTj78("bPuP"), 0, 0);
        j jVar2 = new j(numX49.tnTj78("bPub"), 1, 1);
        c = jVar2;
        j jVar3 = new j(numX49.tnTj78("bPu2"), 2, 2);
        j jVar4 = new j(numX49.tnTj78("bPuL"), 3, 3);
        j jVar5 = new j(numX49.tnTj78("bPur"), 4, 4);
        j jVar6 = new j(numX49.tnTj78("bPuZ"), 5, 15);
        j jVar7 = new j(numX49.tnTj78("bPuk"), 6, 26);
        j jVar8 = new j(numX49.tnTj78("bPuB"), 7, 27);
        f5420d = jVar8;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, new j(numX49.tnTj78("bPuu"), 8, 28)};
        e = jVarArr;
        v0.h(jVarArr);
        f5419b = new mg.c(14);
    }

    public j(String str, int i, int i4) {
        this.f5421a = i4;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) e.clone();
    }
}
