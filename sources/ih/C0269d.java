package Ih;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import k2.v0;

/* JADX INFO: renamed from: Ih.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0269d extends AbstractC0267b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0269d(Ah.e eVar, int i) {
        super(eVar);
        this.c = i;
    }

    private final void g() {
    }

    @Override // Ah.c
    public final void onNext(Object obj) {
        if (this.f2302b.b()) {
        }
        if (get() != 0) {
            this.f2301a.onNext(obj);
            v0.B(this, 1L);
        } else {
            switch (this.c) {
                case 0:
                    break;
                default:
                    c(new MissingBackpressureException("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }
}
