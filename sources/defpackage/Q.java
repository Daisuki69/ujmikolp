package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Q extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        Double dDecode = null;
        Double dDecode2 = null;
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Location(dDecode, dDecode2, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                dDecode = ProtoAdapter.DOUBLE.decode(reader);
            } else if (iNextTag == 2) {
                dDecode2 = ProtoAdapter.DOUBLE.decode(reader);
            } else if (iNextTag != 3) {
                reader.readUnknownField(iNextTag);
            } else {
                boolDecode = ProtoAdapter.BOOL.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Location value = (Location) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(writer, 1, value.getLatitude());
        protoAdapter.encodeWithTag(writer, 2, value.getLongitude());
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.is_mock());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Location value = (Location) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, value.is_mock()) + protoAdapter.encodedSizeWithTag(2, value.getLongitude()) + protoAdapter.encodedSizeWithTag(1, value.getLatitude()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Location value = (Location) obj;
        j.g(value, "value");
        return Location.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Location value = (Location) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.is_mock());
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(writer, 2, value.getLongitude());
        protoAdapter.encodeWithTag(writer, 1, value.getLatitude());
    }
}
