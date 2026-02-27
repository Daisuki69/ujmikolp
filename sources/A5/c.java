package A5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Y5.d {
    public static final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f153d;
    public static final /* synthetic */ c[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f155b;

    static {
        a[] aVarArr = a.f48a;
        W5.e eVar = W5.e.f6314b;
        c cVar = new c("APP_LOCAL_TIMEOUT", 0, "release-app-local-timeout", 30.0d);
        c = cVar;
        c cVar2 = new c("REFRESH_SESSION_DURATION", 1, "release-refresh-session-duration", 5.0d);
        f153d = cVar2;
        c[] cVarArr = {cVar, cVar2};
        e = cVarArr;
        v0.h(cVarArr);
    }

    public c(String str, int i, String str2, double d10) {
        W5.e eVar = W5.e.f6314b;
        this.f154a = str2;
        this.f155b = d10;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }

    @Override // Y5.d
    public final Y5.a a() {
        return W5.e.f6314b;
    }

    @Override // Y5.d
    public final String getKey() {
        return this.f154a;
    }
}
