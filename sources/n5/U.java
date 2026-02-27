package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3939b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f3940d;
    public final ConstraintLayout e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final KycMayaDropDown f3941g;
    public final KycMayaInputLayout h;
    public final TextView i;

    public U(ConstraintLayout constraintLayout, Button button, Button button2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, KycMayaDropDown kycMayaDropDown, KycMayaInputLayout kycMayaInputLayout, TextView textView) {
        this.f3938a = constraintLayout;
        this.f3939b = button;
        this.c = button2;
        this.f3940d = constraintLayout2;
        this.e = constraintLayout3;
        this.f = imageView;
        this.f3941g = kycMayaDropDown;
        this.h = kycMayaInputLayout;
        this.i = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3938a;
    }
}
