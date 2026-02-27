package ba;

import aa.InterfaceC0667a;
import android.content.Intent;
import android.os.Bundle;
import ca.InterfaceC1085a;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.Billable;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1277p;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2509a implements InterfaceC0667a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f8596d;
    public final C1273n e;
    public final C1277p f;

    public o(com.paymaya.data.preference.a aVar, C1273n c1273n, C1277p c1277p) {
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucm"));
        this.f8596d = aVar;
        this.e = c1273n;
        this.f = c1277p;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (!this.f8596d.e().isPayBillsAvailable()) {
            String strMMessage = this.f8596d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mPayBillsAvailability().mMessage();
            InterfaceC1085a interfaceC1085a = (InterfaceC1085a) this.c.get();
            if (strMMessage == null) {
                strMMessage = numX49.tnTj78("bucD");
            }
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1085a;
            mayaPayBillsActivity.getClass();
            AbstractC1236z.g(mayaPayBillsActivity, R.id.fragment_container, M2.b.a0(strMMessage, 3));
            return;
        }
        if (this.f8596d.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
            ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).W1();
        }
        Bundle extras = ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).getIntent().getExtras();
        String strTnTj78 = numX49.tnTj78("buch");
        Billable billable = extras != null ? (Billable) extras.getParcelable(strTnTj78) : null;
        Intent intent = ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).getIntent();
        String strL = com.paymaya.common.utility.C.L(intent != null ? intent.getDataString() : null, numX49.tnTj78("bucM"));
        if (billable != null) {
            InterfaceC1085a interfaceC1085a2 = (InterfaceC1085a) this.c.get();
            Bundle extras2 = ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).getIntent().getExtras();
            String strTnTj782 = numX49.tnTj78("bucN");
            boolean z4 = extras2 != null ? extras2.getBoolean(strTnTj782) : false;
            MayaPayBillsActivity mayaPayBillsActivity2 = (MayaPayBillsActivity) interfaceC1085a2;
            mayaPayBillsActivity2.getClass();
            MayaPayBillsFormFragment mayaPayBillsFormFragment = new MayaPayBillsFormFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(strTnTj78, billable);
            bundle.putBoolean(strTnTj782, z4);
            mayaPayBillsFormFragment.setArguments(bundle);
            AbstractC1236z.i(mayaPayBillsActivity2, R.id.fragment_container, mayaPayBillsFormFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
            return;
        }
        if (strL != null) {
            new Lh.d(new Lh.d(new Lh.d(new Lh.h(new Lh.f(this.f.c.getBillsPaymentV3(strL).d(new com.google.firebase.messaging.n(21)), new Q6.n(this, 24), 0), zh.b.a(), 0), new R4.i(this, 20), 2), n.f8594a, 0), new T3.l(this, 20), 1).e();
            return;
        }
        MayaPayBillsActivity mayaPayBillsActivity3 = (MayaPayBillsActivity) ((InterfaceC1085a) this.c.get());
        Bundle extras3 = mayaPayBillsActivity3.getIntent().getExtras();
        String strTnTj783 = numX49.tnTj78("buc6");
        String string = extras3 != null ? extras3.getString(strTnTj783) : null;
        MayaBillersCategoryFragment mayaBillersCategoryFragment = new MayaBillersCategoryFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(strTnTj783, string);
        mayaBillersCategoryFragment.setArguments(bundle2);
        AbstractC1236z.g(mayaPayBillsActivity3, R.id.fragment_container, mayaBillersCategoryFragment);
        Bundle extras4 = ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).getIntent().getExtras();
        Favorite favorite = extras4 != null ? (Favorite) extras4.getParcelable(numX49.tnTj78("buca")) : null;
        if (favorite != null) {
            if (numX49.tnTj78("bucX").equalsIgnoreCase(favorite.mContentPreview().mMeta())) {
                ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).b2(favorite);
            } else {
                ((MayaPayBillsActivity) ((InterfaceC1085a) this.c.get())).e2(favorite);
            }
        }
    }
}
