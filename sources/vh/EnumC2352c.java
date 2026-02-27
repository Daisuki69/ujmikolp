package vh;

import S1.s;
import ch.InterfaceC1104c;
import ch.InterfaceC1108g;
import ch.r;
import ch.x;
import fh.InterfaceC1486b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2352c implements InterfaceC1108g, r, ch.i, x, InterfaceC1104c, nk.c, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2352c f20499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2352c[] f20500b;

    static {
        EnumC2352c enumC2352c = new EnumC2352c("INSTANCE", 0);
        f20499a = enumC2352c;
        f20500b = new EnumC2352c[]{enumC2352c};
    }

    public static EnumC2352c valueOf(String str) {
        return (EnumC2352c) Enum.valueOf(EnumC2352c.class, str);
    }

    public static EnumC2352c[] values() {
        return (EnumC2352c[]) f20500b.clone();
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        cVar.cancel();
    }

    @Override // nk.c
    public final void cancel() {
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
    }

    @Override // nk.b
    public final void onComplete() {
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        s.r(th2);
    }

    @Override // nk.b
    public final void onNext(Object obj) {
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        interfaceC1486b.dispose();
    }

    @Override // ch.i, ch.x
    public final void onSuccess(Object obj) {
    }

    @Override // nk.c
    public final void request(long j) {
    }
}
