package Ja;

import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.store.C1257f;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z0;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2509a implements Ia.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2506d;
    public final Z0 e;
    public final Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1257f f2507g;
    public TransferAppLink h;

    public g(com.paymaya.data.preference.a mPreference, Z0 z02, Y y7, C1257f c1257f) {
        j.g(mPreference, "mPreference");
        this.f2506d = mPreference;
        this.e = z02;
        this.f = y7;
        this.f2507g = c1257f;
    }
}
