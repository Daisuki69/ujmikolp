package D;

import c0.C1053a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.paymaya.domain.store.C1250b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC0173f {
    public WeakReference c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f936d;
    public C1250b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CleverTapInstanceConfig f937g;
    public final H h;
    public C0176i i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1053a f939l;
    public final ArrayList e = new ArrayList();
    public final List j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f938k = Collections.synchronizedList(new ArrayList());

    public r(CleverTapInstanceConfig cleverTapInstanceConfig, H h) {
        this.f937g = cleverTapInstanceConfig;
        this.h = h;
    }
}
