package Oi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f4873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f4874b;
    public static final /* synthetic */ o[] c;

    static {
        o oVar = new o("AUTH_REJECTIONS", 0);
        f4873a = oVar;
        o oVar2 = new o("TOKEN_REFRESHES", 1);
        f4874b = oVar2;
        c = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) c.clone();
    }
}
