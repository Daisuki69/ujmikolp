package We;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import dOYHB6.tiZVw8.numX49;
import okio.Okio;

/* JADX INFO: renamed from: We.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0599c extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6383b = new Object();
    public AssetManager c;

    public C0599c(Context context) {
        this.f6382a = context;
    }

    @Override // We.H
    public final boolean b(F f) {
        Uri uri = f.f6354a;
        if (numX49.tnTj78("bkRu").equals(uri.getScheme()) && !uri.getPathSegments().isEmpty()) {
            if (numX49.tnTj78("bkRV").equals(uri.getPathSegments().get(0))) {
                return true;
            }
        }
        return false;
    }

    @Override // We.H
    public final Q3.b e(F f, int i) {
        if (this.c == null) {
            synchronized (this.f6383b) {
                try {
                    if (this.c == null) {
                        this.c = this.f6382a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new Q3.b(Okio.source(this.c.open(f.f6354a.toString().substring(22))), 2);
    }
}
