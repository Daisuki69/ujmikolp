package okio;

import cj.AbstractC1117c;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class Options extends AbstractC1117c<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i, List<? extends ByteString> list, int i4, int i6, List<Integer> list2) throws IOException {
            int i10;
            int i11;
            int i12;
            long j6;
            int i13 = i;
            if (i4 >= i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = i4; i14 < i6; i14++) {
                if (list.get(i14).size() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = list.get(i4);
            ByteString byteString2 = list.get(i6 - 1);
            if (i13 == byteString.size()) {
                int iIntValue = list2.get(i4).intValue();
                int i15 = i4 + 1;
                ByteString byteString3 = list.get(i15);
                i10 = i15;
                i11 = iIntValue;
                byteString = byteString3;
            } else {
                i10 = i4;
                i11 = -1;
            }
            if (byteString.getByte(i13) == byteString2.getByte(i13)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && byteString.getByte(i17) == byteString2.getByte(i17); i17++) {
                    i16++;
                }
                long intCount = j + getIntCount(buffer) + ((long) 2) + ((long) i16) + 1;
                buffer.writeInt(-i16);
                buffer.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    buffer.writeInt(byteString.getByte(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == i6) {
                    if (i18 != list.get(i10).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.writeInt(list2.get(i10).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i18, list, i10, i6, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < i6; i20++) {
                if (list.get(i20 - 1).getByte(i13) != list.get(i20).getByte(i13)) {
                    i19++;
                }
            }
            long intCount2 = j + getIntCount(buffer) + ((long) 2) + ((long) (i19 * 2));
            buffer.writeInt(i19);
            buffer.writeInt(i11);
            for (int i21 = i10; i21 < i6; i21++) {
                byte b8 = list.get(i21).getByte(i13);
                if (i21 == i10 || b8 != list.get(i21 - 1).getByte(i13)) {
                    buffer.writeInt(b8 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i10 < i6) {
                byte b10 = list.get(i10).getByte(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= i6) {
                        i12 = i6;
                        break;
                    } else {
                        if (b10 != list.get(i23).getByte(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == list.get(i10).size()) {
                    buffer.writeInt(list2.get(i10).intValue());
                    j6 = intCount2;
                } else {
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                    j6 = intCount2;
                    buildTrieRecursive(j6, buffer3, i13 + 1, list, i10, i12, list2);
                }
                intCount2 = j6;
                i10 = i12;
            }
            buffer.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i4, int i6, List list2, int i10, Object obj) throws IOException {
            if ((i10 & 1) != 0) {
                j = 0;
            }
            companion.buildTrieRecursive(j, buffer, (i10 & 4) != 0 ? 0 : i, list, (i10 & 16) != 0 ? 0 : i4, (i10 & 32) != 0 ? list.size() : i6, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.Options of(okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // cj.AbstractC1115a
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // cj.AbstractC1117c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // java.util.List
    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
