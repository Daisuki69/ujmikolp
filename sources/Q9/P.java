package Q9;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.core.widget.NestedScrollView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditUpdatePersonalDetailsContactReferenceFragment f5315b;

    public /* synthetic */ P(NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment, int i) {
        this.f5314a = i;
        this.f5315b = newMayaCreditUpdatePersonalDetailsContactReferenceFragment;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void e(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void f(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f5314a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f5314a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f5314a) {
            case 0:
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = this.f5315b;
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment.G1().l();
                com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getActivity());
                return;
            case 1:
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = this.f5315b;
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.G1().l();
                com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getActivity());
                return;
            default:
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment3 = this.f5315b;
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.G1().o(String.valueOf(charSequence));
                NestedScrollView nestedScrollView = newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.f13316X;
                if (nestedScrollView == null) {
                    kotlin.jvm.internal.j.n("mScrollViewContainer");
                    throw null;
                }
                nestedScrollView.fullScroll(130);
                MayaInputLayout mayaInputLayout = newMayaCreditUpdatePersonalDetailsContactReferenceFragment3.f13315W;
                if (mayaInputLayout != null) {
                    mayaInputLayout.getInputEditText().requestFocus();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
                    throw null;
                }
        }
    }
}
