package h2;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16874b;

    public k(l lVar, long j) {
        this.f16874b = lVar;
        this.f16873a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.FATAL, 1);
        bundle.putLong("timestamp", this.f16873a);
        this.f16874b.f16881k.h(bundle);
        return null;
    }
}
