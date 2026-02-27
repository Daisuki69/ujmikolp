package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2538z extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Dimension(numDecode, numDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
        Dimension value = (Dimension) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(writer, 1, value.getWidth());
        protoAdapter.encodeWithTag(writer, 2, value.getHeight());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Dimension value = (Dimension) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(2, value.getHeight()) + protoAdapter.encodedSizeWithTag(1, value.getWidth()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Dimension value = (Dimension) obj;
        j.g(value, "value");
        return Dimension.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Dimension value = (Dimension) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(writer, 2, value.getHeight());
        protoAdapter.encodeWithTag(writer, 1, value.getWidth());
    }
}
