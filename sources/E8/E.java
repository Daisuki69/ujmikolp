package E8;

import android.content.DialogInterface;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1269a;

    public /* synthetic */ E(int i) {
        this.f1269a = i;
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1269a) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 2:
                int i4 = MayaRegistrationActivity.f12730r;
                break;
            case 3:
                int i6 = DataPrivacyActivity.f14472s;
                break;
            case 4:
                int i10 = MayaDynamicMerchantActivity.f12840r;
                break;
            case 5:
                int i11 = MayaMerchantActivity.f12845s;
                break;
            case 6:
                int i12 = MayaQRPHMerchantActivity.f12851t;
                break;
            case 7:
                int i13 = EDDActivity.m;
                break;
        }
    }
}
