package Ij;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2355b;
    public static final b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f2356d;
    public static final b e;
    public static final /* synthetic */ b[] f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f2354a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f2355b = bVar2;
        b bVar3 = new b("PARKING", 2);
        c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f2356d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f = bVarArr;
        v0.h(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }
}
