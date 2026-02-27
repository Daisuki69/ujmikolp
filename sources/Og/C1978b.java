package og;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: og.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1978b {
    public static C1978b e;
    public static boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlutterLoader f18847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayStoreDeferredComponentManager f18848b;
    public FlutterJNI.Factory c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExecutorService f18849d;

    public static C1978b a() {
        f = true;
        if (e == null) {
            FlutterJNI.Factory factory = new FlutterJNI.Factory();
            ThreadFactoryC1977a threadFactoryC1977a = new ThreadFactoryC1977a();
            threadFactoryC1977a.f18846a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC1977a);
            FlutterLoader flutterLoader = new FlutterLoader(factory.provideFlutterJNI(), executorServiceNewCachedThreadPool);
            C1978b c1978b = new C1978b();
            c1978b.f18847a = flutterLoader;
            c1978b.f18848b = null;
            c1978b.c = factory;
            c1978b.f18849d = executorServiceNewCachedThreadPool;
            e = c1978b;
        }
        return e;
    }
}
