package L6;

import android.content.DialogInterface;
import androidx.appcompat.widget.AppCompatEditText;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCashInViaCardFormFragment f2844b;

    public /* synthetic */ u(MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment, int i) {
        this.f2843a = i;
        this.f2844b = mayaCashInViaCardFormFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2843a) {
            case 0:
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2844b;
                MayaInputLayout mayaInputLayout = mayaCashInViaCardFormFragment.f11747k0;
                String strB = null;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMonthMayaInputLayout");
                    throw null;
                }
                AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
                com.paymaya.common.adapter.a aVar = (com.paymaya.common.adapter.a) mayaCashInViaCardFormFragment.f11754s0.getValue();
                if (aVar != null) {
                    strB = aVar.f10232b.b(aVar.f10231a.get(i));
                }
                inputEditText.setText(strB);
                mayaCashInViaCardFormFragment.H1().k();
                return;
            default:
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2844b;
                MayaInputLayout mayaInputLayout2 = mayaCashInViaCardFormFragment2.f11748l0;
                String strB2 = null;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mYearMayaInputLayout");
                    throw null;
                }
                AppCompatEditText inputEditText2 = mayaInputLayout2.getInputEditText();
                com.paymaya.common.adapter.a aVar2 = (com.paymaya.common.adapter.a) mayaCashInViaCardFormFragment2.t0.getValue();
                if (aVar2 != null) {
                    strB2 = aVar2.f10232b.b(aVar2.f10231a.get(i));
                }
                inputEditText2.setText(strB2);
                mayaCashInViaCardFormFragment2.H1().k();
                return;
        }
    }
}
