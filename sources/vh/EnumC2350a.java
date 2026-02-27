package vh;

import hh.n;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2350a implements Callable, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2350a f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2350a[] f20497b;

    static {
        EnumC2350a enumC2350a = new EnumC2350a("INSTANCE", 0);
        f20496a = enumC2350a;
        f20497b = new EnumC2350a[]{enumC2350a};
    }

    public static EnumC2350a valueOf(String str) {
        return (EnumC2350a) Enum.valueOf(EnumC2350a.class, str);
    }

    public static EnumC2350a[] values() {
        return (EnumC2350a[]) f20497b.clone();
    }

    @Override // hh.n
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList();
    }
}
