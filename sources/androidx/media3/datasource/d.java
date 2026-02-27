package androidx.media3.datasource;

import N1.j;
import androidx.media3.datasource.DefaultHttpDataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7915a;

    public /* synthetic */ d(int i) {
        this.f7915a = i;
    }

    @Override // N1.j
    public final boolean apply(Object obj) {
        switch (this.f7915a) {
            case 0:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
            case 1:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
            default:
                return e.a((String) obj);
        }
    }
}
