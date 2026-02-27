package N5;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3567b;
    public final LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f3568d;
    public final HtmlTextView e;
    public final C0464l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final KycMayaDropDown f3569g;
    public final KycMayaInputLayout h;
    public final KycMayaDropDown i;
    public final KycMayaDropDown j;

    public C0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, HtmlTextView htmlTextView, C0464l c0464l, KycMayaDropDown kycMayaDropDown, KycMayaInputLayout kycMayaInputLayout, KycMayaDropDown kycMayaDropDown2, KycMayaDropDown kycMayaDropDown3) {
        this.f3566a = constraintLayout;
        this.f3567b = constraintLayout2;
        this.c = linearLayout;
        this.f3568d = linearLayout2;
        this.e = htmlTextView;
        this.f = c0464l;
        this.f3569g = kycMayaDropDown;
        this.h = kycMayaInputLayout;
        this.i = kycMayaDropDown2;
        this.j = kycMayaDropDown3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3566a;
    }
}
