package ui;

import bi.C1026d;
import bi.i;
import dOYHB6.tiZVw8.numX49;
import java.util.Objects;
import ki.InterfaceC1782c;
import p2.C2009e;

/* JADX INFO: renamed from: ui.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2320g implements InterfaceC1782c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.split.android.client.storage.splits.c f20341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20342b;
    public Long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2318e f20343d;
    public final C1026d e;
    public final C2009e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mi.c f20344g;

    public C2320g(C2318e c2318e, io.split.android.client.storage.splits.c cVar, Mi.c cVar2, Long l6, Long l8, C1026d c1026d) {
        Objects.requireNonNull(cVar);
        this.f20341a = cVar;
        Objects.requireNonNull(cVar2);
        this.f20344g = cVar2;
        Objects.requireNonNull(c2318e);
        this.f20343d = c2318e;
        this.f20342b = l6;
        this.c = l8;
        Objects.requireNonNull(c1026d);
        this.e = c1026d;
        this.f = new C2009e();
    }

    @Override // ki.InterfaceC1782c
    public final Ff.f execute() throws Throwable {
        Long l6 = this.f20342b;
        io.split.android.client.storage.splits.c cVar = this.f20341a;
        if (l6 == null || l6.longValue() == 0) {
            this.f20342b = Long.valueOf(cVar.getTill());
        }
        Long l8 = this.c;
        Mi.c cVar2 = this.f20344g;
        if (l8 == null || l8.longValue() == 0) {
            this.c = Long.valueOf(cVar2.a());
        }
        long till = cVar.getTill();
        long jA = cVar2.a();
        if (this.f20342b.longValue() <= till && this.c.longValue() <= jA) {
            Ri.a.d(numX49.tnTj78("bHPk"));
            return Ff.f.k(1);
        }
        Ff.f fVarD = this.f20343d.d(new C2317d(this.f20342b.longValue(), this.c), false, true, false, 10);
        if (fVarD.c == 1) {
            i iVar = i.e;
            long till2 = cVar.getTill();
            this.f.getClass();
            if (till < till2 || jA < cVar2.a()) {
                iVar = i.f;
            }
            this.e.a(iVar);
        }
        return fVarD;
    }
}
