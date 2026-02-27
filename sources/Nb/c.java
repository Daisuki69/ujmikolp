package Nb;

import Ng.AbstractC0493a;
import android.view.View;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import cj.L;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import pc.AbstractC2033b;
import tc.InterfaceC2282c;
import xc.InterfaceC2469a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4383b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, boolean z4, int i) {
        this.f4382a = i;
        this.c = obj;
        this.f4383b = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4382a) {
            case 0:
                View it = (View) obj;
                int i = MayaSettingsActivity.f13839r;
                j.g(it, "it");
                if (this.f4383b) {
                    MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) this.c;
                    AbstractC1236z.b(mayaSettingsActivity);
                    AbstractC1236z.h(mayaSettingsActivity, R.id.frame_layout_container, new MayaAccountRecoveryFragment());
                }
                break;
            case 1:
                Byte b8 = (Byte) obj;
                byte bByteValue = b8.byteValue();
                boolean zContains = AbstractC0493a.f4419a.contains(b8);
                StringBuilder sb2 = (StringBuilder) this.c;
                if (zContains || AbstractC0493a.e.contains(b8)) {
                    sb2.append((char) bByteValue);
                } else if (this.f4383b && bByteValue == 32) {
                    sb2.append('+');
                } else {
                    sb2.append(AbstractC0493a.g(bByteValue));
                }
                break;
            case 2:
                String result = (String) obj;
                j.g(result, "result");
                String str = this.f4383b ? RtspHeaders.ALLOW : "Deny";
                String strP = AbstractC1213b.p(9);
                j.f(strP, "tapped(...)");
                MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) this.c;
                String string = mayaAccountProvisionFragment.getString(R.string.maya_label_reg_v2_verify_registration_title);
                j.f(string, "getString(...)");
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment, str, strP, "Location Permission (Dialog)", string, null, L.c(new Pair(EnumC1212a.LOCATION, result)), 16);
                break;
            default:
                AbstractC2033b abstractC2033b = (AbstractC2033b) this.c;
                boolean z4 = this.f4383b;
                ((Integer) obj).getClass();
                InterfaceC2282c interfaceC2282c = ((MayaUpdateProfileBaseFragment) ((InterfaceC2469a) abstractC2033b.c.get())).f14238W;
                if (interfaceC2282c != null) {
                    interfaceC2282c.S(z4);
                }
                break;
        }
        return Unit.f18162a;
    }

    public /* synthetic */ c(boolean z4, Object obj, int i) {
        this.f4382a = i;
        this.f4383b = z4;
        this.c = obj;
    }
}
