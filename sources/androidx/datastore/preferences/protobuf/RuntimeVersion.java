package androidx.datastore.preferences.protobuf;

import We.s;
import defpackage.AbstractC1414e;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i, int i4, int i6, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i4, i6, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i, int i4, int i6, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        String strVersionString = versionString(i, i4, i6, str);
        if (i < 0 || i4 < 0 || i6 < 0) {
            throw new ProtobufRuntimeVersionException(AbstractC1414e.h("Invalid gencode version: ", strVersionString));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
        }
        if (i != 4) {
            if (i != 3) {
                throw new ProtobufRuntimeVersionException(s.p(s.x("Detected mismatched Protobuf Gencode/Runtime major versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Same major version is required."));
            }
            Logger logger2 = logger;
            StringBuilder sbX = s.x(" Protobuf gencode version ", strVersionString, " is exactly one major version older than the runtime version ", VERSION_STRING, " at ");
            sbX.append(str2);
            sbX.append(". Please update the gencode to avoid compatibility violations in the next runtime release.");
            logger2.warning(sbX.toString());
        }
        if (28 < i4 || (i4 == 28 && 2 < i6)) {
            throw new ProtobufRuntimeVersionException(s.p(s.x("Detected incompatible Protobuf Gencode/Runtime versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Runtime version cannot be older than the linked gencode version."));
        }
        if (28 > i4 || 2 > i6) {
            Logger logger3 = logger;
            StringBuilder sbX2 = s.x(" Protobuf gencode version ", strVersionString, " is older than the runtime version ", VERSION_STRING, " at ");
            sbX2.append(str2);
            sbX2.append(". Please avoid checked-in Protobuf gencode that can be obsolete.");
            logger3.warning(sbX2.toString());
        }
        if (str.equals("")) {
            return;
        }
        throw new ProtobufRuntimeVersionException(s.p(s.x("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Version suffixes must be the same."));
    }

    private static String versionString(int i, int i4, int i6, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), str);
    }
}
