package I7;

import N5.s1;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.UserActivity;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RecyclerView.ViewHolder implements H7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D7.a f2238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f2239b;
    public final Guideline c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Guideline f2240d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f2241g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f2242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J5.c f2243l;

    public h(s1 s1Var, D7.a aVar) {
        super(s1Var.f4206b);
        this.f2238a = aVar;
        ConstraintLayout constraintLayoutContainer = s1Var.c;
        kotlin.jvm.internal.j.f(constraintLayoutContainer, "constraintLayoutContainer");
        this.f2239b = constraintLayoutContainer;
        this.c = s1Var.e;
        this.f2240d = s1Var.f4207d;
        this.e = s1Var.f;
        this.f = s1Var.f4209k;
        this.f2241g = s1Var.h;
        this.h = s1Var.f4208g;
        this.i = s1Var.i;
        this.j = s1Var.j;
        Context context = constraintLayoutContainer.getContext();
        kotlin.jvm.internal.j.f(context, "getContext(...)");
        this.f2242k = context;
        this.f2243l = new J5.c(this);
    }

    @Override // H7.b
    public final void C(String str) {
        Context context = this.f2242k;
        kotlin.jvm.internal.j.d(context);
        p(context.getString(R.string.pma_label_bcf_biller_convenience_fee), str);
    }

    @Override // H7.b
    public final Locale a() {
        Locale locale = this.f2242k.getResources().getConfiguration().locale;
        kotlin.jvm.internal.j.f(locale, "locale");
        return locale;
    }

    @Override // H7.b
    public final void b(String str) {
        this.f2241g.setText(str);
    }

    @Override // H7.b
    public final void c() {
        int dimensionPixelSize = this.f2242k.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        this.c.setGuidelineBegin(dimensionPixelSize);
        this.f2240d.setGuidelineEnd(dimensionPixelSize);
    }

    @Override // H7.b
    public final void d(String str) {
        this.e.setText(str);
    }

    @Override // H7.b
    public final void e() {
        int dimensionPixelSize = this.f2242k.getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        this.c.setGuidelineBegin(dimensionPixelSize);
        this.f2240d.setGuidelineEnd(dimensionPixelSize);
    }

    @Override // H7.b
    public final void f(String str) {
        this.f.setText(str);
    }

    @Override // H7.b
    public final void g(String str) {
        Context context = this.f2242k;
        kotlin.jvm.internal.j.d(context);
        p(context.getString(R.string.pma_label_transaction_fee_2), str);
    }

    @Override // H7.b
    public final void i() {
        this.i.setVisibility(8);
        this.j.setVisibility(8);
    }

    @Override // H7.b
    public final String j() {
        String string = this.f2242k.getString(R.string.pma_label_peso);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // H7.b
    public final void k() {
        this.i.setVisibility(0);
        this.j.setVisibility(0);
    }

    @Override // H7.b
    public final void l() {
        TextViewCompat.setTextAppearance(this.i, R.style.JekoBoldSmallText_Primary);
    }

    @Override // H7.b
    public final void n() {
        TextViewCompat.setTextAppearance(this.h, R.style.JekoBoldLink_Accent);
    }

    @Override // H7.b
    public final void o() {
        TextViewCompat.setTextAppearance(this.i, R.style.JekoBoldSmallText_Accent);
    }

    @Override // H7.b
    public final void p(String str, String str2) {
        this.j.setText(str);
        this.i.setText(str2);
    }

    @Override // H7.b
    public final void q() {
        TextViewCompat.setTextAppearance(this.h, R.style.JekoBoldLink_Primary);
    }

    @Override // H7.b
    public final Contact s(UserActivity userActivity) {
        J5.c cVarD = J5.c.d();
        ActivityDescription activityDescriptionMDescription = userActivity.mDescription();
        return cVarD.c(activityDescriptionMDescription != null ? activityDescriptionMDescription.mTarget() : null);
    }

    @Override // H7.b
    public final String t() {
        String string = this.f2242k.getString(R.string.maya_label_masked_amount);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // H7.b
    public final void w() {
        TextViewCompat.setTextAppearance(this.h, R.style.JekoBoldLink_Tertiary);
    }

    @Override // H7.b
    public final void x(String str) {
        this.h.setText(str);
    }

    @Override // H7.b
    public final void y() {
        TextViewCompat.setTextAppearance(this.i, R.style.JekoBoldSmallText_Quaternary);
    }
}
