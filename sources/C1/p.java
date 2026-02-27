package c1;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    public final i a(Z0.e eVar) {
        i iVar = (i) this;
        String str = iVar.f9230a;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        if (eVar != null) {
            return new i(str, iVar.f9231b, eVar);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        i iVar = (i) this;
        byte[] bArr = iVar.f9231b;
        return "TransportContext(" + iVar.f9230a + ", " + iVar.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
