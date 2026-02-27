package okio.internal;

import We.s;
import cj.C1110A;
import cj.C1132s;
import cj.t;
import defpackage.AbstractC1414e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.ByteString;
import okio.Path;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Path {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final int commonCompareTo(okio.Path path, okio.Path other) {
        j.g(path, "<this>");
        j.g(other, "other");
        return path.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(okio.Path path, Object obj) {
        j.g(path, "<this>");
        return (obj instanceof okio.Path) && j.b(((okio.Path) obj).getBytes$okio(), path.getBytes$okio());
    }

    public static final int commonHashCode(okio.Path path) {
        j.g(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(okio.Path path) {
        j.g(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(okio.Path path) {
        j.g(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(okio.Path path) {
        j.g(path, "<this>");
        return rootLength(path) == path.getBytes$okio().size();
    }

    public static final String commonName(okio.Path path) {
        j.g(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(okio.Path path) {
        j.g(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes$okio().size() != 2) ? path.getBytes$okio() : ByteString.EMPTY;
    }

    public static final okio.Path commonNormalized(okio.Path path) {
        j.g(path, "<this>");
        return okio.Path.Companion.get(path.toString(), true);
    }

    public static final okio.Path commonParent(okio.Path path) {
        j.g(path, "<this>");
        if (j.b(path.getBytes$okio(), DOT) || j.b(path.getBytes$okio(), SLASH) || j.b(path.getBytes$okio(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes$okio().size() == 3) {
                return null;
            }
            return new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes$okio().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new okio.Path(DOT) : indexOfLastSlash == 0 ? new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes$okio().size() == 2) {
            return null;
        }
        return new okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
    }

    public static final okio.Path commonRelativeTo(okio.Path path, okio.Path other) {
        j.g(path, "<this>");
        j.g(other, "other");
        if (!j.b(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < iMin && j.b(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i == iMin && path.getBytes$okio().size() == other.getBytes$okio().size()) {
            return Path.Companion.get$default(okio.Path.Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        if (j.b(other.getBytes$okio(), DOT)) {
            return path;
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i4 = i; i4 < size; i4++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i < size2) {
            buffer.write(segmentsBytes.get(i));
            buffer.write(slash);
            i++;
        }
        return toPath(buffer, false);
    }

    public static final okio.Path commonResolve(okio.Path path, String child, boolean z4) {
        j.g(path, "<this>");
        j.g(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z4);
    }

    public static final okio.Path commonRoot(okio.Path path) {
        j.g(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes$okio().substring(0, iRootLength));
    }

    public static final List<String> commonSegments(okio.Path path) {
        j.g(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public static final List<ByteString> commonSegmentsBytes(okio.Path path) {
        j.g(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final okio.Path commonToPath(String str, boolean z4) {
        j.g(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z4);
    }

    public static final String commonToString(okio.Path path) {
        j.g(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(okio.Path path) {
        j.g(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c = (char) path.getBytes$okio().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(okio.Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = path.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(okio.Path path) {
        return path.getBytes$okio().endsWith(DOT_DOT) && (path.getBytes$okio().size() == 2 || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), SLASH, 0, 1) || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(okio.Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes$okio().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes$okio().size() : iIndexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c = (char) path.getBytes$okio().getByte(0);
            if ('a' <= c && c < '{') {
                return 3;
            }
            if ('A' <= c && c < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!j.b(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c = (char) buffer.getByte(0L);
        if ('a' > c || c >= '{') {
            return 'A' <= c && c < '[';
        }
        return true;
    }

    public static final okio.Path toPath(Buffer buffer, boolean z4) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        j.g(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b8 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b8);
            }
            i++;
        }
        boolean z5 = i >= 2 && j.b(slash, byteString);
        if (z5) {
            j.d(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i > 0) {
            j.d(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z8 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (j.b(byteString2, byteString3)) {
                if (!z8 || !arrayList.isEmpty()) {
                    if (!z4 || (!z8 && (arrayList.isEmpty() || j.b(C1110A.G(arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z5 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(C1132s.f(arrayList));
                        }
                    }
                }
            } else if (!j.b(byteString2, DOT) && !j.b(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i4));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (j.b(str, "/")) {
            return SLASH;
        }
        if (j.b(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(AbstractC1414e.h("not a directory separator: ", str));
    }

    public static final okio.Path commonResolve(okio.Path path, ByteString child, boolean z4) {
        j.g(path, "<this>");
        j.g(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z4);
    }

    public static final okio.Path commonResolve(okio.Path path, Buffer child, boolean z4) {
        j.g(path, "<this>");
        j.g(child, "child");
        return commonResolve(path, toPath(child, false), z4);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path child, boolean z4) {
        j.g(path, "<this>");
        j.g(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes$okio());
        return toPath(buffer, z4);
    }

    private static final ByteString toSlash(byte b8) {
        if (b8 == 47) {
            return SLASH;
        }
        if (b8 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(s.f(b8, "not a directory separator: "));
    }
}
