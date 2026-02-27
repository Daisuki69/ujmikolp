package de;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import t3.C2268a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements OnSuccessListener, OnFailureListener, Uc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MLKitQRScannerFragment f16367a;

    public /* synthetic */ h(MLKitQRScannerFragment mLKitQRScannerFragment) {
        this.f16367a = mLKitQRScannerFragment;
    }

    @Override // Uc.b
    public void onDismiss() {
        this.f16367a.r1();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        MLKitQRScannerFragment mLKitQRScannerFragment = this.f16367a;
        yk.a.c();
        Zd.d dVar = mLKitQRScannerFragment.f14675S;
        if (dVar.g()) {
            ((MLKitQRScannerFragment) ((ce.c) dVar.c.get())).s1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            dVar.m(1, numX49.tnTj78("bd12"));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        MLKitQRScannerFragment mLKitQRScannerFragment = this.f16367a;
        boolean z4 = false;
        for (C2268a c2268a : (List) obj) {
            if (!C.e(c2268a.f20149a.a())) {
                Zd.d dVar = mLKitQRScannerFragment.f14675S;
                String strA = c2268a.f20149a.a();
                dVar.getClass();
                kotlin.jvm.internal.j.g(strA, numX49.tnTj78("bd1L"));
                if (!dVar.e) {
                    dVar.l(1, strA);
                }
                z4 = true;
            }
        }
        if (z4) {
            return;
        }
        Zd.d dVar2 = mLKitQRScannerFragment.f14675S;
        if (dVar2.g()) {
            ((MLKitQRScannerFragment) ((ce.c) dVar2.c.get())).s1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            dVar2.m(1, numX49.tnTj78("bd1r"));
        }
    }
}
