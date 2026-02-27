package io.flutter.plugins.firebase.core;

import E8.RunnableC0219b;
import U1.g;
import U1.i;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import de.m;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.work.impl.b(12, this, gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(i iVar) {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
        builder.setApiKey(iVar.f5911a);
        builder.setAppId(iVar.f5912b);
        String str = iVar.e;
        if (str != null) {
            builder.setMessagingSenderId(str);
        }
        String str2 = iVar.f5914g;
        if (str2 != null) {
            builder.setProjectId(str2);
        }
        builder.setDatabaseURL(iVar.c);
        builder.setStorageBucket(iVar.f);
        builder.setTrackingId(iVar.f5913d);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$7(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                g.f(str).b();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$firebaseAppToMap$0(g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder();
            gVar.a();
            builder.setName(gVar.f5905b);
            gVar.a();
            builder.setOptions(firebaseOptionsToMap(gVar.c));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(gVar.k()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar)));
            taskCompletionSource.setResult(builder.build());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeApp$2(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        try {
            String strCheckNotEmpty = Preconditions.checkNotEmpty(pigeonFirebaseOptions.getApiKey(), "ApiKey must be set.");
            String strCheckNotEmpty2 = Preconditions.checkNotEmpty(pigeonFirebaseOptions.getAppId(), "ApplicationId must be set.");
            String databaseURL = pigeonFirebaseOptions.getDatabaseURL();
            String messagingSenderId = pigeonFirebaseOptions.getMessagingSenderId();
            String projectId = pigeonFirebaseOptions.getProjectId();
            i iVar = new i(strCheckNotEmpty2, strCheckNotEmpty, databaseURL, pigeonFirebaseOptions.getTrackingId(), messagingSenderId, pigeonFirebaseOptions.getStorageBucket(), projectId);
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (pigeonFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, pigeonFirebaseOptions.getAuthDomain());
            }
            taskCompletionSource.setResult((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(g.i(iVar, this.applicationContext, str))));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeCore$3(TaskCompletionSource taskCompletionSource) {
        ArrayList arrayList;
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            synchronized (g.f5902k) {
                arrayList = new ArrayList(g.f5903l.values());
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap((g) it.next())));
            }
            taskCompletionSource.setResult(arrayList2);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            result.error(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$optionsFromResource$4(TaskCompletionSource taskCompletionSource) {
        try {
            i iVarA = i.a(this.applicationContext);
            if (iVarA == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(firebaseOptionsToMap(iVarA));
            }
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAutomaticDataCollectionEnabled$5(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            g.f(str).m(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setAutomaticResourceManagementEnabled$6(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            g gVarF = g.f(str);
            boolean zBooleanValue = bool.booleanValue();
            gVarF.a();
            if (gVarF.e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
                if (zBooleanValue && zIsInBackground) {
                    gVarF.l(true);
                } else if (!zBooleanValue && zIsInBackground) {
                    gVarF.l(false);
                }
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private <T> void listenToResponse(TaskCompletionSource<T> taskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> result) {
        taskCompletionSource.getTask().addOnCompleteListener(new m(result, 22));
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(@NonNull String str, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(0, str, taskCompletionSource));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(@NonNull String str, @NonNull GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0219b(this, pigeonFirebaseOptions, str, taskCompletionSource, 10));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, taskCompletionSource, 1));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, taskCompletionSource, 0));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(@NonNull String str, @NonNull Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(str, bool, taskCompletionSource, 0));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(@NonNull String str, @NonNull Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(str, bool, taskCompletionSource, 1));
        listenToResponse(taskCompletionSource, result);
    }
}
