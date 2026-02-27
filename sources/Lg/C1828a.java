package lg;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;

/* JADX INFO: renamed from: lg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1828a implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.reactivex.rxjava3.disposables.b f18292a;

    public C1828a(io.reactivex.rxjava3.disposables.b bVar) {
        this.f18292a = bVar;
    }

    public static InterfaceC1486b a(io.reactivex.rxjava3.disposables.b bVar) {
        return bVar == Dh.a.f1154a ? EnumC1604b.f17147a : bVar == Dh.b.f1156a ? EnumC1605c.f17149a : new C1828a(bVar);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f18292a.dispose();
    }
}
