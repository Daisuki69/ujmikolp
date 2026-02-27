package P5;

import cg.InterfaceC1101b;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f5037b;
    public final InterfaceC1101b c;

    public /* synthetic */ T(S s9, InterfaceC1101b interfaceC1101b, int i) {
        this.f5036a = i;
        this.f5037b = s9;
        this.c = interfaceC1101b;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5036a) {
            case 0:
                Xe.d dVar = (Xe.d) this.c.get();
                this.f5037b.getClass();
                L5.a aVar = new L5.a();
                aVar.f2811a = dVar;
                return aVar;
            default:
                Xe.d dVar2 = (Xe.d) this.c.get();
                this.f5037b.getClass();
                L5.b bVar = new L5.b();
                bVar.f2812a = dVar2;
                return bVar;
        }
    }
}
