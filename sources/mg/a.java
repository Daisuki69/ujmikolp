package mg;

import A3.i;
import Ah.h;
import Ah.j;
import com.paymaya.domain.store.L;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18411b;

    public /* synthetic */ a(h hVar, int i) {
        this.f18410a = i;
        this.f18411b = hVar;
    }

    @Override // Ah.h
    public final void h(j jVar) {
        switch (this.f18410a) {
            case 0:
                this.f18411b.g(new i(jVar));
                break;
            default:
                this.f18411b.g(new L(jVar, 28));
                break;
        }
    }
}
