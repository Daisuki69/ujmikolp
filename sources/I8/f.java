package I8;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import butterknife.internal.DebouncingOnClickListener;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import u5.AbstractC2302a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2268a;

    public /* synthetic */ f(int i) {
        this.f2268a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2268a) {
            case 0:
                MayaDashboardActivity mayaDashboardActivity = MayaKycActivity.f12445B;
                if (mayaDashboardActivity != null) {
                    mayaDashboardActivity.p1().p0("KYC0_SANCTION_FOR_REVIEW");
                }
                break;
            case 1:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            case 2:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
            case 3:
                DebouncingOnClickListener.enabled = true;
                break;
            case 4:
                int i = AlarmManagerSchedulerBroadcastReceiver.f9609a;
                break;
            case 5:
                FlutterFirebaseCrashlyticsPlugin.lambda$crash$1();
                break;
            default:
                yk.a.a();
                if (!AbstractC2302a.f20266b.isEmpty()) {
                    Iterator it = AbstractC2302a.c.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                }
                break;
        }
    }
}
