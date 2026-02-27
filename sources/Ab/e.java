package ab;

import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements W6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7077b;
    public final /* synthetic */ MayaErrorDialogFragment c;

    public /* synthetic */ e(Function1 function1, MayaErrorDialogFragment mayaErrorDialogFragment, int i) {
        this.f7076a = i;
        this.f7077b = function1;
        this.c = mayaErrorDialogFragment;
    }

    @Override // W6.d
    public final void onClose() {
        switch (this.f7076a) {
            case 0:
                Function1 function1 = this.f7077b;
                if (function1 != null) {
                    function1.invoke(this.c.r1());
                }
                break;
            case 1:
                Function1 function12 = this.f7077b;
                if (function12 != null) {
                    function12.invoke(this.c.r1());
                }
                break;
            case 2:
                Function1 function13 = this.f7077b;
                if (function13 != null) {
                    function13.invoke(this.c.r1());
                }
                break;
            case 3:
                Function1 function14 = this.f7077b;
                if (function14 != null) {
                    function14.invoke(this.c.r1());
                }
                break;
            default:
                this.f7077b.invoke(this.c);
                break;
        }
    }
}
