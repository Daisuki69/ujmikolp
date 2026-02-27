package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f17166b;
    public final /* synthetic */ Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f17167d;
    public final /* synthetic */ Handler e;
    public final /* synthetic */ Runnable f;

    public /* synthetic */ a(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable, int i) {
        this.f17165a = i;
        this.f17166b = flutterLoader;
        this.c = context;
        this.f17167d = strArr;
        this.e = handler;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17165a) {
            case 0:
                this.f17166b.lambda$ensureInitializationCompleteAsync$1(this.c, this.f17167d, this.e, this.f);
                break;
            default:
                this.f17166b.lambda$ensureInitializationCompleteAsync$0(this.c, this.f17167d, this.e, this.f);
                break;
        }
    }
}
