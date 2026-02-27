package N9;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.paymaya.common.utility.E;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements ActivityResultCallback, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditActivity f4343a;

    public /* synthetic */ d(NewMayaCreditActivity newMayaCreditActivity) {
        this.f4343a = newMayaCreditActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        int i = NewMayaCreditActivity.f13081x;
        j.g(result, "result");
        this.f4343a.f13088t.invoke(result);
    }

    @Override // pg.s
    public void onMethodCall(r rVar, t tVar) {
        int i = NewMayaCreditActivity.f13081x;
        NewMayaCreditActivity newMayaCreditActivity = this.f4343a;
        newMayaCreditActivity.getClass();
        E.a("NewMayaCreditActivity", "onMethodChannelCall");
        new Handler(Looper.getMainLooper()).post(new I6.a(5, rVar, newMayaCreditActivity, tVar));
    }
}
