package Lb;

import com.paymaya.common.utility.C;
import com.paymaya.domain.store.C1279q;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a implements Kb.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2943d;
    public final C1279q e;
    public String f;

    public b(com.paymaya.data.preference.a aVar, C1279q c1279q, Uh.d dVar) {
        super(dVar);
        this.f2943d = aVar;
        this.e = c1279q;
    }

    public final String k() {
        MayaInputLayout mayaInputLayout = ((MayaChangeMinFormFragment) ((Rb.c) this.c.get())).f13932V;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutNewMobileNumber");
            throw null;
        }
        String strR = C.r("+63" + C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString());
        j.f(strR, "formatPhoneNumberE164(...)");
        return strR;
    }
}
