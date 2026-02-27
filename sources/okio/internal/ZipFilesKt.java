package okio.internal;

import We.s;
import cj.C1110A;
import cj.M;
import ej.C1449a;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import okio.ZipFileSystem;
import zj.C2576A;
import zj.C2579a;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_NTFS_EXTRA = 10;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$openZip$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<ZipEntry, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ZipEntry it) {
            j.g(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19971 extends k implements Function2<Integer, Long, Unit> {
        final /* synthetic */ x $compressedSize;
        final /* synthetic */ u $hasZip64Extra;
        final /* synthetic */ y $ntfsCreatedAtFiletime;
        final /* synthetic */ y $ntfsLastAccessedAtFiletime;
        final /* synthetic */ y $ntfsLastModifiedAtFiletime;
        final /* synthetic */ x $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ x $size;
        final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

        /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01021 extends k implements Function2<Integer, Long, Unit> {
            final /* synthetic */ y $ntfsCreatedAtFiletime;
            final /* synthetic */ y $ntfsLastAccessedAtFiletime;
            final /* synthetic */ y $ntfsLastModifiedAtFiletime;
            final /* synthetic */ BufferedSource $this_readCentralDirectoryZipEntry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01021(y yVar, BufferedSource bufferedSource, y yVar2, y yVar3) {
                super(2);
                this.$ntfsLastModifiedAtFiletime = yVar;
                this.$this_readCentralDirectoryZipEntry = bufferedSource;
                this.$ntfsLastAccessedAtFiletime = yVar2;
                this.$ntfsCreatedAtFiletime = yVar3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                return Unit.f18162a;
            }

            public final void invoke(int i, long j) throws IOException {
                if (i == 1) {
                    y yVar = this.$ntfsLastModifiedAtFiletime;
                    if (yVar.f18195a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    yVar.f18195a = Long.valueOf(this.$this_readCentralDirectoryZipEntry.readLongLe());
                    this.$ntfsLastAccessedAtFiletime.f18195a = Long.valueOf(this.$this_readCentralDirectoryZipEntry.readLongLe());
                    this.$ntfsCreatedAtFiletime.f18195a = Long.valueOf(this.$this_readCentralDirectoryZipEntry.readLongLe());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19971(u uVar, long j, x xVar, BufferedSource bufferedSource, x xVar2, x xVar3, y yVar, y yVar2, y yVar3) {
            super(2);
            this.$hasZip64Extra = uVar;
            this.$requiredZip64ExtraSize = j;
            this.$size = xVar;
            this.$this_readCentralDirectoryZipEntry = bufferedSource;
            this.$compressedSize = xVar2;
            this.$offset = xVar3;
            this.$ntfsLastModifiedAtFiletime = yVar;
            this.$ntfsLastAccessedAtFiletime = yVar2;
            this.$ntfsCreatedAtFiletime = yVar3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f18162a;
        }

        public final void invoke(int i, long j) throws IOException {
            if (i != 1) {
                if (i != 10) {
                    return;
                }
                if (j < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.$this_readCentralDirectoryZipEntry.skip(4L);
                BufferedSource bufferedSource = this.$this_readCentralDirectoryZipEntry;
                ZipFilesKt.readExtra(bufferedSource, (int) (j - 4), new C01021(this.$ntfsLastModifiedAtFiletime, bufferedSource, this.$ntfsLastAccessedAtFiletime, this.$ntfsCreatedAtFiletime));
                return;
            }
            u uVar = this.$hasZip64Extra;
            if (uVar.f18191a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            uVar.f18191a = true;
            if (j < this.$requiredZip64ExtraSize) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            x xVar = this.$size;
            long longLe = xVar.f18194a;
            if (longLe == 4294967295L) {
                longLe = this.$this_readCentralDirectoryZipEntry.readLongLe();
            }
            xVar.f18194a = longLe;
            x xVar2 = this.$compressedSize;
            xVar2.f18194a = xVar2.f18194a == 4294967295L ? this.$this_readCentralDirectoryZipEntry.readLongLe() : 0L;
            x xVar3 = this.$offset;
            xVar3.f18194a = xVar3.f18194a == 4294967295L ? this.$this_readCentralDirectoryZipEntry.readLongLe() : 0L;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19981 extends k implements Function2<Integer, Long, Unit> {
        final /* synthetic */ y $extendedCreatedAtSeconds;
        final /* synthetic */ y $extendedLastAccessedAtSeconds;
        final /* synthetic */ y $extendedLastModifiedAtSeconds;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19981(BufferedSource bufferedSource, y yVar, y yVar2, y yVar3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$extendedLastModifiedAtSeconds = yVar;
            this.$extendedLastAccessedAtSeconds = yVar2;
            this.$extendedCreatedAtSeconds = yVar3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return Unit.f18162a;
        }

        public final void invoke(int i, long j) throws IOException {
            if (i == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b8 = this.$this_readOrSkipLocalHeader.readByte();
                boolean z4 = (b8 & 1) == 1;
                boolean z5 = (b8 & 2) == 2;
                boolean z8 = (b8 & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j6 = z4 ? 5L : 1L;
                if (z5) {
                    j6 += 4;
                }
                if (z8) {
                    j6 += 4;
                }
                if (j < j6) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z4) {
                    this.$extendedLastModifiedAtSeconds.f18195a = Integer.valueOf(bufferedSource.readIntLe());
                }
                if (z5) {
                    this.$extendedLastAccessedAtSeconds.f18195a = Integer.valueOf(this.$this_readOrSkipLocalHeader.readIntLe());
                }
                if (z8) {
                    this.$extendedCreatedAtSeconds.f18195a = Integer.valueOf(this.$this_readOrSkipLocalHeader.readIntLe());
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        LinkedHashMap linkedHashMapI = M.i(new Pair(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (ZipEntry zipEntry : C1110A.Q(new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return C1449a.a(((ZipEntry) t5).getCanonicalPath(), ((ZipEntry) t10).getCanonicalPath());
            }
        }, list)) {
            if (((ZipEntry) linkedHashMapI.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMapI.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        linkedHashMapI.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMapI;
    }

    public static final Long dosDateTimeToEpochMillis(int i, int i4) {
        if (i4 == -1) {
            return null;
        }
        return Long.valueOf(_ZlibJvmKt.datePartsToEpochMillis(((i >> 9) & 127) + 1980, (i >> 5) & 15, i & 31, (i4 >> 11) & 31, (i4 >> 5) & 63, (i4 & 31) << 1));
    }

    public static final long filetimeToEpochMillis(long j) {
        return (j / ((long) 10000)) - 11644473600000L;
    }

    private static final String getHex(int i) {
        C2579a.a(16);
        String string = Integer.toString(i, 16);
        j.f(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #13 {all -> 0x00df, blocks: (B:13:0x0064, B:15:0x006d, B:18:0x007e, B:43:0x00de, B:46:0x00e2, B:47:0x00e9, B:48:0x00ea), top: B:139:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x001b, B:5:0x0029, B:6:0x0032, B:10:0x0050, B:12:0x005c, B:65:0x0109, B:59:0x00fd, B:66:0x010a, B:93:0x016a, B:97:0x0179, B:90:0x0164, B:100:0x017c, B:103:0x0188, B:104:0x018f, B:105:0x0190, B:106:0x0193, B:107:0x0194, B:108:0x01a9, B:87:0x015f, B:67:0x011b, B:70:0x0123, B:72:0x0133, B:74:0x013f, B:77:0x0146, B:78:0x014a, B:79:0x0151, B:80:0x0152, B:7:0x003a, B:9:0x0043, B:56:0x00f8), top: B:116:0x001b, inners: #1, #2, #9, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.ZipFileSystem openZip(okio.Path r18, okio.FileSystem r19, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ZipFilesKt.openZip(okio.Path, okio.FileSystem, kotlin.jvm.functions.Function1):okio.ZipFileSystem");
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        return openZip(path, fileSystem, function1);
    }

    public static final ZipEntry readCentralDirectoryZipEntry(BufferedSource bufferedSource) throws IOException {
        j.g(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        long intLe2 = ((long) bufferedSource.readIntLe()) & 4294967295L;
        x xVar = new x();
        xVar.f18194a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        x xVar2 = new x();
        xVar2.f18194a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        int shortLe6 = bufferedSource.readShortLe() & 65535;
        int shortLe7 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        x xVar3 = new x();
        xVar3.f18194a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        String utf8 = bufferedSource.readUtf8(shortLe5);
        if (C2576A.y(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = xVar2.f18194a == 4294967295L ? 8 : 0L;
        if (xVar.f18194a == 4294967295L) {
            j += (long) 8;
        }
        if (xVar3.f18194a == 4294967295L) {
            j += (long) 8;
        }
        long j6 = j;
        y yVar = new y();
        y yVar2 = new y();
        y yVar3 = new y();
        u uVar = new u();
        readExtra(bufferedSource, shortLe6, new C19971(uVar, j6, xVar2, bufferedSource, xVar, xVar3, yVar, yVar2, yVar3));
        if (j6 <= 0 || uVar.f18191a) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), z.n(utf8, 2, "/", false), bufferedSource.readUtf8(shortLe7), intLe2, xVar.f18194a, xVar2.f18194a, shortLe2, xVar3.f18194a, shortLe4, shortLe3, (Long) yVar.f18195a, (Long) yVar2.f18195a, (Long) yVar3.f18195a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, 4294967295L & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readExtra(BufferedSource bufferedSource, int i, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j6 = j - ((long) 4);
            if (j6 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(s.f(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j6 - shortLe2;
        }
    }

    public static final ZipEntry readLocalHeader(BufferedSource bufferedSource, ZipEntry centralDirectoryZipEntry) throws IOException {
        j.g(bufferedSource, "<this>");
        j.g(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        ZipEntry orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, centralDirectoryZipEntry);
        j.d(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final ZipEntry readOrSkipLocalHeader(BufferedSource bufferedSource, ZipEntry zipEntry) throws IOException {
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (zipEntry == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        y yVar = new y();
        y yVar2 = new y();
        y yVar3 = new y();
        readExtra(bufferedSource, shortLe3, new C19981(bufferedSource, yVar, yVar2, yVar3));
        return zipEntry.copy$okio((Integer) yVar.f18195a, (Integer) yVar2.f18195a, (Integer) yVar3.f18195a);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        j.g(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
