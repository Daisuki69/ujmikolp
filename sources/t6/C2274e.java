package t6;

import android.text.Editable;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: t6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2274e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBankTransferFormFragment f20176b;

    public /* synthetic */ C2274e(MayaBankTransferFormFragment mayaBankTransferFormFragment, int i) {
        this.f20175a = i;
        this.f20176b = mayaBankTransferFormFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Editable text;
        switch (this.f20175a) {
            case 0:
                this.f20176b.V1();
                return Unit.f18162a;
            default:
                MayaBankTransferFormFragment mayaBankTransferFormFragment = this.f20176b;
                MayaInputLayout mayaInputLayout = mayaBankTransferFormFragment.f11554q0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                boolean z4 = mayaInputLayout.f12073w || (text = mayaInputLayout.getInputEditText().getText()) == null || text.length() == 0;
                MayaInputLayout mayaInputLayout2 = mayaBankTransferFormFragment.f11554q0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                String strD = Ke.d.d(mayaInputLayout2.getHelperErrorSpielTextView().getText().toString());
                if (!z4) {
                    strD = null;
                }
                MayaInputLayout mayaInputLayout3 = mayaBankTransferFormFragment.f11554q0;
                if (mayaInputLayout3 != null) {
                    mayaBankTransferFormFragment.T1(mayaBankTransferFormFragment.Q1(mayaInputLayout3), strD, z4);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                throw null;
        }
    }
}
