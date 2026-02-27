package ha;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsBIRFragment f17008b;

    public /* synthetic */ k(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, int i) {
        this.f17007a = i;
        this.f17008b = mayaPayBillsBIRFragment;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f17007a) {
            case 0:
                if (z4) {
                    return;
                }
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = this.f17008b;
                AppCompatEditText appCompatEditText = mayaPayBillsBIRFragment.f13398v0;
                String strTnTj78 = numX49.tnTj78("bSHPr");
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                appCompatEditText.setText(appCompatEditText.getText());
                AppCompatEditText appCompatEditText2 = mayaPayBillsBIRFragment.f13398v0;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.setOnFocusChangeListener(null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
            default:
                if (z4) {
                    return;
                }
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = this.f17008b;
                AppCompatEditText appCompatEditText3 = mayaPayBillsBIRFragment2.f13397s0;
                String strTnTj782 = numX49.tnTj78("bSHPL");
                if (appCompatEditText3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                appCompatEditText3.setText(appCompatEditText3.getText());
                AppCompatEditText appCompatEditText4 = mayaPayBillsBIRFragment2.f13397s0;
                if (appCompatEditText4 != null) {
                    appCompatEditText4.setOnFocusChangeListener(null);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
        }
    }
}
