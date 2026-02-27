package Ff;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.KeyTransRecipientId;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {
    public e() {
    }

    public static void i(StringBuilder sb2, KeyTransRecipientId keyTransRecipientId, X509Certificate x509Certificate, X509CertificateHolder x509CertificateHolder) {
        BigInteger serialNumber = keyTransRecipientId.getSerialNumber();
        if (serialNumber != null) {
            BigInteger serialNumber2 = x509Certificate.getSerialNumber();
            String string = serialNumber2 != null ? serialNumber2.toString(16) : "unknown";
            sb2.append("serial-#: rid ");
            sb2.append(serialNumber.toString(16));
            sb2.append(" vs. cert ");
            sb2.append(string);
            sb2.append(" issuer: rid '");
            sb2.append(keyTransRecipientId.getIssuer());
            sb2.append("' vs. cert '");
            sb2.append((Object) (x509CertificateHolder == null ? "null" : x509CertificateHolder.getIssuer()));
            sb2.append("' ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // Ff.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(Ff.b r21, yf.C2531a r22, E1.c r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ff.e.h(Ff.b, yf.a, E1.c):void");
    }

    public e(d dVar) {
        throw null;
    }
}
