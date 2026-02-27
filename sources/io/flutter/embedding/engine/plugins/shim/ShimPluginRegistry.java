package io.flutter.embedding.engine.plugins.shim;

import We.s;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pg.y;

/* JADX INFO: loaded from: classes4.dex */
public class ShimPluginRegistry {
    private static final String TAG = "ShimPluginRegistry";
    private final FlutterEngine flutterEngine;
    private final Map<String, Object> pluginMap = new HashMap();
    private final ShimRegistrarAggregate shimRegistrarAggregate;

    public static class ShimRegistrarAggregate implements FlutterPlugin, ActivityAware {
        private ActivityPluginBinding activityPluginBinding;
        private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        private final Set<ShimRegistrar> shimRegistrars;

        private ShimRegistrarAggregate() {
            this.shimRegistrars = new HashSet();
        }

        public void addPlugin(@NonNull ShimRegistrar shimRegistrar) {
            this.shimRegistrars.add(shimRegistrar);
            FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.flutterPluginBinding;
            if (flutterPluginBinding != null) {
                shimRegistrar.onAttachedToEngine(flutterPluginBinding);
            }
            ActivityPluginBinding activityPluginBinding = this.activityPluginBinding;
            if (activityPluginBinding != null) {
                shimRegistrar.onAttachedToActivity(activityPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onAttachedToActivity(activityPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
        public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            this.flutterPluginBinding = flutterPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onAttachedToEngine(flutterPluginBinding);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onDetachedFromActivity() {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onDetachedFromActivityForConfigChanges() {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
        public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromEngine(flutterPluginBinding);
            }
            this.flutterPluginBinding = null;
            this.activityPluginBinding = null;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
        public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
            this.activityPluginBinding = activityPluginBinding;
            Iterator<ShimRegistrar> it = this.shimRegistrars.iterator();
            while (it.hasNext()) {
                it.next().onReattachedToActivityForConfigChanges(activityPluginBinding);
            }
        }
    }

    public ShimPluginRegistry(@NonNull FlutterEngine flutterEngine) {
        this.flutterEngine = flutterEngine;
        ShimRegistrarAggregate shimRegistrarAggregate = new ShimRegistrarAggregate();
        this.shimRegistrarAggregate = shimRegistrarAggregate;
        flutterEngine.getPlugins().add(shimRegistrarAggregate);
    }

    public boolean hasPlugin(@NonNull String str) {
        return this.pluginMap.containsKey(str);
    }

    @NonNull
    public y registrarFor(@NonNull String str) {
        if (this.pluginMap.containsKey(str)) {
            throw new IllegalStateException(s.j("Plugin key ", str, " is already in use"));
        }
        this.pluginMap.put(str, null);
        ShimRegistrar shimRegistrar = new ShimRegistrar(str, this.pluginMap);
        this.shimRegistrarAggregate.addPlugin(shimRegistrar);
        return shimRegistrar;
    }

    public <T> T valuePublishedByPlugin(@NonNull String str) {
        return (T) this.pluginMap.get(str);
    }
}
