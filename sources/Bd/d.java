package Bd;

import android.view.View;
import android.widget.EditText;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f422b;

    public /* synthetic */ d(Object obj, int i) {
        this.f421a = i;
        this.f422b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f421a) {
            case 0:
                ((EDDInputFinancialDocument) this.f422b).onChooseFocused((TextInputEditText) Utils.castParam(view, "onFocusChange", 0, "onChooseFocused", 0, TextInputEditText.class), z4);
                break;
            case 1:
                ((AbstractBaseEDDFormFragmentImpl) this.f422b).onChooseOneFocused((EditText) Utils.castParam(view, "onFocusChange", 0, "onChooseOneFocused", 0, EditText.class), z4);
                break;
            default:
                ((EDDAccountUsageFragment) this.f422b).onPrimaryUseFocusChanged(view, z4);
                break;
        }
    }
}
