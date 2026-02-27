package G6;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1804b;

    public /* synthetic */ n(p pVar, int i) {
        this.f1803a = i;
        this.f1804b = pVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1803a) {
            case 0:
                LoadUpPartner loadUpPartner = (LoadUpPartner) obj;
                kotlin.jvm.internal.j.g(loadUpPartner, "loadUpPartner");
                p pVar = this.f1804b;
                pVar.getClass();
                ((MayaBaseFragment) ((K6.h) pVar.c.get())).w1();
                MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((K6.h) pVar.c.get());
                mayaCashInFragment.getClass();
                L6.q qVar = mayaCashInFragment.f11690G0;
                if (qVar != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar;
                    mayaCashInActivity.getIntent().putExtra("analytics_source_page", "Cash In Landing");
                    String name = loadUpPartner.mName();
                    kotlin.jvm.internal.j.g(name, "name");
                    MayaCashInCodeFormFragment mayaCashInCodeFormFragment = new MayaCashInCodeFormFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("loadup_partner", loadUpPartner);
                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, name);
                    mayaCashInCodeFormFragment.setArguments(bundle);
                    AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInCodeFormFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                }
                break;
            default:
                p pVar2 = this.f1804b;
                PayMayaError payMayaErrorF = pVar2.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                pVar2.s(payMayaErrorF);
                break;
        }
    }
}
