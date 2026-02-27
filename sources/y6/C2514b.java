package y6;

import Eh.d;
import Kh.C0310o;
import Kh.z;
import com.paymaya.data.database.repository.s;
import com.paymaya.data.database.repository.x;
import com.paymaya.domain.store.X;
import n3.C1916a;
import o6.C1967a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: y6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2514b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X f21080d;
    public final com.paymaya.data.preference.a e;

    public C2514b(X x6, com.paymaya.data.preference.a aVar) {
        this.f21080d = x6;
        this.e = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        C1916a c1916a = new C1916a(7);
        s sVar = this.f21080d.f11404b;
        e(new C0310o(new z(sVar.f11321a.d("fund_source", c1916a), new x(sVar, 5), 0).e(zh.b.a()), new C1967a(this, 23), d.c, d.f1365b).f());
    }
}
