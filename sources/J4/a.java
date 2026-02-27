package J4;

import java.util.Arrays;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2411b;
    public final String c;

    public a(byte[] bArr, String str, byte[] bArr2) {
        this.f2410a = bArr;
        this.f2411b = bArr2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type com.maya.raven.cryptography.RavenCryptography.EncryptionResult");
        a aVar = (a) obj;
        return Arrays.equals(this.f2410a, aVar.f2410a) && Arrays.equals(this.f2411b, aVar.f2411b) && j.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Arrays.hashCode(this.f2411b) + (Arrays.hashCode(this.f2410a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionResult(encryptedData=");
        sb2.append(Arrays.toString(this.f2410a));
        sb2.append(", nonce=");
        sb2.append(Arrays.toString(this.f2411b));
        sb2.append(", ephemeralPublicKey=");
        return androidx.camera.core.impl.a.n(sb2, this.c, ')');
    }
}
