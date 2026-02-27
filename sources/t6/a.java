package T6;

import B5.i;
import B5.m;
import D.C0187u;
import L9.C0323a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.store.B;
import com.paymaya.mayaui.funds.view.activity.impl.FundsActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.u;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AbstractActivityC2512d implements S6.a {
    public C0323a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f5797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f5798l;
    public final ArrayList m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f5799n = new LinkedHashMap();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 1200) {
            finish();
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        this.j = new C0323a((com.paymaya.data.preference.a) aVar.e.get(), new B((PayMayaClientApi) aVar.f4745w.get()), aVar.a(), aVar.J(), aVar.b(), (Uh.d) aVar.f4748y.get());
        this.f5797k = (m) aVar.f4718h0.get();
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_base_flutter, (ViewGroup) null, false);
        if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.lottie_view)));
        }
        setContentView((ConstraintLayout) viewInflate);
        t1().h(this);
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        j.f(flutterEngineCache, "getInstance(...)");
        FundsActivity fundsActivity = (FundsActivity) this;
        String str = fundsActivity.f12393o;
        FlutterEngine flutterEngine = flutterEngineCache.get(str);
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(this);
            flutterEngineCache.put(str, flutterEngine);
        }
        u uVar = new u(flutterEngine.getDartExecutor(), fundsActivity.f12394p);
        this.f5798l = uVar;
        uVar.b(new Na.d(this, 19));
        if (bundle == null) {
            t1().j();
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        W4.a.e().f = null;
        u uVar = this.f5798l;
        if (uVar == null) {
            j.n("mMethodChannel");
            throw null;
        }
        uVar.b(null);
        t1().i();
        m mVar = this.f5797k;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        FlutterEngineCache.getInstance().remove("funds");
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        this.e.u0(this);
    }

    public final C0323a t1() {
        C0323a c0323a = this.j;
        if (c0323a != null) {
            return c0323a;
        }
        j.n("mActivityPresenter");
        throw null;
    }

    public final void u1(String str, Map map) {
        C1220i c1220i = this.c;
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220i.c(this, c1219hE);
    }

    public final void v1(String bridgeMethodName) {
        j.g(bridgeMethodName, "bridgeMethodName");
        Long l6 = (Long) this.f5799n.get(bridgeMethodName);
        long jLongValue = l6 != null ? l6.longValue() : -1L;
        System.currentTimeMillis();
        if (jLongValue == -1) {
            yk.a.c();
        } else {
            yk.a.a();
        }
    }

    public final void w1(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        yk.a.a();
        this.f5799n.put(str, Long.valueOf(jCurrentTimeMillis));
    }
}
