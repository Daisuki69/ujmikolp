package com.shield.android.h;

import com.shield.android.i.c;
import com.shield.android.j.a;
import com.shield.android.j.c;
import com.shield.android.j.f;
import com.shield.android.j.h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final Map<Integer, String> jU;
    private final File jV;
    private final com.shield.android.u.b jW;
    private final File jX;
    private final Integer jY;
    private final int jZ;

    public static class a {
        private static Map<Integer, c> ka;

        static {
            HashMap map = new HashMap();
            ka = map;
            map.put(1, c.kL);
            ka.put(2, c.kV);
            ka.put(3, c.kM);
            ka.put(4, c.kP);
            ka.put(5, c.la);
            ka.put(6, c.kO);
            ka.put(7, c.f15378lc);
            ka.put(8, c.kQ);
            ka.put(9, c.f15381lg);
            ka.put(10, c.ln);
            ka.put(11, c.f15382lh);
            ka.put(12, c.f15385lk);
            ka.put(13, c.lw);
            ka.put(14, c.f15384lj);
            ka.put(15, c.ly);
            ka.put(16, c.ll);
            ka.put(17, c.mn);
            ka.put(18, c.f15394mi);
            ka.put(19, c.f15396mk);
            ka.put(20, c.f15395mj);
            ka.put(21, c.mm);
            ka.put(22, c.ml);
            ka.put(23, c.mr);
            ka.put(24, c.mq);
            ka.put(25, c.f15392mg);
            ka.put(26, c.mo);
            ka.put(27, c.mp);
            ka.put(28, c.my);
            ka.put(29, c.mz);
            ka.put(30, c.f15393mh);
            ka.put(31, c.ms);
            ka.put(32, c.mt);
            ka.put(33, c.mu);
            ka.put(34, c.mv);
            ka.put(35, c.mw);
            ka.put(36, c.f15369kd);
            ka.put(37, c.ky);
            ka.put(38, c.mx);
        }

        public static List<d> e(List<? extends com.shield.android.p.a> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (com.shield.android.p.a aVar : list) {
                if (aVar instanceof d) {
                    arrayList.add((d) aVar);
                } else {
                    arrayList.add(new d(ka.get(Integer.valueOf(aVar.dP())), aVar.cF()));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.h.b$b, reason: collision with other inner class name */
    public static class C0066b {
        private File jX;
        private Integer jY;

        /* JADX INFO: renamed from: kb, reason: collision with root package name */
        private final File f15367kb;
        private int jZ = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: kc, reason: collision with root package name */
        private final com.shield.android.u.b f15368kc = null;

        public C0066b(File file) {
            this.f15367kb = file;
        }

        public final b cE() {
            return new b(this.f15367kb, this.f15368kc, this.jX, this.jY, this.jZ, (byte) 0);
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c {
        private final String mA;

        /* JADX INFO: renamed from: kd, reason: collision with root package name */
        public static final c f15369kd = new c("JAR_SIG_NO_SIGNATURES", 0, "No JAR signatures");

        /* JADX INFO: renamed from: ke, reason: collision with root package name */
        private static c f15370ke = new c("JAR_SIG_MAX_SIGNATURES_EXCEEDED", 1, "APK Signature Scheme v1 only supports a maximum of %1$d signers, found %2$d");

        /* JADX INFO: renamed from: kf, reason: collision with root package name */
        private static c f15371kf = new c("JAR_SIG_NO_SIGNED_ZIP_ENTRIES", 2, "No JAR entries covered by JAR signatures");

        /* JADX INFO: renamed from: kg, reason: collision with root package name */
        private static c f15372kg = new c("JAR_SIG_DUPLICATE_ZIP_ENTRY", 3, "Duplicate entry: %1$s");

        /* JADX INFO: renamed from: kh, reason: collision with root package name */
        private static c f15373kh = new c("JAR_SIG_DUPLICATE_MANIFEST_SECTION", 4, "Duplicate section in META-INF/MANIFEST.MF: %1$s");

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private static c f15374ki = new c("JAR_SIG_UNNNAMED_MANIFEST_SECTION", 5, "Malformed META-INF/MANIFEST.MF: invidual section #%1$d does not have a name");

        /* JADX INFO: renamed from: kj, reason: collision with root package name */
        private static c f15375kj = new c("JAR_SIG_UNNNAMED_SIG_FILE_SECTION", 6, "Malformed %1$s: invidual section #%2$d does not have a name");

        /* JADX INFO: renamed from: kk, reason: collision with root package name */
        private static c f15376kk = new c("JAR_SIG_NO_MANIFEST", 7, "Missing META-INF/MANIFEST.MF");
        private static c kl = new c("JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST", 8, "%1$s entry referenced by META-INF/MANIFEST.MF not found in the APK");
        private static c km = new c("JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST", 9, "No digest for %1$s in META-INF/MANIFEST.MF");
        private static c kn = new c("JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE", 10, "No digest for %1$s in %2$s");
        private static c ko = new c("JAR_SIG_ZIP_ENTRY_NOT_SIGNED", 11, "%1$s entry not signed");
        private static c kp = new c("JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH", 12, "Entries %1$s and %3$s are signed with different sets of signers : <%2$s> vs <%4$s>");
        private static c kq = new c("JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY", 13, "%2$s digest of %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>");
        private static c kr = new c("JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY", 14, "%1$s digest of META-INF/MANIFEST.MF main section does not match the digest specified in %2$s. Expected: <%4$s>, actual: <%3$s>");
        private static c ks = new c("JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY", 15, "%2$s digest of META-INF/MANIFEST.MF section for %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>");
        private static c kt = new c("JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE", 16, "%1$s does not specify digest of META-INF/MANIFEST.MF. This slows down verification.");
        private static c ku = new c("JAR_SIG_NO_APK_SIG_STRIP_PROTECTION", 17, "APK is signed using APK Signature Scheme v2 but these signatures may be stripped without being detected because %1$s does not contain anti-stripping protections.");
        private static c kv = new c("JAR_SIG_MISSING_FILE", 18, "Partial JAR signature. Found: %1$s, missing: %2$s");
        private static c kw = new c("JAR_SIG_VERIFY_EXCEPTION", 19, "Failed to verify JAR signature %1$s against %2$s: %3$s");
        private static c kx = new c("JAR_SIG_UNSUPPORTED_SIG_ALG", 20, "JAR signature %1$s uses digest algorithm %5$s and signature algorithm %6$s which is not supported on API Level(s) %4$s for which this APK is being verified");
        public static final c ky = new c("JAR_SIG_PARSE_EXCEPTION", 21, "Failed to parse JAR signature %1$s: %2$s");
        private static c kz = new c("JAR_SIG_MALFORMED_CERTIFICATE", 22, "Malformed certificate in JAR signature %1$s: %2$s");
        private static c kA = new c("JAR_SIG_DID_NOT_VERIFY", 23, "JAR signature %1$s did not verify against %2$s");
        private static c kB = new c("JAR_SIG_NO_SIGNERS", 24, "JAR signature %1$s contains no signers");
        private static c kC = new c("JAR_SIG_DUPLICATE_SIG_FILE_SECTION", 25, "Duplicate section in %1$s: %2$s");
        private static c kD = new c("JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE", 26, "Malformed %1$s: missing Signature-Version attribute");
        private static c kE = new c("JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID", 27, "JAR signature %1$s references unknown APK signature scheme ID: %2$d");
        private static c kF = new c("JAR_SIG_MISSING_APK_SIG_REFERENCED", 28, "JAR signature %1$s indicates the APK is signed using %3$s but no such signature was found. Signature stripped?");
        private static c kG = new c("JAR_SIG_UNPROTECTED_ZIP_ENTRY", 29, "%1$s not protected by signature. Unauthorized modifications to this JAR entry will not be detected. Delete or move the entry outside of META-INF/.");
        public static final c kH = new c("JAR_SIG_MISSING", 30, "No JAR signature from this signer");
        public static final c kI = new c("NO_SIG_FOR_TARGET_SANDBOX_VERSION", 31, "Missing APK Signature Scheme v2 signature required for target sandbox version %1$d");
        public static final c kJ = new c("MIN_SIG_SCHEME_FOR_TARGET_SDK_NOT_MET", 32, "Target SDK version %1$d requires a minimum of signature scheme v%2$d; the APK is not signed with this or a later signature scheme");
        public static final c kK = new c("V2_SIG_MISSING", 33, "No APK Signature Scheme v2 signature from this signer");
        public static final c kL = new c("V2_SIG_MALFORMED_SIGNERS", 34, "Malformed list of signers");
        public static final c kM = new c("V2_SIG_MALFORMED_SIGNER", 35, "Malformed signer block");
        public static final c kN = new c("V2_SIG_MALFORMED_PUBLIC_KEY", 36, "Malformed public key: %1$s");
        public static final c kO = new c("V2_SIG_MALFORMED_CERTIFICATE", 37, "Malformed certificate #%2$d: %3$s");
        public static final c kP = new c("V2_SIG_MALFORMED_SIGNATURE", 38, "Malformed APK Signature Scheme v2 signature record #%1$d");
        public static final c kQ = new c("V2_SIG_MALFORMED_DIGEST", 39, "Malformed APK Signature Scheme v2 digest record #%1$d");
        public static final c kR = new c("V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE", 40, "Malformed additional attribute #%1$d");
        public static final c kS = new c("V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID", 41, "APK Signature Scheme v2 signer: %1$s references unknown APK signature scheme ID: %2$d");
        public static final c kT = new c("V2_SIG_MISSING_APK_SIG_REFERENCED", 42, "APK Signature Scheme v2 signature %1$s indicates the APK is signed using %2$s but no such signature was found. Signature stripped?");
        public static final c kU = new c("V2_SIG_MAX_SIGNATURES_EXCEEDED", 43, "APK Signature Scheme V2 only supports a maximum of %1$d signers, found %2$d");
        public static final c kV = new c("V2_SIG_NO_SIGNERS", 44, "No signers in APK Signature Scheme v2 signature");
        public static final c kW = new c("V2_SIG_UNKNOWN_SIG_ALGORITHM", 45, "Unknown signature algorithm: %1$#x");
        public static final c kX = new c("V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE", 46, "Unknown additional attribute: ID %1$#x");
        public static final c kY = new c("V2_SIG_VERIFY_EXCEPTION", 47, "Failed to verify %1$s signature: %2$s");
        public static final c kZ = new c("V2_SIG_DID_NOT_VERIFY", 48, "%1$s signature over signed-data did not verify");
        public static final c la = new c("V2_SIG_NO_SIGNATURES", 49, "No signatures");

        /* JADX INFO: renamed from: lb, reason: collision with root package name */
        public static final c f15377lb = new c("V2_SIG_NO_SUPPORTED_SIGNATURES", 50, "No supported signatures: %1$s");

        /* JADX INFO: renamed from: lc, reason: collision with root package name */
        public static final c f15378lc = new c("V2_SIG_NO_CERTIFICATES", 51, "No certificates");
        public static final c ld = new c("V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 52, "Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>");

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public static final c f15379le = new c("V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS", 53, "Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s");

        /* JADX INFO: renamed from: lf, reason: collision with root package name */
        public static final c f15380lf = new c("V2_SIG_APK_DIGEST_DID_NOT_VERIFY", 54, "APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>");

        /* JADX INFO: renamed from: lg, reason: collision with root package name */
        public static final c f15381lg = new c("V3_SIG_MALFORMED_SIGNERS", 55, "Malformed list of signers");

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public static final c f15382lh = new c("V3_SIG_MALFORMED_SIGNER", 56, "Malformed signer block");

        /* JADX INFO: renamed from: li, reason: collision with root package name */
        public static final c f15383li = new c("V3_SIG_MALFORMED_PUBLIC_KEY", 57, "Malformed public key: %1$s");

        /* JADX INFO: renamed from: lj, reason: collision with root package name */
        public static final c f15384lj = new c("V3_SIG_MALFORMED_CERTIFICATE", 58, "Malformed certificate #%2$d: %3$s");

        /* JADX INFO: renamed from: lk, reason: collision with root package name */
        public static final c f15385lk = new c("V3_SIG_MALFORMED_SIGNATURE", 59, "Malformed APK Signature Scheme v3 signature record #%1$d");
        public static final c ll = new c("V3_SIG_MALFORMED_DIGEST", 60, "Malformed APK Signature Scheme v3 digest record #%1$d");
        public static final c lm = new c("V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE", 61, "Malformed additional attribute #%1$d");
        public static final c ln = new c("V3_SIG_NO_SIGNERS", 62, "No signers in APK Signature Scheme v3 signature");
        public static final c lo = new c("V3_SIG_MULTIPLE_SIGNERS", 63, "Multiple APK Signature Scheme v3 signatures found for a single  platform version.");
        public static final c lp = new c("V3_SIG_MULTIPLE_PAST_SIGNERS", 64, "Multiple signatures found for pre-v3 signing with an APK  Signature Scheme v3 signer.  Only one allowed.");
        public static final c lq = new c("V3_SIG_PAST_SIGNERS_MISMATCH", 65, "v3 signer differs from v1/v2 signer without proper signing certificate lineage.");
        public static final c lr = new c("V3_SIG_UNKNOWN_SIG_ALGORITHM", 66, "Unknown signature algorithm: %1$#x");
        public static final c ls = new c("V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE", 67, "Unknown additional attribute: ID %1$#x");
        public static final c lt = new c("V3_SIG_VERIFY_EXCEPTION", 68, "Failed to verify %1$s signature: %2$s");
        public static final c lu = new c("V3_SIG_INVALID_SDK_VERSIONS", 69, "Invalid SDK Version parameter(s) encountered in APK Signature scheme v3 signature: minSdkVersion %1$s maxSdkVersion: %2$s");
        public static final c lv = new c("V3_SIG_DID_NOT_VERIFY", 70, "%1$s signature over signed-data did not verify");
        public static final c lw = new c("V3_SIG_NO_SIGNATURES", 71, "No signatures");
        public static final c lx = new c("V3_SIG_NO_SUPPORTED_SIGNATURES", 72, "No supported signatures");
        public static final c ly = new c("V3_SIG_NO_CERTIFICATES", 73, "No certificates");
        public static final c lz = new c("V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD", 74, "minSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>");
        public static final c lA = new c("V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD", 75, "maxSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>");
        public static final c lB = new c("V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 76, "Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>");
        public static final c lC = new c("V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS", 77, "Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s");
        public static final c lD = new c("V3_SIG_APK_DIGEST_DID_NOT_VERIFY", 78, "APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>");
        public static final c lE = new c("V3_SIG_POR_DID_NOT_VERIFY", 79, "SigningCertificateLineage attribute containd a proof-of-rotation record with signature(s) that did not verify.");
        public static final c lF = new c("V3_SIG_MALFORMED_LINEAGE", 80, "Failed to parse the SigningCertificateLineage structure in the APK Signature Scheme v3 signature's additional attributes section.");
        public static final c lG = new c("V3_SIG_POR_CERT_MISMATCH", 81, "APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage.");
        public static final c lH = new c("V3_INCONSISTENT_SDK_VERSIONS", 82, "APK Signature Scheme v3 signers supported min/max SDK versions are not continuous.");
        public static final c lI = new c("V3_MISSING_SDK_VERSIONS", 83, "APK Signature Scheme v3 signers supported min/max SDK versions do not cover the entire desired range.  Found min:  %1$s max %2$s");
        public static final c lJ = new c("V3_INCONSISTENT_LINEAGES", 84, "SigningCertificateLineages targeting different platform versions using APK Signature Scheme v3 are not all a part of the same overall lineage.");
        public static final c lK = new c("V31_BLOCK_MISSING", 85, "The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but a v3.1 block was not found");
        public static final c lL = new c("V31_ROTATION_MIN_SDK_MISMATCH", 86, "The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but the v3.1 block targets %2$s for rotation");
        public static final c lM = new c("V31_ROTATION_MIN_SDK_ATTR_MISSING", 87, "APK supports key rotation starting from SDK version %1$s, but the v3 signer does not contain the attribute to detect if this signature is stripped");
        public static final c lN = new c("V31_BLOCK_FOUND_WITHOUT_V3_BLOCK", 88, "The APK contains a v3.1 signing block without a v3.0 base block");
        public static final c lO = new c("V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER", 89, "The rotation-targets-dev-release attribute is only supported on v3.1 signers; this attribute will be ignored by the platform in a v3.0 signer");
        private static c lP = new c("APK_SIG_BLOCK_UNKNOWN_ENTRY_ID", 90, "APK Signing Block contains unknown entry: ID %1$#x");
        private static c lQ = new c("V4_SIG_MALFORMED_SIGNERS", 91, "V4 signature has malformed signer block");
        public static final c lR = new c("V4_SIG_UNKNOWN_SIG_ALGORITHM", 92, "V4 signature has unknown signing algorithm: %1$#x");
        public static final c lS = new c("V4_SIG_NO_SIGNATURES", 93, "V4 signature has no signature found");
        private static c lT = new c("V4_SIG_NO_SUPPORTED_SIGNATURES", 94, "V4 signature has no supported signature");
        public static final c lU = new c("V4_SIG_DID_NOT_VERIFY", 95, "%1$s signature over signed-data did not verify");
        public static final c lV = new c("V4_SIG_VERIFY_EXCEPTION", 96, "Failed to verify %1$s signature: %2$s");
        public static final c lW = new c("V4_SIG_MALFORMED_PUBLIC_KEY", 97, "Malformed public key: %1$s");
        public static final c lX = new c("V4_SIG_MALFORMED_CERTIFICATE", 98, "V4 signature has malformed certificate");
        public static final c lY = new c("V4_SIG_NO_CERTIFICATE", 99, "V4 signature has no certificate");
        public static final c lZ = new c("V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD", 100, "V4 signature has mismatched certificate and signature: <%1$s> vs <%2$s>");

        /* JADX INFO: renamed from: ma, reason: collision with root package name */
        public static final c f15386ma = new c("V4_SIG_APK_ROOT_DID_NOT_VERIFY", 101, "V4 signature's hash tree root (content digest) did not verity");

        /* JADX INFO: renamed from: mb, reason: collision with root package name */
        public static final c f15387mb = new c("V4_SIG_APK_TREE_DID_NOT_VERIFY", 102, "V4 signature's hash tree did not verity");

        /* JADX INFO: renamed from: mc, reason: collision with root package name */
        public static final c f15388mc = new c("V4_SIG_MULTIPLE_SIGNERS", 103, "V4 signature only supports one signer");

        /* JADX INFO: renamed from: md, reason: collision with root package name */
        public static final c f15389md = new c("V4_SIG_V2_V3_SIGNERS_MISMATCH", 104, "V4 signature and V2/V3 signature have mismatched certificates");

        /* JADX INFO: renamed from: me, reason: collision with root package name */
        public static final c f15390me = new c("V4_SIG_V2_V3_DIGESTS_MISMATCH", 105, "V4 signature and V2/V3 signature have mismatched digests");

        /* JADX INFO: renamed from: mf, reason: collision with root package name */
        public static final c f15391mf = new c("V4_SIG_VERSION_NOT_CURRENT", 106, "V4 signature format version %1$d is different from the tool's current version %2$d");

        /* JADX INFO: renamed from: mg, reason: collision with root package name */
        public static final c f15392mg = new c("SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING", 107, "Neither the source stamp certificate digest file nor the signature block are present in the APK");

        /* JADX INFO: renamed from: mh, reason: collision with root package name */
        public static final c f15393mh = new c("SOURCE_STAMP_SIG_MISSING", 108, "No SourceStamp signature");

        /* JADX INFO: renamed from: mi, reason: collision with root package name */
        public static final c f15394mi = new c("SOURCE_STAMP_MALFORMED_CERTIFICATE", 109, "Malformed certificate: %1$s");

        /* JADX INFO: renamed from: mj, reason: collision with root package name */
        public static final c f15395mj = new c("SOURCE_STAMP_MALFORMED_SIGNATURE", 110, "Malformed SourceStamp signature");

        /* JADX INFO: renamed from: mk, reason: collision with root package name */
        public static final c f15396mk = new c("SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM", 111, "Unknown signature algorithm: %1$#x");
        public static final c ml = new c("SOURCE_STAMP_VERIFY_EXCEPTION", 112, "Failed to verify %1$s signature: %2$s");
        public static final c mm = new c("SOURCE_STAMP_DID_NOT_VERIFY", 113, "%1$s signature over signed-data did not verify");
        public static final c mn = new c("SOURCE_STAMP_NO_SIGNATURE", 114, "No signature");
        public static final c mo = new c("SOURCE_STAMP_NO_SUPPORTED_SIGNATURE", 115, "Signature(s) {%1$s} not supported: %2$s");
        public static final c mp = new c("SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK", 116, "Certificate mismatch between SourceStamp block in APK signing block and SourceStamp file in APK: <%1$s> vs <%2$s>");
        public static final c mq = new c("SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST", 117, "A source stamp signature block was found without a corresponding certificate digest in the APK");
        public static final c mr = new c("SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH", 118, "The source stamp certificate digest in the APK, %1$s, does not match the expected digest, %2$s");
        public static final c ms = new c("SOURCE_STAMP_MALFORMED_ATTRIBUTE", 119, "Malformed stamp attribute #%1$d");
        public static final c mt = new c("SOURCE_STAMP_UNKNOWN_ATTRIBUTE", 120, "Unknown stamp attribute: ID %1$#x");
        public static final c mu = new c("SOURCE_STAMP_MALFORMED_LINEAGE", 121, "Failed to parse the SigningCertificateLineage structure in the source stamp attributes section.");
        public static final c mv = new c("SOURCE_STAMP_POR_CERT_MISMATCH", 122, "APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage.");
        public static final c mw = new c("SOURCE_STAMP_POR_DID_NOT_VERIFY", 123, "Source stamp SigningCertificateLineage attribute contains a proof-of-rotation record with signature(s) that did not verify.");
        public static final c mx = new c("SOURCE_STAMP_INVALID_TIMESTAMP", 124, "The source stamp timestamp attribute has an invalid value: %1$d");
        public static final c my = new c("MALFORMED_APK", 125, "Malformed APK; the following exception was caught when attempting to parse the APK: %1$s");
        public static final c mz = new c("UNEXPECTED_EXCEPTION", 126, "An unexpected exception was caught when verifying the signature: %1$s");

        private c(String str, int i, String str2) {
            this.mA = str2;
        }
    }

    public static class d extends com.shield.android.p.a {
        private final c mB;
        private final Object[] mC;

        public d(c cVar, Object[] objArr) {
            super(cVar.mA, objArr);
            this.mB = cVar;
            this.mC = objArr;
        }

        @Override // com.shield.android.p.a
        public final Object[] cF() {
            return (Object[]) this.mC.clone();
        }

        @Override // com.shield.android.p.a
        public final String toString() {
            return String.format(this.mB.mA, this.mC);
        }
    }

    public static class e {
        private final List<d> mD = new ArrayList();
        private final List<d> mE = new ArrayList();
        private final List<X509Certificate> mF = new ArrayList();
        private final List<C0068b> mG = new ArrayList();
        private final List<c> mH;
        private final List<d> mI;
        private final List<d> mJ;
        private final List<C0069e> mK;
        private a mL;
        private boolean mM;
        private boolean mN;
        private boolean mO;
        private boolean mP;
        private com.shield.android.h.c mQ;

        public static class a {
            private final List<d> mR;
            private final List<d> mS;

            /* JADX WARN: $VALUES field not found */
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX INFO: renamed from: com.shield.android.h.b$e$a$a, reason: collision with other inner class name */
            public static final class EnumC0067a {
                public static final EnumC0067a mT = new EnumC0067a("STAMP_VERIFIED", 0);
                public static final EnumC0067a mU = new EnumC0067a("STAMP_VERIFICATION_FAILED", 1);
                private static EnumC0067a mV = new EnumC0067a("CERT_DIGEST_MISMATCH", 2);
                private static EnumC0067a mW = new EnumC0067a("STAMP_MISSING", 3);
                private static EnumC0067a mX = new EnumC0067a("STAMP_NOT_VERIFIED", 4);
                private static EnumC0067a mY = new EnumC0067a("VERIFICATION_ERROR", 5);

                private EnumC0067a(String str, int i) {
                }
            }

            public /* synthetic */ a(com.shield.android.j.b bVar, byte b8) {
                this(bVar);
            }

            public final boolean cQ() {
                return !this.mR.isEmpty();
            }

            private a(com.shield.android.j.b bVar) {
                List<d> listE = a.e(bVar.dm());
                this.mR = listE;
                List<d> listE2 = a.e(bVar.dn());
                this.mS = listE2;
                a.e(bVar.dv());
                if (listE.isEmpty() && listE2.isEmpty()) {
                    EnumC0067a enumC0067a = EnumC0067a.mT;
                } else {
                    EnumC0067a enumC0067a2 = EnumC0067a.mT;
                }
            }
        }

        /* JADX INFO: renamed from: com.shield.android.h.b$e$b, reason: collision with other inner class name */
        public static class C0068b {
        }

        public static class c {
            private final int mZ;

            /* JADX INFO: renamed from: na, reason: collision with root package name */
            private final List<X509Certificate> f15397na;
            private final List<d> nb;
            private final List<d> nc;

            /* JADX INFO: renamed from: nd, reason: collision with root package name */
            private final List<c.e.a.b> f15398nd;

            public /* synthetic */ c(c.e.a aVar, byte b8) {
                this(aVar);
            }

            public final X509Certificate cR() {
                if (this.f15397na.isEmpty()) {
                    return null;
                }
                return this.f15397na.get(0);
            }

            public final boolean cS() {
                return !this.nb.isEmpty();
            }

            public final List<c.e.a.b> cT() {
                return this.f15398nd;
            }

            private c(c.e.a aVar) {
                this.mZ = aVar.ob;
                this.f15397na = aVar.f15435od;
                this.nb = aVar.dm();
                this.nc = aVar.dn();
                this.f15398nd = aVar.oB;
            }
        }

        public static class d {
            private final List<X509Certificate> ne;

            /* JADX INFO: renamed from: nf, reason: collision with root package name */
            private final List<d> f15399nf;

            /* JADX INFO: renamed from: ng, reason: collision with root package name */
            private final List<d> f15400ng;

            /* JADX INFO: renamed from: nh, reason: collision with root package name */
            private final List<c.e.a.b> f15401nh;

            public /* synthetic */ d(c.e.a aVar, byte b8) {
                this(aVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean g(int i) {
                return i == -1029262406;
            }

            public final X509Certificate cU() {
                if (this.ne.isEmpty()) {
                    return null;
                }
                return this.ne.get(0);
            }

            public final boolean cV() {
                return !this.f15399nf.isEmpty();
            }

            public final List<c.e.a.b> cW() {
                return this.f15401nh;
            }

            private d(c.e.a aVar) {
                this.ne = aVar.f15435od;
                this.f15399nf = aVar.dm();
                this.f15400ng = aVar.dn();
                this.f15401nh = aVar.oB;
                aVar.oF.stream().mapToInt(new Se.a(1)).anyMatch(new Se.b(0));
            }
        }

        /* JADX INFO: renamed from: com.shield.android.h.b$e$e, reason: collision with other inner class name */
        public static class C0069e {
            private final List<X509Certificate> ni;

            /* JADX INFO: renamed from: nj, reason: collision with root package name */
            private final List<c.e.a.b> f15402nj;

            public /* synthetic */ C0069e(c.e.a aVar, byte b8) {
                this(aVar);
            }

            public final X509Certificate cX() {
                if (this.ni.isEmpty()) {
                    return null;
                }
                return this.ni.get(0);
            }

            public final List<c.e.a.b> cY() {
                return this.f15402nj;
            }

            private C0069e(c.e.a aVar) {
                this.ni = aVar.f15435od;
                aVar.dm();
                aVar.dn();
                this.f15402nj = aVar.oB;
            }
        }

        public e() {
            new ArrayList();
            this.mH = new ArrayList();
            this.mI = new ArrayList();
            this.mJ = new ArrayList();
            this.mK = new ArrayList();
        }

        public final void a(c cVar, Object... objArr) {
            this.mD.add(new d(cVar, objArr));
        }

        public final void b(c cVar, Object... objArr) {
            this.mE.add(new d(cVar, objArr));
        }

        public final boolean cG() {
            return this.mM;
        }

        public final boolean cH() {
            return this.mN;
        }

        public final boolean cI() {
            return this.mO;
        }

        public final boolean cJ() {
            return this.mP;
        }

        public final List<c> cK() {
            return this.mH;
        }

        public final List<d> cL() {
            return this.mI;
        }

        public final List<d> cM() {
            return this.mJ;
        }

        public final List<C0069e> cN() {
            return this.mK;
        }

        public final com.shield.android.h.c cO() {
            return this.mQ;
        }

        public final boolean cP() {
            if (!this.mD.isEmpty()) {
                return true;
            }
            if (!this.mG.isEmpty()) {
                Iterator<C0068b> it = this.mG.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw null;
                }
            }
            if (!this.mH.isEmpty()) {
                Iterator<c> it2 = this.mH.iterator();
                while (it2.hasNext()) {
                    if (it2.next().cS()) {
                        return true;
                    }
                }
            }
            if (!this.mI.isEmpty()) {
                Iterator<d> it3 = this.mI.iterator();
                while (it3.hasNext()) {
                    if (it3.next().cV()) {
                        return true;
                    }
                }
            }
            if (!this.mJ.isEmpty()) {
                Iterator<d> it4 = this.mJ.iterator();
                while (it4.hasNext()) {
                    if (it4.next().cV()) {
                        return true;
                    }
                }
            }
            a aVar = this.mL;
            return aVar != null && aVar.cQ();
        }

        public static /* synthetic */ void a(e eVar, c.e eVar2) {
            if (eVar2 != null) {
                if (eVar2.cP()) {
                    eVar.mD.addAll(eVar2.dm());
                }
                if (eVar2.dl()) {
                    eVar.mE.addAll(eVar2.dn());
                }
                int i = eVar2.nH;
                byte b8 = 0;
                if (i == 0) {
                    if (eVar2.oy.isEmpty()) {
                        return;
                    }
                    eVar.mL = new a(eVar2.oy.get(0), b8);
                    return;
                }
                if (i == 31) {
                    eVar.mO = eVar2.nI;
                    Iterator<c.e.a> it = eVar2.oy.iterator();
                    while (it.hasNext()) {
                        eVar.mJ.add(new d(it.next(), b8));
                    }
                    eVar.mQ = eVar2.ox;
                    return;
                }
                if (i == 2) {
                    eVar.mM = eVar2.nI;
                    Iterator<c.e.a> it2 = eVar2.oy.iterator();
                    while (it2.hasNext()) {
                        eVar.mH.add(new c(it2.next(), b8));
                    }
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unknown Signing Block Scheme Id");
                    }
                    eVar.mP = eVar2.nI;
                    Iterator<c.e.a> it3 = eVar2.oy.iterator();
                    while (it3.hasNext()) {
                        eVar.mK.add(new C0069e(it3.next(), b8));
                    }
                    return;
                }
                eVar.mN = eVar2.nI;
                Iterator<c.e.a> it4 = eVar2.oy.iterator();
                while (it4.hasNext()) {
                    eVar.mI.add(new d(it4.next(), b8));
                }
                if (eVar.mQ == null) {
                    eVar.mQ = eVar2.ox;
                }
            }
        }

        public static /* synthetic */ void a(e eVar, a.AnonymousClass1 anonymousClass1) {
            if (anonymousClass1.nH == 0) {
                if (anonymousClass1.nJ.isEmpty()) {
                    return;
                }
                eVar.mL = new a(anonymousClass1.nJ.get(0), (byte) 0);
                return;
            }
            throw new IllegalArgumentException("Unknown ApkSigResult Signing Block Scheme Id " + anonymousClass1.nH);
        }

        public static /* synthetic */ void a(e eVar, X509Certificate x509Certificate) {
            eVar.mF.add(x509Certificate);
        }
    }

    static {
        new HashSet(Arrays.asList(c.lF, c.lJ, c.lE, c.lG));
        HashMap map = new HashMap(2);
        map.put(2, "APK Signature Scheme v2");
        map.put(3, "APK Signature Scheme v3");
        jU = map;
    }

    public /* synthetic */ b(File file, com.shield.android.u.b bVar, File file2, Integer num, int i, byte b8) {
        this(file, bVar, file2, num, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:9|10|(2:12|(2:14|(1:21)(2:19|20))(2:23|24))(2:25|(2:202|203))|22|28|(1:30)(1:(1:32)(1:33))|34|(4:36|(8:38|235|39|233|40|43|(0)|199)(1:46)|(6:225|48|(1:50)|51|56|(3:(10:223|64|65|231|66|67|221|68|72|(0))(1:63)|75|(2:77|(0))))(0)|199)(1:80)|81|(2:83|(1:87))(1:88)|89|237|90|(2:91|(2:93|(2:240|95)(1:241))(1:239))|(1:99)|104|(8:107|(4:111|(1:113)|114|(5:116|(1:118)|219|119|(1:121))(3:227|126|(1:128)))|131|(4:133|(1:135)|136|(6:138|(1:140)(1:141)|142|(1:144)|145|(1:147)(1:148))(2:149|(6:151|(1:153)|154|(1:156)|157|(1:159))(2:160|161)))|(2:229|163)|(4:165|(1:167)(1:169)|168|(1:183))|184|(2:187|(1:189)(2:190|(1:192)(2:193|(3:195|(2:198|196)|242)(2:200|201)))))|199) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0278, code lost:
    
        throw new com.shield.android.i.a("Failed to read APK", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0279, code lost:
    
        r12.b(com.shield.android.h.b.c.f15393mh, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0258, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.shield.android.h.b.e a(com.shield.android.u.b r22) throws java.security.NoSuchAlgorithmException, java.io.IOException, com.shield.android.i.a {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.h.b.a(com.shield.android.u.b):com.shield.android.h.b$e");
    }

    public final e cD() throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            com.shield.android.u.b eVar = this.jW;
            if (eVar == null) {
                if (this.jV == null) {
                    throw new IllegalStateException("APK not provided");
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.jV, "r");
                try {
                    long length = randomAccessFile2.length();
                    FileChannel channel = randomAccessFile2.getChannel();
                    if (channel == null) {
                        throw new NullPointerException();
                    }
                    randomAccessFile = randomAccessFile2;
                    eVar = new com.shield.android.r.e(channel, 0L, length);
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            }
            e eVarA = a(eVar);
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return eVarA;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private b(File file, com.shield.android.u.b bVar, File file2, Integer num, int i) {
        this.jV = file;
        this.jW = bVar;
        this.jX = file2;
        this.jY = num;
        this.jZ = i;
    }

    private static void a(List<e.d> list, List<X509Certificate> list2, byte[] bArr, e eVar) {
        if (list.size() != 1) {
            eVar.a(c.f15388mc, new Object[0]);
        }
        a(list2, list.get(0).ne, eVar);
        List<c.e.a.b> listCW = list.get(0).cW();
        HashMap map = new HashMap();
        a(listCW, map);
        if (Arrays.equals(bArr, com.shield.android.j.c.f(map))) {
            return;
        }
        eVar.a(c.f15390me, new Object[0]);
    }

    private static void a(List<X509Certificate> list, List<X509Certificate> list2, e eVar) {
        try {
            if (Arrays.equals(list2.get(0).getEncoded(), list.get(0).getEncoded())) {
                return;
            }
            eVar.a(c.f15389md, new Object[0]);
        } catch (CertificateEncodingException e7) {
            throw new RuntimeException("Failed to encode APK signer cert", e7);
        }
    }

    private static Map<f, byte[]> a(c.e eVar) {
        HashMap map = new HashMap();
        Iterator<c.e.a> it = eVar.oy.iterator();
        while (it.hasNext()) {
            a(it.next().oB, map);
        }
        return map;
    }

    private static void a(List<c.e.a.b> list, Map<f, byte[]> map) {
        for (c.e.a.b bVar : list) {
            h hVarM = h.m(bVar.dy());
            if (hVarM != null) {
                map.put(hVarM.dG(), bVar.dz());
            }
        }
    }

    private static ByteBuffer a(com.shield.android.u.b bVar, c.b bVar2) throws IOException, com.shield.android.i.a {
        try {
            return com.shield.android.h.a.a(com.shield.android.l.a.b(bVar, bVar2), bVar.b(0L, bVar2.eG()));
        } catch (com.shield.android.v.a e7) {
            throw new com.shield.android.i.a("Failed to read AndroidManifest.xml", e7);
        }
    }
}
