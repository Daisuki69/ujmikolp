package Ee;

import Ah.o;
import Ah.p;
import G6.u;
import Gh.d;
import Kh.J;
import Kh.T;
import Lh.g;
import Nh.e;
import Rb.i;
import Sb.t;
import android.os.Bundle;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDisplayNameFragment;
import com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m9.InterfaceC1856a;
import y5.AbstractC2509a;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1350d;
    public boolean e;

    public /* synthetic */ a(int i) {
        this.f1350d = i;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        switch (this.f1350d) {
            case 2:
                super.j();
                Bundle extras = ((MayaDynamicMerchantActivity) ((InterfaceC1856a) this.c.get())).getIntent().getExtras();
                if ((extras != null ? (QRMerchant) extras.getParcelable("merchant") : null) == null) {
                    Bundle extras2 = ((MayaDynamicMerchantActivity) ((InterfaceC1856a) this.c.get())).getIntent().getExtras();
                    String string = extras2 != null ? extras2.getString("payment_id") : null;
                    if (string != null && !C2576A.H(string)) {
                        InterfaceC1856a interfaceC1856a = (InterfaceC1856a) this.c.get();
                        Bundle extras3 = ((MayaDynamicMerchantActivity) ((InterfaceC1856a) this.c.get())).getIntent().getExtras();
                        String string2 = extras3 != null ? extras3.getString("payment_id") : null;
                        MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) interfaceC1856a;
                        Bundle extras4 = mayaDynamicMerchantActivity.getIntent().getExtras();
                        mayaDynamicMerchantActivity.V1().e = extras4 != null ? extras4.getBoolean("is_from_webview") : false;
                        MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment = new MayaDynamicMerchantPaymentFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("payment_id", string2);
                        mayaDynamicMerchantPaymentFragment.setArguments(bundle);
                        AbstractC1236z.g(mayaDynamicMerchantActivity, R.id.maya_activity_merchant_fragment_container, mayaDynamicMerchantPaymentFragment);
                        break;
                    }
                } else {
                    InterfaceC1856a interfaceC1856a2 = (InterfaceC1856a) this.c.get();
                    Bundle extras5 = ((MayaDynamicMerchantActivity) ((InterfaceC1856a) this.c.get())).getIntent().getExtras();
                    QRMerchant qRMerchant = extras5 != null ? (QRMerchant) extras5.getParcelable("merchant") : null;
                    MayaDynamicMerchantActivity mayaDynamicMerchantActivity2 = (MayaDynamicMerchantActivity) interfaceC1856a2;
                    mayaDynamicMerchantActivity2.getClass();
                    MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment2 = new MayaDynamicMerchantPaymentFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("merchant", qRMerchant);
                    mayaDynamicMerchantPaymentFragment2.setArguments(bundle2);
                    AbstractC1236z.g(mayaDynamicMerchantActivity2, R.id.maya_activity_merchant_fragment_container, mayaDynamicMerchantPaymentFragment2);
                    break;
                }
                break;
            default:
                super.j();
                break;
        }
    }

    public void k(boolean z4) {
        t tVar;
        if (!this.e && (tVar = ((MayaDisplayNameFragment) ((i) this.c.get())).f13981Z) != null) {
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) tVar;
            MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = new MayaDisplayNamePasswordBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_enabled", z4);
            mayaDisplayNamePasswordBottomSheetDialogFragment.setArguments(bundle);
            mayaDisplayNamePasswordBottomSheetDialogFragment.f13860Z = new u(mayaSettingsActivity, 22);
            mayaDisplayNamePasswordBottomSheetDialogFragment.show(mayaSettingsActivity.getSupportFragmentManager(), "password_credential_dialog");
        }
        this.e = false;
    }

    public void l(boolean z4) {
        TravelTicketFragment travelTicketFragment = (TravelTicketFragment) this.c.get();
        travelTicketFragment.getClass();
        J jC = p.c(Boolean.TRUE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e eVar = Th.e.f5841b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar, "scheduler is null");
        T t5 = new T(jC, eVar);
        o oVarA = b.a();
        d dVar = new d(1, new com.paymaya.ui.travel.view.fragment.impl.a(travelTicketFragment, 1), Eh.d.f1366d);
        try {
            t5.f(new g(dVar, oVarA));
            travelTicketFragment.f14937U.a(dVar);
            if (z4 && !this.e) {
                ((TravelTicketFragment) this.c.get()).x1();
                this.e = true;
            }
            ((TravelTicketFragment) this.c.get()).w1(true);
            ((TravelTicketFragment) this.c.get()).v1(true);
            ((TravelTicketFragment) this.c.get()).u1(true);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
        }
    }
}
