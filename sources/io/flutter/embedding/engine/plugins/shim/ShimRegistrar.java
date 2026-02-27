package io.flutter.embedding.engine.plugins.shim;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.platform.m;
import io.flutter.view.o;
import io.flutter.view.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import og.C1978b;
import pg.InterfaceC2034A;
import pg.InterfaceC2035B;
import pg.InterfaceC2036C;
import pg.j;
import pg.w;
import pg.x;
import pg.y;
import pg.z;

/* JADX INFO: loaded from: classes4.dex */
class ShimRegistrar implements y, FlutterPlugin, ActivityAware {
    private static final String TAG = "ShimRegistrar";
    private ActivityPluginBinding activityPluginBinding;
    private final Map<String, Object> globalRegistrarMap;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final String pluginId;
    private final Set<InterfaceC2035B> viewDestroyListeners = new HashSet();
    private final Set<z> requestPermissionsResultListeners = new HashSet();
    private final Set<w> activityResultListeners = new HashSet();
    private final Set<x> newIntentListeners = new HashSet();
    private final Set<InterfaceC2034A> userLeaveHintListeners = new HashSet();
    private final Set<InterfaceC2036C> WindowFocusChangedListeners = new HashSet();

    public ShimRegistrar(@NonNull String str, @NonNull Map<String, Object> map) {
        this.pluginId = str;
        this.globalRegistrarMap = map;
    }

    private void addExistingListenersToActivityPluginBinding() {
        Iterator<z> it = this.requestPermissionsResultListeners.iterator();
        while (it.hasNext()) {
            this.activityPluginBinding.addRequestPermissionsResultListener(it.next());
        }
        Iterator<w> it2 = this.activityResultListeners.iterator();
        while (it2.hasNext()) {
            this.activityPluginBinding.addActivityResultListener(it2.next());
        }
        Iterator<x> it3 = this.newIntentListeners.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            this.activityPluginBinding.addOnNewIntentListener(null);
        }
        Iterator<InterfaceC2034A> it4 = this.userLeaveHintListeners.iterator();
        while (it4.hasNext()) {
            if (it4.next() != null) {
                throw new ClassCastException();
            }
            this.activityPluginBinding.addOnUserLeaveHintListener(null);
        }
        Iterator<InterfaceC2036C> it5 = this.WindowFocusChangedListeners.iterator();
        while (it5.hasNext()) {
            if (it5.next() != null) {
                throw new ClassCastException();
            }
            this.activityPluginBinding.addOnWindowFocusChangedListener(null);
        }
    }

    public Context activeContext() {
        return this.activityPluginBinding == null ? context() : activity();
    }

    public Activity activity() {
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            return activityPluginBinding.getActivity();
        }
        return null;
    }

    public y addActivityResultListener(w wVar) {
        this.activityResultListeners.add(wVar);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(wVar);
        }
        return this;
    }

    public y addNewIntentListener(x xVar) {
        this.newIntentListeners.add(xVar);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addOnNewIntentListener(xVar);
        }
        return this;
    }

    public y addRequestPermissionsResultListener(z zVar) {
        this.requestPermissionsResultListeners.add(zVar);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addRequestPermissionsResultListener(zVar);
        }
        return this;
    }

    public y addUserLeaveHintListener(InterfaceC2034A interfaceC2034A) {
        this.userLeaveHintListeners.add(interfaceC2034A);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addOnUserLeaveHintListener(interfaceC2034A);
        }
        return this;
    }

    @NonNull
    public y addViewDestroyListener(@NonNull InterfaceC2035B interfaceC2035B) {
        this.viewDestroyListeners.add(interfaceC2035B);
        return this;
    }

    public y addWindowFocusChangedListener(InterfaceC2036C interfaceC2036C) {
        this.WindowFocusChangedListeners.add(interfaceC2036C);
        ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addOnWindowFocusChangedListener(interfaceC2036C);
        }
        return this;
    }

    public Context context() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getApplicationContext();
        }
        return null;
    }

    public String lookupKeyForAsset(String str) {
        return C1978b.a().f18847a.getLookupKeyForAsset(str);
    }

    public j messenger() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getBinaryMessenger();
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        addExistingListenersToActivityPluginBinding();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activityPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Iterator<InterfaceC2035B> it = this.viewDestroyListeners.iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
        this.pluginBinding = null;
        this.activityPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        addExistingListenersToActivityPluginBinding();
    }

    public m platformViewRegistry() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getPlatformViewRegistry();
        }
        return null;
    }

    public y publish(Object obj) {
        this.globalRegistrarMap.put(this.pluginId, obj);
        return this;
    }

    public t textures() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getTextureRegistry();
        }
        return null;
    }

    public o view() {
        throw new UnsupportedOperationException("The new embedding does not support the old FlutterView.");
    }

    public String lookupKeyForAsset(String str, String str2) {
        return C1978b.a().f18847a.getLookupKeyForAsset(str, str2);
    }
}
