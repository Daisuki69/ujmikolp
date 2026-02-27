package L6;

import com.paymaya.R;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import java.util.TimerTask;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCashInCodeFragment f2840a;

    public o(MayaCashInCodeFragment mayaCashInCodeFragment) {
        this.f2840a = mayaCashInCodeFragment;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MayaCashInCodeFragment mayaCashInCodeFragment = this.f2840a;
        if (mayaCashInCodeFragment.f11683s0) {
            return;
        }
        mayaCashInCodeFragment.f11683s0 = true;
        n nVar = mayaCashInCodeFragment.f11680p0;
        if (nVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) nVar;
            String string = mayaCashInActivity.getString(R.string.maya_label_cash_in_code_expired_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            z2.d.n(2131231464, string, mayaCashInActivity.getString(R.string.maya_label_cash_in_code_expired_description), new Pair(mayaCashInActivity.getString(R.string.maya_label_generate_code), new I6.c(mayaCashInActivity, 7)), new Pair(mayaCashInActivity.getString(R.string.pma_label_cancel), new I6.c(mayaCashInActivity, 8)), null, 96).show(mayaCashInActivity.getSupportFragmentManager(), "alert_dialog");
        }
    }
}
