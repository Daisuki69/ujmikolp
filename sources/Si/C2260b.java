package si;

import com.google.gson.JsonSyntaxException;
import dOYHB6.tiZVw8.numX49;
import io.split.android.client.dtos.AllSegmentsChange;
import io.split.android.client.service.http.HttpResponseParserException;
import mi.InterfaceC1867b;

/* JADX INFO: renamed from: si.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2260b implements InterfaceC1867b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2260b f20119a = new C2260b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2260b f20120b = new C2260b();

    @Override // mi.InterfaceC1867b
    public Object d(String str) throws HttpResponseParserException {
        try {
            return (AllSegmentsChange) io.split.android.client.utils.b.f17635a.e(str, AllSegmentsChange.class);
        } catch (JsonSyntaxException e) {
            throw new HttpResponseParserException(numX49.tnTj78("bFAH") + e.getLocalizedMessage());
        } catch (Exception e7) {
            throw new HttpResponseParserException(numX49.tnTj78("bFAF") + e7.getLocalizedMessage());
        }
    }
}
