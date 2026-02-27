package Bj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f586b;
    public static final F c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f587d;
    public static final /* synthetic */ F[] e;

    static {
        F f = new F("DEFAULT", 0);
        f585a = f;
        F f3 = new F("LAZY", 1);
        f586b = f3;
        F f7 = new F("ATOMIC", 2);
        c = f7;
        F f10 = new F("UNDISPATCHED", 3);
        f587d = f10;
        F[] fArr = {f, f3, f7, f10};
        e = fArr;
        k2.v0.h(fArr);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) e.clone();
    }
}
