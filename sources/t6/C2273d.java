package t6;

import com.paymaya.R;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: t6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2273d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f20173b;
    public final /* synthetic */ MayaBankTransferFormFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f20174d;

    public /* synthetic */ C2273d(MayaInputLayout mayaInputLayout, MayaBankTransferFormFragment mayaBankTransferFormFragment, MayaInputLayout mayaInputLayout2, int i) {
        this.f20172a = i;
        this.f20173b = mayaInputLayout;
        this.c = mayaBankTransferFormFragment;
        this.f20174d = mayaInputLayout2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaInputLayout mayaInputLayout = this.f20173b;
        MayaBankTransferFormFragment mayaBankTransferFormFragment = this.c;
        MayaInputLayout mayaInputLayout2 = this.f20174d;
        switch (this.f20172a) {
            case 0:
                mayaInputLayout.setHelperErrorText(mayaBankTransferFormFragment.getString(R.string.maya_has_invalid_characters, mayaInputLayout2.getLabel()));
                mayaInputLayout.p();
                mayaInputLayout.r();
                mayaBankTransferFormFragment.V1();
                break;
            default:
                mayaInputLayout.setHelperErrorText(mayaBankTransferFormFragment.getString(R.string.pma_error_missing_field, mayaInputLayout2.getLabel()));
                mayaInputLayout.p();
                mayaInputLayout.r();
                mayaBankTransferFormFragment.V1();
                break;
        }
        return Unit.f18162a;
    }
}
