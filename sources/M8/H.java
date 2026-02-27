package M8;

import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import defpackage.AbstractC1414e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f3170b;
    public final /* synthetic */ kotlin.jvm.internal.i c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ H(MayaInputLayout mayaInputLayout, Function1 function1, int i) {
        this.f3169a = i;
        this.f3170b = mayaInputLayout;
        this.c = (kotlin.jvm.internal.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3169a) {
            case 0:
                MayaInputLayout mayaInputLayout = this.f3170b;
                this.c.invoke(AbstractC1414e.g(mayaInputLayout));
                mayaInputLayout.d();
                break;
            case 1:
                MayaInputLayout mayaInputLayout2 = this.f3170b;
                if (mayaInputLayout2.getShouldShowPrimaryIcon()) {
                    this.c.invoke(AbstractC1414e.g(mayaInputLayout2));
                    mayaInputLayout2.d();
                }
                break;
            case 2:
                MayaInputLayout mayaInputLayout3 = this.f3170b;
                if (mayaInputLayout3.getShouldShowPrimaryIcon()) {
                    this.c.invoke(AbstractC1414e.g(mayaInputLayout3));
                    mayaInputLayout3.d();
                } else {
                    mayaInputLayout3.getInputEditText().requestFocus();
                }
                break;
            default:
                MayaInputLayout mayaInputLayout4 = this.f3170b;
                this.c.invoke(AbstractC1414e.g(mayaInputLayout4));
                mayaInputLayout4.d();
                break;
        }
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ H(Function1 function1, MayaInputLayout mayaInputLayout, int i) {
        this.f3169a = i;
        this.c = (kotlin.jvm.internal.i) function1;
        this.f3170b = mayaInputLayout;
    }
}
