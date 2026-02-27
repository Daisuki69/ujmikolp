package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInfoSection;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3947b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KycMayaInfoSection f3948d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3949g;

    public V(ConstraintLayout constraintLayout, Button button, Button button2, KycMayaInfoSection kycMayaInfoSection, View view, View view2, TextView textView) {
        this.f3946a = constraintLayout;
        this.f3947b = button;
        this.c = button2;
        this.f3948d = kycMayaInfoSection;
        this.e = view;
        this.f = view2;
        this.f3949g = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3946a;
    }
}
