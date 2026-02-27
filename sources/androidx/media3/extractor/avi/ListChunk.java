package androidx.media3.extractor.avi;

import O1.AbstractC0529x;
import O1.L;
import O1.P;
import O1.S;
import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class ListChunk implements AviChunk {
    public final S children;
    private final int type;

    private ListChunk(int i, S s9) {
        this.type = i;
        this.children = s9;
    }

    @Nullable
    private static AviChunk createBox(int i, int i4, ParsableByteArray parsableByteArray) {
        switch (i) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i4, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        AbstractC0529x.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iLimit = parsableByteArray.limit();
        int i4 = 0;
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                int i6 = i4 + 1;
                if (objArrCopyOf.length < i6) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, L.e(objArrCopyOf.length, i6));
                }
                objArrCopyOf[i4] = from;
                i4 = i6;
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i, S.i(i4, objArrCopyOf));
    }

    @Nullable
    public <T extends AviChunk> T getChild(Class<T> cls) {
        P pListIterator = this.children.listIterator(0);
        while (pListIterator.hasNext()) {
            T t5 = (T) pListIterator.next();
            if (t5.getClass() == cls) {
                return t5;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}
