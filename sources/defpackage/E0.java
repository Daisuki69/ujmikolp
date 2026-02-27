package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class E0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Volume(strDecode, strDecode2, strDecode3, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag == 3) {
                strDecode3 = ProtoAdapter.STRING.decode(reader);
            } else if (iNextTag != 4) {
                reader.readUnknownField(iNextTag);
            } else {
                boolDecode = ProtoAdapter.BOOL.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Volume value = (Volume) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getDescription());
        protoAdapter.encodeWithTag(writer, 2, value.getTotal_size());
        protoAdapter.encodeWithTag(writer, 3, value.getAvailable_size());
        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.is_removable());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Volume value = (Volume) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, value.is_removable()) + protoAdapter.encodedSizeWithTag(3, value.getAvailable_size()) + protoAdapter.encodedSizeWithTag(2, value.getTotal_size()) + protoAdapter.encodedSizeWithTag(1, value.getDescription()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Volume value = (Volume) obj;
        j.g(value, "value");
        return Volume.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Volume value = (Volume) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.is_removable());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 3, value.getAvailable_size());
        protoAdapter.encodeWithTag(writer, 2, value.getTotal_size());
        protoAdapter.encodeWithTag(writer, 1, value.getDescription());
    }
}
