package Cj;

import Bj.G0;
import Bj.W;
import androidx.datastore.core.MulticastFileObserver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f788b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f787a = i;
        this.f788b = obj;
        this.c = obj2;
    }

    @Override // Bj.W
    public final void dispose() {
        switch (this.f787a) {
            case 0:
                ((d) this.f788b).f789a.removeCallbacks((G0) this.c);
                break;
            default:
                MulticastFileObserver.Companion.observe$lambda$4((String) this.f788b, (Function1) this.c);
                break;
        }
    }
}
