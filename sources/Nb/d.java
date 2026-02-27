package Nb;

import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements W6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f4385b;
    public final /* synthetic */ MayaSettingsActivity c;

    public /* synthetic */ d(MayaErrorDialogFragment mayaErrorDialogFragment, MayaSettingsActivity mayaSettingsActivity, int i) {
        this.f4384a = i;
        this.f4385b = mayaErrorDialogFragment;
        this.c = mayaSettingsActivity;
    }

    @Override // W6.d
    public final void onClose() {
        switch (this.f4384a) {
            case 0:
                this.f4385b.q1().z(this.c);
                break;
            default:
                this.f4385b.q1().z(this.c);
                break;
        }
    }
}
