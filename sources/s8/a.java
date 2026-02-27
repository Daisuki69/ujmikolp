package S8;

import E8.RunnableC0219b;
import android.os.Handler;
import android.os.Looper;
import com.paymaya.mayaui.load.view.activity.impl.MayaLoadActivity;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaLoadActivity f5686b;

    public /* synthetic */ a(MayaLoadActivity mayaLoadActivity, int i) {
        this.f5685a = i;
        this.f5686b = mayaLoadActivity;
    }

    @Override // pg.s
    public final void onMethodCall(r methodCall, t result) {
        switch (this.f5685a) {
            case 0:
                int i = MayaLoadActivity.f12708q;
                j.g(methodCall, "methodCall");
                j.g(result, "result");
                MayaLoadActivity mayaLoadActivity = this.f5686b;
                mayaLoadActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0219b(methodCall, mayaLoadActivity, result, "packages/paymaya_checkout", 1));
                break;
            default:
                int i4 = MayaLoadActivity.f12708q;
                j.g(methodCall, "methodCall");
                j.g(result, "result");
                MayaLoadActivity mayaLoadActivity2 = this.f5686b;
                mayaLoadActivity2.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC0219b(methodCall, mayaLoadActivity2, result, "packages/maya_load", 1));
                break;
        }
    }
}
