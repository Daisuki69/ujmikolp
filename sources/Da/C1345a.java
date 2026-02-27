package da;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: renamed from: da.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1345a implements ActivityResultCallback, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsActivity f16298a;

    public /* synthetic */ C1345a(MayaPayBillsActivity mayaPayBillsActivity) {
        this.f16298a = mayaPayBillsActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = MayaPayBillsActivity.f13334x;
        j.g(activityResult, numX49.tnTj78("bdpP"));
        int resultCode = activityResult.getResultCode();
        MayaPayBillsActivity mayaPayBillsActivity = this.f16298a;
        if (resultCode != 6) {
            if (activityResult.getResultCode() != 7 || (mayaPostTransactionBottomSheetDialogFragment = mayaPayBillsActivity.f13338q) == null) {
                return;
            }
            mayaPostTransactionBottomSheetDialogFragment.t1();
            return;
        }
        mayaPayBillsActivity.f13340s = null;
        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = mayaPayBillsActivity.f13338q;
        if (mayaPostTransactionBottomSheetDialogFragment2 != null) {
            mayaPostTransactionBottomSheetDialogFragment2.s1();
        }
    }

    @Override // pg.s
    public void onMethodCall(r rVar, t tVar) {
        int i = MayaPayBillsActivity.f13334x;
        MayaPayBillsActivity mayaPayBillsActivity = this.f16298a;
        mayaPayBillsActivity.getClass();
        new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(7, rVar, mayaPayBillsActivity, tVar));
    }
}
