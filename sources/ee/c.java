package ee;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.common.utility.C;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;
import java.util.List;
import kotlin.jvm.internal.j;
import t3.C2268a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1421c f16655a;

    public /* synthetic */ c(C1421c c1421c) {
        this.f16655a = c1421c;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Object obj = this.f16655a.c;
        yk.a.c();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        MLKitQRScannerFragment mLKitQRScannerFragment = (MLKitQRScannerFragment) this.f16655a.c;
        for (C2268a c2268a : (List) obj) {
            if (!C.e(c2268a.f20149a.a())) {
                Zd.d dVar = mLKitQRScannerFragment.f14675S;
                String strA = c2268a.f20149a.a();
                dVar.getClass();
                j.g(strA, numX49.tnTj78("bibP"));
                if (!dVar.e && !dVar.f) {
                    dVar.l(0, strA);
                }
            }
        }
    }
}
