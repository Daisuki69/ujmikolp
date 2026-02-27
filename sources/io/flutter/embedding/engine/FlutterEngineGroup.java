package io.flutter.embedding.engine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.platform.u;
import java.util.ArrayList;
import java.util.List;
import og.C1978b;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngineGroup {

    @VisibleForTesting
    final List<FlutterEngine> activeEngines;

    public static class Options {

        @NonNull
        private Context context;

        @Nullable
        private DartExecutor.DartEntrypoint dartEntrypoint;

        @Nullable
        private List<String> dartEntrypointArgs;

        @Nullable
        private String initialRoute;

        @NonNull
        private u platformViewsController;
        private boolean automaticallyRegisterPlugins = true;
        private boolean waitForRestorationData = false;

        public Options(@NonNull Context context) {
            this.context = context;
        }

        public boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public Context getContext() {
            return this.context;
        }

        public DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public String getInitialRoute() {
            return this.initialRoute;
        }

        public u getPlatformViewsController() {
            return this.platformViewsController;
        }

        public boolean getWaitForRestorationData() {
            return this.waitForRestorationData;
        }

        public Options setAutomaticallyRegisterPlugins(boolean z4) {
            this.automaticallyRegisterPlugins = z4;
            return this;
        }

        public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint) {
            this.dartEntrypoint = dartEntrypoint;
            return this;
        }

        public Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public Options setPlatformViewsController(@NonNull u uVar) {
            this.platformViewsController = uVar;
            return this;
        }

        public Options setWaitForRestorationData(boolean z4) {
            this.waitForRestorationData = z4;
            return this;
        }
    }

    public FlutterEngineGroup(@NonNull Context context) {
        this(context, null);
    }

    public FlutterEngine createAndRunDefaultEngine(@NonNull Context context) {
        return createAndRunEngine(context, null);
    }

    public FlutterEngine createAndRunEngine(@NonNull Context context, @Nullable DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, null);
    }

    @VisibleForTesting
    public FlutterEngine createEngine(Context context, @NonNull u uVar, boolean z4, boolean z5) {
        return new FlutterEngine(context, null, null, uVar, null, z4, z5, this);
    }

    public FlutterEngineGroup(@NonNull Context context, @Nullable String[] strArr) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = C1978b.a().f18847a;
        if (flutterLoader.initialized()) {
            return;
        }
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context.getApplicationContext(), strArr);
    }

    public FlutterEngine createAndRunEngine(@NonNull Context context, @Nullable DartExecutor.DartEntrypoint dartEntrypoint, @Nullable String str) {
        return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str));
    }

    public FlutterEngine createAndRunEngine(@NonNull Options options) {
        final FlutterEngine flutterEngineSpawn;
        Context context = options.getContext();
        DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        String initialRoute = options.getInitialRoute();
        List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
        u platformViewsController = options.getPlatformViewsController();
        if (platformViewsController == null) {
            platformViewsController = new u();
        }
        u uVar = platformViewsController;
        boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
        boolean waitForRestorationData = options.getWaitForRestorationData();
        if (dartEntrypoint == null) {
            dartEntrypoint = DartExecutor.DartEntrypoint.createDefault();
        }
        DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            flutterEngineSpawn = createEngine(context, uVar, automaticallyRegisterPlugins, waitForRestorationData);
            if (initialRoute != null) {
                flutterEngineSpawn.getNavigationChannel().setInitialRoute(initialRoute);
            }
            flutterEngineSpawn.getDartExecutor().executeDartEntrypoint(dartEntrypoint2, dartEntrypointArgs);
        } else {
            flutterEngineSpawn = this.activeEngines.get(0).spawn(context, dartEntrypoint2, initialRoute, dartEntrypointArgs, uVar, automaticallyRegisterPlugins, waitForRestorationData);
        }
        this.activeEngines.add(flutterEngineSpawn);
        flutterEngineSpawn.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                FlutterEngineGroup.this.activeEngines.remove(flutterEngineSpawn);
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        return flutterEngineSpawn;
    }
}
