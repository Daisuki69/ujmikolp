package t6;

import com.paymaya.R;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: t6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2272c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f20171b;
    public final /* synthetic */ MayaBankTransferFormFragment c;

    public /* synthetic */ C2272c(MayaInputLayout mayaInputLayout, MayaBankTransferFormFragment mayaBankTransferFormFragment, int i) {
        this.f20170a = i;
        this.f20171b = mayaInputLayout;
        this.c = mayaBankTransferFormFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaInputLayout mayaInputLayout = this.f20171b;
        MayaBankTransferFormFragment mayaBankTransferFormFragment = this.c;
        switch (this.f20170a) {
            case 0:
                mayaInputLayout.f();
                mayaInputLayout.h();
                mayaBankTransferFormFragment.V1();
                break;
            default:
                mayaInputLayout.setHelperErrorText(mayaBankTransferFormFragment.getString(R.string.maya_character_limit, 35));
                mayaInputLayout.p();
                mayaInputLayout.r();
                mayaBankTransferFormFragment.V1();
                break;
        }
        return Unit.f18162a;
    }
}
