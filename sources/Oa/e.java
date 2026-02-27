package Oa;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.V;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import java.util.List;
import kotlin.jvm.internal.j;
import t3.C2268a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lh.c f4783a;

    public /* synthetic */ e(Lh.c cVar) {
        this.f4783a = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        Object obj = this.f4783a.c;
        j.g(e, "e");
        yk.a.c();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        V[] allowedQRPHCodeTypes;
        List<C2268a> barcodes = (List) obj;
        MayaMLKitQRScannerFragment mayaMLKitQRScannerFragment = (MayaMLKitQRScannerFragment) this.f4783a.c;
        j.g(barcodes, "barcodes");
        for (C2268a c2268a : barcodes) {
            if (!C.e(c2268a.f20149a.a())) {
                Ia.a aVarH1 = mayaMLKitQRScannerFragment.H1();
                String strA = c2268a.f20149a.a();
                j.d(strA);
                Na.e eVar = mayaMLKitQRScannerFragment.f13591j0;
                if (eVar == null || (allowedQRPHCodeTypes = ((MayaQRActivity) eVar).V1()) == null) {
                    allowedQRPHCodeTypes = V.values();
                }
                Ja.b bVar = (Ja.b) aVarH1;
                j.g(allowedQRPHCodeTypes, "allowedQRPHCodeTypes");
                if (!bVar.f && !bVar.f2499g) {
                    bVar.o(strA, 0, allowedQRPHCodeTypes);
                }
            }
        }
    }
}
