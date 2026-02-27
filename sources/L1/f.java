package L1;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f2801b;
    public static final f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f2802d;

    static {
        f fVar = new f("UNKNOWN", 0);
        f2800a = fVar;
        f fVar2 = new f("NOT_REQUIRED", 1);
        f2801b = fVar2;
        f fVar3 = new f("REQUIRED", 2);
        c = fVar3;
        f2802d = new f[]{fVar, fVar2, fVar3};
    }

    @RecentlyNonNull
    public static f valueOf(@RecentlyNonNull String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    @RecentlyNonNull
    public static f[] values() {
        return (f[]) f2802d.clone();
    }
}
