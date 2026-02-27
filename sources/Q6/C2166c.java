package q6;

import B5.i;
import W6.e;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;

/* JADX INFO: renamed from: q6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2166c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f19747b;
    public final /* synthetic */ MayaBankTransferActivity c;

    public /* synthetic */ C2166c(MayaErrorDialogFragment mayaErrorDialogFragment, MayaBankTransferActivity mayaBankTransferActivity, int i) {
        this.f19746a = i;
        this.f19747b = mayaErrorDialogFragment;
        this.c = mayaBankTransferActivity;
    }

    @Override // W6.e
    public final void onDismiss() {
        switch (this.f19746a) {
            case 0:
                this.f19747b.q1();
                i.k(this.c, "paymaya://banktransfer");
                break;
            default:
                this.f19747b.q1().z(this.c);
                break;
        }
    }
}
