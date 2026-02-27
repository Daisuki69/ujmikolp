package G6;

import android.os.Bundle;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f1792b;

    public j(String str, k kVar) {
        this.f1791a = str;
        this.f1792b = kVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        MoneyInTopUpCode moneyInTopUpCode = (MoneyInTopUpCode) obj;
        kotlin.jvm.internal.j.g(moneyInTopUpCode, "moneyInTopUpCode");
        Amount amountBuild = Amount.sBuilder().mCurrency("PHP").mValue(this.f1791a).build();
        kotlin.jvm.internal.j.f(amountBuild, "build(...)");
        k kVar = this.f1792b;
        MoneyInTopUpCode moneyInTopUpCodeBuild = moneyInTopUpCode.toBuilder().mOriginalAmount(amountBuild).build();
        y5.s sVar = (K6.f) kVar.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("attribution", ((MayaBaseFragment) ((K6.f) kVar.c.get())).n1().f10371a);
        ((MayaBaseFragment) sVar).A1(c1219hH);
        ((MayaBaseFragment) ((K6.f) kVar.c.get())).w1();
        K6.f fVar = (K6.f) kVar.c.get();
        LoadUpPartner loadUpPartner = (LoadUpPartner) kVar.f1795k;
        L6.k kVar2 = ((MayaCashInCodeFormFragment) fVar).f11658x0;
        if (kVar2 != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) kVar2;
            mayaCashInActivity.getIntent().putExtra("analytics_source_page", "Cash In Partner");
            MayaCashInCodeFragment mayaCashInCodeFragment = new MayaCashInCodeFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("moneyIn", moneyInTopUpCodeBuild);
            bundle.putParcelable("loadUpPartner", loadUpPartner);
            mayaCashInCodeFragment.setArguments(bundle);
            AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInCodeFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }
}
