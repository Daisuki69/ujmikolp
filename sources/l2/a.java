package l2;

import android.util.JsonReader;
import d4.AbstractC1331a;
import df.o;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import k2.C1691A;
import k2.C1693C;
import k2.C1694D;
import k2.C1695E;
import k2.C1697G;
import k2.C1711V;
import k2.C1715a0;
import k2.C1717b0;
import k2.Y;
import k2.Z;
import o6.C1967a;
import w2.C2373d;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1967a f18226a;

    static {
        C2373d c2373d = new C2373d();
        C1691A.f17827a.configure(c2373d);
        c2373d.f20681d = true;
        f18226a = new C1967a(c2373d, 21);
    }

    public static Z a(JsonReader jsonReader) throws IOException {
        Y y7 = new Y();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    y7.f17905d = jsonReader.nextLong();
                    y7.f = (byte) (y7.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    y7.f17904b = strNextString;
                    break;
                    break;
                case "pc":
                    y7.f17903a = jsonReader.nextLong();
                    y7.f = (byte) (y7.f | 1);
                    break;
                case "file":
                    y7.c = jsonReader.nextString();
                    break;
                case "importance":
                    y7.e = jsonReader.nextInt();
                    y7.f = (byte) (y7.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y7.a();
    }

    public static C1697G b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new C1697G(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public static C1695E c(JsonReader jsonReader) throws IOException {
        int i = 3;
        byte b8 = 0;
        C1694D c1694d = new C1694D();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c1694d.i = d(jsonReader, new o(i, b8));
                    break;
                case "pid":
                    c1694d.f17839a = jsonReader.nextInt();
                    c1694d.j = (byte) (c1694d.j | 1);
                    break;
                case "pss":
                    c1694d.e = jsonReader.nextLong();
                    c1694d.j = (byte) (c1694d.j | 8);
                    break;
                case "rss":
                    c1694d.f = jsonReader.nextLong();
                    c1694d.j = (byte) (c1694d.j | 16);
                    break;
                case "timestamp":
                    c1694d.f17842g = jsonReader.nextLong();
                    c1694d.j = (byte) (c1694d.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c1694d.f17840b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c1694d.c = jsonReader.nextInt();
                    c1694d.j = (byte) (c1694d.j | 2);
                    break;
                case "traceFile":
                    c1694d.h = jsonReader.nextString();
                    break;
                case "importance":
                    c1694d.f17841d = jsonReader.nextInt();
                    c1694d.j = (byte) (c1694d.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1694d.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(android.util.JsonReader r21, df.o r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.d(android.util.JsonReader, df.o):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f4, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0106, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
    
        r20 = 4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[PHI: r20
  0x0153: PHI (r20v11 char) = (r20v5 char), (r20v6 char), (r20v7 char), (r20v8 char), (r20v9 char), (r20v10 char), (r20v12 char) binds: [B:88:0x0151, B:84:0x0144, B:80:0x0137, B:76:0x012a, B:72:0x011c, B:68:0x010f, B:64:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k2.C1707Q e(android.util.JsonReader r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.e(android.util.JsonReader):k2.Q");
    }

    public static C1711V f(JsonReader jsonReader) throws IOException {
        byte b8 = 0;
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        C1711V c1711vF = null;
        byte b10 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new o(8, b8));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    c1711vF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b10 = (byte) (b10 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b10 == 1 && str != null && list != null) {
            return new C1711V(str, strNextString, list, c1711vF, iNextInt);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" type");
        }
        if (list == null) {
            sb2.append(" frames");
        }
        if ((1 & b10) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public static C1717b0 g(JsonReader jsonReader) throws IOException {
        C1715a0 c1715a0 = new C1715a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c1715a0.f17913b = jsonReader.nextInt();
                    c1715a0.e = (byte) (c1715a0.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c1715a0.f17912a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    c1715a0.f17914d = jsonReader.nextBoolean();
                    c1715a0.e = (byte) (c1715a0.e | 4);
                    break;
                case "importance":
                    c1715a0.c = jsonReader.nextInt();
                    c1715a0.e = (byte) (c1715a0.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1715a0.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0191, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0125, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0145, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016d, code lost:
    
        r22 = 4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019c A[PHI: r22
  0x019c: PHI (r22v27 char) = 
  (r22v16 char)
  (r22v17 char)
  (r22v18 char)
  (r22v19 char)
  (r22v20 char)
  (r22v21 char)
  (r22v22 char)
  (r22v23 char)
  (r22v24 char)
  (r22v25 char)
  (r22v26 char)
  (r22v28 char)
 binds: [B:109:0x019a, B:105:0x018b, B:101:0x0180, B:97:0x0175, B:93:0x0167, B:89:0x015a, B:85:0x014d, B:81:0x013e, B:77:0x012e, B:73:0x011d, B:69:0x010d, B:65:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k2.C1693C h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.h(android.util.JsonReader):k2.C");
    }

    public static C1693C i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C1693C c1693cH = h(jsonReader);
                jsonReader.close();
                return c1693cH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
