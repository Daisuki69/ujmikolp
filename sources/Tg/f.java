package Tg;

import k2.v0;
import n3.C1916a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1916a f5834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f5835b;
    public static final /* synthetic */ jj.b c;

    static {
        f[] fVarArr = {new f("MONDAY", 0), new f("TUESDAY", 1), new f("WEDNESDAY", 2), new f("THURSDAY", 3), new f("FRIDAY", 4), new f("SATURDAY", 5), new f("SUNDAY", 6)};
        f5835b = fVarArr;
        c = v0.h(fVarArr);
        f5834a = new C1916a(15);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f5835b.clone();
    }
}
