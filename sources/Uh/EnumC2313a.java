package uh;

import S1.s;
import io.reactivex.exceptions.ProtocolViolationException;
import nk.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC2313a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2313a f20320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2313a[] f20321b;

    static {
        EnumC2313a enumC2313a = new EnumC2313a("CANCELLED", 0);
        f20320a = enumC2313a;
        f20321b = new EnumC2313a[]{enumC2313a};
    }

    public static boolean a(long j) {
        if (j > 0) {
            return true;
        }
        s.r(new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean b(c cVar, c cVar2) {
        if (cVar2 == null) {
            s.r(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        s.r(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static EnumC2313a valueOf(String str) {
        return (EnumC2313a) Enum.valueOf(EnumC2313a.class, str);
    }

    public static EnumC2313a[] values() {
        return (EnumC2313a[]) f20321b.clone();
    }

    @Override // nk.c
    public final void cancel() {
    }

    @Override // nk.c
    public final void request(long j) {
    }
}
