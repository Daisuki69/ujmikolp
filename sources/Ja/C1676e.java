package ja;

import A3.i;
import N5.w1;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Biller;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import ea.l;
import fa.ViewOnClickListenerC1479a;
import ha.InterfaceC1551d;
import ia.InterfaceC1596b;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ja.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1676e extends RecyclerView.ViewHolder implements InterfaceC1596b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f17728b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f17729d;
    public final i e;
    public Biller f;

    public C1676e(w1 w1Var, l lVar, boolean z4) {
        super(w1Var.f4256b);
        this.f17727a = lVar;
        this.f17728b = w1Var.f4257d;
        this.c = w1Var.e;
        ConstraintLayout billersListItemContainer = w1Var.c;
        j.f(billersListItemContainer, "billersListItemContainer");
        this.f17729d = w1Var.f;
        this.e = new i(this, z4);
        billersListItemContainer.setOnClickListener(new ViewOnClickListenerC1479a(this, 9));
    }

    @Override // ia.InterfaceC1596b
    public final void A(String str) {
        this.c.setText(str);
        this.f17728b.setContentDescription(str);
    }

    @Override // ia.InterfaceC1596b
    public final void B(Biller biller) {
        j.g(biller, "biller");
        l lVar = this.f17727a;
        lVar.getClass();
        MayaBillersFragment mayaBillersFragment = lVar.f16620a;
        mayaBillersFragment.getClass();
        Bb.f fVarQ1 = mayaBillersFragment.Q1();
        if (((MayaBillersFragment) ((ga.b) fVarQ1.c.get())).t1().e().isBillsPayEventsV2Enabled()) {
            MayaBillersFragment mayaBillersFragment2 = (MayaBillersFragment) ((ga.b) fVarQ1.c.get());
            mayaBillersFragment2.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1173g.a(2));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String strMSlug = mayaBillersFragment2.P1().mSlug();
            HashMap map = c1219hE.j;
            map.put("category_slug", strMSlug);
            map.put("category_name", mayaBillersFragment2.P1().mName());
            map.put("biller_slug", biller.mSlug());
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String strMName = biller.mName();
            if (strMName != null) {
                c1219hE.j.put("biller_name", strMName);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("disabled", String.valueOf(biller.mActive() != null ? Boolean.valueOf(!r5.booleanValue()) : null));
            mayaBillersFragment2.o1().b(c1219hE);
        } else {
            ga.b bVar = (ga.b) fVarQ1.c.get();
            String strMName2 = biller.mName();
            if (strMName2 == null) {
                strMName2 = "";
            }
            MayaBillersFragment mayaBillersFragment3 = (MayaBillersFragment) bVar;
            mayaBillersFragment3.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.BILLER);
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("biller", strMName2);
            mayaBillersFragment3.A1(c1219h);
        }
        if (!mayaBillersFragment.t1().e().isBillsPayEventsV2Enabled()) {
            Bb.f fVarQ12 = mayaBillersFragment.Q1();
            String strMSlug2 = biller.mSlug();
            j.f(strMSlug2, "mSlug(...)");
            if ("BIR".equalsIgnoreCase(strMSlug2)) {
                MayaBillersFragment mayaBillersFragment4 = (MayaBillersFragment) ((ga.b) fVarQ12.c.get());
                mayaBillersFragment4.getClass();
                InterfaceC1551d interfaceC1551d = mayaBillersFragment4.t0;
                if (interfaceC1551d != null) {
                    ((MayaPayBillsActivity) interfaceC1551d).c2(strMSlug2);
                    return;
                }
                return;
            }
            MayaBillersFragment mayaBillersFragment5 = (MayaBillersFragment) ((ga.b) fVarQ12.c.get());
            mayaBillersFragment5.getClass();
            InterfaceC1551d interfaceC1551d2 = mayaBillersFragment5.t0;
            if (interfaceC1551d2 != null) {
                ((MayaPayBillsActivity) interfaceC1551d2).f2(strMSlug2);
                return;
            }
            return;
        }
        Bb.f fVarQ13 = mayaBillersFragment.Q1();
        if ("BIR".equalsIgnoreCase(biller.mSlug())) {
            MayaBillersFragment mayaBillersFragment6 = (MayaBillersFragment) ((ga.b) fVarQ13.c.get());
            mayaBillersFragment6.getClass();
            InterfaceC1551d interfaceC1551d3 = mayaBillersFragment6.t0;
            if (interfaceC1551d3 != null) {
                MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1551d3;
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = new MayaPayBillsBIRFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("biller", biller);
                mayaPayBillsBIRFragment.setArguments(bundle);
                AbstractC1236z.i(mayaPayBillsActivity, R.id.fragment_container, mayaPayBillsBIRFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
                return;
            }
            return;
        }
        MayaBillersFragment mayaBillersFragment7 = (MayaBillersFragment) ((ga.b) fVarQ13.c.get());
        mayaBillersFragment7.getClass();
        InterfaceC1551d interfaceC1551d4 = mayaBillersFragment7.t0;
        if (interfaceC1551d4 != null) {
            MayaPayBillsActivity mayaPayBillsActivity2 = (MayaPayBillsActivity) interfaceC1551d4;
            MayaPayBillsFormFragment mayaPayBillsFormFragment = new MayaPayBillsFormFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("biller_slug", biller.mSlug());
            bundle2.putParcelable("selected_biller", biller);
            mayaPayBillsFormFragment.setArguments(bundle2);
            AbstractC1236z.i(mayaPayBillsActivity2, R.id.fragment_container, mayaPayBillsFormFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    @Override // ia.InterfaceC1596b
    public final void h() {
        this.f17729d.setVisibility(8);
        this.f17728b.setAlpha(1.0f);
        this.c.setAlpha(1.0f);
    }

    @Override // ia.InterfaceC1596b
    public final void r() {
        TextView textView = this.f17729d;
        textView.setVisibility(0);
        TextViewCompat.setTextAppearance(textView, R.style.JekoBoldSmallText_Tertiary);
        textView.setText(R.string.maya_label_accepts_maya_credit);
    }

    @Override // ia.InterfaceC1596b
    public final void u() {
        TextView textView = this.f17729d;
        textView.setVisibility(0);
        TextViewCompat.setTextAppearance(textView, R.style.JekoBoldSmallText_Primary);
        textView.setText(R.string.maya_label_pay_bills_service_temporarily_unavailable);
        textView.setAlpha(0.4f);
        this.f17728b.setAlpha(0.4f);
        this.c.setAlpha(0.4f);
    }

    @Override // ia.InterfaceC1596b
    public final void v() {
        this.f17729d.setVisibility(8);
    }

    @Override // ia.InterfaceC1596b
    public final void z(String str) {
        AppCompatImageView appCompatImageView = this.f17728b;
        if (str != null) {
            int dimensionPixelSize = appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_padding_extra_small);
            appCompatImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            appCompatImageView.setBackgroundResource(R.drawable.maya_bg_icon_circle_border);
        } else {
            appCompatImageView.setPadding(0, 0, 0, 0);
            appCompatImageView.setBackgroundResource(0);
        }
        int dimensionPixelSize2 = appCompatImageView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_large);
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = appCompatImageView.getContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(R.attr.mayaDrawable_BillerPlaceholder, typedValue, true);
        }
        C.c0(str, typedValue.resourceId, this.f17728b, dimensionPixelSize2, dimensionPixelSize2, 0);
    }
}
