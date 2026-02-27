package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3943b;
    public final MayaProfileInputLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaProfileInputLayout f3944d;
    public final MayaDropDown e;
    public final MayaDropDown f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MayaDropDown f3945g;
    public final Button h;
    public final ScrollView i;

    public U0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MayaProfileInputLayout mayaProfileInputLayout, MayaProfileInputLayout mayaProfileInputLayout2, MayaDropDown mayaDropDown, MayaDropDown mayaDropDown2, MayaDropDown mayaDropDown3, Button button, ScrollView scrollView) {
        this.f3942a = constraintLayout;
        this.f3943b = constraintLayout2;
        this.c = mayaProfileInputLayout;
        this.f3944d = mayaProfileInputLayout2;
        this.e = mayaDropDown;
        this.f = mayaDropDown2;
        this.f3945g = mayaDropDown3;
        this.h = button;
        this.i = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3942a;
    }
}
