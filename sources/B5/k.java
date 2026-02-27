package B5;

import N5.E;
import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalViewRequestFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j, MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment) {
        super(j, 1000L);
        this.f372b = mayaPushApprovalViewRequestFragment;
    }

    private final void a(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Object obj = this.f372b;
        switch (this.f371a) {
            case 0:
                ((l) obj).b();
                break;
            case 1:
                MayaPushApprovalViewRequestFragment mayaPushApprovalViewRequestFragment = (MayaPushApprovalViewRequestFragment) obj;
                C1219h c1219h = new C1219h();
                c1219h.r(EnumC1216e.REQUETS_EXPIRED);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("challengeId", mayaPushApprovalViewRequestFragment.I1().getId());
                c1219h.i();
                mayaPushApprovalViewRequestFragment.z1(c1219h);
                E e = mayaPushApprovalViewRequestFragment.f13566V;
                kotlin.jvm.internal.j.d(e);
                ConstraintLayout constraintLayout = (ConstraintLayout) e.f3587d;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).navigate(new Fa.h(mayaPushApprovalViewRequestFragment.I1().getId()));
                break;
            default:
                int i = CTFirebaseMessagingReceiver.f;
                ((CTFirebaseMessagingReceiver) obj).a("receiver life time is expired");
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f371a) {
            case 0:
                yk.a.h();
                break;
            case 1:
                E e = ((MayaPushApprovalViewRequestFragment) this.f372b).f13566V;
                kotlin.jvm.internal.j.d(e);
                TextView textViewCountdown = (TextView) e.f;
                kotlin.jvm.internal.j.f(textViewCountdown, "textViewCountdown");
                textViewCountdown.setText(String.valueOf(j / 1000));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, long j) {
        super(j, 30000L);
        this.f372b = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CTFirebaseMessagingReceiver cTFirebaseMessagingReceiver, long j) {
        super(j, 1000L);
        this.f372b = cTFirebaseMessagingReceiver;
    }
}
