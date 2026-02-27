package io.flutter.embedding.android;

import androidx.annotation.CallSuper;
import com.google.android.play.core.splitcompat.SplitCompatApplication;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.C1978b;
import og.ThreadFactoryC1977a;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterPlayStoreSplitApplication extends SplitCompatApplication {
    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void onCreate() {
        super.onCreate();
        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = new PlayStoreDeferredComponentManager(this, null);
        FlutterJNI.Factory factory = new FlutterJNI.Factory();
        ThreadFactoryC1977a threadFactoryC1977a = new ThreadFactoryC1977a();
        threadFactoryC1977a.f18846a = 0;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC1977a);
        FlutterLoader flutterLoader = new FlutterLoader(factory.provideFlutterJNI(), executorServiceNewCachedThreadPool);
        C1978b c1978b = new C1978b();
        c1978b.f18847a = flutterLoader;
        c1978b.f18848b = playStoreDeferredComponentManager;
        c1978b.c = factory;
        c1978b.f18849d = executorServiceNewCachedThreadPool;
        if (C1978b.f) {
            throw new IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
        }
        C1978b.e = c1978b;
    }
}
