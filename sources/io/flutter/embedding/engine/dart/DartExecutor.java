package io.flutter.embedding.engine.dart;

import We.s;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.tracing.Trace;
import d4.AbstractC1331a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import og.C1978b;
import pg.F;
import pg.InterfaceC2043f;
import pg.g;
import pg.h;
import pg.i;
import pg.j;

/* JADX INFO: loaded from: classes4.dex */
public class DartExecutor implements j {
    private static final String TAG = "DartExecutor";

    @NonNull
    private final AssetManager assetManager;

    @NonNull
    private final j binaryMessenger;

    @NonNull
    private final DartMessenger dartMessenger;

    @NonNull
    private final FlutterJNI flutterJNI;
    private boolean isApplicationRunning;
    private final InterfaceC2043f isolateChannelMessageHandler;

    @Nullable
    private String isolateServiceId;

    @Nullable
    private IsolateServiceIdListener isolateServiceIdListener;

    public static class DartCallback {
        public final AssetManager androidAssetManager;
        public final FlutterCallbackInformation callbackHandle;
        public final String pathToBundle;

        public DartCallback(@NonNull AssetManager assetManager, @NonNull String str, @NonNull FlutterCallbackInformation flutterCallbackInformation) {
            this.androidAssetManager = assetManager;
            this.pathToBundle = str;
            this.callbackHandle = flutterCallbackInformation;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
            sb2.append(this.pathToBundle);
            sb2.append(", library path: ");
            sb2.append(this.callbackHandle.callbackLibraryPath);
            sb2.append(", function: ");
            return s.p(sb2, this.callbackHandle.callbackName, " )");
        }
    }

    public static class DefaultBinaryMessenger implements j {
        private final DartMessenger messenger;

        public void disableBufferingIncomingMessages() {
            this.messenger.disableBufferingIncomingMessages();
        }

        public void enableBufferingIncomingMessages() {
            this.messenger.enableBufferingIncomingMessages();
        }

        @Override // pg.j
        @UiThread
        public /* bridge */ /* synthetic */ h makeBackgroundTaskQueue() {
            return AbstractC1331a.b(this);
        }

        @Override // pg.j
        @UiThread
        public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer) {
            this.messenger.send(str, byteBuffer, null);
        }

        @Override // pg.j
        @UiThread
        public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f) {
            this.messenger.setMessageHandler(str, interfaceC2043f);
        }

        private DefaultBinaryMessenger(@NonNull DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        @Override // pg.j
        public h makeBackgroundTaskQueue(i iVar) {
            return this.messenger.makeBackgroundTaskQueue(iVar);
        }

        @Override // pg.j
        @UiThread
        public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable g gVar) {
            this.messenger.send(str, byteBuffer, gVar);
        }

        @Override // pg.j
        @UiThread
        public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f, @Nullable h hVar) {
            this.messenger.setMessageHandler(str, interfaceC2043f, hVar);
        }
    }

    public interface IsolateServiceIdListener {
        void onIsolateServiceIdAvailable(@NonNull String str);
    }

    public DartExecutor(@NonNull FlutterJNI flutterJNI, @NonNull AssetManager assetManager) {
        this.isApplicationRunning = false;
        InterfaceC2043f interfaceC2043f = new InterfaceC2043f() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
            @Override // pg.InterfaceC2043f
            public void onMessage(ByteBuffer byteBuffer, g gVar) {
                DartExecutor dartExecutor = DartExecutor.this;
                F.f19098b.getClass();
                dartExecutor.isolateServiceId = F.a(byteBuffer);
                if (DartExecutor.this.isolateServiceIdListener != null) {
                    DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.isolateChannelMessageHandler = interfaceC2043f;
        this.flutterJNI = flutterJNI;
        this.assetManager = assetManager;
        DartMessenger dartMessenger = new DartMessenger(flutterJNI);
        this.dartMessenger = dartMessenger;
        dartMessenger.setMessageHandler("flutter/isolate", interfaceC2043f);
        this.binaryMessenger = new DefaultBinaryMessenger(dartMessenger);
        if (flutterJNI.isAttached()) {
            this.isApplicationRunning = true;
        }
    }

    @Deprecated
    public void disableBufferingIncomingMessages() {
        this.dartMessenger.disableBufferingIncomingMessages();
    }

    @Deprecated
    public void enableBufferingIncomingMessages() {
        this.dartMessenger.enableBufferingIncomingMessages();
    }

    public void executeDartCallback(@NonNull DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Trace.beginSection(ug.a.b("DartExecutor#executeDartCallback"));
        try {
            Objects.toString(dartCallback);
            FlutterJNI flutterJNI = this.flutterJNI;
            String str = dartCallback.pathToBundle;
            FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, null);
            this.isApplicationRunning = true;
            Trace.endSection();
        } finally {
        }
    }

    public void executeDartEntrypoint(@NonNull DartEntrypoint dartEntrypoint) {
        executeDartEntrypoint(dartEntrypoint, null);
    }

    @NonNull
    public j getBinaryMessenger() {
        return this.binaryMessenger;
    }

    @Nullable
    public String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    @UiThread
    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    @Override // pg.j
    @UiThread
    public /* bridge */ /* synthetic */ h makeBackgroundTaskQueue() {
        return AbstractC1331a.b(this);
    }

    public void notifyLowMemoryWarning() {
        if (this.flutterJNI.isAttached()) {
            this.flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void onAttachedToJNI() {
        this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
    }

    public void onDetachedFromJNI() {
        this.flutterJNI.setPlatformMessageHandler(null);
    }

    @Override // pg.j
    @UiThread
    @Deprecated
    public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer) {
        this.binaryMessenger.send(str, byteBuffer);
    }

    public void setIsolateServiceIdListener(@Nullable IsolateServiceIdListener isolateServiceIdListener) {
        String str;
        this.isolateServiceIdListener = isolateServiceIdListener;
        if (isolateServiceIdListener == null || (str = this.isolateServiceId) == null) {
            return;
        }
        isolateServiceIdListener.onIsolateServiceIdAvailable(str);
    }

    @Override // pg.j
    @UiThread
    @Deprecated
    public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f) {
        this.binaryMessenger.setMessageHandler(str, interfaceC2043f);
    }

    public void executeDartEntrypoint(@NonNull DartEntrypoint dartEntrypoint, @Nullable List<String> list) {
        if (this.isApplicationRunning) {
            Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Trace.beginSection(ug.a.b("DartExecutor#executeDartEntrypoint"));
        try {
            Objects.toString(dartEntrypoint);
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list);
            this.isApplicationRunning = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // pg.j
    @UiThread
    @Deprecated
    public h makeBackgroundTaskQueue(i iVar) {
        return this.binaryMessenger.makeBackgroundTaskQueue(iVar);
    }

    @Override // pg.j
    @UiThread
    @Deprecated
    public void send(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable g gVar) {
        this.binaryMessenger.send(str, byteBuffer, gVar);
    }

    @Override // pg.j
    @UiThread
    @Deprecated
    public void setMessageHandler(@NonNull String str, @Nullable InterfaceC2043f interfaceC2043f, @Nullable h hVar) {
        this.binaryMessenger.setMessageHandler(str, interfaceC2043f, hVar);
    }

    public static class DartEntrypoint {

        @NonNull
        public final String dartEntrypointFunctionName;

        @Nullable
        public final String dartEntrypointLibrary;

        @NonNull
        public final String pathToBundle;

        public DartEntrypoint(@NonNull String str, @NonNull String str2) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = null;
            this.dartEntrypointFunctionName = str2;
        }

        @NonNull
        public static DartEntrypoint createDefault() {
            FlutterLoader flutterLoader = C1978b.a().f18847a;
            if (flutterLoader.initialized()) {
                return new DartEntrypoint(flutterLoader.findAppBundlePath(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DartEntrypoint dartEntrypoint = (DartEntrypoint) obj;
            if (this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
                return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
            }
            return false;
        }

        public int hashCode() {
            return this.dartEntrypointFunctionName.hashCode() + (this.pathToBundle.hashCode() * 31);
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DartEntrypoint( bundle path: ");
            sb2.append(this.pathToBundle);
            sb2.append(", function: ");
            return s.p(sb2, this.dartEntrypointFunctionName, " )");
        }

        public DartEntrypoint(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = str2;
            this.dartEntrypointFunctionName = str3;
        }
    }
}
