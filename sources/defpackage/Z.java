package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Z extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new MediaCount(numDecode, numDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                numDecode = ProtoAdapter.UINT32.decode(reader);
            } else if (iNextTag != 2) {
                reader.readUnknownField(iNextTag);
            } else {
                numDecode2 = ProtoAdapter.UINT32.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        MediaCount value = (MediaCount) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(writer, 1, value.getImage());
        protoAdapter.encodeWithTag(writer, 2, value.getVideo());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MediaCount value = (MediaCount) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(2, value.getVideo()) + protoAdapter.encodedSizeWithTag(1, value.getImage()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MediaCount value = (MediaCount) obj;
        j.g(value, "value");
        return MediaCount.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        MediaCount value = (MediaCount) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(writer, 2, value.getVideo());
        protoAdapter.encodeWithTag(writer, 1, value.getImage());
    }
}
