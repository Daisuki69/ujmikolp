package G6;

import Kh.T;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.d0;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.store.e1;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.nio.charset.Charset;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import w.C2361c;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f1823d;
    public boolean e;

    public x(e1 e1Var, Uh.d dVar) {
        super(dVar);
        this.f1823d = e1Var;
    }

    public final void k() {
        ((MayaBaseFragment) ((K6.p) this.c.get())).E1();
        e1 e1Var = this.f1823d;
        MayaInputLayout mayaInputLayout = ((MayaWesternUnionFragment) ((K6.p) this.c.get())).f11776V;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutMTCN");
            throw null;
        }
        String strG = AbstractC1414e.g(mayaInputLayout);
        int length = strG.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = kotlin.jvm.internal.j.i(strG.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        String string = strG.subSequence(i, length + 1).toString();
        e1Var.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mtcn", string);
        } catch (JSONException unused) {
            yk.a.e();
        }
        Ah.p<WesternUnionTransaction> pVarValidateMtcn = e1Var.f11438b.validateMtcn(RequestBody.create(d0.f10787a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarValidateMtcn, pVarValidateMtcn, zh.b.a()), new C2361c(this, 27), 2), new w(this, 0), 0), new A7.c(this, 25)).e();
    }
}
