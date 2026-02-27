package xh;

import ch.r;
import fh.InterfaceC1486b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC2480d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2480d f21001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2480d[] f21002b;

    static {
        EnumC2480d enumC2480d = new EnumC2480d("INSTANCE", 0);
        f21001a = enumC2480d;
        f21002b = new EnumC2480d[]{enumC2480d};
    }

    public static EnumC2480d valueOf(String str) {
        return (EnumC2480d) Enum.valueOf(EnumC2480d.class, str);
    }

    public static EnumC2480d[] values() {
        return (EnumC2480d[]) f21002b.clone();
    }

    @Override // ch.r
    public final void onComplete() {
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
    }

    @Override // ch.r
    public final void onNext(Object obj) {
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
    }
}
