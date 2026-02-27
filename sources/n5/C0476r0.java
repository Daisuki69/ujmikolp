package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInfoSection;

/* JADX INFO: renamed from: N5.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0476r0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4194b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KycMayaInfoSection f4195d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4196g;
    public final TextView h;
    public final TextView i;

    public C0476r0(ConstraintLayout constraintLayout, Button button, Button button2, KycMayaInfoSection kycMayaInfoSection, View view, View view2, View view3, TextView textView, TextView textView2) {
        this.f4193a = constraintLayout;
        this.f4194b = button;
        this.c = button2;
        this.f4195d = kycMayaInfoSection;
        this.e = view;
        this.f = view2;
        this.f4196g = view3;
        this.h = textView;
        this.i = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4193a;
    }
}
