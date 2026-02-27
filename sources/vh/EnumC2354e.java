package vh;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2354e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2354e f20502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2354e[] f20503b;

    static {
        EnumC2354e enumC2354e = new EnumC2354e("INSTANCE", 0);
        f20502a = enumC2354e;
        f20503b = new EnumC2354e[]{enumC2354e};
    }

    public static EnumC2354e valueOf(String str) {
        return (EnumC2354e) Enum.valueOf(EnumC2354e.class, str);
    }

    public static EnumC2354e[] values() {
        return (EnumC2354e[]) f20503b.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new HashMap();
    }
}
