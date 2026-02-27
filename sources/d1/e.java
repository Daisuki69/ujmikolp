package d1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y.e f16250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16251b;
    public final HashMap c;

    public e(Context context, d dVar) {
        Y.e eVar = new Y.e(context, 26);
        this.c = new HashMap();
        this.f16250a = eVar;
        this.f16251b = dVar;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryG = this.f16250a.g(str);
        if (cctBackendFactoryG == null) {
            return null;
        }
        d dVar = this.f16251b;
        f fVarCreate = cctBackendFactoryG.create(new b(dVar.f16248a, dVar.f16249b, dVar.c, str));
        this.c.put(str, fVarCreate);
        return fVarCreate;
    }
}
