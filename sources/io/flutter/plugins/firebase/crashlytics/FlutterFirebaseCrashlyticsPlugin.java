package io.flutter.plugins.firebase.crashlytics;

import I8.f;
import U1.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d2.C1328c;
import de.m;
import h2.l;
import h2.n;
import h2.o;
import h2.q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.core.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import pg.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, s {
    public static final String TAG = "FLTFirebaseCrashlytics";
    private u channel;

    private Task<Map<String, Object>> checkForUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private void crash() {
        new Handler(Looper.myLooper()).postDelayed(new f(5), 50L);
    }

    private Task<Void> deleteUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get(Constants.FILE);
            String str2 = map.get(Constants.LINE);
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get(Constants.METHOD);
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(j jVar) {
        u uVar = new u(jVar, "plugins.flutter.io/firebase_crashlytics");
        this.channel = uVar;
        uVar.b(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCrashlyticsCollectionEnabled(g gVar) {
        gVar.a();
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(gVar.f5904a);
        if (crashlyticsSharedPrefs.contains("firebase_crashlytics_collection_enabled")) {
            return crashlyticsSharedPrefs.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!gVar.k()) {
            return false;
        }
        C1328c c1328cA = C1328c.a();
        c1328cA.f16255a.d(Boolean.TRUE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$checkForUnsentReports$0(TaskCompletionSource taskCompletionSource) {
        Task task;
        try {
            l lVar = C1328c.a().f16255a.h;
            if (lVar.f16888s.compareAndSet(false, true)) {
                task = lVar.f16885p.getTask();
            } else {
                Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                task = Tasks.forResult(Boolean.FALSE);
            }
            taskCompletionSource.setResult(new HashMap<String, Object>(((Boolean) Tasks.await(task)).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
                final /* synthetic */ boolean val$unsentReports;

                {
                    this.val$unsentReports = z;
                    put(Constants.UNSENT_REPORTS, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crash$1() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$deleteUnsentReports$2(TaskCompletionSource taskCompletionSource) {
        try {
            l lVar = C1328c.a().f16255a.h;
            lVar.f16886q.trySetResult(Boolean.FALSE);
            lVar.f16887r.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$didCrashOnPreviousExecution$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(C1328c.a().f16255a.f16900g) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
                final /* synthetic */ boolean val$didCrashOnPreviousExecution;

                {
                    this.val$didCrashOnPreviousExecution = z;
                    put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource, g gVar) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(gVar) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
                final /* synthetic */ g val$firebaseApp;

                {
                    this.val$firebaseApp = gVar;
                    gVar.a();
                    if (gVar.f5905b.equals("[DEFAULT]")) {
                        put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(g.e())));
                    }
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$log$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            q qVar = C1328c.a().f16255a;
            long jCurrentTimeMillis = System.currentTimeMillis() - qVar.f16899d;
            qVar.f16905p.f17092a.a(new n(qVar, jCurrentTimeMillis, (String) obj, 1));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$10(t tVar, Task task) {
        if (task.isSuccessful()) {
            tVar.success(task.getResult());
        } else {
            Exception exception = task.getException();
            tVar.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordError$4(Map map, TaskCompletionSource taskCompletionSource) {
        FlutterError flutterError;
        try {
            C1328c c1328cA = C1328c.a();
            Object obj = map.get(Constants.EXCEPTION);
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get(Constants.REASON);
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get(Constants.FATAL);
            Objects.requireNonNull(obj3);
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get(Constants.BUILD_ID);
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            if (str4.length() > 0) {
                q qVar = C1328c.a().f16255a;
                qVar.f16905p.f17092a.a(new o(qVar, str4, 1));
            }
            if (str2 != null) {
                c1328cA.c(Constants.FLUTTER_ERROR_REASON, "thrown ".concat(str2));
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            c1328cA.c(Constants.FLUTTER_ERROR_EXCEPTION, str);
            ArrayList arrayList = new ArrayList();
            Object obj5 = map.get(Constants.STACK_TRACE_ELEMENTS);
            Objects.requireNonNull(obj5);
            Iterator it = ((List) obj5).iterator();
            while (it.hasNext()) {
                StackTraceElement stackTraceElementGenerateStackTraceElement = generateStackTraceElement((Map) it.next());
                if (stackTraceElementGenerateStackTraceElement != null) {
                    arrayList.add(stackTraceElementGenerateStackTraceElement);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                q qVar2 = c1328cA.f16255a;
                qVar2.f16905p.f17092a.a(new n(qVar2, System.currentTimeMillis() - qVar2.f16899d, str3, 1));
            }
            if (zBooleanValue) {
                X5.f.B(flutterError);
            } else {
                c1328cA.b(flutterError);
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$sendUnsentReports$6(TaskCompletionSource taskCompletionSource) {
        try {
            l lVar = C1328c.a().f16255a.h;
            lVar.f16886q.trySetResult(Boolean.TRUE);
            lVar.f16887r.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setCrashlyticsCollectionEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.ENABLED);
            Objects.requireNonNull(obj);
            C1328c.a().f16255a.d((Boolean) obj);
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
                {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(g.e())));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCustomKey$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            C1328c.a().c((String) obj, (String) obj2);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setUserIdentifier$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.IDENTIFIER);
            Objects.requireNonNull(obj);
            q qVar = C1328c.a().f16255a;
            qVar.f16905p.f17092a.a(new o(qVar, (String) obj, 0));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private Task<Void> log(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> recordError(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> sendUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setCustomKey(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(map, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setUserIdentifier(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(3, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new androidx.work.impl.b(13, this, taskCompletionSource, gVar));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        u uVar = this.channel;
        if (uVar != null) {
            uVar.b(null);
            this.channel = null;
        }
    }

    @Override // pg.s
    public void onMethodCall(r rVar, @NonNull t tVar) {
        Object obj;
        Task taskDidCrashOnPreviousExecution;
        String str = rVar.f19112a;
        str.getClass();
        obj = rVar.f19113b;
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                taskDidCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case "Crashlytics#recordError":
                taskDidCrashOnPreviousExecution = recordError((Map) obj);
                break;
            case "Crashlytics#checkForUnsentReports":
                taskDidCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case "Crashlytics#sendUnsentReports":
                taskDidCrashOnPreviousExecution = sendUnsentReports();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                taskDidCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) obj);
                break;
            case "Crashlytics#log":
                taskDidCrashOnPreviousExecution = log((Map) obj);
                break;
            case "Crashlytics#setCustomKey":
                taskDidCrashOnPreviousExecution = setCustomKey((Map) obj);
                break;
            case "Crashlytics#deleteUnsentReports":
                taskDidCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case "Crashlytics#setUserIdentifier":
                taskDidCrashOnPreviousExecution = setUserIdentifier((Map) obj);
                break;
            case "Crashlytics#crash":
                crash();
                return;
            default:
                tVar.notImplemented();
                return;
        }
        taskDidCrashOnPreviousExecution.addOnCompleteListener(new m(tVar, 23));
    }
}
