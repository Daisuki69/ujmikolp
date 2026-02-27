package ng;

import android.content.Context;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.Map;
import pg.C2037D;
import pg.j;

/* JADX INFO: renamed from: ng.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948c extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18734a;

    public C1948c(j jVar) {
        super(C2037D.INSTANCE);
        this.f18734a = jVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final k create(Context context, int i, Object obj) {
        return new C1946a(context, this.f18734a, i, (Map) obj);
    }
}
