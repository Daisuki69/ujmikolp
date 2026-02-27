package p8;

import A7.l;
import Lh.h;
import Uh.d;
import com.paymaya.domain.store.C1250b0;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import o6.C1967a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1250b0 f19075d;
    public final d e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f19076g;

    public b(C1250b0 c1250b0, d mInboxPublishSubject) {
        j.g(mInboxPublishSubject, "mInboxPublishSubject");
        this.f19075d = c1250b0;
        this.e = mInboxPublishSubject;
        this.f19076g = new l(14);
    }

    public final void k() {
        String str = this.f;
        if (str != null) {
            new Lh.d(new h(this.f19075d.a(str), zh.b.a(), 0), new C1967a(this, 4), 2).e();
        }
        Unit unit = Unit.f18162a;
    }
}
