package W0;

import k2.v0;
import n3.C1916a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1916a f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6171b;
    public static final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6172d;
    public static final c e;
    public static final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f6173g;
    public static final c h;
    public static final c i;
    public static final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f6174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f6175l;
    public static final c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f6176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ c[] f6177o;

    static {
        c cVar = new c("DISPLAY_NAME", 0);
        f6171b = cVar;
        c cVar2 = new c("NAME_PREFIX", 1);
        c = cVar2;
        c cVar3 = new c("GIVEN_NAME", 2);
        f6172d = cVar3;
        c cVar4 = new c("MIDDLE_NAME", 3);
        e = cVar4;
        c cVar5 = new c("FAMILY_NAME", 4);
        f = cVar5;
        c cVar6 = new c("NAME_SUFFIX", 5);
        f6173g = cVar6;
        c cVar7 = new c("COMPANY", 6);
        h = cVar7;
        c cVar8 = new c("DEPARTMENT", 7);
        i = cVar8;
        c cVar9 = new c("JOB_DESCRIPTION", 8);
        j = cVar9;
        c cVar10 = new c("PHONE_NUMBERS", 9);
        f6174k = cVar10;
        c cVar11 = new c("PHONE_LABELS", 10);
        f6175l = cVar11;
        c cVar12 = new c("EMAIL_ADDRESSES", 11);
        m = cVar12;
        c cVar13 = new c("EMAIL_LABELS", 12);
        f6176n = cVar13;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13};
        f6177o = cVarArr;
        v0.h(cVarArr);
        f6170a = new C1916a(16);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f6177o.clone();
    }
}
