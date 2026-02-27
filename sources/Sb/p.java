package Sb;

import android.text.Editable;
import android.text.TextWatcher;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaChangePasswordFragment f5709b;

    public /* synthetic */ p(MayaChangePasswordFragment mayaChangePasswordFragment, int i) {
        this.f5708a = i;
        this.f5709b = mayaChangePasswordFragment;
    }

    private final void a(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void b(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void c(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void d(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void e(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void f(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        String string2;
        String string3;
        switch (this.f5708a) {
            case 0:
                MayaChangePasswordFragment mayaChangePasswordFragment = this.f5709b;
                MayaInputLayout mayaInputLayout = mayaChangePasswordFragment.f13948W;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                    throw null;
                }
                mayaInputLayout.f();
                Lb.e eVarH1 = mayaChangePasswordFragment.H1();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment.f13949X;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                    throw null;
                }
                String strG1 = MayaChangePasswordFragment.G1(mayaChangePasswordFragment, mayaInputLayout2);
                MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment.f13950Y;
                if (mayaInputLayout3 != null) {
                    eVarH1.k(string, strG1, MayaChangePasswordFragment.G1(mayaChangePasswordFragment, mayaInputLayout3));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                    throw null;
                }
            case 1:
                MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5709b;
                MayaInputLayout mayaInputLayout4 = mayaChangePasswordFragment2.f13949X;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                    throw null;
                }
                mayaInputLayout4.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_medium);
                MayaInputLayout mayaInputLayout5 = mayaChangePasswordFragment2.f13949X;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                    throw null;
                }
                mayaInputLayout5.f();
                Lb.e eVarH12 = mayaChangePasswordFragment2.H1();
                MayaInputLayout mayaInputLayout6 = mayaChangePasswordFragment2.f13948W;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                    throw null;
                }
                String strG12 = MayaChangePasswordFragment.G1(mayaChangePasswordFragment2, mayaInputLayout6);
                if (editable == null || (string2 = editable.toString()) == null) {
                    string2 = "";
                }
                MayaInputLayout mayaInputLayout7 = mayaChangePasswordFragment2.f13950Y;
                if (mayaInputLayout7 != null) {
                    eVarH12.k(strG12, string2, MayaChangePasswordFragment.G1(mayaChangePasswordFragment2, mayaInputLayout7));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                    throw null;
                }
            default:
                MayaChangePasswordFragment mayaChangePasswordFragment3 = this.f5709b;
                MayaInputLayout mayaInputLayout8 = mayaChangePasswordFragment3.f13950Y;
                if (mayaInputLayout8 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                    throw null;
                }
                mayaInputLayout8.i();
                MayaInputLayout mayaInputLayout9 = mayaChangePasswordFragment3.f13950Y;
                if (mayaInputLayout9 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                    throw null;
                }
                mayaInputLayout9.f();
                Lb.e eVarH13 = mayaChangePasswordFragment3.H1();
                MayaInputLayout mayaInputLayout10 = mayaChangePasswordFragment3.f13948W;
                if (mayaInputLayout10 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                    throw null;
                }
                String strG13 = MayaChangePasswordFragment.G1(mayaChangePasswordFragment3, mayaInputLayout10);
                MayaInputLayout mayaInputLayout11 = mayaChangePasswordFragment3.f13949X;
                if (mayaInputLayout11 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                    throw null;
                }
                String strG14 = MayaChangePasswordFragment.G1(mayaChangePasswordFragment3, mayaInputLayout11);
                if (editable == null || (string3 = editable.toString()) == null) {
                    string3 = "";
                }
                eVarH13.k(strG13, strG14, string3);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f5708a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f5708a;
    }
}
