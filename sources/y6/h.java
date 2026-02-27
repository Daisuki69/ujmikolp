package Y6;

import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f6764b;

    public /* synthetic */ h(MayaInputLayout mayaInputLayout, int i) {
        this.f6763a = i;
        this.f6764b = mayaInputLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6763a) {
            case 0:
                this.f6764b.f();
                break;
            case 1:
                this.f6764b.p();
                break;
            case 2:
                this.f6764b.f();
                break;
            case 3:
                MayaInputLayout mayaInputLayout = this.f6764b;
                mayaInputLayout.p();
                mayaInputLayout.r();
                break;
            default:
                MayaInputLayout mayaInputLayout2 = this.f6764b;
                mayaInputLayout2.f();
                mayaInputLayout2.h();
                break;
        }
        return Unit.f18162a;
    }
}
