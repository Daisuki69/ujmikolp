package T6;

import S1.r;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import pg.t;
import pg.u;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends q {
    public ViewBinding m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f5800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5801o;

    public abstract ViewBinding V1();

    public abstract Map W1();

    public abstract String X1();

    public abstract String Y1();

    public abstract void Z1(t tVar);

    public abstract void a2(t tVar);

    public abstract void b2(t tVar);

    public abstract void c2(t tVar);

    public abstract void d2(t tVar);

    public abstract void e2(String str);

    public final void f2() {
        C.i(getClass().getSimpleName(), "initializeFlutterEngine");
        u uVar = new u(r.d(this, X1()).getDartExecutor(), Y1());
        uVar.b(new Na.d(this, 21));
        this.f5800n = uVar;
    }

    public abstract void g2();

    public final void h2(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    public abstract boolean i2(pg.r rVar, t tVar);

    public abstract void j2();

    public final void k2() {
        if (Build.VERSION.SDK_INT < 30) {
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            return;
        }
        getWindow().setDecorFitsSystemWindows(false);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.show(WindowInsetsCompat.Type.systemBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null && !FlutterEngineCache.getInstance().contains(X1())) {
            Context applicationContext = getApplicationContext();
            j.f(applicationContext, "getApplicationContext(...)");
            r.d(applicationContext, X1());
            this.f5801o = true;
        }
        super.onCreate(bundle);
        k2();
        g2();
        ViewBinding viewBindingV1 = V1();
        this.m = viewBindingV1;
        setContentView(viewBindingV1.getRoot());
        f2();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        u uVar = this.f5800n;
        if (uVar == null) {
            j.n("mMethodChannel");
            throw null;
        }
        uVar.b(null);
        j2();
        FlutterEngineCache.getInstance().remove(X1());
        super.onDestroy();
        this.m = null;
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f5801o) {
            finish();
        }
    }
}
