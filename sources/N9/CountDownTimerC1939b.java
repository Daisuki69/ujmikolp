package n9;

import B5.i;
import android.os.CountDownTimer;
import android.widget.Button;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class CountDownTimerC1939b extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaDynamicMerchantActivity f18637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1939b(MayaDynamicMerchantActivity mayaDynamicMerchantActivity, String str) {
        super(10000L, 1000L);
        this.f18637a = mayaDynamicMerchantActivity;
        this.f18638b = str;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        MayaDynamicMerchantActivity mayaDynamicMerchantActivity = this.f18637a;
        mayaDynamicMerchantActivity.n1();
        i.f(mayaDynamicMerchantActivity, this.f18638b);
        mayaDynamicMerchantActivity.finish();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        MayaDynamicMerchantActivity mayaDynamicMerchantActivity = this.f18637a;
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment = mayaDynamicMerchantActivity.f12842o;
        if (mayaAlertBottomSheetDialogFragment != null) {
            String string = mayaDynamicMerchantActivity.getString(R.string.maya_format_back_to_merchant_count_down, Long.valueOf(j / ((long) 1000)));
            j.f(string, "getString(...)");
            Button button = mayaAlertBottomSheetDialogFragment.f11814W;
            if (button != null) {
                button.setText(string);
            } else {
                j.n("mButtonPrimary");
                throw null;
            }
        }
    }
}
