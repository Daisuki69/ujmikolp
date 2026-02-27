package G5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentResultListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements FragmentResultListener, b2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1761a;

    public /* synthetic */ p(Object obj) {
        this.f1761a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        kotlin.jvm.internal.j.g(str, "<unused var>");
        kotlin.jvm.internal.j.g(bundle, "bundle");
        Parcelable parcelable = bundle.getParcelable("fragment.result.key");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1761a.invoke(parcelable);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        return this.f1761a;
    }
}
