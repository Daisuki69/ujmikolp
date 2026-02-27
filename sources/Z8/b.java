package Z8;

import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import g9.InterfaceC1507b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f6907b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(c cVar, String str, int i) {
        this.f6906a = i;
        this.f6907b = cVar;
        this.c = str;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6906a) {
            case 0:
                c cVar = this.f6907b;
                PayMayaError payMayaErrorF = cVar.f((Throwable) obj, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                String str = this.c;
                j.d(str);
                cVar.q(payMayaErrorF, str);
                break;
            default:
                PayMayaError payMayaErrorF2 = this.f6907b.f((Throwable) obj, true);
                j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((InterfaceC1507b) this.f6907b.c.get())).w1();
                InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.f6907b.c.get();
                String strMSpiel = payMayaErrorF2.mSpiel();
                j.f(strMSpiel, "mSpiel(...)");
                MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) interfaceC1507b;
                mayaLoginFragment.getClass();
                C1220i c1220iO1 = mayaLoginFragment.o1();
                FragmentActivity fragmentActivityRequireActivity = mayaLoginFragment.requireActivity();
                C1219h c1219hH = AbstractC2329d.h(12);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put(Constants.REASON, strMSpiel);
                c1219hH.i();
                c1220iO1.c(fragmentActivityRequireActivity, c1219hH);
                c cVar2 = this.f6907b;
                String str2 = this.c;
                j.d(str2);
                cVar2.q(payMayaErrorF2, str2);
                break;
        }
    }
}
