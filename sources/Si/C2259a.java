package si;

import java.util.Objects;
import ki.InterfaceC1782c;

/* JADX INFO: renamed from: si.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2259a implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Li.b f20117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Li.b f20118b;
    public final int c;

    public C2259a(Li.b bVar, Li.b bVar2, C2260b c2260b) {
        Objects.requireNonNull(bVar);
        this.f20117a = bVar;
        Objects.requireNonNull(bVar2);
        this.f20118b = bVar2;
        c2260b.getClass();
        this.c = 6;
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() {
        this.f20117a.m();
        this.f20118b.m();
        return Ff.f.k(this.c);
    }
}
