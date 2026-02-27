package M8;

import D8.C0198f;
import K8.InterfaceC0278c;
import K8.InterfaceC0295u;
import androidx.lifecycle.LifecycleOwnerKt;
import bj.InterfaceC1031b;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import kotlin.jvm.internal.InterfaceC1791f;

/* JADX INFO: renamed from: M8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0368j implements O0, InterfaceC1791f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3319b;

    public /* synthetic */ C0368j(Object obj, int i) {
        this.f3318a = i;
        this.f3319b = obj;
    }

    public final boolean equals(Object obj) {
        switch (this.f3318a) {
            case 0:
                if ((obj instanceof O0) && (obj instanceof InterfaceC1791f)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof O0) && (obj instanceof InterfaceC1791f)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof O0) && (obj instanceof InterfaceC1791f)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((InterfaceC1791f) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        switch (this.f3318a) {
            case 0:
                return new kotlin.jvm.internal.i((B8.a) this.f3319b, "onErrorDialogDismissed", 0, "onErrorDialogDismissed()V", 0, B8.a.class);
            case 1:
                return new kotlin.jvm.internal.i((D8.D) this.f3319b, "onErrorDialogDismissed", 0, "onErrorDialogDismissed()V", 0, D8.D.class);
            default:
                return new kotlin.jvm.internal.i((D8.L) this.f3319b, "onErrorDialogDismissed", 0, "onErrorDialogDismissed()V", 0, D8.L.class);
        }
    }

    public final int hashCode() {
        switch (this.f3318a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // M8.O0
    public final void onDismiss() {
        switch (this.f3318a) {
            case 0:
                ((MayaKycAdditionalDocumentsFragment) ((InterfaceC0278c) ((C0198f) ((B8.a) this.f3319b)).c.get())).P1();
                break;
            case 1:
                ((MayaKycIdReviewFragment) ((InterfaceC0295u) ((D8.D) this.f3319b).c.get())).a2();
                break;
            default:
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) ((K8.E) ((D8.L) this.f3319b).c.get());
                mayaKycSimpleCaptureV3Fragment.getClass();
                Bj.H.w(LifecycleOwnerKt.getLifecycleScope(mayaKycSimpleCaptureV3Fragment), null, null, new C0335a2(mayaKycSimpleCaptureV3Fragment, null), 3);
                break;
        }
    }
}
