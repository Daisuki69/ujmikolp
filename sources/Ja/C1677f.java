package ja;

import A3.i;
import N5.w1;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Biller;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import ea.h;
import fa.ViewOnClickListenerC1479a;
import ha.z;
import ia.InterfaceC1596b;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: renamed from: ja.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1677f extends RecyclerView.ViewHolder implements InterfaceC1596b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f17731b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f17732d;
    public final i e;
    public Biller f;

    public C1677f(w1 w1Var, h hVar, boolean z4) {
        super(w1Var.f4256b);
        this.f17730a = hVar;
        this.f17731b = w1Var.f4257d;
        this.c = w1Var.e;
        ConstraintLayout billersListItemContainer = w1Var.c;
        j.f(billersListItemContainer, "billersListItemContainer");
        this.f17732d = w1Var.f;
        this.e = new i(this, z4);
        billersListItemContainer.setOnClickListener(new ViewOnClickListenerC1479a(this, 10));
    }

    @Override // ia.InterfaceC1596b
    public final void A(String str) {
        this.c.setText(str);
        this.f17731b.setContentDescription(str);
    }

    @Override // ia.InterfaceC1596b
    public final void B(Biller biller) {
        j.g(biller, "biller");
        h hVar = this.f17730a;
        hVar.getClass();
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment = hVar.f16612a;
        mayaPayBillsSearchFragment.getClass();
        if (mayaPayBillsSearchFragment.t1().e().isBillsPayEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1173g.a(16));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            AppCompatEditText appCompatEditText = mayaPayBillsSearchFragment.f13473V;
            if (appCompatEditText == null) {
                j.n("mEditTextSearchInput");
                throw null;
            }
            c1219hE.j.put("keyword", String.valueOf(appCompatEditText.getText()));
            c1219hE.j.put("biller_slug", biller.mSlug());
            c1219hE.j.put("biller_name", biller.mName());
            c1219hE.j.put("category_slug", biller.mSlug());
            c1219hE.j.put("category_name", biller.mCategory());
            mayaPayBillsSearchFragment.o1().b(c1219hE);
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.BILLER);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("biller", biller.mName());
            c1219hH.j.put("screen", "LIST");
            mayaPayBillsSearchFragment.A1(c1219hH);
        }
        A7.j jVarG1 = mayaPayBillsSearchFragment.G1();
        String strMSlug = biller.mSlug();
        j.f(strMSlug, "mSlug(...)");
        if ("BIR".equalsIgnoreCase(strMSlug)) {
            MayaPayBillsSearchFragment mayaPayBillsSearchFragment2 = (MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get());
            mayaPayBillsSearchFragment2.getClass();
            mayaPayBillsSearchFragment2.H1();
            z zVar = mayaPayBillsSearchFragment2.f13481d0;
            if (zVar != null) {
                ((MayaPayBillsActivity) zVar).c2(strMSlug);
                return;
            }
            return;
        }
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment3 = (MayaPayBillsSearchFragment) ((ga.g) jVarG1.c.get());
        mayaPayBillsSearchFragment3.getClass();
        mayaPayBillsSearchFragment3.H1();
        z zVar2 = mayaPayBillsSearchFragment3.f13481d0;
        if (zVar2 != null) {
            ((MayaPayBillsActivity) zVar2).f2(strMSlug);
        }
    }

    @Override // ia.InterfaceC1596b
    public final void h() {
        this.f17732d.setVisibility(8);
        this.f17731b.setAlpha(1.0f);
        this.c.setAlpha(1.0f);
    }

    @Override // ia.InterfaceC1596b
    public final void r() {
        TextView textView = this.f17732d;
        textView.setVisibility(0);
        TextViewCompat.setTextAppearance(textView, R.style.JekoBoldSmallText_Tertiary);
        textView.setText(R.string.maya_label_accepts_maya_credit);
    }

    @Override // ia.InterfaceC1596b
    public final void u() {
        TextView textView = this.f17732d;
        textView.setVisibility(0);
        TextViewCompat.setTextAppearance(textView, R.style.JekoBoldSmallText_Primary);
        textView.setText(R.string.maya_label_pay_bills_service_temporarily_unavailable);
        textView.setAlpha(0.4f);
        this.f17731b.setAlpha(0.4f);
        this.c.setAlpha(0.4f);
    }

    @Override // ia.InterfaceC1596b
    public final void v() {
        this.f17732d.setVisibility(8);
    }

    @Override // ia.InterfaceC1596b
    public final void z(String str) {
        AppCompatImageView appCompatImageView = this.f17731b;
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
        C.c0(str, typedValue.resourceId, this.f17731b, dimensionPixelSize2, dimensionPixelSize2, 0);
    }
}
