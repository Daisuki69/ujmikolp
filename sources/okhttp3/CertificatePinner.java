package okhttp3;

import androidx.webkit.ProxyConfig;
import cj.C1110A;
import cj.C1112C;
import cj.C1129o;
import cj.t;
import com.dynatrace.android.agent.Global;
import defpackage.AbstractC1414e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            j.g(pattern, "pattern");
            j.g(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(C1110A.Z(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String pin(Certificate certificate) {
            j.g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            j.g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j.f(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            j.g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            j.f(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            j.g(pattern, "pattern");
            j.g(pin, "pin");
            if ((!z.w(pattern, 2, "*.", false) || C2576A.F(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 1, false, 4) != -1) && ((!z.w(pattern, 2, "**.", false) || C2576A.F(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 2, false, 4) != -1) && C2576A.F(pattern, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            this.pattern = canonicalHost;
            if (z.w(pin, 2, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                ByteString.Companion companion = ByteString.Companion;
                String strSubstring = pin.substring(5);
                j.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                ByteString byteStringDecodeBase64 = companion.decodeBase64(strSubstring);
                if (byteStringDecodeBase64 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                }
                this.hash = byteStringDecodeBase64;
                return;
            }
            if (!z.w(pin, 2, "sha256/", false)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.Companion;
            String strSubstring2 = pin.substring(7);
            j.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            ByteString byteStringDecodeBase642 = companion2.decodeBase64(strSubstring2);
            if (byteStringDecodeBase642 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.hash = byteStringDecodeBase642;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return j.b(this.pattern, pin.pattern) && j.b(this.hashAlgorithm, pin.hashAlgorithm) && j.b(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + AbstractC1414e.c(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            j.g(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (j.b(str, "sha256")) {
                return j.b(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (j.b(str, "sha1")) {
                return j.b(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean matchesHostname(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.j.g(r12, r0)
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                boolean r0 = zj.z.w(r0, r3, r1, r2)
                r1 = 46
                r4 = 1
                if (r0 == 0) goto L3c
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r10 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r10
                int r3 = r12.length()
                int r6 = r3 - r10
                java.lang.String r8 = r11.pattern
                r7 = 0
                r9 = 3
                r5 = r12
                boolean r12 = zj.z.q(r5, r6, r7, r8, r9, r10)
                if (r12 == 0) goto L6e
                if (r0 == 0) goto L6d
                int r0 = r0 - r4
                char r12 = r5.charAt(r0)
                if (r12 != r1) goto L6e
                goto L6d
            L3c:
                r5 = r12
                java.lang.String r12 = r11.pattern
                java.lang.String r0 = "*."
                boolean r12 = zj.z.w(r12, r3, r0, r2)
                if (r12 == 0) goto L6f
                java.lang.String r12 = r11.pattern
                int r12 = r12.length()
                int r10 = r12 + (-1)
                int r12 = r5.length()
                int r12 = r12 - r10
                int r0 = r5.length()
                int r6 = r0 - r10
                java.lang.String r8 = r11.pattern
                r7 = 0
                r9 = 1
                boolean r0 = zj.z.q(r5, r6, r7, r8, r9, r10)
                if (r0 == 0) goto L6e
                int r12 = r12 - r4
                r0 = 4
                int r12 = zj.C2576A.I(r5, r1, r12, r0)
                r0 = -1
                if (r12 != r0) goto L6e
            L6d:
                return r4
            L6e:
                return r2
            L6f:
                java.lang.String r12 = r11.pattern
                boolean r12 = r5.equals(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<List<? extends X509Certificate>> {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            List<Certificate> list = listClean;
            ArrayList arrayList = new ArrayList(t.l(list, 10));
            for (Certificate certificate : list) {
                j.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        j.g(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        j.g(hostname, "hostname");
        j.g(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new AnonymousClass1(peerCertificates, hostname));
    }

    public final void check$okhttp(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        j.g(hostname, "hostname");
        j.g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (j.b(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (j.b(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!j.b(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (j.b(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(Companion.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(Global.COLON);
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        String string = sb2.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return j.b(certificatePinner.pins, this.pins) && j.b(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String hostname) {
        j.g(hostname, "hostname");
        Set<Pin> set = this.pins;
        List arrayList = C1112C.f9377a;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                D.b(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        j.g(certificateChainCleaner, "certificateChainCleaner");
        return j.b(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        j.g(hostname, "hostname");
        j.g(peerCertificates, "peerCertificates");
        check(hostname, C1129o.z(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
