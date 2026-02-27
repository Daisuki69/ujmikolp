package ua;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.work.impl.b;
import com.paymaya.mayaui.purchasefinancing.view.activity.impl.MayaPurchaseFinancingActivity;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements ActivityResultCallback, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaPurchaseFinancingActivity f20280a;

    public /* synthetic */ a(MayaPurchaseFinancingActivity mayaPurchaseFinancingActivity) {
        this.f20280a = mayaPurchaseFinancingActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        int i = MayaPurchaseFinancingActivity.f13534v;
        j.g(result, "result");
        this.f20280a.f13541t.invoke(result);
    }

    @Override // pg.s
    public void onMethodCall(r methodCall, t result) {
        int i = MayaPurchaseFinancingActivity.f13534v;
        j.g(methodCall, "methodCall");
        j.g(result, "result");
        MayaPurchaseFinancingActivity mayaPurchaseFinancingActivity = this.f20280a;
        mayaPurchaseFinancingActivity.getClass();
        new Handler(Looper.getMainLooper()).post(new b(23, methodCall, mayaPurchaseFinancingActivity, result));
    }
}
