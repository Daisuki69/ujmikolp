package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f17164b;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue, int i) {
        this.f17163a = i;
        this.f17164b = serialTaskQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17163a) {
            case 0:
                this.f17164b.lambda$dispatch$0();
                break;
            default:
                this.f17164b.lambda$flush$1();
                break;
        }
    }
}
