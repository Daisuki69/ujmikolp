package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3914b;
    public final MayaProfileInputLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaProfileInputLayout f3915d;
    public final MayaProfileInputLayout e;
    public final MayaProfileInputLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayoutCompat f3916g;
    public final MayaDropDown h;
    public final AppCompatCheckBox i;
    public final Button j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScrollView f3917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f3918l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f3919n;

    public S0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MayaProfileInputLayout mayaProfileInputLayout, MayaProfileInputLayout mayaProfileInputLayout2, MayaProfileInputLayout mayaProfileInputLayout3, MayaProfileInputLayout mayaProfileInputLayout4, LinearLayoutCompat linearLayoutCompat, MayaDropDown mayaDropDown, AppCompatCheckBox appCompatCheckBox, Button button, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3) {
        this.f3913a = constraintLayout;
        this.f3914b = constraintLayout2;
        this.c = mayaProfileInputLayout;
        this.f3915d = mayaProfileInputLayout2;
        this.e = mayaProfileInputLayout3;
        this.f = mayaProfileInputLayout4;
        this.f3916g = linearLayoutCompat;
        this.h = mayaDropDown;
        this.i = appCompatCheckBox;
        this.j = button;
        this.f3917k = scrollView;
        this.f3918l = textView;
        this.m = textView2;
        this.f3919n = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3913a;
    }
}
