package v;

import q.InterfaceC2157a;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2326a implements InterfaceC2157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2327b f20352a;

    public C2326a(AbstractC2327b abstractC2327b) {
        this.f20352a = abstractC2327b;
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        AbstractC2327b abstractC2327b = this.f20352a;
        boolean z4 = abstractC2327b.f20361p.l() == 1.0f;
        if (z4 != abstractC2327b.f20367v) {
            abstractC2327b.f20367v = z4;
            abstractC2327b.m.invalidateSelf();
        }
    }
}
