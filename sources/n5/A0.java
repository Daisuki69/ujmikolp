package N5;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.MayaRadioOptionView;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatCheckBox f3540b;
    public final C0450f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f3541d;
    public final LinearLayout e;
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f3542g;
    public final KycMayaInputLayout h;
    public final KycMayaInputLayout i;
    public final KycMayaInputLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final KycMayaInputLayout f3543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final KycMayaInputLayout f3544l;
    public final KycMayaDropDown m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MayaRadioOptionView f3545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MayaRadioOptionView f3546o;

    public A0(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, C0450f c0450f, LinearLayout linearLayout, LinearLayout linearLayout2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, KycMayaInputLayout kycMayaInputLayout, KycMayaInputLayout kycMayaInputLayout2, KycMayaInputLayout kycMayaInputLayout3, KycMayaInputLayout kycMayaInputLayout4, KycMayaInputLayout kycMayaInputLayout5, KycMayaDropDown kycMayaDropDown, MayaRadioOptionView mayaRadioOptionView, MayaRadioOptionView mayaRadioOptionView2) {
        this.f3539a = constraintLayout;
        this.f3540b = appCompatCheckBox;
        this.c = c0450f;
        this.f3541d = linearLayout;
        this.e = linearLayout2;
        this.f = constraintLayout2;
        this.f3542g = constraintLayout3;
        this.h = kycMayaInputLayout;
        this.i = kycMayaInputLayout2;
        this.j = kycMayaInputLayout3;
        this.f3543k = kycMayaInputLayout4;
        this.f3544l = kycMayaInputLayout5;
        this.m = kycMayaDropDown;
        this.f3545n = mayaRadioOptionView;
        this.f3546o = mayaRadioOptionView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3539a;
    }
}
