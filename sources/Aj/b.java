package Aj;

import java.util.concurrent.TimeUnit;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f330b;
    public static final b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f331d;
    public static final b e;
    public static final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f332g;
    public static final /* synthetic */ b[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f333a;

    static {
        b bVar = new b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f330b = bVar;
        b bVar2 = new b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b bVar3 = new b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = bVar3;
        b bVar4 = new b("SECONDS", 3, TimeUnit.SECONDS);
        f331d = bVar4;
        b bVar5 = new b("MINUTES", 4, TimeUnit.MINUTES);
        e = bVar5;
        b bVar6 = new b("HOURS", 5, TimeUnit.HOURS);
        f = bVar6;
        b bVar7 = new b("DAYS", 6, TimeUnit.DAYS);
        f332g = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        h = bVarArr;
        v0.h(bVarArr);
    }

    public b(String str, int i, TimeUnit timeUnit) {
        this.f333a = timeUnit;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) h.clone();
    }
}
