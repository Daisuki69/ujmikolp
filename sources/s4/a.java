package S4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.ContextCompat;
import cj.M;
import com.appsflyer.AppsFlyerProperties;
import dOYHB6.lBzGT9.pYp6Y3;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;
import pg.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements FlutterPlugin, s, z, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f5662b;
    public u c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f5663d;
    public ActivityPluginBinding e;
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5664g;

    public a() {
        this.f5664g = Build.VERSION.SDK_INT >= 33 ? M.h(new Pair(c.c, "android.permission.READ_CONTACTS"), new Pair(c.f5667d, "android.permission.READ_CALENDAR"), new Pair(c.h, "android.permission.CAMERA"), new Pair(c.f5668g, "android.permission.READ_MEDIA_IMAGES"), new Pair(c.e, "android.permission.READ_MEDIA_AUDIO"), new Pair(c.f, "android.permission.READ_MEDIA_VIDEO"), new Pair(c.i, "android.permission.ACCESS_FINE_LOCATION")) : M.h(new Pair(c.c, "android.permission.READ_CONTACTS"), new Pair(c.f5667d, "android.permission.READ_CALENDAR"), new Pair(c.h, "android.permission.CAMERA"), new Pair(c.f5668g, "android.permission.READ_EXTERNAL_STORAGE"), new Pair(c.e, "android.permission.READ_EXTERNAL_STORAGE"), new Pair(c.f, "android.permission.READ_EXTERNAL_STORAGE"), new Pair(c.i, "android.permission.ACCESS_FINE_LOCATION"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r0.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(java.util.List r7) {
        /*
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = cj.t.l(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L11:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r7.next()
            p3.b r2 = S4.c.f5666b
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.j.e(r1, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.getClass()
            S4.c[] r2 = S4.c.values()
            int r3 = r2.length
            r4 = 0
        L31:
            if (r4 >= r3) goto L40
            r5 = r2[r4]
            int r6 = r5.f5669a
            if (r6 != r1) goto L3d
            r0.add(r5)
            goto L11
        L3d:
            int r4 = r4 + 1
            goto L31
        L40:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "Array contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.a(java.util.List):java.util.ArrayList");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        this.f5662b = binding.getActivity();
        this.e = binding;
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j.g(flutterPluginBinding, "flutterPluginBinding");
        this.f5661a = flutterPluginBinding.getApplicationContext();
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "maya_mobile_permissions");
        this.c = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(this);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.c;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        Boolean boolValueOf;
        j.g(call, "call");
        j.g(result, "result");
        String str = call.f19112a;
        if (j.b(str, "getPlatformVersion")) {
            result.success("Android " + Build.VERSION.RELEASE);
            return;
        }
        boolean zB = j.b(str, "requestPermissions");
        ?? r22 = this.f5664g;
        Object obj = call.f19113b;
        if (zB) {
            j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            ArrayList<c> arrayListA = a((List) obj);
            ArrayList<c> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT < 33) {
                ArrayList arrayList2 = this.f;
                arrayList2.clear();
                boolean z4 = false;
                for (c cVar : arrayListA) {
                    if (cVar == c.f || cVar == c.e || cVar == c.f5668g) {
                        if (!z4) {
                            arrayList.add(cVar);
                            z4 = true;
                        }
                        arrayList2.add(cVar);
                    } else {
                        arrayList.add(cVar);
                    }
                }
            } else {
                arrayList.addAll(arrayListA);
            }
            ArrayList arrayList3 = new ArrayList();
            for (c cVar2 : arrayList) {
                if (r22.get(cVar2) != null) {
                    Object obj2 = r22.get(cVar2);
                    j.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj2;
                    Context context = this.f5661a;
                    if (context == null) {
                        j.n("context");
                        throw null;
                    }
                    if (ContextCompat.checkSelfPermission(context, str2) != 0) {
                        Object obj3 = r22.get(cVar2);
                        j.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        arrayList3.add((String) obj3);
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                result.success(new int[0]);
                return;
            }
            this.f5663d = result;
            Activity activity = this.f5662b;
            if (activity != null) {
                pYp6Y3.requestPermissions(activity, (String[]) arrayList3.toArray(new String[0]), 1001);
                return;
            } else {
                j.n("activity");
                throw null;
            }
        }
        if (j.b(str, "openSettings")) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            Activity activity2 = this.f5662b;
            if (activity2 == null) {
                j.n("activity");
                throw null;
            }
            intent.setData(Uri.fromParts("package", activity2.getPackageName(), null));
            Activity activity3 = this.f5662b;
            if (activity3 != null) {
                ContextCompat.startActivity(activity3, intent, null);
                return;
            } else {
                j.n("activity");
                throw null;
            }
        }
        if (!j.b(str, "requestPermissionStatus")) {
            if (!j.b(str, "unGrantedPermissions")) {
                result.notImplemented();
                return;
            }
            j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            ArrayList<c> arrayListA2 = a((List) obj);
            ArrayList arrayList4 = new ArrayList();
            for (c cVar3 : arrayListA2) {
                String str3 = (String) r22.get(cVar3);
                if (str3 != null) {
                    Context context2 = this.f5661a;
                    if (context2 == null) {
                        j.n("context");
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(ContextCompat.checkSelfPermission(context2, str3) == 0);
                } else {
                    boolValueOf = null;
                }
                if (j.b(boolValueOf, Boolean.FALSE)) {
                    arrayList4.add(Integer.valueOf(cVar3.f5669a));
                }
            }
            result.success(arrayList4);
            return;
        }
        j.e(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        c.f5666b.getClass();
        for (c cVar4 : c.values()) {
            if (cVar4.f5669a == iIntValue) {
                this.f5663d = result;
                if (Build.VERSION.SDK_INT >= 33) {
                    String strValueOf = String.valueOf(r22.get(cVar4));
                    Activity activity4 = this.f5662b;
                    if (activity4 != null) {
                        pYp6Y3.requestPermissions(activity4, new String[]{strValueOf}, 1002);
                        return;
                    } else {
                        j.n("activity");
                        throw null;
                    }
                }
                if (cVar4 == c.e || cVar4 == c.f || cVar4 == c.f5668g) {
                    Activity activity5 = this.f5662b;
                    if (activity5 != null) {
                        pYp6Y3.requestPermissions(activity5, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1002);
                        return;
                    } else {
                        j.n("activity");
                        throw null;
                    }
                }
                String strValueOf2 = String.valueOf(r22.get(cVar4));
                Activity activity6 = this.f5662b;
                if (activity6 != null) {
                    pYp6Y3.requestPermissions(activity6, new String[]{strValueOf2}, 1002);
                    return;
                } else {
                    j.n("activity");
                    throw null;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        j.g(binding, "binding");
        this.f5662b = binding.getActivity();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // pg.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onRequestPermissionsResult(int r11, java.lang.String[] r12, int[] r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.onRequestPermissionsResult(int, java.lang.String[], int[]):boolean");
    }
}
