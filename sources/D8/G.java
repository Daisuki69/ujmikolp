package D8;

import M8.C0405s1;
import N5.C0459i0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.navigation.ViewKt;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends C8.a {
    public final com.paymaya.domain.store.M e;
    public final com.paymaya.data.preference.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f1013g;
    public int h;

    public G(com.paymaya.domain.store.M m, com.paymaya.data.preference.a aVar) {
        super(aVar, 0);
        this.e = m;
        this.f = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (ContextCompat.checkSelfPermission(((MayaKycLivenessCaptureFragment) ((K8.w) this.c.get())).requireContext(), "android.permission.CAMERA") != 0) {
            ((MayaKycLivenessCaptureFragment) ((K8.w) this.c.get())).P1();
        } else {
            ((MayaKycLivenessCaptureFragment) ((K8.w) this.c.get())).R();
            ((MayaKycLivenessCaptureFragment) ((K8.w) this.c.get())).N1();
        }
    }

    public final void o() {
        MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) ((K8.w) this.c.get());
        mayaKycLivenessCaptureFragment.getClass();
        C0405s1 c0405s1 = new C0405s1();
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentM1 = mayaKycLivenessCaptureFragment.M1();
        kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentM1);
        String getCaptureMethod = mayaEKYCSelectedDocumentM1.getGetCaptureMethod();
        if (getCaptureMethod == null) {
            throw new IllegalArgumentException("Argument \"captureMethod\" is marked as non-null but was passed a null value.");
        }
        HashMap map = c0405s1.f3366a;
        map.put("captureMethod", getCaptureMethod);
        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentM12 = mayaKycLivenessCaptureFragment.M1();
        kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentM12);
        map.put("documentType", String.valueOf(mayaEKYCSelectedDocumentM12.getDocument().getKey()));
        ConstraintLayout constraintLayout = ((C0459i0) mayaKycLivenessCaptureFragment.G1()).f4117a;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        E1.c.m(ViewKt.findNavController(constraintLayout), c0405s1);
    }
}
