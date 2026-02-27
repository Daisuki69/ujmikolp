package mh;

import ch.InterfaceC1108g;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC1864a {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(c cVar, int i) {
        super(cVar);
        this.c = i;
    }

    @Override // ch.AbstractC1107f
    public final void c(nk.b bVar) {
        switch (this.c) {
            case 0:
                this.f18422b.b(new h((InterfaceC1108g) bVar));
                break;
            default:
                this.f18422b.b(new j((InterfaceC1108g) bVar));
                break;
        }
    }
}
