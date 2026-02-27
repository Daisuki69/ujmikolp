package G7;

import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import io.flutter.embedding.engine.FlutterEngineCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: G7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0260c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardFragment f1844b;

    public /* synthetic */ C0260c(MayaDashboardFragment mayaDashboardFragment, int i) {
        this.f1843a = i;
        this.f1844b = mayaDashboardFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1843a) {
            case 0:
                FlutterEngineCache.getInstance().remove("rlfFullscreen");
                this.f1844b.requireActivity().finishActivity(69);
                break;
            case 1:
                MayaDashboardFragment mayaDashboardFragment = this.f1844b;
                mayaDashboardFragment.K1("help_center");
                InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
                if (interfaceC0263f != null) {
                    ((MayaDashboardActivity) interfaceC0263f).Y1().p();
                }
                break;
            default:
                MayaDashboardFragment mayaDashboardFragment2 = this.f1844b;
                mayaDashboardFragment2.K1("inbox");
                mayaDashboardFragment2.G1().E(com.paymaya.common.utility.C.d("paymaya://inbox", "route", "fullscreenFlowEntrypoint"));
                break;
        }
        return Unit.f18162a;
    }
}
