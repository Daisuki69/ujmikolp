package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        long jBeginMessage = reader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Sensor(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                strDecode4 = ProtoAdapter.STRING.decode(reader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Sensor value = (Sensor) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getEnabled_sensor_name());
        protoAdapter.encodeWithTag(writer, 2, value.getMin_delay());
        protoAdapter.encodeWithTag(writer, 3, value.getCurrent_value());
        protoAdapter.encodeWithTag(writer, 4, value.getVendor());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Sensor value = (Sensor) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, value.getVendor()) + protoAdapter.encodedSizeWithTag(3, value.getCurrent_value()) + protoAdapter.encodedSizeWithTag(2, value.getMin_delay()) + protoAdapter.encodedSizeWithTag(1, value.getEnabled_sensor_name()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Sensor value = (Sensor) obj;
        j.g(value, "value");
        return Sensor.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Sensor value = (Sensor) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 4, value.getVendor());
        protoAdapter.encodeWithTag(writer, 3, value.getCurrent_value());
        protoAdapter.encodeWithTag(writer, 2, value.getMin_delay());
        protoAdapter.encodeWithTag(writer, 1, value.getEnabled_sensor_name());
    }
}
