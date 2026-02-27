package Z8;

import Ah.p;
import Kh.T;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.store.C1278p0;
import d4.AbstractC1331a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import qj.n;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6905d;

    public a(C1278p0 c1278p0, com.paymaya.data.preference.a preference) {
        j.g(preference, "preference");
        this.f6905d = c1278p0;
    }

    public void k(MfaMeta mfaMeta, String str, n nVar, Function1 function1) {
        int i = 0;
        if (mfaMeta != null) {
            p pVarA = ((C1278p0) this.f6905d).a(mfaMeta.getTransactionType(), mfaMeta.getChallengeId(), str);
            e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new U8.c(nVar, mfaMeta, str), 2), new Y.e(4, function1, this), i), new Xa.c(this, 9)).e());
        }
    }
}
