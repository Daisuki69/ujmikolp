package B5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSupportWebActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final UpdaterConfigDetails f = new UpdaterConfigDetails(0, false, null, 7, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MaintenanceDynamicConfig f352g = new MaintenanceDynamicConfig(false, null, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f354b;
    public final A5.m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f355d;
    public Gh.f e;

    public c(Context context, com.paymaya.data.preference.a preference, A5.m flagConfigurationLifecycleHandler, S5.c flagConfigurationService) {
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationLifecycleHandler, "flagConfigurationLifecycleHandler");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f353a = context;
        this.f354b = preference;
        this.c = flagConfigurationLifecycleHandler;
        this.f355d = flagConfigurationService;
    }

    public static void b() {
        Activity activity;
        WeakReference weakReference = X5.f.e;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return;
        }
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaMaintenanceActivity.class);
        intent.setFlags(268468224);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void c() {
        Activity activity;
        WeakReference weakReference = X5.f.e;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return;
        }
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaUpdaterActivity.class);
        intent.setFlags(268468224);
        activity.startActivity(intent);
        activity.finish();
    }

    public final void a() {
        Object objA;
        Object objA2;
        String strD = this.f355d.d(A5.f.f);
        Object obj = f;
        Class<?> cls = obj.getClass();
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = A.f10366a.e(strD, cls);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        if (objA != null) {
            obj = objA;
        }
        UpdaterConfigDetails updaterConfigDetails = (UpdaterConfigDetails) obj;
        androidx.camera.core.impl.a.A(this.f354b.f11330b, "key_has_updates", d(updaterConfigDetails));
        String strD2 = this.f355d.d(A5.f.f158d);
        Object obj2 = f352g;
        try {
            objA2 = A.f10366a.e(strD2, obj2.getClass());
        } catch (Throwable th3) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA2 = AbstractC1039j.a(th3);
        }
        if (objA2 instanceof C1038i) {
            objA2 = null;
        }
        if (objA2 != null) {
            obj2 = objA2;
        }
        MaintenanceDynamicConfig maintenanceDynamicConfig = (MaintenanceDynamicConfig) obj2;
        this.f354b.Q(maintenanceDynamicConfig.isAppMaintenance());
        maintenanceDynamicConfig.toString();
        yk.a.h();
        WeakReference weakReference = X5.f.e;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (!this.f354b.J() || maintenanceDynamicConfig.isAppMaintenance()) {
            if ((activity instanceof MayaMaintenanceActivity) || (activity instanceof MayaSupportWebActivity)) {
                return;
            }
            b();
            return;
        }
        if ((activity instanceof MayaUpdaterActivity) || (activity instanceof MayaMaintenanceActivity) || this.f354b.f11330b.getBoolean("key_is_app_under_maintenance", false)) {
            return;
        }
        if (!((activity instanceof MayaSupportWebActivity) && (this.f354b.f11330b.getBoolean("key_has_updates", false) || this.f354b.f11330b.getBoolean("key_is_app_under_maintenance", false))) && d(updaterConfigDetails)) {
            c();
        }
    }

    public final boolean d(UpdaterConfigDetails updaterConfigDetails) {
        Context applicationContext = this.f353a.getApplicationContext();
        kotlin.jvm.internal.j.f(applicationContext, "getApplicationContext(...)");
        return updaterConfigDetails.isMandatory() && (qk.i.A(applicationContext) < updaterConfigDetails.getBuildNumber());
    }
}
