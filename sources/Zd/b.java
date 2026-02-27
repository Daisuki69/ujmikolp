package Zd;

import android.content.Intent;
import android.os.Handler;
import android.os.Vibrator;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import ce.InterfaceC1098a;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.ui.qr.view.activity.impl.BarcodeScannerActivity;
import com.paymaya.ui.qr.view.fragment.impl.BarcodeScannerFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import s.AbstractC2217b;
import tc.InterfaceC2280a;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6925d;
    public String e;

    public /* synthetic */ b(int i) {
        this.f6925d = i;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        switch (this.f6925d) {
            case 1:
                super.j();
                if (((MayaUpdateProfileActivity) ((InterfaceC2280a) this.c.get())).getIntent().getDataString() == null) {
                    MayaUpdateProfileActivity mayaUpdateProfileActivity = (MayaUpdateProfileActivity) ((InterfaceC2280a) this.c.get());
                    String stringExtra = mayaUpdateProfileActivity.getIntent().getStringExtra("FRAGMENT_TO_OPEN");
                    if (stringExtra != null) {
                        int iHashCode = stringExtra.hashCode();
                        if (iHashCode == -1799391950) {
                            if (stringExtra.equals("FRAGMENT_PERSONAL_DETAILS")) {
                                mayaUpdateProfileActivity.W1();
                            }
                        } else if (iHashCode == 1774923964 && stringExtra.equals("FRAGMENT_UNDERWRITING_REQUIREMENTS")) {
                            mayaUpdateProfileActivity.X1();
                        }
                    }
                    mayaUpdateProfileActivity.X1();
                    break;
                } else {
                    String dataString = ((MayaUpdateProfileActivity) ((InterfaceC2280a) this.c.get())).getIntent().getDataString();
                    int iW = C.w(dataString);
                    if (iW != 0) {
                        HashMap mapA = C.A(dataString);
                        this.e = (String) jk.b.m(mapA, "next", null);
                        int iC = AbstractC2217b.c(iW);
                        if (iC == 89) {
                            ((MayaUpdateProfileActivity) ((InterfaceC2280a) this.c.get())).X1();
                            break;
                        } else if (iC == 90) {
                            ((MayaUpdateProfileActivity) ((InterfaceC2280a) this.c.get())).W1();
                            break;
                        }
                    }
                }
                break;
            default:
                super.j();
                break;
        }
    }

    public void k() {
        ((Vibrator) ((BarcodeScannerFragment) ((InterfaceC1098a) this.c.get())).getActivity().getSystemService("vibrator")).vibrate(100L);
        BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) ((InterfaceC1098a) this.c.get());
        barcodeScannerFragment.f14665U.setBorderColor(-65536);
        barcodeScannerFragment.f14665U.setErrorState(true);
        new Handler().postDelayed(new C.h(barcodeScannerFragment, 16), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    public void l(String str) {
        if (!"MERALCO".equalsIgnoreCase(this.e) || str == null || str.length() != 26) {
            Object obj = (InterfaceC1098a) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.SCAN);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(Constants.REASON, "Not Supported");
            ((BaseFragment) obj).o1(c1219hH);
            k();
            return;
        }
        Object obj2 = (InterfaceC1098a) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(14);
        c1219hH2.t(EnumC1217f.SCAN);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH2.j.put(SessionDescription.ATTR_TYPE, "BARCODE_SCAN");
        ((BaseFragment) obj2).o1(c1219hH2);
        BarcodeScannerActivity barcodeScannerActivity = (BarcodeScannerActivity) ((BarcodeScannerFragment) ((InterfaceC1098a) this.c.get())).f14666V;
        barcodeScannerActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("account_number", str);
        barcodeScannerActivity.setResult(-1, intent);
        barcodeScannerActivity.finish();
    }
}
