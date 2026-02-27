package df;

import com.dynatrace.android.agent.Global;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import k2.v0;
import of.C1976a;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static final r c = new r(new LinkedHashSet(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f16472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X5.f f16473b;

    public r(LinkedHashSet linkedHashSet, X5.f fVar) {
        this.f16472a = linkedHashSet;
        this.f16473b = fVar;
    }

    public static String a(X509Certificate x509Certificate) {
        if (!AbstractC1414e.u(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb2 = new StringBuilder("sha256/");
        try {
            C1976a c1976aG = C1976a.g(MessageDigest.getInstance("SHA-256").digest(C1976a.g(x509Certificate.getPublicKey().getEncoded()).f18814a));
            byte[] bArr = v0.e;
            byte[] bArr2 = c1976aG.f18814a;
            byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
            int length = bArr2.length - (bArr2.length % 3);
            int i = 0;
            for (int i4 = 0; i4 < length; i4 += 3) {
                bArr3[i] = bArr[(bArr2[i4] & 255) >> 2];
                int i6 = i4 + 1;
                bArr3[i + 1] = bArr[((bArr2[i4] & 3) << 4) | ((bArr2[i6] & 255) >> 4)];
                int i10 = i + 3;
                int i11 = (bArr2[i6] & 15) << 2;
                int i12 = i4 + 2;
                bArr3[i + 2] = bArr[i11 | ((bArr2[i12] & 255) >> 6)];
                i += 4;
                bArr3[i10] = bArr[bArr2[i12] & Utf8.REPLACEMENT_BYTE];
            }
            int length2 = bArr2.length % 3;
            if (length2 == 1) {
                bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
                bArr3[i + 1] = bArr[(bArr2[length] & 3) << 4];
                bArr3[i + 2] = 61;
                bArr3[i + 3] = 61;
            } else if (length2 == 2) {
                bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
                int i13 = (bArr2[length] & 3) << 4;
                int i14 = length + 1;
                bArr3[i + 1] = bArr[((bArr2[i14] & 255) >> 4) | i13];
                bArr3[i + 2] = bArr[(bArr2[i14] & 15) << 2];
                bArr3[i + 3] = 61;
            }
            try {
                sb2.append(new String(bArr3, "US-ASCII"));
                return sb2.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void b(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f16472a.iterator();
        if (it.hasNext()) {
            throw AbstractC1331a.n(it);
        }
        if (list2.isEmpty()) {
            return;
        }
        X5.f fVar = this.f16473b;
        if (fVar != null) {
            list = fVar.d(str, list);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i4);
            sb2.append("\n    ");
            sb2.append(a(x509Certificate));
            sb2.append(": ");
            sb2.append(x509Certificate.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(Global.COLON);
        int size3 = list2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            if (list2.get(i6) != null) {
                throw new ClassCastException();
            }
            sb2.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f16473b, rVar.f16473b) && this.f16472a.equals(rVar.f16472a);
    }

    public final int hashCode() {
        return this.f16472a.hashCode() + (Objects.hashCode(this.f16473b) * 31);
    }
}
