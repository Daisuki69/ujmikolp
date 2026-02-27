package Vd;

import Bb.f;
import N5.r1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder implements Ud.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6097g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaCreditActivationFragment f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f6099b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatCheckBox f6100d;
    public final f e;
    public final Context f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(r1 r1Var, MayaCreditActivationFragment mayaCreditActivationFragment) {
        ConstraintLayout constraintLayout = (ConstraintLayout) r1Var.c;
        super(constraintLayout);
        this.f6098a = mayaCreditActivationFragment;
        this.f6099b = (TextView) r1Var.f4198b;
        this.c = (TextView) r1Var.e;
        this.f6100d = (AppCompatCheckBox) r1Var.f4199d;
        f fVar = new f(11);
        this.e = fVar;
        this.f = constraintLayout.getContext();
        fVar.h(this);
    }

    public static final void E(b bVar, CreditAgreement creditAgreement, View view) {
        j.e(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatCheckBox");
        f fVar = bVar.e;
        boolean zIsChecked = ((AppCompatCheckBox) view).isChecked();
        fVar.getClass();
        String key = creditAgreement.getKey();
        if (zIsChecked) {
            CreditAgreement creditAgreement2 = (CreditAgreement) fVar.e;
            if (!(creditAgreement2 != null ? j.b(creditAgreement2.isBlockShowAgreement(), Boolean.TRUE) : false)) {
                ((b) ((Ud.a) fVar.c.get())).getClass();
                ((b) ((Ud.a) fVar.c.get())).D(key, false);
                return;
            }
        }
        if (zIsChecked) {
            CreditAgreement creditAgreement3 = (CreditAgreement) fVar.e;
            if (creditAgreement3 != null ? j.b(creditAgreement3.isBlockShowAgreement(), Boolean.TRUE) : false) {
                ((b) ((Ud.a) fVar.c.get())).D(key, true);
                CreditAgreement creditAgreement4 = (CreditAgreement) fVar.e;
                if (creditAgreement4 != null) {
                    creditAgreement4.setItemChecked(Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        ((b) ((Ud.a) fVar.c.get())).D(key, false);
        CreditAgreement creditAgreement5 = (CreditAgreement) fVar.e;
        if (creditAgreement5 != null) {
            creditAgreement5.setItemChecked(Boolean.FALSE);
        }
    }

    public final void D(String key, boolean z4) {
        j.g(key, "key");
        AppCompatCheckBox appCompatCheckBox = this.f6100d;
        if (z4) {
            appCompatCheckBox.setButtonDrawable(ResourcesCompat.getDrawable(this.f.getResources(), R.drawable.pma_selectable_background_checkbox_green, null));
        }
        appCompatCheckBox.setChecked(z4);
        MayaCreditActivationFragment mayaCreditActivationFragment = this.f6098a;
        if (mayaCreditActivationFragment != null) {
            C1220i c1220i = mayaCreditActivationFragment.f10245B;
            FragmentActivity activity = mayaCreditActivationFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaCreditActivationFragment.m1());
            c1219hD.r(EnumC1216e.ACTIVATION);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.AGREEMENT);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("document_type", key);
            c1220i.c(activity, c1219hD);
        }
    }
}
