package ig;

import android.app.Activity;
import com.paymaya.domain.store.L;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.tiZVw8.numX49;
import defpackage.B0;
import defpackage.H0;
import defpackage.I0;
import dev.fluttercommunity.plus.wakelock.NoActivityException;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ig.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1602a implements FlutterPlugin, I0, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f17146a;

    public final void a(B0 b02) throws NoActivityException {
        L l6 = this.f17146a;
        j.d(l6);
        Activity activity = (Activity) l6.f11367b;
        if (activity == null) {
            throw new NoActivityException();
        }
        j.d(activity);
        boolean z4 = (activity.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = b02.f334a;
        j.d(bool);
        if (bool.booleanValue()) {
            if (z4) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (z4) {
            dLgao9.oVike1(activity.getWindow(), 128);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        j.g(activityPluginBinding, numX49.tnTj78("bSMP"));
        L l6 = this.f17146a;
        if (l6 != null) {
            l6.f11367b = activityPluginBinding.getActivity();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, numX49.tnTj78("bSMb"));
        pg.j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        j.f(binaryMessenger, numX49.tnTj78("bSM2"));
        H0.a(I0.f2196A, binaryMessenger, this);
        this.f17146a = new L(14);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        L l6 = this.f17146a;
        if (l6 != null) {
            l6.f11367b = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, numX49.tnTj78("bSML"));
        pg.j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        j.f(binaryMessenger, numX49.tnTj78("bSMr"));
        H0.a(I0.f2196A, binaryMessenger, null);
        this.f17146a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        j.g(activityPluginBinding, numX49.tnTj78("bSMZ"));
        onAttachedToActivity(activityPluginBinding);
    }
}
