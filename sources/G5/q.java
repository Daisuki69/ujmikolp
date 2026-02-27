package G5;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements FragmentResultListener, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i f1762a;

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        kotlin.jvm.internal.j.g(str, "<unused var>");
        kotlin.jvm.internal.j.g(bundle, "bundle");
        this.f1762a.invoke(Boolean.valueOf(bundle.getBoolean("fragment.result.key")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    @Override // Ch.a
    public void run() {
        this.f1762a.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q(Function1 function1) {
        this.f1762a = (kotlin.jvm.internal.i) function1;
    }
}
