package io.flutter.embedding.engine.deferredcomponents;

import We.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
    public static final String MAPPING_KEY = DeferredComponentManager.class.getName().concat(".loadingUnitMapping");
    private static final String TAG = "PlayStoreDeferredComponentManager";

    @Nullable
    private DeferredComponentChannel channel;

    @NonNull
    private Context context;

    @NonNull
    private FlutterApplicationInfo flutterApplicationInfo;

    @Nullable
    private FlutterJNI flutterJNI;
    private FeatureInstallStateUpdatedListener listener;

    @NonNull
    protected SparseArray<String> loadingUnitIdToComponentNames;

    @NonNull
    protected SparseArray<String> loadingUnitIdToSharedLibraryNames;

    @NonNull
    private Map<String, Integer> nameToSessionId;

    @NonNull
    private SparseIntArray sessionIdToLoadingUnitId;

    @NonNull
    private SparseArray<String> sessionIdToName;

    @NonNull
    private SparseArray<String> sessionIdToState;

    @NonNull
    private SplitInstallManager splitInstallManager;

    public class FeatureInstallStateUpdatedListener implements SplitInstallStateUpdatedListener {
        private FeatureInstallStateUpdatedListener() {
        }

        @SuppressLint({"DefaultLocale"})
        public void onStateUpdate(@NonNull SplitInstallSessionState splitInstallSessionState) {
            int iSessionId = splitInstallSessionState.sessionId();
            if (PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId) != null) {
                switch (splitInstallSessionState.status()) {
                    case 1:
                        String.format("Module \"%s\" (sessionId %d) install pending.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "pending");
                        break;
                    case 2:
                        String.format("Module \"%s\" (sessionId %d) downloading.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloading");
                        break;
                    case 3:
                        String.format("Module \"%s\" (sessionId %d) downloaded.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "downloaded");
                        break;
                    case 4:
                        String.format("Module \"%s\" (sessionId %d) installing.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installing");
                        break;
                    case 5:
                        String.format("Module \"%s\" (sessionId %d) install successfully.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = PlayStoreDeferredComponentManager.this;
                        playStoreDeferredComponentManager.loadAssets(playStoreDeferredComponentManager.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        if (PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId) > 0) {
                            PlayStoreDeferredComponentManager playStoreDeferredComponentManager2 = PlayStoreDeferredComponentManager.this;
                            playStoreDeferredComponentManager2.loadDartLibrary(playStoreDeferredComponentManager2.sessionIdToLoadingUnitId.get(iSessionId), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        }
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallSuccess((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId));
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "installed");
                        break;
                    case 6:
                        Log.e(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install failed with: %s", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId), Integer.valueOf(splitInstallSessionState.errorCode())));
                        PlayStoreDeferredComponentManager.this.flutterJNI.deferredComponentInstallFailure(PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iSessionId), "Module install failed with " + splitInstallSessionState.errorCode(), true);
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component failed to install.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, StateEvent.ProcessResult.FAILED);
                        break;
                    case 7:
                        String.format("Module \"%s\" (sessionId %d) install canceled.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), "Android Deferred Component installation canceled.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iSessionId);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "cancelled");
                        break;
                    case 8:
                        String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "requiresUserConfirmation");
                        break;
                    case 9:
                        String.format("Module \"%s\" (sessionId %d) install canceling.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iSessionId), Integer.valueOf(iSessionId));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iSessionId, "canceling");
                        break;
                    default:
                        splitInstallSessionState.status();
                        break;
                }
            }
        }
    }

    public PlayStoreDeferredComponentManager(@NonNull Context context, @Nullable FlutterJNI flutterJNI) {
        this.context = context;
        this.flutterJNI = flutterJNI;
        this.flutterApplicationInfo = ApplicationInfoLoader.load(context);
        this.splitInstallManager = SplitInstallManagerFactory.create(context);
        FeatureInstallStateUpdatedListener featureInstallStateUpdatedListener = new FeatureInstallStateUpdatedListener();
        this.listener = featureInstallStateUpdatedListener;
        this.splitInstallManager.registerListener(featureInstallStateUpdatedListener);
        this.sessionIdToName = new SparseArray<>();
        this.sessionIdToLoadingUnitId = new SparseIntArray();
        this.sessionIdToState = new SparseArray<>();
        this.nameToSessionId = new HashMap();
        this.loadingUnitIdToComponentNames = new SparseArray<>();
        this.loadingUnitIdToSharedLibraryNames = new SparseArray<>();
        initLoadingUnitMappingToComponentNames();
    }

    @NonNull
    private ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void initLoadingUnitMappingToComponentNames() {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return;
        }
        String str = MAPPING_KEY;
        String string = bundle.getString(str, null);
        if (string == null) {
            Log.e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            return;
        }
        if (string.equals("")) {
            return;
        }
        for (String str2 : string.split(",")) {
            String[] strArrSplit = str2.split(Global.COLON, -1);
            int i = Integer.parseInt(strArrSplit[0]);
            this.loadingUnitIdToComponentNames.put(i, strArrSplit[1]);
            if (strArrSplit.length > 2) {
                this.loadingUnitIdToSharedLibraryNames.put(i, strArrSplit[2]);
            }
        }
    }

    private /* synthetic */ void lambda$installDeferredComponent$0(String str, int i, Integer num) {
        this.sessionIdToName.put(num.intValue(), str);
        this.sessionIdToLoadingUnitId.put(num.intValue(), i);
        if (this.nameToSessionId.containsKey(str)) {
            this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
        }
        this.nameToSessionId.put(str, num);
        this.sessionIdToState.put(num.intValue(), "Requested");
    }

    private /* synthetic */ void lambda$installDeferredComponent$1(int i, String str, Exception exc) {
        SplitInstallException splitInstallException = (SplitInstallException) exc;
        int errorCode = splitInstallException.getErrorCode();
        if (errorCode == -6) {
            this.flutterJNI.deferredComponentInstallFailure(i, s.j("Install of deferred component module \"", str, "\" failed with a network error"), true);
        } else if (errorCode != -2) {
            this.flutterJNI.deferredComponentInstallFailure(i, String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, Integer.valueOf(splitInstallException.getErrorCode()), splitInstallException.getMessage()), false);
        } else {
            this.flutterJNI.deferredComponentInstallFailure(i, s.j("Install of deferred component module \"", str, "\" failed as it is unavailable"), false);
        }
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        Log.e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void destroy() {
        this.splitInstallManager.unregisterListener(this.listener);
        this.channel = null;
        this.flutterJNI = null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    @NonNull
    public String getDeferredComponentInstallState(int i, @Nullable String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return "unknown";
        }
        if (this.nameToSessionId.containsKey(str)) {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
        return this.splitInstallManager.getInstalledModules().contains(str) ? "installedPendingLoad" : "unknown";
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void installDeferredComponent(int i, @Nullable String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else if (str.equals("") && i > 0) {
            loadDartLibrary(i, str);
        } else {
            this.splitInstallManager.startInstall(SplitInstallRequest.newBuilder().addModule(str).build()).addOnSuccessListener(new a()).addOnFailureListener(new b());
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadAssets(int i, @NonNull String str) {
        if (verifyJNI()) {
            try {
                Context context = this.context;
                Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
                this.context = contextCreatePackageContext;
                this.flutterJNI.updateJavaAssetManager(contextCreatePackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadDartLibrary(int i, @NonNull String str) {
        if (verifyJNI() && i >= 0) {
            String str2 = this.loadingUnitIdToSharedLibraryNames.get(i);
            if (str2 == null) {
                str2 = this.flutterApplicationInfo.aotSharedLibraryName + Global.HYPHEN + i + ".part.so";
            }
            String str3 = Build.SUPPORTED_ABIS[0];
            String strReplace = str3.replace(Global.HYPHEN, Global.UNDERSCORE);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.context.getFilesDir());
            for (String str4 : this.context.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new File(str4));
            }
            while (!linkedList.isEmpty()) {
                File file = (File) linkedList.remove();
                if (file == null || !file.isDirectory() || file.listFiles() == null) {
                    String name = file.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(strReplace))) {
                        arrayList.add(file.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file.getAbsolutePath());
                    }
                } else {
                    for (File file2 : file.listFiles()) {
                        linkedList.add(file2);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((String) it2.next());
            }
            this.flutterJNI.loadDartDeferredLibrary(i, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setDeferredComponentChannel(@NonNull DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setJNI(@NonNull FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public boolean uninstallDeferredComponent(int i, @Nullable String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.splitInstallManager.deferredUninstall(arrayList);
        if (this.nameToSessionId.get(str) == null) {
            return true;
        }
        this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
        return true;
    }
}
