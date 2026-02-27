package D8;

import N5.C0490y0;
import android.util.Base64;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.domain.model.KycUploadRequest;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends C8.a {
    public final Y.e e;
    public final com.paymaya.data.preference.a f;

    public T(Y.e eVar, com.paymaya.data.preference.a aVar) {
        super(aVar, 0);
        this.e = eVar;
        this.f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.T.j():void");
    }

    public final KycUploadRequest o(String str) {
        String key;
        String str2 = "";
        if (!this.f.e().isShortenedFlowPhilsysEnabled()) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP = p();
            kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentP);
            key = mayaEKYCSelectedDocumentP.getKey();
        } else if (str.equals("FRONT") || str.equals("BACK")) {
            KeyEventDispatcher.Component componentRequireActivity = ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).requireActivity();
            H8.b bVar = componentRequireActivity instanceof H8.b ? (H8.b) componentRequireActivity : null;
            String str3 = bVar != null ? ((MayaKycActivity) bVar).f12455w : null;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() == 0) {
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP2 = p();
                kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentP2);
                key = mayaEKYCSelectedDocumentP2.getKey();
            } else {
                key = str3;
            }
        } else {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP3 = p();
            kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentP3);
            key = mayaEKYCSelectedDocumentP3.getKey();
        }
        if (this.f.e().isKycForcePhNationalIdEnabled() && kotlin.jvm.internal.j.b(key, "PHILSYS_DIGITAL")) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP4 = p();
            kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentP4);
            key = mayaEKYCSelectedDocumentP4.getKey();
        }
        File fileK1 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).K1(str);
        ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).getClass();
        if (fileK1 != null && fileK1.exists()) {
            try {
                String strEncodeToString = Base64.encodeToString(nj.j.a(fileK1), 0);
                kotlin.jvm.internal.j.d(strEncodeToString);
                str2 = strEncodeToString;
            } catch (Exception unused) {
                yk.a.d();
            }
        }
        return new KycUploadRequest(key, str, str2);
    }

    public final MayaEKYCSelectedDocument p() {
        return ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).N1();
    }

    public final void q() {
        File fileK1 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).K1("FRONT");
        File fileK12 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) this.c.get())).K1("BACK");
        boolean z4 = false;
        boolean z5 = fileK1 != null;
        boolean z8 = fileK12 != null;
        K8.O o8 = (K8.O) this.c.get();
        if (z5 && z8) {
            z4 = true;
        }
        ((C0490y0) ((MayaKycUploadPhilsysIdFragment) o8).G1()).f4298b.f4307b.setEnabled(z4);
    }
}
