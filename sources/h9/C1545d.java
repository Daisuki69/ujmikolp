package h9;

import android.widget.TextView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: h9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1545d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaLoginFragment f16939b;
    public final /* synthetic */ MayaInputLayout c;

    public /* synthetic */ C1545d(MayaInputLayout mayaInputLayout, MayaLoginFragment mayaLoginFragment) {
        this.f16938a = 0;
        this.c = mayaInputLayout;
        this.f16939b = mayaLoginFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16938a) {
            case 0:
                this.c.f();
                this.f16939b.J1().t();
                return Unit.f18162a;
            case 1:
                MayaLoginFragment mayaLoginFragment = this.f16939b;
                TextView textView = mayaLoginFragment.f12778X;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView.setVisibility(0);
                this.c.p();
                mayaLoginFragment.J1().t();
                return Unit.f18162a;
            case 2:
                MayaLoginFragment mayaLoginFragment2 = this.f16939b;
                TextView textView2 = mayaLoginFragment2.f12778X;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView2.setVisibility(8);
                this.c.f();
                mayaLoginFragment2.J1().t();
                return Unit.f18162a;
            default:
                MayaLoginFragment mayaLoginFragment3 = this.f16939b;
                if (mayaLoginFragment3.f12786f0) {
                    mayaLoginFragment3.f12786f0 = false;
                    return Unit.f18162a;
                }
                this.c.p();
                mayaLoginFragment3.J1().t();
                return Unit.f18162a;
        }
    }

    public /* synthetic */ C1545d(MayaLoginFragment mayaLoginFragment, MayaInputLayout mayaInputLayout, int i) {
        this.f16938a = i;
        this.f16939b = mayaLoginFragment;
        this.c = mayaInputLayout;
    }
}
